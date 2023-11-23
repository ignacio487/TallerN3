package config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;


import javax.sql.DataSource;

@Configuration
public class JooqConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DSLContext dslContext() {
        return new DefaultDSLContext(configuration());
    }

    private org.jooq.Configuration configuration() {
        return new org.jooq.Configuration()
                .derive(SQLDialect.POSTGRES)
                .derive(dataSource);
    }
}