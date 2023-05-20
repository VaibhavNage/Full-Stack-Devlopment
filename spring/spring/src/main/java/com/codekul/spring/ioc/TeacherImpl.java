package com.codekul.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class TeacherImpl implements SchoolService{
    @Override
    public void doWork(){
        System.out.println("in teacher impl");
    }
}
