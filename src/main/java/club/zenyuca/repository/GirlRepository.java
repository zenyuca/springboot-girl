package club.zenyuca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import club.zenyuca.entity.Girl;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

	public List<Girl> getByAge(Integer age);
}
