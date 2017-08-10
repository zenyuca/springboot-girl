package club.zenyuca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yuca
 * 日期：2017-08-10 09:34:11
 */

/*
 * @RestController 等同于 @Controller + @ResponseBody
 */
@RestController
//@Controller
//@ResponseBody
public class HelloController {
	@Autowired
	private Url url;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHi() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping(value = "/url", method = RequestMethod.GET)
	public Url url() {
		return this.url;
	}
}
