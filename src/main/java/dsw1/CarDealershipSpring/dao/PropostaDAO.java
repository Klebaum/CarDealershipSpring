package dsw1.CarDealershipSpring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dsw1.CarDealershipSpring.domain.Proposta;
import dsw1.CarDealershipSpring.domain.Usuario;

@SuppressWarnings("unchecked")
public interface PropostaDAO extends CrudRepository<Proposta, Long>{
	Proposta findById(long id);

	List<Proposta> findAll();
	
	List<Proposta> findAllByUsuario(Usuario u);
	
	Proposta save(Proposta proposta);

	void deleteById(Long id);

}
