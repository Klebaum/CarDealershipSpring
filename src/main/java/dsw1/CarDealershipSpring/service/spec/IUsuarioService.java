package dsw1.CarDealershipSpring.service.spec;

import java.util.List;

import dsw1.CarDealershipSpring.domain.Usuario;

public interface IUsuarioService {
	Usuario buscarPorId(Long id);
	
	List<Usuario> buscarTodos();
	
	void salvar(Usuario usuario);
	
	void excluir(Long id);
}
