package ec.edu.espe.arquitectura.examen.model;

import javax.persistence.*;

@Embeddable
public class UsuarioEspacioPK {

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    @Column(name = "cod_perfil", nullable = false)
    private Integer codEspacio;

    public UsuarioEspacioPK(Integer codUsuario, Integer codEspacio) {
        this.codUsuario = codUsuario;
        this.codEspacio = codEspacio;
    }

    public UsuarioEspacioPK() {
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }


    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }


    public Integer getCodEspacio() {
        return codEspacio;
    }


    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        hash += (codEspacio != null ? codEspacio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsuarioEspacioPK)) {
            return false;
        }
        UsuarioEspacioPK other = (UsuarioEspacioPK) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        if ((this.codEspacio == null && other.codEspacio != null) || (this.codEspacio != null && !this.codEspacio.equals(other.codEspacio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ codUsuario=" + codUsuario + ", codEspacio=" + codEspacio + " ]";
    }

}

