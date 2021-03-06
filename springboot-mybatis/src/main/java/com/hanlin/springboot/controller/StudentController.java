package com.hanlin.springboot.controller;

import com.hanlin.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author：hanlin.yuan
 * @date：2020/07/15
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("querystudentsfromoracle")
    public List<Map<String, Object>> queryStudentsFromOracle(){
        return this.studentService.getAllStudentsFromOralce();
    }

    @RequestMapping("querystudentsfrommysql")
    public List<Map<String, Object>> queryStudentsFromMysql(){
        return this.studentService.getAllStudentsFromMysql();
    }

}
