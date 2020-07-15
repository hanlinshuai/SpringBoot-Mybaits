package com.hanlin.springboot.service.impl;

import com.hanlin.springboot.mapper.mysql.MysqlStudentMapper;
import com.hanlin.springboot.mapper.oracle.OracleStudentMapper;
import com.hanlin.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author：hanlin.yuan
 * @date：2020/07/15
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private OracleStudentMapper oracleStudentMapper;
    @Autowired
    private MysqlStudentMapper mysqlStudentMapper;

    @Override
    public List<Map<String, Object>> getAllStudentsFromOralce() {
        return oracleStudentMapper.getAllStudents();
    }

    @Override
    public List<Map<String, Object>> getAllStudentsFromMysql() {
        return mysqlStudentMapper.getAllStudents();
    }
}
