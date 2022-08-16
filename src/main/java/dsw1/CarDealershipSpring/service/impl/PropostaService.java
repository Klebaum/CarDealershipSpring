package dsw1.CarDealershipSpring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dsw1.CarDealershipSpring.dao.PropostaDAO;
import dsw1.CarDealershipSpring.domain.Proposta;
import dsw1.CarDealershipSpring.domain.Usuario;
import dsw1.CarDealershipSpring.service.spec.IPropostaService;

@Service
@Transactional(readOnly = false)
public class PropostaService implements IPropostaService {
	@Autowired
	PropostaDAO dao;
	
	public void salvar(Proposta proposta) {
		dao.save(proposta);
	}

	public void excluir(Long id) {
		dao.deleteById(id);
	}

	@Transactional(readOnly = true)
	public Proposta buscarPorId(Long id) {
		return dao.findById(id.longValue());
	}

	@Transactional(readOnly = true)
	public List<Proposta> buscarTodosPorUsuario(Usuario u) {
		return dao.findAllByUsuario(u);
	}
	
	@Transactional(readOnly = true)
	public List<Proposta> buscarTodos() {
		return dao.findAll();
	}
}
