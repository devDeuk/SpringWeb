package org.hdcd.controller;

import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm(Model model) {
		logger.info("registerForm");
		
		Member member = new Member();
		
		member.setEmail("aaa@ccc.com");
		member.setUserName("홍길동");
		
		model.addAttribute("member", member);
		
		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Validated Member member, BindingResult result) {
		logger.info("register");
		
		if(result.hasErrors()) {
			return "registerForm";
		}
		
		logger.info("member.getUserId() = " + member.getUserId());
		logger.info("member.getUserName() = " + member.getUserName());
		logger.info("member.getEmail() = " + member.getEmail());
		
		return "result";
	}


}
