package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// if u want to navigate to other page without carrying data

	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mv = new ModelAndView("bootstrap");
		mv.addObject("message", "thank for visit");
		return mv;
		// return new ModelAndView("bootstrap");
	}

	@RequestMapping("/signin")
	public ModelAndView Signin() {
		ModelAndView mv = new ModelAndView("/signin");
		mv.addObject("User Click For Signin", "True");
		return mv;
	}

	@RequestMapping("/signup")
	public ModelAndView Signup() {
		ModelAndView mv = new ModelAndView("/signup");
		mv.addObject("User Click For Signup", "True");

		return mv;
	}

}
