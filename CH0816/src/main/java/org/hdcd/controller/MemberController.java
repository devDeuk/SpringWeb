package org.hdcd.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hdcd.domain.Address;
import org.hdcd.domain.Card;
import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
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
		
		String introduction = "안녕하세요.\n반갑습니다.";
		
		member.setIntroduction(introduction);
		
		model.addAttribute("member", member);
		
		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Member member) {
		logger.info("register");
		
		logger.info("member.getIntroduction() = " + member.getIntroduction());
		
		return "result";
	}

}
