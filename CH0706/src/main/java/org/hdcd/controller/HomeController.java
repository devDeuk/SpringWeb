package org.hdcd.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hdcd.domain.Card;
import org.hdcd.domain.Member;
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
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		
		return "home0101";
	}
	
	@RequestMapping(value = "/home0102", method = RequestMethod.GET)
	public String home0102(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd<>&'\"");
		
		model.addAttribute(member);
		
		return "home0102";
	}
	
	@RequestMapping(value = "/home0103", method = RequestMethod.GET)
	public String home0103(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd<>&'\"");
		
		model.addAttribute(member);
		
		return "home0103";
	}

	@RequestMapping(value = "/home0104", method = RequestMethod.GET)
	public String home0104(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd<>&'\"");
		
		model.addAttribute(member);
		
		return "home0104";
	}

	@RequestMapping(value = "/home0105", method = RequestMethod.GET)
	public String home0105(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		
		return "home0105";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		
		return "home0201";
	}

	@RequestMapping(value = "/home0202", method = RequestMethod.GET)
	public String home0202(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		
		return "home0202";
	}

	@RequestMapping(value = "/home0203", method = RequestMethod.GET)
	public String home0203(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		
		return "home0203";
	}

	@RequestMapping(value = "/home0204", method = RequestMethod.GET)
	public String home0204(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		
		return "home0204";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		
		return "home0301";
	}

	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = {"Music", "Movie"};
		
		member.setHobbyArray(hobbyArray);
		
		model.addAttribute(member);
		
		return "home0401";
	}

	@RequestMapping(value = "/home0402", method = RequestMethod.GET)
	public String home0402(Model model) {
		return "home0402";
	}

	@RequestMapping(value = "/home0501", method = RequestMethod.GET)
	public String home0501(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		
		return "home0501";
	}

	@RequestMapping(value = "/home0502", method = RequestMethod.GET)
	public String home0502(Model model) {
		Member member = new Member();
		member.setForeigner(true);
		
		model.addAttribute(member);
		
		return "home0502";
	}

	@RequestMapping(value = "/home0601", method = RequestMethod.GET)
	public String home0601(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		
		return "home0601";
	}
	
	@RequestMapping(value = "/home0602", method = RequestMethod.GET)
	public String home0602(Model model) {
		Member member = new Member();
		member.setGender("F");
		
		model.addAttribute(member);
		
		return "home0601";
	}
	
	@RequestMapping(value = "/home0603", method = RequestMethod.GET)
	public String home0603(Model model) {
		Member member = new Member();
		member.setGender("M");
		
		model.addAttribute(member);
		
		return "home0601";
	}

	@RequestMapping(value = "/home0701", method = RequestMethod.GET)
	public String home0701(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = {"Music", "Movie"};
		
		member.setHobbyArray(hobbyArray);
		
		model.addAttribute(member);
		
		return "home0701";
	}

	@RequestMapping(value = "/home0702", method = RequestMethod.GET)
	public String home0702(Model model) {
		Member member = new Member();
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		member.setHobbyList(hobbyList);
		
		model.addAttribute(member);
		
		return "home0702";
	}
	
	@RequestMapping(value = "/home0703", method = RequestMethod.GET)
	public String home0703(Model model) {
		Member member = new Member();
		
		List<Card> cardList = new ArrayList<Card>();
		
		Card card1 = new Card();
		card1.setNo("123456");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 8);
		
		card1.setValidMonth(cal.getTime());
		
		cardList.add(card1);
		
		Card card2 = new Card();
		card2.setNo("456786");
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 7);
		
		card2.setValidMonth(cal.getTime());
		
		cardList.add(card2);
		
		member.setCardList(cardList);;
		
		model.addAttribute(member);
		
		return "home0703";
	}

	@RequestMapping(value = "/home0801", method = RequestMethod.GET)
	public String home0801(Model model) {
		Member member = new Member();
		
		String hobby = "Music,Movie";
		
		member.setHobby(hobby);
		
		model.addAttribute(member);
		
		return "home0801";
	}

	@RequestMapping(value = "/home0901", method = RequestMethod.GET)
	public String home0901(Model model) {
		return "home0901";
	}

	@RequestMapping(value = "/home0902", method = RequestMethod.GET)
	public String home0902(Model model) {
		return "home0902";
	}

	@RequestMapping(value = "/home1001", method = RequestMethod.GET)
	public String home1001(Model model) {
		return "home1001";
	}
	
	@RequestMapping(value = "/home1002", method = RequestMethod.GET)
	public String home1002(Model model) {
		return "home1002";
	}

	@RequestMapping(value = "/home1101", method = RequestMethod.GET)
	public String home1101(Model model) {
		return "home1101";
	}
	
	@RequestMapping(value = "/home1102", method = RequestMethod.GET)
	public String home1102(Model model) {
		return "home1102";
	}

	@RequestMapping(value = "/home1103", method = RequestMethod.GET)
	public String home1103(Model model) {
		return "home1103";
	}
	
}
