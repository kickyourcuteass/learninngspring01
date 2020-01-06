package com.learning.spring.model.furniture;

import org.springframework.stereotype.Component;

@Component
public class Bed {

    public Bed() {
        System.out.println("Bed - constructor called!");
    }

    @Override
    public String toString() {
        return "Bed{}";
    }
}
