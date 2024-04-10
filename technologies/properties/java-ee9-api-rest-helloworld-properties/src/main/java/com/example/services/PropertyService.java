package com.example.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Startup;
import jakarta.ejb.Stateless;

@Stateless
@Startup
public class PropertyService {

    private static final String PATH = "/application.properties";

    private Properties prop;
    
    @PostConstruct
    public void init() {

        try {
            InputStream inputStream  = PropertyService.class.getClassLoader().getResourceAsStream(PATH);
            prop = new Properties();
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }

}