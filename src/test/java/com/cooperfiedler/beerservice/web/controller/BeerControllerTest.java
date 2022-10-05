package com.cooperfiedler.beerservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getBeerById() {
        //todo add test
    }

    @Test
    void saveNewBeer() {
        //todo add test
    }

    @Test
    void updateBeerById() {
        //todo add tests
    }
}