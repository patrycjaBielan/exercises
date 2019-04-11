package com.sdpCourse;

public class Cat extends Animal implements CanClimb{
    public Cat(String name) throws  Exception{
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating Whiskas");
    }

    @Override
    public void climb() {
        System.out.println("I can climb");
    }
}
