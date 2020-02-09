package com.dreambuilder.spring_aop.controller;

import com.dreambuilder.spring_aop.model.Student;
import com.dreambuilder.spring_aop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private StudentService studentService;
    @Autowired
    StudentController(final StudentService studentService)
    {
        this.studentService = studentService;
    }
    @GetMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getStudent()
    {
        Student student = studentService.getStudent();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
