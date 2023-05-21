package com.bindebackend.bindebackend.controller;

import com.bindebackend.bindebackend.entity.Student;
import com.bindebackend.bindebackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    private Student student;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    @PostMapping("/createStudent")
    public ResponseEntity<Student> saveStudent(@ResponseBody Student student){
        this.student = student;
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/getallstudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
