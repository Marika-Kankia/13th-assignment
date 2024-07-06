package com.example.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // პირველი ენდპოინტი /hello, რომელიც აბრუნებს "Hello, World"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World";
    }

    // მეორე ენდპოინტი /hello/{name}, რომელიც აბრუნებს "Hello, [სახელი]"
    @GetMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello, " + name;
    }
}
