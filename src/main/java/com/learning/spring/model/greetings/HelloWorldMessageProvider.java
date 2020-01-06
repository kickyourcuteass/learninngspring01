package com.learning.spring.model.greetings;

import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    private String name;

    public HelloWorldMessageProvider() {
        System.out.println("HelloWorldMessageProvider - constructor called!");
        name = "Ioana's Message Provider";
    }

    @Override
    public String getMessage() {
        return "Hello World Message Provider!";
    }

    @Override
    public String toString() {
        return "HelloWorldMessageProvider{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
