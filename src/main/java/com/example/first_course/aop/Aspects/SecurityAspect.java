package com.example.first_course.aop.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class SecurityAspect {

    @Before("com.example.first_course.aop.Aspects.MyPointCats.allAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
        System.out.println("---------------------------------");
    }
}
