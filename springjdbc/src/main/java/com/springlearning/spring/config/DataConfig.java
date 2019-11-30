package com.springlearning.spring.config;

import com.springlearning.spring.DAO.StudentJDBCTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://10.82.82.95:3306/TEST");
        dataSource.setUsername("root");
        dataSource.setPassword("w3015201301rb");
        return dataSource;
    }

    @Bean
    public StudentJDBCTemplate getStudentJDBCTemplate(){
        StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
        studentJDBCTemplate.setDataSource(getDataSource());
        return studentJDBCTemplate;
    }
}
