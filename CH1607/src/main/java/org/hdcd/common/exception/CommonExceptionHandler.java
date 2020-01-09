package org.hdcd.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

	/*
	@ExceptionHandler(Exception.class)
	public ModelAndView handle(Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error/errorCommon");
		modelAndView.addObject("exception", ex);

		return modelAndView;
	}
	*/
	
	/* Spring  4.3.x는 가능  Model model 파라미터*/
	@ExceptionHandler(Exception.class)
	public String handle(Exception ex, Model model) {
		logger.info("handle " + ex.toString());
		
		model.addAttribute("exception", ex);

		return "/error/errorCommon";
	}
	
}
