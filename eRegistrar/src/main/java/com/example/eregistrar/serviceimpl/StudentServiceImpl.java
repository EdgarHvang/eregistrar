package com.example.eregistrar.serviceimpl;

import com.example.eregistrar.entity.Student;
import com.example.eregistrar.repository.StudentRepository;
import com.example.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
         repository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1 = repository.getOne(student.getStudentId());
        student1.setCgpa(student.getCgpa());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setEnrollmentDate(student.getEnrollmentDate());
        student1.setInternational(student.isInternational());
        student1.setFirstName(student.getFirstName());
        student1.setMiddleName(student.getMiddleName());
        student1.setLastName(student.getLastName());
        student1.setStudentId(student.getStudentId());
       return repository.save(student1);
    }
}
