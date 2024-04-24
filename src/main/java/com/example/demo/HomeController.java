package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String homepage()
	{
		System.out.println("inside home page");
		return "index";
	}

}
