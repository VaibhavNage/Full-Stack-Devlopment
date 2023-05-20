package com.codekul.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements SchoolService{
    @Override
    public void doWork(){
        System.out.println("in student impl");
    }
}
