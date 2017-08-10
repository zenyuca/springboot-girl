package club.zenyuca.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author yuca
 * 日期：2017-08-10 17:30:35
 */
@Aspect
@Component
public class HttpAspect {

	@Pointcut(value = "execution(public * club.zenyuca.controller.GirlController.*(..))")
	public void log() {
	}

	@Before("log()")
	public void doBefore() {
		System.out.println("我来了");
	}

	@After("log()")
	public void doAfter() {
		System.out.println("我走了");
	}
}
