/*package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;



@Controller
public class UserController {
//first do integration
	// When user clicks login
	// based on credentials i want to find whether he is admin or not
	// if he is admin i wantto navigate to admin page
	// if he is user i want to navigate to user page
	// if the user doesnot exists with given credentials ,i want to give Erroe
	// message

	@Autowired
	UserDetailsDAO userDetailsDAO;
	UserDetails userDetails;

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password,HttpSession session) {

		ModelAndView mv = new ModelAndView("home");
		String msg;
		userDetails = userDetailsDAO.isValidUser(id,password);
		if (userDetails == null) {

			msg = "Invalid User.......pls try Again";
		} else {
			// find out whether user is adin r not

			if (userDetails.getRole().equals("ROLE_ADMIN")) {
				mv = new ModelAndView("adminHome");
			} else {
                        
				session.setAttribute("welcomemsg",userDetails.getName());
				session.setAttribute("userID",userDetails.getId());
			}

		}

		return mv;

	}

}*/