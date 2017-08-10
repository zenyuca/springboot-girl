package club.zenyuca;

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

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHi() {
		return "Hello Spring Boot!";
	}
}
