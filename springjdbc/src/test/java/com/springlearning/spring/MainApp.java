package com.springlearning.spring;

import com.springlearning.spring.DAO.Student;
import com.springlearning.spring.DAO.StudentJDBCTemplate;
import com.springlearning.spring.config.DataConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class MainApp {

    @Autowired
    StudentJDBCTemplate studentJDBCTemplate;

    @Test
    public void test() {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("classpath:Beans.xml");
//        StudentJDBCTemplate studentJDBCTemplate =
//                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        System.out.println( "------Clearing all data from tale Student------" );
        studentJDBCTemplate.clear();
        System.out.println("------Records Creation------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Jack", 2);
        studentJDBCTemplate.create("Tim", 17);
        System.out.println("------Listing Multiple Records------");
        List<Student> students = studentJDBCTemplate.listStudents();
        for(Student student : students){
            System.out.printf("ID: " + student.getId() +
                    ", Name: " + student.getName() +
                    ",Age:" + student.getAge()+"\n");
        }
        System.out.println("-----Updating Record with ID = 2 ------");
        studentJDBCTemplate.update(2, 20);
        System.out.println("------Listing Record with ID = 2 ------");
        int id = 17;
        Student student = studentJDBCTemplate.getStudent(id);
        if(student != null){
            System.out.printf("ID: " + student.getId() +
                    ", Name: " + student.getName() +
                    ",Age:" + student.getAge()+"\n");
        }else {
            System.out.println("Student with ID " + id + "not found!");
        }

        System.out.println("------Succeeded------");
    }
}
