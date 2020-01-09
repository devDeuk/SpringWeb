package org.hdcd.common.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceLoggerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(ServiceLoggerAdvice.class);

	@After("execution(* org.hdcd.service.BoardService*.*(..))")
	public void endLog(JoinPoint jp) {
		logger.info("endLog");
		logger.info("endLog : " + jp.getSignature());
		logger.info("endLog : " + Arrays.toString(jp.getArgs()));
	}

}
