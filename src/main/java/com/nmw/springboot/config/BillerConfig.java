package com.nmw.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;


@EnableConfigurationProperties
@Configuration
@ConfigurationProperties("data")
public class BillerConfig {
    Map<Integer, String> datasource;

    public BillerConfig() {
    }


    public Map<Integer, String> getDatasource() {
        return datasource;
    }

    public void setDatasource(Map<Integer, String> datasource) {
        this.datasource = datasource;
    }

    @Override
    public String toString() {
        return "BillerConfig{" +
                "datasource=" + datasource +
                '}';
    }
}
