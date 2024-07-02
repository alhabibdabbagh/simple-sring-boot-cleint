package com.spring.initializr.simple.drink.web.client;

import com.spring.initializr.simple.drink.web.model.DrinkModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class DrinkClientTest {

    @Autowired
    DrinkClient drinkClient;

    @Test
    void getDrinkById() {
        DrinkModel drinkModel=drinkClient.getDrinkById(UUID.randomUUID());

        assertNotNull(drinkModel);
}
}
