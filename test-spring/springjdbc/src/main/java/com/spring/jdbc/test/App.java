package com.spring.jdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
public static void main(String[] args) {
	 
	System.out.println("my program started......");
	
	ApplicationContext context=new AnnotationConfigApplicationContext(jdbcconfig.class);
		/*
		 * JdbcTemplate template=context.getBean("jdbcTemplate", JdbcTemplate.class);
		 * 
		 * //insert Query String
		 * query="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //fire query int result = template.update(query,2,"Ram Patel" ,"indore");
		 * 
		 * System.out.println("number of record insert.." +result);
		 */

	StudentDao studentDao =	context.getBean("studentDao",StudentDao.class);
	
		/*//insert method
		 * Student student=new Student(); student.setId(3);
		 * student.setName("Mohit Sen"); student.setCity("Bhopal");
		 * 
		 * int result = studentDao.insert(student);
		 * 
		 * System.out.println("student added" +result);
		 */
		//update method
		/*
		 * Student student=new Student(); student.setId(3); student.setName("Sagar");
		 * student.setCity("Pune");
		 * 
		 * int result = studentDao.change(student);
		 * System.out.println("changed data"+result);
		 */
		/*
		 * //delete method Student student=new Student(); student.setId(3); int result =
		 * studentDao.delete(student);
		 * 
		 * System.out.println("delete data"+result);
		 */
	
	//delete data
	
		/*
		 * int result = studentDao.delete(3);
		 * 
		 * System.out.println("delete"+result);
		 */
		/*
		 * Student student=studentDao.getStudent(2);
		 * 
		 * System.out.println(student);
		 */
	
	List<Student> student = studentDao.getAllStudent();
	for(Student s : student) {
	System.out.println(s);
	}
}
}
