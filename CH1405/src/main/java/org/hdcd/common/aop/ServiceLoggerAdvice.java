package org.hdcd.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceLoggerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(ServiceLoggerAdvice.class);

	@AfterThrowing(pointcut = "execution(* org.hdcd.service.BoardService*.*(..))", throwing = "e")
	public void logException(JoinPoint jp, Exception e) {
		logger.info("logException");
		logger.info("logException : " + jp.getSignature());

		logger.info("logException : " + e);
	}

}
