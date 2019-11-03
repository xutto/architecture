package com.practice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "pruebas")
public class PropertiesConfig {

    private String propiedad01;

    public String getPropiedad01() {
        return propiedad01;
    }

    public void setPropiedad01(final String propiedad01) {
        this.propiedad01 = propiedad01;
    }
}
