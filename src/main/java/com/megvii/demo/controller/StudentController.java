package com.megvii.demo.controller;

import com.megvii.demo.domain.Student;
import com.megvii.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "学员接口")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "查询所有学员", notes = "学员列表")
    @ResponseBody
    @GetMapping("/all/list")
    public List<Student> listAll() {
        return studentService.listAll();
    }

}
