package com.te.emailapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.emailapp.bean.User_Info;
import com.te.emailapp.service.EmailService;

@Controller
public class EmailController {

	@Autowired(required = false)
	private EmailService serevice;

	@GetMapping("/login")
	public String loginForm() {
		return "loginform";
	}

	@PostMapping("/login")
	public String login(Integer id, String password, ModelMap map, HttpServletRequest req, HttpServletResponse resp) {
		User_Info info = serevice.login(id, password);
		if (info != null) {
			Cookie cookie = new Cookie("id", id + "");
			HttpSession session = req.getSession();
			session.setAttribute("isLogin", info);
			map.addAttribute("user", info);
			return "welcome";
		} else {
			map.addAttribute("err", "Invalid Credential");
			return "loginform";
		}

	}
	
	@GetMapping("/signup")
	public String getRegForm() {
		return "signUp";
	}
	@PostMapping("/register")
	public String register(User_Info info, ModelMap map) {
		if (serevice.register(info)) {
			map.addAttribute("err", "Registred Successfully");
			return "loginForm";
		} else {
			map.addAttribute("err", "Data already Exit");
			return "signUp";
		}
	}
}
