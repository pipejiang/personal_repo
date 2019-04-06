package com.megvii.demo.service;

import com.megvii.demo.domain.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查询所有学生信息；
     * @return 学生基本信息列表
     */
    List<Student> listAll();
}
