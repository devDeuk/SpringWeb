package org.hdcd.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

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
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home0101", method = RequestMethod.GET)
	public String home0101(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		member.setPassword("1234");
		member.setEmail("aaa@ccc.com");
		member.setUserName("홍길동");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);
		
		member.setDateOfBirth(cal.getTime());
		
		model.addAttribute(member);
		
		return "home0101";
	}

	@RequestMapping(value = "/home0102", method = RequestMethod.GET)
	public String home0102(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = {"Music", "Movie"};
		
		member.setHobbyArray(hobbyArray);
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		member.setHobbyList(hobbyList);
		
		model.addAttribute(member);
		
		return "home0102";
	}

	@RequestMapping(value = "/home0103", method = RequestMethod.GET)
	public String home0103(Model model) {
		Member member = new Member();
		
		Address address = new Address();
		address.setPostCode("080908");
		address.setLocation("seoul");
		
		member.setAddress(address);
		
		model.addAttribute(member);
		
		return "home0103";
	}

	@RequestMapping(value = "/home0104", method = RequestMethod.GET)
	public String home0104(Model model) {
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
		
		member.setCardList(cardList);
		
		model.addAttribute(member);
		
		return "home0104";
	}

	@RequestMapping(value = "/home0105", method = RequestMethod.GET)
	public String home0105(Model model) {
		Map memberMap = new HashMap();
		
		memberMap.put("userId", "hongkd");
		memberMap.put("password", "1234");
		memberMap.put("email", "aaa@ccc.com");
		memberMap.put("userName", "홍길동");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);
		
		memberMap.put("dateOfBirth", cal.getTime());
		
		model.addAttribute("memberMap", memberMap);
		
		return "home0105";
	}

	@RequestMapping(value = "/home0201", method = RequestMethod.GET)
	public String home0201(Model model) {
		int coin = 1000;
		
		model.addAttribute("coin", coin);
		
		return "home0201";
	}

	@RequestMapping(value = "/home0202", method = RequestMethod.GET)
	public String home0202(Model model) {
		int coin = 1000;
		
		model.addAttribute("coin", coin);
		
		return "home0202";
	}

	@RequestMapping(value = "/home0203", method = RequestMethod.GET)
	public String home0203(Model model) {
		String userId = "hongkd";
		
		model.addAttribute("userId", userId);
		
		return "home0203";
	}

	@RequestMapping(value = "/home0301", method = RequestMethod.GET)
	public String home0301(Model model) {
		return "home0301";
	}
	
	@RequestMapping(value = "/home0302", method = RequestMethod.GET)
	public String home0302(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		
		return "home0302";
	}
	
	@RequestMapping(value = "/home0303", method = RequestMethod.GET)
	public String home0303(Model model) {
		Member member = new Member();
		
		member.setUserId("");
		
		model.addAttribute(member);
		return "home0303";
	}
	
	@RequestMapping(value = "/home0304", method = RequestMethod.GET)
	public String home0304(Model model) {
		Member member = new Member();
		
		member.setUserId("hongkd");
		
		model.addAttribute(member);
		return "home0304";
	}
	
	@RequestMapping(value = "/home0305", method = RequestMethod.GET)
	public String home0305(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = null;
		
		member.setHobbyArray(hobbyArray);
		
		model.addAttribute(member);
		return "home0305";
	}
	
	@RequestMapping(value = "/home0306", method = RequestMethod.GET)
	public String home0306(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = {};
		
		member.setHobbyArray(hobbyArray);
		
		model.addAttribute(member);
		return "home0306";
	}
	
	@RequestMapping(value = "/home0307", method = RequestMethod.GET)
	public String home0307(Model model) {
		Member member = new Member();
		
		String[] hobbyArray = {"Music", "Movie"};
		
		member.setHobbyArray(hobbyArray);
		
		model.addAttribute(member);
		return "home0307";
	}
	
	@RequestMapping(value = "/home0308", method = RequestMethod.GET)
	public String home0308(Model model) {
		Member member = new Member();
		
		model.addAttribute(member);
		return "home0308";
	}
	
	@RequestMapping(value = "/home0309", method = RequestMethod.GET)
	public String home0309(Model model) {
		Member member = new Member();
		
		List<String> hobbyList = new ArrayList<String>();
		
		member.setHobbyList(hobbyList);
		
		model.addAttribute(member);
		return "home0309";
	}
	
	@RequestMapping(value = "/home0310", method = RequestMethod.GET)
	public String home0310(Model model) {
		Member member = new Member();
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		member.setHobbyList(hobbyList);
		
		model.addAttribute(member);
		return "home0310";
	}

	@RequestMapping(value = "/home0311", method = RequestMethod.GET)
	public String home0311(Model model) {
		Map memberMap = new HashMap();
		
		model.addAttribute("memberMap", memberMap);
		
		return "home0311";
	}
	
	@RequestMapping(value = "/home0312", method = RequestMethod.GET)
	public String home0312(Model model) {
		Map memberMap = new HashMap();
		
		memberMap.put("userId", "hongkd");
		memberMap.put("password", "1234");
		memberMap.put("email", "aaa@ccc.com");
		memberMap.put("userName", "홍길동");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);
		
		memberMap.put("dateOfBirth", cal.getTime());
		
		model.addAttribute("memberMap", memberMap);
		
		return "home0312";
	}

	@RequestMapping(value = "/home0401", method = RequestMethod.GET)
	public String home0401(Model model) {
		int coin = 1000;
		String userId = "hongkd";
		Member member = new Member();
		
		model.addAttribute("coin", coin);
		model.addAttribute("userId", userId);
		model.addAttribute("member", member);
		
		return "home0401";
	}
	
}
