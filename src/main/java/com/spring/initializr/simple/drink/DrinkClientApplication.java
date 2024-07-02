package com.spring.initializr.simple.drink;

import com.spring.initializr.simple.drink.web.client.DrinkClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DrinkClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrinkClientApplication.class, args);
    }

}
