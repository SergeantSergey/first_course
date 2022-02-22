package com.example.first_course.aop.Aspects;

import com.example.first_course.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* com.example.first_course.aop.UniLibrary.*(..))")
//    public void allMethodFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.example.first_course.aop.UniLibrary.returnMagazine())")
//    public void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    public void allMethodExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodExceptReturnMagazineFromUniLibrary Лош №10");
//    }

//    @Pointcut("execution(* com.example.first_course.aop.UniLibrary.get*())")
//    public void allGetMethodsFromUniLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Лог №1");
//    }
//
//    @Pointcut("execution(* com.example.first_course.aop.UniLibrary.return*())")
//    public void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Лог №2");
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary() {
//
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: Лог №3");
//    }

    @Before("com.example.first_course.aop.Aspects.MyPointCats.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object object : args) {
                if (object instanceof Book) {
                    Book myBook = (Book) object;
                    System.out.println("Информация о книги: " + "название — " + myBook.getName() + " автор — " + myBook.getAuthor() + " год издания — " + myBook.getYearOfPublication());
                } else if (object instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + object);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: логирование попыткы получить книгу/журнал");
        System.out.println("---------------------------------");
    }
}