package com.example.first_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dogBeen", Dog.class);
        Dog myDog = context.getBean("dogBeen", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект " + (dog == myDog));
        System.out.println(dog);
        System.out.println(myDog);
        context.close();
    }
}
