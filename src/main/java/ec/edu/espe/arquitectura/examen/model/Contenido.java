package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido")
public class Contenido implements Serializable {
    
    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;
    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer codContenidoPadre;
    @Column(name = "tipo_contenido", nullable = false)
    private Integer tipoContenido;
    @Column(name = "nombre", nullable = false)
    private Integer nombre;
    @Column(name = "nombre_archivo", nullable = false)
    private Integer nombreArchivo;
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "estado", nullable = false)
    private Integer estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio")
    private List<ContenidoVersion> contenidos;

    public Contenido() {

    }

    public Contenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodContenidoPadre() {
        return codContenidoPadre;
    }

    public void setCodContenidoPadre(Integer codContenidoPadre) {
        this.codContenidoPadre = codContenidoPadre;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(Integer nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<ContenidoVersion> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<ContenidoVersion> contenidos) {
        this.contenidos = contenidos;
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
        Contenido other = (Contenido) object;
        if ((this.codContenido == null && other.codContenido != null) || (this.codEspacio != null && !this.codEspacio.equals(other.codContenido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ codEspacio=" + codEspacio + " ]";
    }

    
}
