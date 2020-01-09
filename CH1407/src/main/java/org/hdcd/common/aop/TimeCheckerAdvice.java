package org.hdcd.common.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeCheckerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(TimeCheckerAdvice.class);

	@Around("execution(* org.hdcd.service.BoardService*.*(..))")
	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable {

		long startTime = System.currentTimeMillis();
		logger.info(Arrays.toString(pjp.getArgs()));

		Object result = pjp.proceed();

		long endTime = System.currentTimeMillis();
		logger.info(pjp.getSignature().getName() + " : " + (endTime - startTime));
		
		return result;
	}

}
