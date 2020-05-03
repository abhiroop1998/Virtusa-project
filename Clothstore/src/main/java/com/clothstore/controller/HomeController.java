package com.clothstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("classActiveLogin",true);
		return "myAccount";
	}
	@RequestMapping("/forgetPasswrod")
	public String forgetPassword(Model model) {
		model.addAttribute("classActiveforgetPassword",true);
		return "myAccount";
	}
	
	@RequestMapping("/newUser")
	public String newUser(Model model) {
		model.addAttribute("classActiveNewUser",true);
		return "myAccount";
	}
	
}
