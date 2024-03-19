package com.spring.jdbc.test;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoimpl;

@Component
public class jdbcconfig {
	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
		
	}
	@Bean(name= {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoimpl studentDao=new StudentDaoimpl();
		studentDao.setJdbcTemplate(getTemplate());
		
		return studentDao;
		
	}
	
}
