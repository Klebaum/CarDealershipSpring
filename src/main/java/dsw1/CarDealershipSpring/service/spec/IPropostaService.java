package dsw1.CarDealershipSpring.service.spec;

import java.util.List;

import dsw1.CarDealershipSpring.domain.Proposta;
import dsw1.CarDealershipSpring.domain.Usuario;

public interface IPropostaService {
	Proposta buscarPorId(Long id);
	
	List<Proposta> buscarTodos();

	List<Proposta> buscarTodosPorUsuario(Usuario u);
	
	void salvar(Proposta proposta);
	
	void excluir(Long id);
}
