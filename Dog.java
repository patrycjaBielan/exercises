package com.sdpCourse;

public class Dog extends Animal {
    public Dog(String name) throws  Exception{
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating Pedigree.");
    }
}
