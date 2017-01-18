package com.niit.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController<CategoryDAO> 

{

	@Autowired
    CategoryDAO categoryDAO;
	@RequestMapping("/")
	public String showHomePage()
	{
		
		return "AdminHome";
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


       @RequestMapping("/login")
       public String showlogin()
   
  {
	
	return "login";
	
  }
       /*@RequestMapping("/AddCategory")
		public ModelAndView ShowAddCategory(Model model) 
		
		{
			ModelAndView mv = new ModelAndView("AddCategory");

			model.addAttribute("categoryList", categoryDAO.list());
			System.out.println("added category details  in controller");

			return mv;
			
		}

*/     
	
	
}
