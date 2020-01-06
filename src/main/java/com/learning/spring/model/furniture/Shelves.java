package com.learning.spring.model.furniture;

import org.springframework.stereotype.Component;

@Component
public class Shelves {

    private int number;

    public Shelves(int number){
        System.out.println("Valoarea injectata : " + number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Shelves{" +
                "number=" + number +
                '}';
    }
}
