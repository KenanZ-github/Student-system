package com.kenany.studentsystem.controller;

import com.kenany.studentsystem.model.Student;
import com.kenany.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add (@RequestBody Student student){
        studentService.saveStudent(student);
        return  "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
       return studentService.getAllStudent();
    }
}
