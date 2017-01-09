package com.niit.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController

{
	@RequestMapping("/")
	public String showHomePage()
	{
		return "HomePage";
	}
	
@RequestMapping("/AboutUs")
public String showAboutUs()
	{
		return "AboutUs";
	}

     
@RequestMapping("/ContactUs")
public String showContactUs()
{
	return "ContactUs";
}


@RequestMapping("/registration")
public String showregistration()
{
	return "registration";
}


@RequestMapping("/login")
public String showlogin()
{
	return "login";
}
 
     
}
