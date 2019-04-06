package com.megvii.demo.service.impl;

import com.megvii.demo.dao.StudentMapper;
import com.megvii.demo.domain.Student;
import com.megvii.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> listAll() {
        return studentMapper.listAll();
    }

}
