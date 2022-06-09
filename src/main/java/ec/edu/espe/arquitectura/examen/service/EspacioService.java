package ec.edu.espe.arquitectura.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.dao.EspacioRepository;
import ec.edu.espe.arquitectura.examen.model.Espacio;

@Service
public class EspacioService {

    private final EspacioRepository espacioRepository;

    public EspacioService(EspacioRepository espacioRepository) {
        this.espacioRepository = espacioRepository;
    }


    public Espacio buscarPorCodigo(Integer codigo) {
        Optional<Espacio> usuarioOpt = this.espacioRepository.findById(codigo);
        if (usuarioOpt.isPresent()) {
            return usuarioOpt.get();
        } else {
            return null;
        }
    }

    public List<Espacio> obtenerSitiosUsuario(String codigoUsuario) {
        return null;
    }
    
}
