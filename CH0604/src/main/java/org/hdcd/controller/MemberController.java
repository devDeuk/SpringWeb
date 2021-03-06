package org.hdcd.controller;

import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm() {
		logger.info("registerForm");

		return "registerForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Member member, RedirectAttributes rttr) throws Exception {
		logger.info("register");

		rttr.addFlashAttribute("msg", "success");
		return "redirect:/result";
	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result() {
		logger.info("result");

		return "result";
	}

}
