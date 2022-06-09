package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion implements Serializable {

    private static final long serialVersionUID = 1543L;
    @Id
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;
    @Column(name = "hash_archivo", nullable = false, length = 64)
    private Integer hashArchivo;
    @Column(name = "nombre_archivo", nullable = false, length = 128)
    private String nombreArchivo;
    @Column(name = "cod_usuario_creacion", nullable = false, length = 64)
    private Integer codUsuarioCreacion;
    @Column(name = "tamanio", nullable = false)
    private Integer tamanio;
    @Column(name = "version", nullable = false)
    private Integer version;
    @Column(name = "comentario", nullable = false, length = 500)
    private String comentario;
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public ContenidoVersion() {
        
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }


    public Integer getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(Integer hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codContenidoVersion != null ? codContenidoVersion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        ContenidoVersion other = (ContenidoVersion) object;
        if ((this.codContenidoVersion == null && other.codContenidoVersion != null) || (this.codContenidoVersion != null && !this.codContenidoVersion.equals(other.codContenidoVersion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ codContenidoVersion=" + codContenidoVersion + " ]";
    }

    
}
