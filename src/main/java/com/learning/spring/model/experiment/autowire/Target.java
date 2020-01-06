package com.learning.spring.model.experiment.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Target {
    @Autowired
    @Qualifier("fooOne")
    private Foo fooOne;

    @Autowired
    @Qualifier("fooTwo")
    private Foo fooTwo;

    @Autowired
    private Bar bar;

//    public Target(@Qualifier("fooOne") Foo foo) {
//        System.out.println("Target(Foo) - called");
//    }

//    public Target(@Qualifier("fooOne") Foo foo, Bar bar){
//        System.out.println("Target(Foo,Bar) - called");
//    }

    public void setFooOne(@Qualifier("fooOne")Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public void setFooTwo(@Qualifier("fooTwo")Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    public void setBar(@Qualifier("bar")Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    @Override
    public String toString() {
        return "Target{" +
                "fooOne=" + fooOne +
                ", fooTwo=" + fooTwo +
                ", bar=" + bar +
                '}';
    }
}
