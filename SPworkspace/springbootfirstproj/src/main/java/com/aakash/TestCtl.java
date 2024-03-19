package com.aakash;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestCtl {
	
	@RequestMapping("/test")
	public String FirstHendler() {
		
		return "just for testing";
	}
	

}
