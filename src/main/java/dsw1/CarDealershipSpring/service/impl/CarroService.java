package dsw1.CarDealershipSpring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dsw1.CarDealershipSpring.dao.CarroDAO;
import dsw1.CarDealershipSpring.domain.Carro;
import dsw1.CarDealershipSpring.service.spec.ICarroService;

@Service
@Transactional(readOnly = false)
public class CarroService implements ICarroService{
	@Autowired
	CarroDAO dao;
	
	public void salvar(Carro carro) {
		dao.save(carro);
	}
	
	public void excluir(Long id) {
		dao.deleteById(id);
	}

	@Transactional(readOnly = true)
	public Carro buscarPorId(Long id) {
		return dao.findById(id.longValue());
	}

	@Transactional(readOnly = true)
	public List<Carro> buscarTodos() {
		return dao.findAll();
	}
}
