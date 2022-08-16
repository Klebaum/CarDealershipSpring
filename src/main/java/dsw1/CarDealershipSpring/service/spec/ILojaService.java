package dsw1.CarDealershipSpring.service.spec;

import java.util.List;

import dsw1.CarDealershipSpring.domain.Loja;

public interface ILojaService {
	Loja buscarPorId(Long id);
	
	List<Loja> buscarTodos();
	
	void salvar(Loja loja);
	
	void excluir(Long id);
}
