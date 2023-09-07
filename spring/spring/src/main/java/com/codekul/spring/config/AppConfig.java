package com.codekul.spring.config;

import com.codekul.spring.beanscope.Car;
import com.codekul.spring.beanscope.Vehicle;
import com.codekul.spring.di.Teacher;
import com.codekul.spring.ioc.SchoolService;
import com.codekul.spring.ioc.StudentImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.codekul.spring.ioc")
public class AppConfig {

    @Bean
    @Scope(value = "singleton")
    public Vehicle getVehicle(){
        return new Vehicle();
    }

    @Bean
    @Scope(value = "prototype")
    public Car getCar(){
        return new Car();
    }

    @Bean
    public Teacher getTeacher(){
        return new Teacher();
    }
//    @Bean
//    public SchoolService getSchoolImpl(){
//        return new StudentImpl();
//    }
}
