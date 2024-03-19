package com.spring.testorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		/*
		 * Student student = new Student(1, "Aakash Rathod", "khargone"); int r =
		 * studentDao.insert(student);
		 * 
		 * System.out.println("done " + r);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go) {
		System.out.println("add");
		System.out.println("display all student");
		System.out.println("detail of singal student");
		System.out.println("delete");
		System.out.println("update");
		System.out.println("for exit");

		try {
			int input = Integer.parseInt(br.readLine());
			/*
			 * if (input==1) { //add a new student }else if (input==2) { //desplay }
			 */

			switch (input) {
			case 1:
				// add a new student
				break;
			case 2:
					//display all student
				break;
			case 3:
				//get singal student data
				break;
			case 4:
				//for delete students
				break;
			case 5:
				//for update student
				break;
			case 6:
				//exit
				go=false;
				break;
			
				
			}

		} catch (Exception e) {
			System.out.println("Invalid Input Try with another one !!");
			System.out.println(e.getMessage());
		}

	}
System.out.println("thank you for using my Application");
}
}
