package com.alex.springconfig.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import static com.alex.springconfig.constant.SpringProfile.QA;


@Slf4j
@RequiredArgsConstructor
@Configuration
@Profile(QA)
public class ConfigQa {

    @Value("${db.username}")
    private String user;
    @Value("${db.url}")
    private String url;
    @Value("${db.password}")
    private String pass;
    @Value("${db.driver}")
    private String driver;

    @Bean
    public DataSource dataSource() {
        log.info("Init datasource: {}", QA);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(pass);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }
}
