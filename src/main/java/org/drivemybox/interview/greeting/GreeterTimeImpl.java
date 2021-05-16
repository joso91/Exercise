package org.drivemybox.interview.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@Profile("dev")
public class GreeterTimeImpl implements Greeter {

    @Override
    public String greet(String name) {
        LocalTime localTime = LocalTime.now();

        return greet(name, localTime);
    }

    public String greet(String name, LocalTime localTime) {
        String greeting = null;
        int currentHour = localTime.getHour();

        if (currentHour < 3 || currentHour >= 20) {
            greeting = "Good night";
        } else if (currentHour < 12) {
            greeting = "Good morning";
        } else if (currentHour < 17) {
            greeting = "Good afternoon";
        } else if (currentHour < 20) {
            greeting = "Good evening";
        }

        return greeting + ", " + name + "!";
    }
}
