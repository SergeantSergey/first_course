package com.example.first_course.aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBeen")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу из: SchoolLibrary");
    }
}
