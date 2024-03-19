package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String hone(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Sky Rathod");
		model.addAttribute("id", 2342321);

		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Mohit");
		friends.add("Manish");
		friends.add("Akshay");
		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");

		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//create model and view object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Sky-Harshu");
		modelAndView.addObject("rollnumber", 123);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list= new ArrayList<Integer>();
		list.add(11111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		
		modelAndView.addObject("marks", list);
		 
		//setting the view name
		modelAndView.setViewName("help"); 
		
		return modelAndView;
	}
}
