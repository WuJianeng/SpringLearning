package com.springlearning.spring.DAO;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age) {
        String SQL = "INSERT INTO Student(name, age) values(?, ?)";
        jdbcTemplateObject.update(SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL = "SELECT id, name, age FROM Student WHERE id = ?";
        Student student = null;
        try{
            student = jdbcTemplateObject.queryForObject(SQL,
                    new Object[]{id}, new StudentMapper());
        }catch (EmptyResultDataAccessException e){
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "SELECT id, name, age FROM Student";
        List<Student> students = jdbcTemplateObject.query(SQL,
                new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "DELETE FROM Student WHERE id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
    }

    @Override
    public void clear() {
        String SQL = "DELETE FROM Student";
        jdbcTemplateObject.execute(SQL);
        System.out.println("Records has been deleted.");
    }

    @Override
    public void update(Integer id, Integer age) {
        String SQL = "UPDATE Student SET age = ? WHERE id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id);
    }
}
