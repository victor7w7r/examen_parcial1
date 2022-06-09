package ec.edu.espe.arquitectura.examen.service;


import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.dao.ContenidoRepository;
import ec.edu.espe.arquitectura.examen.dao.EspacioRepository;
import ec.edu.espe.arquitectura.examen.model.Espacio;

@Service
public class ContenidoService {

    private final ContenidoRepository contenidoRepository;

    public ContenidoService(ContenidoRepository contenidoRepository) {
        this.contenidoRepository = contenidoRepository;
    }
    
}
