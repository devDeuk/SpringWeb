package org.hdcd.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeCheckerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(TimeCheckerAdvice.class);

	@Before("execution(* org.hdcd.service.BoardService*.*(..))")
	public void log(JoinPoint jp) {

		Object targetObject = jp.getTarget();

		logger.info("targetObject = " + targetObject);

		Object thisObject = jp.getThis();

		logger.info("thisObject = " + thisObject);

		Object[] args = jp.getArgs();

		logger.info("args.length = " + args.length);

	}

}
