package com.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.login.entity.User;
import com.demo.login.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	//private String errorMsg;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap model, @RequestParam String userId, @RequestParam String password) {

		User result = loginService.authenticateUser(userId, password);
		if (result != null) {
			model.put("user", result);
			return "welcome";
		} else {
			model.put("authenication", "fail");
			return "login";
		}
	}
}
