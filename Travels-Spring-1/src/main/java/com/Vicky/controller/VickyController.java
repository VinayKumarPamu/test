package com.Vicky.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan(basePackages = "com")
public class VickyController {
	@GetMapping("/logIn")
	public String getLogin() {
		System.out.println("LogIn page Loaded");
		return "LogIn";
	}

	}

