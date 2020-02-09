package com.dreambuilder.spring_aop.Util;

import com.dreambuilder.spring_aop.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class StudentLogger {
    @AfterReturning(pointcut = "execution(* com.dreambuilder.spring_aop.dao.StudentDAO.getStudent())", returning = "studentDetails")
    public void logStudent(JoinPoint joinPoint, Student studentDetails)
    {
        log.info("Method signature : {}",joinPoint.getSignature());
        log.info("Student details are retrieved by : {}",studentDetails.getId());
    }
}
