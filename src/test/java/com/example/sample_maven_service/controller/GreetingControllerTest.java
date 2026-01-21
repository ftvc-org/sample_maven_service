package com.example.sample_maven_service.controller;

import com.example.sample_maven_service.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GreetingControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGreetEndpoint() {
        ResponseEntity<String> response = restTemplate.getForEntity("/api/greet?name=Tanaji", String.class);
        assertThat(response.getBody()).isEqualTo("Hello, Tanaji!");
    }

    @Test
    void testAddEndpoint() {
        ResponseEntity<Integer> response = restTemplate.getForEntity("/api/add?a=2&b=3", Integer.class);
        assertThat(response.getBody()).isEqualTo(5);
    }
}
