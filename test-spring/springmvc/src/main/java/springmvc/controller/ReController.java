package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	
	//redirect view
	@RequestMapping("/one")
	public RedirectView one(){
		System.out.println("this is one hendler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("enjoy");
		
		return redirectView;
	}
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is two hendler [enjoy]");
		
		return "contect";
	}
	
	
	/*
	 * //redirect Prefix
	 * 
	 * @RequestMapping("/one") public String one(){
	 * System.out.println("this is one hendler");
	 * 
	 * return "redirect:/enjoy"; }
	 * 
	 * @RequestMapping("/enjoy") public String two() {
	 * System.out.println("this is two hendler [enjoy]");
	 * 
	 * return "contect"; }
	 */
}
