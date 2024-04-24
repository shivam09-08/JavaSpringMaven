package com.web.SpringWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	
	public String Homepage()
	{
		System.out.println("inside home page");
		return "NewFile";
	}
	
	@ModelAttribute("course")
	public String courseName()
	{
		return "java";
	}
	
//	public String add(HttpServletRequest req, HttpSession session)
//	{
//	int num1 = Integer.parseInt(req.getParameter("num1"));
//	int num2 = Integer.parseInt(req.getParameter("num2"));
	
//	public String add(@RequestParam ("num1") int num1 , @RequestParam ("num2") int num2, Model model )
//	{
//	int result = num1+num2;
//	
////	session.setAttribute("result", result);
//	model.addAttribute("result", result);

//		return "result";
//	@RequestMapping("/add")
//	public ModelAndView add(@RequestParam ("num1") int num1 , @RequestParam ("num2") int num2, ModelAndView mv)
//	{
//		int result = num1+num2;
//		
//		mv.addObject("result", result);
//		mv.setViewName("result");
//		return mv;
//	}
	

//	@RequestMapping("/addAlien")
//	public ModelAndView addAlien(@RequestParam ("aid") int aid , @RequestParam ("aname") String aname, ModelAndView mv)
//	{
//		Alien alien =new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
//		
//		mv.addObject("alien", alien);
//		mv.setViewName("result");
//		return mv;
//	}	
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
//		Alien alien =new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
//		
//		mv.addObject("alien", alien);
//		mv.setViewName("result");
		return "result";
	}	
	
}
