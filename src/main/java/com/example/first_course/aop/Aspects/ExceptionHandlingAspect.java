package com.example.first_course.aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("com.example.first_course.aop.Aspects.MyPointCats.allAddMethod()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: обрабатываем исключения при поытки получить книгу/журнал");
        System.out.println("---------------------------------");
    }
}
