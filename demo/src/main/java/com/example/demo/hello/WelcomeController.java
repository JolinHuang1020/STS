package com.example.demo.hello;


import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	
	
//	@RequestMapping("/welcome")
//	public String sayWelcome() {
//		return "Welcome to Spring Boot";  //works but no jsp file
//	}
//	
//	
//	@RequestMapping("/welcome")
//	public String sayWelcome() {
//		System.out.println("Welcome to Spring Boot");
//		return "welcome"; // not return to welcome.jsp!!
//	}
//	
//	@RequestMapping("/hello")
//	public String greeting() {
//		return "Hello to the world";	
//		
//	}

	
	//@Value("${welcome.message:test}")
	private String message="Hello World";
	
	private String m="Good morning";

	
	@RequestMapping("/hello")
    public String hello(Map<String, Object> model) {
        model.put("message", this.m);
        return "hello";
	}
	
//-----------------------------------------------------------	
	@RequestMapping("/hi")
    public ModelAndView getHello() {
		ModelAndView model= new ModelAndView("hi");
		model.addObject("msg", "Good morning the World");
		return model;
	}

//	@RequestMapping("hi/{userName}/{country}")
//	public ModelAndView helloUser(@PathVariable("userName") String name,
//			@PathVariable("country") String country) {
//		ModelAndView model = new ModelAndView("hi");
//		model.addObject("msg","Hello "+name +", Your are from " + country);
//		return model;
//	}
		//same result as above
		@RequestMapping("hi/{userName}/{country}")
		public ModelAndView helloUser(@PathVariable Map<String, String>pathVars) {
			String name= pathVars.get("userName");
			String country = pathVars.get("country");
			ModelAndView model = new ModelAndView("hi");
			model.addObject("msg","Hello "+name +", Your are from " + country);
			return model;
		
	}
	
	
	
	
	
	
	
	
	
}
