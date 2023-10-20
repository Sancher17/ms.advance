package com.alex.springconfig.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static com.alex.springconfig.constant.SpringProfile.DEFAULT;

import javax.sql.DataSource;


@Slf4j
@RequiredArgsConstructor
@Configuration
@Profile(DEFAULT)
public class Config {

    @Value("${db.username}")
    private String user;
    @Value("${db.url}")
    private String url;
    @Value("${db.password}")
    private String pass;
    @Value("${db.driver}")
    private String driver;

    private final Environment env;

    @Bean
    public DataSource dataSource() {
        log.info("Init datasource: {}", DEFAULT);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pass);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }

    @ConditionalOnMissingBean(DataSource.class)
    @Bean
    public DataSource dataSourceCustom() {
        log.info("Init custom datasource");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getProperty("db.custom.url"));
        dataSource.setUsername(env.getProperty("db.custom.username"));
        dataSource.setPassword(env.getProperty("db.custom.password"));
        dataSource.setDriverClassName(env.getProperty("db.custom.driver"));
        return dataSource;
    }
}
