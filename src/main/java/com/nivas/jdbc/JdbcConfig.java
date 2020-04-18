package com.nivas.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
    @Bean
    public DataSource h2DataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("createPersonTable.sql").build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(h2DataSource());
    }

    @Bean
    public PersonService personService(){
        return new PersonService();
    }

    @Bean
    public JdbcTemPlateDAO jdbcTemPlateDAO(){
        return new JdbcTemPlateDAO();
    }
}
