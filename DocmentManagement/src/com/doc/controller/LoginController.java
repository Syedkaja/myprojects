package com.doc.controller;

//import org.springframework.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/welcome")
	public ModelAndView login() {
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from LoginController.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
		
	}

}
