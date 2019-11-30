package com.springlearning.spring.DAO;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setAge(resultSet.getInt("age"));
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        return student;
    }
}
