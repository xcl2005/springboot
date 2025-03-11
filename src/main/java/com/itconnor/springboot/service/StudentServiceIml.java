package com.itconnor.springboot.service;

import com.itconnor.springboot.DAO.Student;
import com.itconnor.springboot.DAO.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIml implements StudentService {
    @Resource
    private static StudentRepository StudentRepository;

    @Override
    public  Student getStudenById(long id) {
        return StudentRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
