package com.agumen.alpha.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.agumen.alpha.domain.User;
import com.agumen.alpha.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index.html")
	public String loginPage(){
		return "login";
	}
	@RequestMapping(value = "/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommond) {
		boolean isValidUser = userService.hasMatchUser(loginCommond.getUserName(), loginCommond.getPassword());
		if (!isValidUser) {
			return new ModelAndView("login","error","用户名或密码错误");
		}else {
			User user = userService.findUserByUserName(loginCommond.getUserName());
			request.getSession().setAttribute("user", user);
			return new ModelAndView("main");
		}
	}

}
