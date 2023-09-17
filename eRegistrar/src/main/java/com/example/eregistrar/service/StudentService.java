package com.example.eregistrar.service;

import com.example.eregistrar.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAll();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long studentId);
}
