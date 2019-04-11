package com.sdpCourse;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        String name = "Patrycja";
//        Customer c = new Customer(name);
//        c.setName("NewName");
//        System.out.println(c);
        try {
            Dog dog = new Dog("Burek");
            Cat cat = new Cat("Puszek");
            ArrayList<Animal> animals = new ArrayList<>();
            animals.add(dog);
            animals.add(cat);
            cat.climb();

            for (Animal animal : animals) {
                System.out.println(animal);
            }

            animals.stream().forEach(System.out::println);

            ArrayList<CanClimb> climbers = new ArrayList<>();
            climbers.add(cat);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Za dlugie imie");
        }


//        Animal animal1=new Animal("Zwierze");   zmiana na klase abstrakcyjna
//        cat.sayMyName();
//        dog.sayMyName();
//
//        dog.eat();
//        cat.eat();


    }
}
