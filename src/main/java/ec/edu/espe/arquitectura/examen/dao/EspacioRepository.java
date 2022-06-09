package ec.edu.espe.arquitectura.examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.Espacio;

public interface EspacioRepository extends JpaRepository<Espacio,Integer>{
    
}
