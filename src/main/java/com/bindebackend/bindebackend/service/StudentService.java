package com.bindebackend.bindebackend.service;

import com.bindebackend.bindebackend.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student>getAllStudent();
    Student getStudentById(Long id);
    Student updateStudent(Student student,Long id);
    void deleteStudentById(Long id);
}
