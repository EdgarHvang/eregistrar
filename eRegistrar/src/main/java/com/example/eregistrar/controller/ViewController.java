package com.example.eregistrar.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class ViewController {

    @RequestMapping("/view-students")
    public String viewStudents() {
        return "view-students";
    }
    @RequestMapping("/add-students")
    public String addStudents() {
        return "add-students";
    }
}
