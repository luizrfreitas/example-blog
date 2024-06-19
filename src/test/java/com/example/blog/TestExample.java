package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;

@SpringBootTest
public class TestExample {

    @Test
    public void testGreet() {
        String greeting = "Hello";
        Assertions.assertThat("Hello").isEqualTo("Hello");
    }
}
