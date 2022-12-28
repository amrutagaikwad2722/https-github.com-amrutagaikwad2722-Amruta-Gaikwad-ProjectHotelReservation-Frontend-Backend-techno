package com.HotelReservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.HotelReservation.form.LoginForm;
import com.HotelReservation.form.SigninForm;

@Controller
public class LoginController {

	//to get login form page
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		return "login";
}
  
	//checking for login credentials
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute (name="loginForm")  LoginForm loginForm, Model model) {
		
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			//if username and password is correct, we are returning home page
			return"home";
		}
		//if username or password is wrong
		model.addAttribute("invalidCredentials", true);
		//returning again login page
		return"login";
	}
	
	
	
	
	
	//to get signin form page
		@RequestMapping(value="/signin", method=RequestMethod.GET)
		public String getSigninForm() {
			return "signin";
	}
	  
		//checking for signin credentials
		@RequestMapping(value="/signin", method=RequestMethod.POST)
		public String signin(@ModelAttribute (name="signinForm")  SigninForm signinForm, Model model) {
			
			String username = signinForm.getUsername();
			String password = signinForm.getPassword();
			
			if("amruta".equals(username) && "amruta".equals(password)) {
				//if username and password is correct, we are returning home page
				return"home";
			}
			//if username or password is wrong
			model.addAttribute("invalidCredentials", true);
			//returning again signin page
			return"signin";
		}
		
	
}
