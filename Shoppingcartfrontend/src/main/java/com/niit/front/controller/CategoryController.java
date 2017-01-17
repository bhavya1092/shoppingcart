package com.niit.front.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.niit.Shoppingbackend.dao.CategoryDAO;
import com.niit.Shoppingbackend.dao.ProductDAO;
import com.niit.Shoppingbackend.dao.SupplierDAO;
import com.niit.Shoppingbackend.modal.Category;
import com.niit.Shoppingbackend.modal.Product;
import com.niit.Shoppingbackend.modal.Supplier;
import com.niit.Shoppingbackend.modal.User;


@Controller
public class CategoryController 

{
	
	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Category category;
	// Creates empty obj and takes values frm user


		@ModelAttribute
		public Category returnObject1() 
		
		{
			return new Category();

		}

		@RequestMapping("/AddCategory")
		public ModelAndView ShowAddCategory(Model model) 

		{
			ModelAndView mv = new ModelAndView("AddCategory");

			model.addAttribute("categoryList", categoryDAO.list());
			System.out.println("added category details  in controller");

			return mv;
		}
		/*
		 * action of addcategory
		 */

		@RequestMapping(value = "/addcat", method = RequestMethod.POST)
		public String addCate(@Valid @ModelAttribute("category") Category cate, Model model, BindingResult result,HttpServletRequest request) throws IOException
		
		{
			if (cate.getCat_id() == 0) 
			
			{
				// new category, add it

				categoryDAO.saveOrUpdate(cate);
				System.out.println("adding of new category in controller");
				
			} 
			
			return "redirect:/AddCategory";

		}

		

		/* delete category... */
		@RequestMapping(value = "/deletecategory{id}")
		public ModelAndView showDeleteCategory(@PathVariable("id") String id, Model model) throws Exception 
		
		{

			int i = Integer.parseInt(id);

			category = categoryDAO.get(i);

			System.out.println("category delete");

			ModelAndView mv = new ModelAndView("AddCategory");

			categoryDAO.delete(i);
			mv.addObject("addcategory", 0);

			System.out.println("delete Id:" + id);

			return mv;

		}
		
		
        @RequestMapping(value = "/editcategory{id}")
		public ModelAndView updateCatPage(@PathVariable("id") String id, Model model) throws Exception 
		
		{
			
			int i = Integer.parseInt(id);

			model.addAttribute("category", categoryDAO.get(i));
			model.addAttribute("CategoryList", categoryDAO.list());
			System.out.println("edit category in controller");
			ModelAndView mv = new ModelAndView("AddCategory");
			return mv;

		}


}


			
	
