package com.niit.front.controller;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingbackend.Dao.UserDAO;
import com.niit.shoppingbackend.model.User;

public class UserController

{

	@Autowired
	UserDAO userDAO;

	@Autowired
	User user;

	@RequestMapping("/isValidUser")
	public ModelAndView isValidate(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password)

	{

		System.out.println("in controller");
		@SuppressWarnings("unused")
		String message;
		ModelAndView mv;
		if (userDAO.isValidate(name, password))

		{

			message = "valid credientals";
			mv = new ModelAndView("AdminHome");

		}

		else

		{

			message = "invalid credientals";
			mv = new ModelAndView("login");

		}

		return mv;

	}

	@RequestMapping("/perform_logout")
	public ModelAndView showLogout(HttpServletRequest request, HttpSession session)

	{

		System.out.println("logout");
		ModelAndView mv = new ModelAndView("Home");
		session.invalidate();
		session = request.getSession(true);
		// Category category=new Category();
		mv.addObject("logOutMessage", "u hv successfully logged out..");
		mv.addObject("loggedOut", "true");

		return mv;

	}

	@RequestMapping("/registration")
	public ModelAndView ShowRegister(@ModelAttribute("user") User user, BindingResult result,
			HttpServletRequest request)

	{

		System.out.println("registered");
		ModelAndView mv = new ModelAndView("registration");
		return mv;

	}

	@ModelAttribute
	public User returnObject()

	{
		return new User();

	}

	@RequestMapping(value = "/addus", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, BindingResult result, HttpServletRequest request)

	{

		System.out.print(user.getCpassword());
		System.out.println(user.getPassword());

		user.setEnabled("true");
		user.setRole("ROLE_USER");

		if (user.getCpassword().equals(user.getPassword()))
			;

		{

			userDAO.saveOrUpdate(user);

		}

		return "login";

	}

	/* security check for login */

	@RequestMapping(value = "/login_session_attributes")
	/* getting values from textbox */

	public String login_session_attributes(HttpSession session, Model model,
			@RequestParam(value = "username") String id)

	{

		String name = SecurityContextHolder.getContext().getAuthentication().getName();

		System.out.println("inside security check");

		session.setAttribute("name", name);
		System.out.println(name);

		user = userDAO.get(id);
		int x = user.getUserid();
		session.setAttribute("email", user.getEmail());
		session.setAttribute("loggedInUser", user.getUsername());

		System.out.println("x value is" + x);
		session.setAttribute("loggedInUserID", x);

		session.setAttribute("LoggedIn", "true");

		@SuppressWarnings("unchecked")
		/* getting values from database */
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>)

		SecurityContextHolder.getContext().getAuthentication().getAuthorities();

		String role = "ROLE_USER";
		for (GrantedAuthority authority : authorities)

		{

			/* comparing both the values from txtbox and database */
			if (authority.getAuthority().equals(role))

			{

				System.out.println(role);

				return "Home";

			}

			else

				session.setAttribute("isAdmin", "true");

		}

		return "AdminHome";

	}

}
