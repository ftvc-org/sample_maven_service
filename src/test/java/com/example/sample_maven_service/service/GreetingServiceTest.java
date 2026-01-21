package com.example.sample_maven_service.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void testGreetWithName() {
        String result = service.greet("Tanaji");
        assertEquals("Hello, Tanaji!", result);
    }

    @Test
    void testGreetWithoutName() {
        String result = service.greet("");
        assertEquals("Hello, World!", result);
    }

    @Test
    void testAddNumbers() {
        assertEquals(5, service.addNumbers(2, 3));
    }
}
