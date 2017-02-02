package com.niit.front.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingbackend.Dao.SupplierDAO;
import com.niit.shoppingbackend.model.Supplier;


    @Controller
	public class SupplierController 


	{
		
		@Autowired
		Supplier supplier;
		
		@Autowired
		SupplierDAO supplierDAO;

		
		
		@RequestMapping("/AddSupplier")
		public ModelAndView ShowAddSupplier(Model model) 

		{
			
		    	ModelAndView mv = new ModelAndView("AddSupplier");
		        model.addAttribute("supplierList", supplierDAO.list());
			   System.out.println("added supplier details  in controller");

			return mv;
			
		}
		
		
		@ModelAttribute
		public Supplier returnObject2() 
		
		{
			return new Supplier();

		}


		/* action of addsupplier */

		@RequestMapping(value = "/addsup", method = RequestMethod.POST)
		public String addSupp (@Valid @ModelAttribute("supplier") Supplier supp, Model model, BindingResult result, HttpServletRequest request) throws IOException


		{
			
			if ( supp.getSup_id() == 0) 
			
			{
				// new supplier, add it

				supplierDAO.saveOrUpdate(supp);
				System.out.println("adding of new supplier in controller");
			}
			

			return "redirect:/AddSupplier";

		}

		/* delete supplier... */
		@RequestMapping(value = "/deletesupplier{id}")
		public ModelAndView showDeleteSupplier(@PathVariable("id") String id, Model model) throws Exception 

		{

			int i = Integer.parseInt(id);

			supplier = supplierDAO.get(i);

			System.out.println("supplier delete");

			ModelAndView mv = new ModelAndView("addsupplier");

			supplierDAO.delete(i);
			mv.addObject("addsupplier", 0);

			System.out.println("delete Id:" + id);

			return mv;

		}

		/*
		 * /////////////////////////
		 */

		@RequestMapping(value = "/editsupplier{id}")
		public ModelAndView UpdatesuppPage(@PathVariable("id") String id, Model model) throws Exception 

		{
			
			int i = Integer.parseInt(id);

			model.addAttribute("supplier", supplierDAO.get(i));
			model.addAttribute("SupplierList", supplierDAO.list());
			System.out.println("edit supplier in controller");
			ModelAndView mv = new ModelAndView("addsupplier");
			return mv;

			
		      }


     }
	
	
