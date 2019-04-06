package com.megvii.demo.controller;

import com.megvii.demo.domain.Student;
import com.megvii.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @ResponseBody
    @GetMapping("/all/list")
    public List<Student> listAll() {
        return studentService.listAll();
    }

}
