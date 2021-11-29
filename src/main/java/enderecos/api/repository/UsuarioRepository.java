package enderecos.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import enderecos.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	
	public Optional<Usuario> findByUsuario(String usuario);
}
