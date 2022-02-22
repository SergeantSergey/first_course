package com.example.first_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

//        myDog.setName("Белка");
//        yourDog.setName("Стрелка");
//
//        System.out.println("Пременны ссыллаются на один и тот же объект " + (myDog == yourDog));
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        context.close();
    }
}
