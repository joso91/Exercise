package org.drivemybox.interview.greeting;

public enum Greeting {

    HELLO("Hello"),
    HI("Hi"),
    HEY("Hey"),
    ;

    private final String greeting;

    Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

}
