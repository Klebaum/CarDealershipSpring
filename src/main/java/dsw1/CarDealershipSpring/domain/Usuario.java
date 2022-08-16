package dsw1.CarDealershipSpring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "Usuario")
public class Usuario extends AbstractEntity<Long> {

	@NotNull
	@Column(nullable = false, length = 19)
	private String email;
	@NotNull
	@Column(nullable = false, length = 19)
	private String senha;
	@NotNull
	@Column(nullable = false, length = 19)
	private String papel;

	public String getEmail() {
		return email;
	}

	public void setLogin(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String password) {
		this.senha = password;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
}
