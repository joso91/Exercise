package org.drivemybox.interview;

import org.drivemybox.interview.greeting.GreeterTimeImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class GreeterTimeImplTest {

    private GreeterTimeImpl greeter = new GreeterTimeImpl();
    private String name = "Leonard";

    @Test
    public void greetGoodMorning() {
        LocalTime localTime = LocalTime.of(3, 0);
        assertEquals("Good morning, Leonard!", greeter.greet(name, localTime));
    }

    @Test
    public void greetGoodAfternoon() {
        LocalTime localTime = LocalTime.of(12, 0);
        assertEquals("Good afternoon, Leonard!", greeter.greet(name, localTime));
    }

    @Test
    public void greetGoodEvening() {
        LocalTime localTime = LocalTime.of(17, 0);
        assertEquals("Good evening, Leonard!", greeter.greet(name, localTime));
    }

    @Test
    public void greetGoodNight1() {
        LocalTime localTime = LocalTime.of(20, 0);
        assertEquals("Good night, Leonard!", greeter.greet(name, localTime));
    }

    @Test
    public void greetGoodNight2() {
        LocalTime localTime = LocalTime.of(2, 59);
        assertEquals("Good night, Leonard!", greeter.greet(name, localTime));
    }
}
