package com.example.first_course.aop;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.first_course.aop")
public class MyConfig {
}
