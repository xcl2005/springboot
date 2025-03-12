package com.itconnor.springboot.controller;
import com.itconnor.springboot.DAO.Student;
import com.itconnor.springboot.service.StudentServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JsonController {
    @Autowired
    private StudentServiceIml StudentService;
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable long id) {
        return StudentService.getStudentById(id);
    }

}