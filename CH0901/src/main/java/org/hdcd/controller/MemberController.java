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
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Validated Member member, BindingResult result) {
		logger.info("register");
		
		if(result.hasErrors()) {
			return "registerForm";
		}
		
		logger.info("member.getUserId() = " + member.getUserId());
		logger.info("member.getGender() = " + member.getGender());
		
		return "success";
	}

	@RequestMapping(value = "/registerForm01", method = RequestMethod.GET)
	public String registerForm01(Model model) {
		logger.info("registerForm01");
		
		model.addAttribute("member", new Member());
		
		return "registerForm";
	}

	@RequestMapping(value = "/registerForm02", method = RequestMethod.GET)
	public String registerForm02(Model model) {
		logger.info("registerForm02");
		
		Member member = new Member();
		
		member.setPassword("1234");
		member.setEmail("aaa@ccc.com");
		member.setUserName("홍길동");
		
		member.setGender("female");
		
		model.addAttribute("member", member);
		
		return "registerForm";
	}

}
