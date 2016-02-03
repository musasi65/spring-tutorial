package demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemLogger {
	@Pointcut("execution(** demo.aop.TransactionManager.*(..))")
	public void logeer() {

	}

	@Before("logeer()")
	public void check() {
		System.out.println("check before transaction!");
	}
}
