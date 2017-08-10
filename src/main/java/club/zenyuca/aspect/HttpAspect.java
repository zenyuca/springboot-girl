package club.zenyuca.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author yuca
 * 日期：2017-08-10 17:30:35
 */
@Aspect
@Component
public class HttpAspect {

	@Before(value = "execution(public * club.zenyuca.controller.GirlController.*(..))")
	public void log() {
		System.out.println("log123");
	}
}
