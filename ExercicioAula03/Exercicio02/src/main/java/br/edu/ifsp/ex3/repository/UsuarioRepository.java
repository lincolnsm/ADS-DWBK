package br.edu.ifsp.ex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifsp.ex3.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}