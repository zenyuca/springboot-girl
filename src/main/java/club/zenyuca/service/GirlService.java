package club.zenyuca.service;

import javax.transaction.Transactional;

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
}
