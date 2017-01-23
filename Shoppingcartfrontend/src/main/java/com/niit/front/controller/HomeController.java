package com.niit.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 

{
	
	@RequestMapping("/")
	public String showHomePage()
	
	{
		
		return "Home";
		
	}
	
	@RequestMapping("/login1")
	public String showLoginPage()
	
	{
		
		return "login1";
		
	}
	
}
    