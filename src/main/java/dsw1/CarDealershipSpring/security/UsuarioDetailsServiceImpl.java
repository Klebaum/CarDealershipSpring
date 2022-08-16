package dsw1.CarDealershipSpring.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dsw1.CarDealershipSpring.dao.UsuarioDAO;
import dsw1.CarDealershipSpring.domain.Usuario;

 
public class UsuarioDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UsuarioDAO dao;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Usuario usuario = dao.getUserByUsername(username);
         
        if (usuario == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new UsuarioDetails(usuario);
    }
}