package dsw1.CarDealershipSpring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dsw1.CarDealershipSpring.domain.Loja;

@SuppressWarnings("unchecked")
public interface LojaDAO extends CrudRepository<Loja, Long>{
	
	Loja findById(long id);
	
	List<Loja> findAll();
	
	Loja save(Loja l);
	
	void deleteById(Long id);
	
}
