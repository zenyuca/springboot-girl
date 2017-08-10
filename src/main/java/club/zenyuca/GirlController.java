package club.zenyuca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yuca 日期：2017-08-10 14:42:40
 */
@RestController
public class GirlController {

	@Autowired
	private GirlRepository girlRepository;

	@GetMapping(value = "/girls")
	public List<Girl> girls() {
		return this.girlRepository.findAll();
	}

	@PostMapping(value = "/girl")
	public Girl addGril(
			@RequestParam(value = "name") String name, 
			@RequestParam(value = "age") Integer age) {
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setName(name);
		return this.girlRepository.save(girl);
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
}
