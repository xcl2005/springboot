package com.itconnor.springboot.service;

import com.itconnor.springboot.DAO.Student;
import com.itconnor.springboot.DAO.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIml implements StudentService {
    @Resource
    private StudentRepository studentRepository;

    @Override
    public  Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
