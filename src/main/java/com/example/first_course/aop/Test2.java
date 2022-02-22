package com.example.first_course.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> listStudent = university.getStudents();
            System.out.println(listStudent);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e.getMessage());
        }

        context.close();
    }
}
