package com.example.lambdaspringboot.service;

import com.example.lambdaspringboot.service.vo.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public HelloWorld helloWorld(String name) {
        return HelloWorld.builder()
                .response("Hello, " + name)
                .build();
    }
}
