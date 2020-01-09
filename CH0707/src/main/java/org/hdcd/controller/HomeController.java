package org.hdcd.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home0101", method = RequestMethod.GET)
	public String home0101(Model model) {
		int coin = 1000;
		
		model.addAttribute("coin", coin);
		
		return "home0101";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		String coin = "1,000";
		
		model.addAttribute("coin", coin);
		
		return "home0201";
	}
	
	@RequestMapping(value = "/home0202", method = RequestMethod.GET)
	public String home0202(Model model) {
		String coin = "￦1,000";
		
		model.addAttribute("coin", coin);
		
		return "home0202";
	}
	
	@RequestMapping(value = "/home0203", method = RequestMethod.GET)
	public String home0203(Model model) {
		String coin = "1000%";
		
		model.addAttribute("coin", coin);
		
		return "home0203";
	}
	
	@RequestMapping(value = "/home0204", method = RequestMethod.GET)
	public String home0204(Model model) {
		String coin = "1,000.25";
		
		model.addAttribute("coin", coin);
		
		return "home0204";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		Date date = new Date();
		
		model.addAttribute("now", date);
		
		return "home0301";
	}
	
	@RequestMapping(value = "/home0302", method = RequestMethod.GET)
	public String home0302(Model model) {
		Date date = new Date();
		
		model.addAttribute("now", date);
		
		return "home0302";
	}
	
	@RequestMapping(value = "/home0303", method = RequestMethod.GET)
	public String home0303(Model model) {
		Date date = new Date();
		
		model.addAttribute("now", date);
		
		return "home0303";
	}

	@RequestMapping(value = "/home0304", method = RequestMethod.GET)
	public String home0304(Model model) {
		Date date = new Date();
		
		model.addAttribute("now", date);
		
		return "home0304";
	}	
	
	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		String dateValue = "2019. 2. 1";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0401";
	}

	@RequestMapping(value = "/home0402", method = RequestMethod.GET)
	public String home0402(Model model) {
		String dateValue = "19. 2. 1";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0402";
	}
	
	@RequestMapping(value = "/home0403", method = RequestMethod.GET)
	public String home0403(Model model) {
		String dateValue = "2019. 2. 1";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0403";
	}
	
	@RequestMapping(value = "/home0404", method = RequestMethod.GET)
	public String home0404(Model model) {
		String dateValue = "2019년 2월 1일 (금)";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0404";
	}
	
	@RequestMapping(value = "/home0405", method = RequestMethod.GET)
	public String home0405(Model model) {
		String dateValue = "2019년 2월 1일 금요일";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0405";
	}
	
	@RequestMapping(value = "/home0406", method = RequestMethod.GET)
	public String home0406(Model model) {
		String dateValue = "2019-02-01 15:00:35";
		
		model.addAttribute("dateValue", dateValue);
		
		return "home0406";
	}

}
