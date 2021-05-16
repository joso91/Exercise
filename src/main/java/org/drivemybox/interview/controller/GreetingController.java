package org.drivemybox.interview.controller;

import org.drivemybox.interview.greeting.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    Greeter greeter;

    @GetMapping("/greeting")
    public String readCustomer(@RequestParam String name) {
       return greeter.greet(name);
    }
}