package com.example.eregistrar.controller;

import com.example.eregistrar.entity.Student;
import com.example.eregistrar.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Student student, HttpServletRequest request) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Student student, HttpServletRequest request) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @DeleteMapping()
    public ResponseEntity<?> delete(@RequestParam Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

}
