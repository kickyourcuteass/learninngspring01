package com.learning.spring.model.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CustomerService {
    @Value("defaultValueMessage")
    private String message;

    public CustomerService() {
        System.out.println("CustomerService - called!!");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "message='" + message + '\'' +
                '}';
    }
}
