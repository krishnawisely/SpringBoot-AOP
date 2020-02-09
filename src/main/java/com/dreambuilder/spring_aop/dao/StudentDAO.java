package com.dreambuilder.spring_aop.dao;

import com.dreambuilder.spring_aop.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class StudentDAO {
    public Student getStudent()
    {
        String uri = "https://api.myjson.com/bins/eow68";
        RestTemplate restTemplate = new RestTemplate();
        Student student = restTemplate.getForObject(uri,Student.class);
        return student;
    }
}
