package com.kenany.studentsystem.service;

import com.kenany.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List <Student> getAllStudent();


}
