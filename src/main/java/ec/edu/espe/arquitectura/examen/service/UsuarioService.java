package ec.edu.espe.arquitectura.examen.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.dao.EspacioRepository;
import ec.edu.espe.arquitectura.examen.dao.UsuarioRepository;
import ec.edu.espe.arquitectura.examen.model.Espacio;
import ec.edu.espe.arquitectura.examen.model.Usuario;

@Service
public class UsuarioService {

    private final EspacioRepository espacioRepository;
    private final UsuarioRepository usuarioRepository;
   

    public UsuarioService(UsuarioRepository usuarioRepository, EspacioRepository espacioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.espacioRepository = espacioRepository;
    }

    public Usuario buscarPorCodigo(Integer codigo) {
        Optional<Usuario> usuarioOpt = this.usuarioRepository.findById(codigo);
        if (usuarioOpt.isPresent()) {
            return usuarioOpt.get();
        } else {
            return null;
        }
    }

    public void agregarUsuario(Integer codSitio, String codUsuario) {

        Usuario usuarioBD = this.buscarPorCodigo(Integer.parseInt(codUsuario));

        usuarioRepository.save(usuarioBD);

    }
    
}


