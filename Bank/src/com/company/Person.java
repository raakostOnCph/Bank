package com.company;

public class Person {

    private String name;
    private String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }


    // todo lave en funktion der kan udskrive personoplysningerne. Den skal returnere en string til main.
}
