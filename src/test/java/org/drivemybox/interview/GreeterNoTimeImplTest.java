package org.drivemybox.interview;

import org.drivemybox.interview.greeting.Greeter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class GreeterNoTimeImplTest {

    @Autowired
    private Greeter greeter;

    private String name = "Leonard";

    @Test
    public void greet() {
        assertEquals("Hi, Leonard!", greeter.greet(name));
    }
}
