package com.bkt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bkt.Entites.UserEntity;
import com.bkt.forms.LoginForm;
import com.bkt.services.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/ViewLogin.htm", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("login", new LoginForm());

		return "login";
	}

	@PostMapping("/loginSubmit.htm")
	public ModelAndView loginSubmit(@ModelAttribute("login") LoginForm loginform) {
		ModelAndView model = new ModelAndView();

		model.setViewName("userinfo");
		UserEntity user = userService.getUser(loginform.getLoginId());

		model.addObject(user);

		return model;

	}
}
