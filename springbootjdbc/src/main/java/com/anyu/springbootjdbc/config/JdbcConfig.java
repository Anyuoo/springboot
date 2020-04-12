package com.anyu.springbootjdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.InputStream;
//
//@Configuration
//@PropertySource("classpath:/jdbc.properties")//加载指定的配置文件
//@EnableConfigurationProperties(JdbcProperties.class)、、
public class JdbcConfig {
//    @Autowired
//    private JdbcProperties jdbcProperties;
//    @Value("${jdbc.driverName}")
//    private String driverName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.userName}")
//    private String userName;
//    @Value("${jdbc.password}")
//    private String password;
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource getDataSource(){
//        DruidDataSource source=new DruidDataSource();
////        source.setDriverClassName(this.jdbcProperties.getDriverName());
////        source.setUrl(this.jdbcProperties.getUrl());
////        source.setUsername(this.jdbcProperties.getUserName());
////        source.setPassword(this.jdbcProperties.getPassword());
//        return source;
//    }
}
