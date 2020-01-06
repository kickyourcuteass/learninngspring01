package com.learning.spring.model.greetings;

public class HelloWorld {

    private String message;

    public HelloWorld(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void greet(){
        System.out.println("the application is greeting:");
        System.out.println(getMessage());
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
