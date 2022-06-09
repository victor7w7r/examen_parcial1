/*
 * Copyright 2022 User.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "seg_usuario_espacio")

public class UsuarioEspacio implements Serializable {

    private static final long serialVersionUID = 165465L;
    @EmbeddedId
    private UsuarioEspacioPK pk;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    @JoinColumn(name = "cod_usuario", referencedColumnName = "cod_usuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }
   
    public UsuarioEspacioPK getUsuarioEspacioPK() {
        return pk;
    }

    public void setUsuarioEspacioPK(UsuarioEspacioPK usuarioEspacioPK) {
        this.pk = usuarioEspacioPK;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.usuario = Usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pk != null ? pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsuarioEspacio)) {
            return false;
        }
        UsuarioEspacio other = (UsuarioEspacio) object;
        if ((this.pk == null && other.pk != null) || (this.pk != null && !this.pk.equals(other.pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ UsuarioEspacioPK=" + pk + " ]";
    }
    
}
