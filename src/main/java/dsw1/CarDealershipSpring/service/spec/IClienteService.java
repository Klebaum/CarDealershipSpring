package dsw1.CarDealershipSpring.service.spec;

import java.util.List;

import dsw1.CarDealershipSpring.domain.Cliente;

public interface IClienteService {
	Cliente buscarPorId(Long id);
	
	List<Cliente> buscarTodos();
	
	void salvar(Cliente cliente);
	
	void excluir(Long id);
}
