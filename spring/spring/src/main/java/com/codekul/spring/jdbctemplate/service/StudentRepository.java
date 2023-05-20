package com.codekul.spring.jdbctemplate.service;

import com.codekul.spring.jdbctemplate.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    Integer getStudentCount();
    String saveStudent(Student student);

    String updateStudent(String city,Integer rno);

    String deleteStudent(Integer rno);

    Student findByRno(Integer rno);

    List<Student> findAll();
}

