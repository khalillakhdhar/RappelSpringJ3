package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.duranco.model.User;

@RestController
public class MainController {

	@GetMapping("") //path => commun= localhost:8080
	public String GoodMorning()
	{
		return "<h1>bonjour le monde</h1>";
	}
	@GetMapping("hello")
	public ModelAndView sayHello()
	{
		ModelAndView mymodel=new ModelAndView("welcome.html");
		return mymodel;
		
	}
	@GetMapping("show")
	public String showUser()
	{
		User u1=new User(1,"admin", "user", 40);
		return u1.toString();
		
	}
	
	
}
