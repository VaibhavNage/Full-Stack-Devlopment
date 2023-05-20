package com.codekul.spring.di;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Student {
    @Autowired
    private Teacher teacher;

//1. Constructor based Dependency Injection (CDI)
@Autowired
public Student (Teacher teacher){
    this.teacher = teacher;
    System.out.println("in student constructor");
}

//2. Setter based Dependency Injection (SDI)
@Autowired
public void setTeacher(Teacher teacher){
    this.teacher = teacher;
}
}