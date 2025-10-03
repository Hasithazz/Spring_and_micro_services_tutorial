package com.springtutorial.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean sayHelloBean() {
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world/{name}")
    public HelloWorldBean sayHelloBeanWithPathVariable(@PathVariable String name) {
        return new HelloWorldBean(name);
    }
}
