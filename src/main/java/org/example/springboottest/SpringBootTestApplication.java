package org.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Specifies that this class acts as a request handler
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    @GetMapping("/hello") // maps GET requests to /hello to this sayHello() method.
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        // @RequestParam expects a value called myName in the request it receives and maps it to the name variable
        return String.format("Hello, %s!", name);
    }

}
