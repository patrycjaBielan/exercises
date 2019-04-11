package com.sdpCourse;

public abstract class Animal {
    String name;
    String food;

    public Animal(String name) throws Exception {
        this.name = name;
        if (name.length() > 10) {
            throw new Exception();
        }
    }

    public void sayMyName() {
        System.out.println(name);
    }

    public abstract void eat();
}
