package dsw1.CarDealershipSpring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dsw1.CarDealershipSpring.domain.Carro;
@SuppressWarnings("unchecked")

public interface CarroDAO extends CrudRepository<Carro, Long>{
	
	Carro findById(long id);
	
	List<Carro> findAll();
	
	Carro save(Carro c);
	
	void deleteById(Long id);
}
