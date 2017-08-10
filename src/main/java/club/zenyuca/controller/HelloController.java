package club.zenyuca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import club.zenyuca.entity.Url;

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

	// /hello 和 /hi 都能映射到 sayHi 方法
	@RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.POST)
	public String sayHi() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping(value = "/url", method = RequestMethod.GET)
	public Url url() {
		return this.url;
	}

	/**
	 * @PathVariable 是获取 url 中的参数（以 {} 扩起来）
	 * 实现restful的必要工具。
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getUser(@PathVariable(value = "id") Integer id) {
		return "UserId is " + id;
	}

	/**
	 * @RequestParam 获取请求参数的值
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUserId(@RequestParam(value = "id", required = false, defaultValue = "-1") Integer id) {
		return "用户编号是：" + id;
	}

	/**
	 * @GetMapping 是 @RequestMapping(value = "", method = RequestMethod.GET) 的组合注解
	 * 类似的还有 @PostMapping 等等。
	 */
	@GetMapping(value = "/username/{name}")
	public String getUserName(@PathVariable(value = "name", required = true) String name) {
		return "用户名是：" + name;
	}
}
