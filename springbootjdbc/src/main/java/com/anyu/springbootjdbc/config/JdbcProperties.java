package com.anyu.springbootjdbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String driverName;
    private String url;
    private String userName;
    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
