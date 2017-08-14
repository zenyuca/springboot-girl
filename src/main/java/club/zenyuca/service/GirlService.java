package club.zenyuca.service;

import javax.transaction.Transactional;

import club.zenyuca.enums.ResultEnum;
import club.zenyuca.exception.GirlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.zenyuca.entity.Girl;
import club.zenyuca.repository.GirlRepository;

@Service
public class GirlService {
	
	@Autowired
	private GirlRepository girlRepository;

	@Transactional
	public void insertTwo() {
		Girl a = new Girl();
		a.setAge(18);
		a.setName("小红");
		this.girlRepository.save(a);
		
		Girl b = new Girl();
		b.setAge(19);
		b.setName("宋佳佳");
		this.girlRepository.save(b);
	}

	public void getAge(Integer age) throws GirlException {
		if (age < 13) {
			throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
		} else if (age < 18) {
			throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
		}
	}

	public Girl findOne(Integer id) {
		return this.girlRepository.findOne(id);
	}
}
