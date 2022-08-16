package dsw1.CarDealershipSpring.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "Cliente")
public class Cliente extends AbstractEntity<Long>{
	
	@NotNull
	@Column(nullable = false, length = 19)
	private String nome;
	@NotNull
	@Column(nullable = false, length = 19)
	private String cpf;
	@NotNull
	@Column(nullable = false, length = 19)
	private String telefone;
	@NotNull
	@Column(nullable = false, length = 19)
	private String sexo;
	@NotNull
	@Column(nullable = false, length = 19)
	private LocalDate dataDeNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
