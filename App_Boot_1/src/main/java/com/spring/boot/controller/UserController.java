package com.spring.boot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.domain.User;
import com.spring.boot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	

	
	@RequestMapping(path = "registorUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") User user, Model model, HttpSession session) {
		 int id = userService.ragistor(user);
		if (id > 0) {
			model.addAttribute("msg", "Registration Successfull");
			session.setAttribute("name", user.getName());
			return new ModelAndView("redirect:/welcome");       
		} else {
			model.addAttribute("msg", "User Not Registered...Please Try Again");
			model.addAttribute("register", new User());
			return new ModelAndView("redirect:/error");
		}
	}

	public ModelAndView login(int id, String email) {
		int count = userService.logIn(id, email);
		return null;
	}


	public ModelAndView getPwsByMobile(long mobile) {
		return null;

	}

	public ModelAndView getPwsByEmail(String email) {
		return null;

	}

}
