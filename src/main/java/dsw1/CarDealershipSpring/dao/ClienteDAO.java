package dsw1.CarDealershipSpring.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import dsw1.CarDealershipSpring.domain.Cliente;

@SuppressWarnings("unchecked")
public interface ClienteDAO extends CrudRepository<Cliente, Long>{
	Cliente findById(long id);

	List<Cliente> findAll();
	
	Cliente save(Cliente cliente);

	void deleteById(Long id);
}
