package com.codekul.spring.jdbctemplate.service.impl;

import com.codekul.spring.jdbctemplate.model.Student;
import com.codekul.spring.jdbctemplate.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentRepositoryImpl implements StudentRepository {
    private final String studCount = "select count(*) from student";
    private final String insetStudent = "insert into student(rno,name,age,city,gender) values(?,?,?,?,?)";
    private final String updateStudent = "update student set city = ? where rno = ?";
    private final String deleteStudent="delete from student where rno = ?";
    private final String findByRno="select * from student where rno = ?";
    private final String fetchAll="select * from student";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getStudentCount() {
        return jdbcTemplate.queryForObject(studCount, Integer.class);

    }

    @Override
    public String saveStudent(Student student) {
        try {
            jdbcTemplate.update(insetStudent, student.getRno(), student.getName(), student.getAge(), student.getCity(), student.getGender());
            return "Student saved successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateStudent(String city, Integer rno) {
        try {
            jdbcTemplate.update(updateStudent, city, rno);
            return "Student updated Successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String deleteStudent(Integer rno) {
        try {
            jdbcTemplate.update(deleteStudent,rno);
            return "Student deleted Successfully";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public Student findByRno(Integer rno) {
        return jdbcTemplate.queryForObject(findByRno, BeanPropertyRowMapper.newInstance(Student.class),rno);
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query(fetchAll,BeanPropertyRowMapper.newInstance(Student.class));
    }

}

