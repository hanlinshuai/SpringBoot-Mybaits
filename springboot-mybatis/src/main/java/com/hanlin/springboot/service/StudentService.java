package com.hanlin.springboot.service;

import java.util.List;
import java.util.Map;

/**
 * @author：hanlin.yuan
 * @date：2020/07/15
 */
public interface StudentService {
    /**
     * oracle查询
     * @return
     */
    List<Map<String, Object>> getAllStudentsFromOralce();

    /**
     *  mysql查询
     * @return
     */
    List<Map<String, Object>> getAllStudentsFromMysql();
}
