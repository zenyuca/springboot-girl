package club.zenyuca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

	public List<Girl> getByAge(Integer age);
}
