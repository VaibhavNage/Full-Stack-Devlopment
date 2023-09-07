package com.codekul.spring.di;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Teacher {
    public Teacher(){
        System.out.println("in teacher");
    }
    public void doWork(){
        System.out.println("do work");
    }
}
