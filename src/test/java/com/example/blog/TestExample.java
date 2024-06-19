package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestExample {

    @Test
    public void testGreet() {
        String greeting = "Hello";
        assertEquals("Hello", "Hello");
    }
}
