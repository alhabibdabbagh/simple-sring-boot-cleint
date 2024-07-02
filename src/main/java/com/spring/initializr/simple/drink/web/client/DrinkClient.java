package com.spring.initializr.simple.drink.web.client;

import com.spring.initializr.simple.drink.web.model.DrinkModel;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@ConfigurationProperties(prefix = "sfg.drink.api",ignoreUnknownFields = false)
@Component
public class DrinkClient {

    @Value("${sfg.drink.api}")
    private String sfgDrinkApi;
    public final String DRINK_PATH_V1="/api/v1/drink/";

    private final RestTemplate restTemplate ;
    public DrinkClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public DrinkModel getDrinkById(UUID drinkId) {
        return restTemplate.getForObject(sfgDrinkApi +DRINK_PATH_V1+drinkId.toString(), DrinkModel.class);
    }
}
