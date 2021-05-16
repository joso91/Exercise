package org.drivemybox.interview.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class GreeterNoTimeImpl implements Greeter {

    @Value("${drivemybox.greeting}")
    Greeting greeting;

    @Override
    public String greet(String name) {
        return greeting.getGreeting() + ", " + name + "!";
    }
}
