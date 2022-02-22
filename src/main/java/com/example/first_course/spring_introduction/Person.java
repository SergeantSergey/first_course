package com.example.first_course.spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Person {

    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person is create;");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person is create;");
//    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname;");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age;");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet;");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
