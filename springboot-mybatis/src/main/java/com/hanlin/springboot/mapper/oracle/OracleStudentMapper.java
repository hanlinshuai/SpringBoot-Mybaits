package com.hanlin.springboot.mapper.oracle;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OracleStudentMapper {
	List<Map<String, Object>> getAllStudents();
}
