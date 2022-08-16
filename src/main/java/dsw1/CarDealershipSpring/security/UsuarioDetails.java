package dsw1.CarDealershipSpring.security;

import java.util.Arrays;
import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import dsw1.CarDealershipSpring.domain.Usuario;


 
@SuppressWarnings("serial")
public class UsuarioDetails implements UserDetails {
 
    private Usuario usuario;
     
    public UsuarioDetails(Usuario usuario) {
        this.usuario = usuario;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(usuario.getPapel());
        return Arrays.asList(authority);
    }
 
    @Override
    public String getPassword() {
        return usuario.getSenha();
    }
 
    	//Pegar email
    @Override
    public String getUsername() {
        return usuario.getEmail();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }

	public Usuario getUsuario() {
		return usuario;
	}
    
}