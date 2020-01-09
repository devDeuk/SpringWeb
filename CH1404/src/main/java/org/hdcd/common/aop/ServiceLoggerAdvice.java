package org.hdcd.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceLoggerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(ServiceLoggerAdvice.class);

	@AfterReturning("execution(* org.hdcd.service.BoardService*.*(..))")
	public void logReturning(JoinPoint jp) {
		logger.info("logReturning");
		logger.info("logReturning : " + jp.getSignature());
	}

}
