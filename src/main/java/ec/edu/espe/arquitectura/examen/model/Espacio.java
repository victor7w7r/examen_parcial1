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
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "gdc_espacio")

public class Espacio implements Serializable {

    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<UsuarioEspacio> usuarioEspacios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<Contenido> contenidos;

    public Espacio() {
    }

    public Espacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEspacio != null ? codEspacio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Espacio other = (Espacio) object;
        if ((this.codEspacio == null && other.codEspacio != null) || (this.codEspacio != null && !this.codEspacio.equals(other.codEspacio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ codEspacio=" + codEspacio + " ]";
    }

    
}
