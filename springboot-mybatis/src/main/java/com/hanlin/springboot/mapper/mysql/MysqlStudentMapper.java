package com.hanlin.springboot.mapper.mysql;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MysqlStudentMapper {
	List<Map<String, Object>> getAllStudents();
}
