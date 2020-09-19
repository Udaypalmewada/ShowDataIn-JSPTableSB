package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.domain.User;
import com.spring.boot.service.UserService;

@Controller
public class GenericController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("")
	public ModelAndView homePage() {
		ModelAndView vname = new ModelAndView();
		vname.setViewName("home");
		return vname;
	}

	@RequestMapping("registor")
	public ModelAndView registor(Model model) {
		model.addAttribute("user", new User());
		return new ModelAndView("ragistration");

	}
	
		@RequestMapping("welcome")
		public ModelAndView welcomeUser() {
			ModelAndView vname = new ModelAndView();
			vname.setViewName("welcome");
			return vname;
		}
		
		@RequestMapping("view")
		public ModelAndView userList(Model model) {
			List<User>userList=new ArrayList<User>();
			userList=userService.ListOfUSer();
			model.addAttribute("userList", userList);
			return new ModelAndView("list");
		}
}
