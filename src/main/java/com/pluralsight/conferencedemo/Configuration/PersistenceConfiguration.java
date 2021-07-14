package com.pluralsight.conferencedemo.Configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:sqlserver://localhost:1433;databaseName=conference_app");
//        builder.username("dbUser");
//        builder.password("1234");
//        System.out.println("In data source builder");
//        return builder.build();
//    }
}
