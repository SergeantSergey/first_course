package com.example.first_course.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBeen")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу: UniLibrary ");
        System.out.println("---------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу из: UniLibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал: UniLibrary");
        System.out.println("---------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал: UniLibrary");
        System.out.println("---------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Добавляем книгу в UniLibrary");
        System.out.println("---------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал: UniLibrary");
        System.out.println("---------------------------------");
    }
}
