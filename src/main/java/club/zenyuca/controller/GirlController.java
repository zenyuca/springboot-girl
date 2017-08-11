package club.zenyuca.controller;

import java.util.List;

import javax.validation.Valid;

import club.zenyuca.entity.Result;
import club.zenyuca.exception.GirlException;
import club.zenyuca.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import club.zenyuca.entity.Girl;
import club.zenyuca.repository.GirlRepository;
import club.zenyuca.service.GirlService;

/**
 *
 * @author yuca 日期：2017-08-10 14:42:40
 */
@RestController
public class GirlController {

	@Autowired
	private GirlRepository girlRepository;
	@Autowired
	private GirlService girlService;

	@GetMapping(value = "/girls")
	public List<Girl> girls() {
		return this.girlRepository.findAll();
	}

	/**
	 * @param girl	参数接收对象
	 * @param bindingResult	验证消息返回对象
	 * @return	返回给客户端的消息
	 */
	@PostMapping(value = "/girl")
	public Result<Girl> addGril(@Valid Girl girl, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			String err = bindingResult.getFieldError().getDefaultMessage();
			return ResultUtil.error(1, err);
		}
		return ResultUtil.success(this.girlRepository.save(girl));
	}

	@DeleteMapping(value = "/girl/{id}")
	public void delGirl(@PathVariable(value = "id") Integer id) {
		this.girlRepository.delete(id);
	}

	@PutMapping(value = "/girl/{id}")
	public Girl updateGirl(
			@PathVariable(value = "id") Integer id, 
			@RequestParam(value = "name") String name,
			@RequestParam(value = "age") Integer age) {
		Girl girl = new Girl();
		girl.setId(id);
		girl.setName(name);
		girl.setAge(age);
		
		return this.girlRepository.save(girl);
	}
	
	@GetMapping(value = "/girl/{id}")
	public Girl getGirl(@PathVariable(value = "id") Integer id) {
		return this.girlRepository.findOne(id);
	}
	
	@GetMapping(value = "/girl/age/{age}")
	public List<Girl> getByAge(@PathVariable(value = "age") Integer age) {
		return this.girlRepository.getByAge(age);
	}

	@PostMapping(value = "/girl/insertTwo")
	public void insertTow() {
		this.girlService.insertTwo();
	}

	@GetMapping(value = "/girl/getage/{age}")
	public void getAge(@PathVariable(value = "age") Integer age) throws GirlException {
		this.girlService.getAge(age);
	}
}
