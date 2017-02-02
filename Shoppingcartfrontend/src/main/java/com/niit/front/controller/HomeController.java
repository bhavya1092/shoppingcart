package com.niit.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	

     @RequestMapping("/Product")
 	public ModelAndView showProducts()
 	
 	{
 		ModelAndView mv=new ModelAndView("Product");
 		mv.addObject("msg", "You clicked Products link");
 		mv.addObject("showProducts","true");
 		
 		return mv;
 		
 	}
 	
	@RequestMapping("/Home")
 	public ModelAndView showProductsDetails()
 	
 	{
 		ModelAndView mv=new ModelAndView("Home");
 		mv.addObject("msg", "You clicked Home link");
 		mv.addObject("Home","true");
 		
 		return mv;
 	}
	
}