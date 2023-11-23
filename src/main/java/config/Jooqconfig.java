package config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class Jooqconfig {

    private final DataSource dataSource;

    @Autowired
    public Jooqconfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public DSLContext dslContext() {
        return new DefaultDSLContext(dataSource, SQLDialect.YOUR_SQL_DIALECT);
    }
}