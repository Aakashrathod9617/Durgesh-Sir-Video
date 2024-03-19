package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringjpaexampalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjpaexampalApplication.class, args);
	
	    UserRepository userRepository =context.getBean(UserRepository.class);
		/*
		 * User user=new User(); user.setName("Aakash Rathod"); user.setCity("Indore");
		 * user.setStatus("I Am Java Programer");
		 * 
		 * User user1 = userRepository.save(user);
		 * 
		 * System.out.println(user1);
		 */
	    

//	    User user1=new User();
//	    user1.setName("Mohit Sen");
//	    user1.setCity("Bhopal");
//	    user1.setStatus("MCA");
//	  
//
//	    User user2=new User();
//	    user2.setName("Ram Patel");
//	    user2.setCity("Indore");
//	    user2.setStatus("I Am Java Programer");
//	    
//	    
//	    //save singal user
//	   // User resultUser=userRepository.save(user2);
//	    List<User> users=List.of(user1,user2);
//	    
//	    //save multipal object
//	   Iterable<User> result= userRepository.saveAll(users);
//	  
//	   result.forEach(user->{
//		   System.out.println(user);
//	   });
//	   
//	   // System.out.println("save user"+ resultUser);
//	  System.out.println("done");
	
	
	//update   the user id 4
	    
//	    Optional<User> optional= userRepository.findById(4);
//	
//	  User user =   optional.get();
//	  user.setName("Manish Sen");
//	  User result=userRepository.save(user);
//	  System.out.println(result);
//	  
//	  System.out.println(user);
	    
	    //how to get the data
	    // findbyId(id)- return Optinal Containing your data
	    
	  // Iterable<User> itr= userRepository.findAll();
//	   itr.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			System.out.println(t);			
//		}
//	});
//	    
	 //useing lembda function
	   
	   //itr.forEach(user->{System.out.println(user);});
	   
	   
	    //Deleting the user element
	    
	    userRepository.deleteById(4);
	    
	    System.out.println("delete");
	}

}