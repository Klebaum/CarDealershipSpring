package dsw1.CarDealershipSpring.service.spec;

import java.util.List;

import dsw1.CarDealershipSpring.domain.Carro;

public interface ICarroService {
	Carro buscarPorId(Long id);
	
	List<Carro> buscarTodos();
	
	void salvar(Carro carro);
	
	void excluir(Long id);
}
