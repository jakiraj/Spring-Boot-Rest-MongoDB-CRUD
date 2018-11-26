package com.jakir.springmongorest.service;

import com.jakir.springmongorest.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    List<Student> getAllStudent();
    void deleteStudent(String id);
    Student getStudentByName(String name);
}
