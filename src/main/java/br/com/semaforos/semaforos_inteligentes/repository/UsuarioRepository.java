package br.com.semaforos.semaforos_inteligentes.repository;

import br.com.semaforos.semaforos_inteligentes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
