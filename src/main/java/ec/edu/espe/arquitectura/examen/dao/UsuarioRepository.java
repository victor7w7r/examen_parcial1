package ec.edu.espe.arquitectura.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    
}