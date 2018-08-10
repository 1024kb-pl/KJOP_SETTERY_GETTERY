package com.company;

public class Dog {
    private String name;
    private String breef;

    public Dog(String name, String breef) {
        this.name = name;
        this.breef = breef;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreef() {
        return breef;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breef='" + breef + '\'' +
                '}';
    }
}
