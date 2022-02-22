package com.example.first_course.aop.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCats {

    @Pointcut("execution(public * abc*(..))")
    public void allAddMethod() {
    }
}
