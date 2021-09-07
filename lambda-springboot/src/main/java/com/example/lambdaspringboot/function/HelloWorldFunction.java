package com.example.lambdaspringboot.function;

import com.example.lambdaspringboot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class HelloWorldFunction implements Function<String, String> {

    @Autowired
    HelloWorldService helloWorldService;

    @Override
    public String apply(String input) {
        return helloWorldService.helloWorld(input).getResponse();
    }
}