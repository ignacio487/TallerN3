package config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
                .derive(SQLDialect.SQLDialect.POSTGRES) // Reemplaza YOUR_SQL_DIALECT por tu dialecto de SQL
                .derive(dataSource);
    }
}