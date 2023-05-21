package com.bindebackend.bindebackend.service.StudentServiceImpl;

import com.bindebackend.bindebackend.entity.Student;
import com.bindebackend.bindebackend.exception.StudentNotFoundException;
import com.bindebackend.bindebackend.repository.StudentRepository;
import com.bindebackend.bindebackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student", "id", id));
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student","id", id));
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setEmail(student.getEmail());
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.findById(id).orElseThrow(() ->
                new StudentNotFoundException("Student", "id", id));
        studentRepository.deleteById(id);


    }
}
