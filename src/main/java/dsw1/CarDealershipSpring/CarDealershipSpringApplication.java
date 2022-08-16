package dsw1.CarDealershipSpring;


import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dsw1.CarDealershipSpring.dao.CarroDAO;
import dsw1.CarDealershipSpring.dao.ClienteDAO;
import dsw1.CarDealershipSpring.dao.LojaDAO;
import dsw1.CarDealershipSpring.dao.PropostaDAO;
import dsw1.CarDealershipSpring.dao.UsuarioDAO;
import dsw1.CarDealershipSpring.domain.Carro;
import dsw1.CarDealershipSpring.domain.Cliente;
import dsw1.CarDealershipSpring.domain.Loja;
import dsw1.CarDealershipSpring.domain.Proposta;
import dsw1.CarDealershipSpring.domain.Usuario;


@SpringBootApplication
public class CarDealershipSpringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CarDealershipSpringApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CarroDAO carroDAO, LojaDAO lojaDAO, PropostaDAO propostaDAO, ClienteDAO clienteDAO, UsuarioDAO usuarioDAO) {
		return (args) -> {
			
			//Usuarios
			Usuario u1 = new Usuario();
			u1.setLogin("user");
			u1.setPapel("USER");
			u1.setSenha("user");
			usuarioDAO.save(u1);
			
			Usuario u2 = new Usuario();
			u2.setLogin("admin");
			u2.setPapel("ADMIN");
			u2.setSenha("admin");
			usuarioDAO.save(u2);
			
			Usuario u3 = new Usuario();
			u3.setLogin("loja1");
			u3.setPapel("LOJA");
			u3.setSenha("loja1");
			usuarioDAO.save(u3);
			
			Usuario u5 = new Usuario();
			u5.setLogin("loja2");
			u5.setPapel("LOJA");
			u5.setSenha("loja2");
			usuarioDAO.save(u5);
			
			Usuario u4 = new Usuario();
			u4.setLogin("cliente");
			u4.setPapel("CLIENTE");
			u4.setSenha("cliente");
			usuarioDAO.save(u4);
			
			//Lojas
			Loja l1 = new Loja();
			l1.setNome("loja1");
			l1.setDescricao("Nada a dizer");
			l1.setCnpj("1234589");
			lojaDAO.save(l1);
			
			Loja l2 = new Loja();
			l2.setNome("loja2");
			l2.setDescricao("Nada a dizer");
			l2.setCnpj("1234");
			lojaDAO.save(l2);
			
			//Carros
			Carro c1 = new Carro();
			c1.setLoja(l1);
			c1.setPlaca("1234asda");
			c1.setModelo("Modelo 1");
			c1.setChassi("asdasd");
			c1.setAno(2000);
			c1.setQuilometragem(200);
			c1.setDescricao("algo a dizer?");
			c1.setValor(BigDecimal.valueOf(200000));
			c1.setFotos("caminho");
			carroDAO.save(c1);
			
			Carro c2 = new Carro();
			c2.setLoja(l2);
			c2.setPlaca("1234asda");
			c2.setModelo("Modelo 1");
			c2.setChassi("asdasd");
			c2.setAno(2000);
			c2.setQuilometragem(200);
			c2.setDescricao("algo a dizer?");
			c2.setValor(BigDecimal.valueOf(200000));
			c2.setFotos("caminho");
			carroDAO.save(c2);
			
			//Clientes
			Cliente cl1 = new Cliente();
			cl1.setCpf("124564564");
			cl1.setDataDeNascimento(LocalDate.parse("2000-02-02"));
			cl1.setNome("Roberval");
			cl1.setSexo("M");
			cl1.setTelefone("123-5888");
			clienteDAO.save(cl1);
			
			//Propostas
			Proposta p1 = new Proposta();
			p1.setCarro(c1);
			p1.setCliente(cl1);
			p1.setCondPagamento("Dinheiro");
			p1.setdataProposta(LocalDate.parse("2000-02-02"));
			p1.setStatus("ACEITO");
			p1.setValor(BigDecimal.valueOf(2000));
			p1.setUsuario(u3);
			propostaDAO.save(p1);
			
			Proposta p2 = new Proposta();
			p2.setCarro(c2);
			p2.setCliente(cl1);
			p2.setCondPagamento("Dinheiro");
			p2.setdataProposta(LocalDate.parse("2000-02-02"));
			p2.setStatus("ACEITO");
			p2.setValor(BigDecimal.valueOf(2000));
			p2.setUsuario(u5);
			propostaDAO.save(p2);
			
			
			
	};
	
}
}
