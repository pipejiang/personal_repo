package com.megvii.demo.service.impl;

import com.megvii.demo.dao.StudentMapper;
import com.megvii.demo.domain.Student;
import com.megvii.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> listAll() {
        log.info("Invoke listAll...");
        return studentMapper.listAll();
    }

    @Override
    public Student queryByKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

}
