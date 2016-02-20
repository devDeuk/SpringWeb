package com.devdeuk.spring;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String register(Locale locale, Model model) {	
		System.out.println("GET일경우");
		
		return "register";
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String registerFinised(Locale locale,@ModelAttribute("user") User user, Model model) {	
		System.out.println("POST일경우"); 
		if(!user.getPassword().equals(user.getConfirmPassword())){
			model.addAttribute("msg", "password not matched!");			
			model.addAttribute("user", user);
			
			return "register";
		}
		
		UserDAO.save(user);
		return "redirect:registerFinished.do";
		                 
	}	
	
	@RequestMapping(value = "/registerFinished.do")
	public String registerFinished(Model model){
		return "registerFinished";
	}
}
