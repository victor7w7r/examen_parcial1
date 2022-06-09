package ec.edu.espe.arquitectura.examen.model;

import ec.edu.espe.arquitectura.examen.model.ContenidoVersion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-06-08T20:57:35")
@StaticMetamodel(Contenido.class)
public class Contenido_ { 

    public static volatile SingularAttribute<Contenido, Integer> nombreArchivo;
    public static volatile SingularAttribute<Contenido, Integer> estado;
    public static volatile SingularAttribute<Contenido, Integer> codContenidoPadre;
    public static volatile SingularAttribute<Contenido, Integer> tipoContenido;
    public static volatile ListAttribute<Contenido, ContenidoVersion> contenidos;
    public static volatile SingularAttribute<Contenido, Integer> codEspacio;
    public static volatile SingularAttribute<Contenido, Integer> codContenido;
    public static volatile SingularAttribute<Contenido, Integer> nombre;
    public static volatile SingularAttribute<Contenido, Integer> version;

}