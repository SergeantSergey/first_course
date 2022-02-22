package com.example.first_course.aop.Aspects;

import com.example.first_course.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentLoggingAdvise() {
//        System.out.println("Логируем получения списка студентов метода перед метода getStudents");
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentLoggingAdvise(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("Логируем получения списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentLoggingAdvise(Throwable exception) {
//        System.out.println("afterThrowingGetStudentLoggingAdvise: логируем выброс исключение " + exception);
//    }

//    @After("execution(* getStudents())")
//    public void afterGetStudentLoggingAdvise(){
//        System.out.println("afterGetStudentLoggingAdvise: логируем запрос");
//    }
}
