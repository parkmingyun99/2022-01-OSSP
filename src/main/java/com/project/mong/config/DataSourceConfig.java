/*package com.project.mong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {

        return DataSourceBuilder
                .create()
                .username("minsu_05")
                .password("rlaalstn1!")
                .url("jdbc:mysql://minsuisconfused.cijinkootmoi.ap-northeast-2.rds.amazonaws.com:3306/Dongguk?serverTimezone=UTC&characterEncoding=UTF-8")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}

*/
