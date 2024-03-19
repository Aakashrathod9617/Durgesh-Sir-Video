package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "LearnCodeWith Aakash");
		model.addAttribute("Desc", "Home for programer");
		System.out.println("commone method");
		
	}
	
	@RequestMapping("/contect")
	public String ShowForm() {
		
		return "contect";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST )
	public String HendleForm(@ModelAttribute User user, Model model)
	{
		System.out.println(user);
		
		if (user.getUsername().isBlank()) {
			
			return"redirect:/contect";
		}
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createUser);
		return "sucess";
	}
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST )
	public String HendleForm
	(@RequestParam("email")String UserEmail,
	 @RequestParam("username") String UserName,
	 @RequestParam("password")String UserPassword,
	 Model model)
	{
		
		System.out.println("UserEmail "+ UserEmail);
		System.out.println("UserName "+ UserName);
		System.out.println("UserPassword "+ UserPassword);
		
		//seconde type
		//User user = new User();
		//user.setEmail(UserEmail);
		//user.setUsername(UserName);
		//user.setPassword(UserPassword);
		
		//prosess
		model.addAttribute("name", UserName);
		model.addAttribute("email", UserEmail);
		model.addAttribute("password", UserPassword);
		
		
		
		
		return "sucess";
	}
	*/
}
