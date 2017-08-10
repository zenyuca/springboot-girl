package club.zenyuca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yuca
 * 日期：2017-08-10 09:34:11
 */
@RestController
public class HelleController {
	
	@Value("${url}")
	private String url;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHi() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping(value = "/url", method = RequestMethod.GET)
	public String url() {
		return this.url;
	}
}
