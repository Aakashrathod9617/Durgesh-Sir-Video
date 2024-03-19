package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoimpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {

		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		
		return r;
	}
	
	public int change(Student student) {
		//updating data
		String query="update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return r;
	}
	
	/*
	 * public int delete(Student student) { //delete data String
	 * query="delete from student where id=?"; int r =
	 * this.jdbcTemplate.update(query,student.getId()); return r; }
	 */
	
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
				return r ;
	}
	
	public Student getStudent(int studentId) {
		//selecting singal student data
		
		String query="select*from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId );
		return student;
	}


	public List<Student> getAllStudent() {
		//selecting multipal Student
		String query="select* from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	





	

	

}