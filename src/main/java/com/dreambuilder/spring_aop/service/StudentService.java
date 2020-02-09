package com.dreambuilder.spring_aop.service;

import com.dreambuilder.spring_aop.dao.StudentDAO;
import com.dreambuilder.spring_aop.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentDAO studentDAO;
    @Autowired
    StudentService(final StudentDAO studentDAO)
    {
        this.studentDAO = studentDAO;
    }

    public Student getStudent()
    {
        Student student = studentDAO.getStudent();
        return student;
    }
}
