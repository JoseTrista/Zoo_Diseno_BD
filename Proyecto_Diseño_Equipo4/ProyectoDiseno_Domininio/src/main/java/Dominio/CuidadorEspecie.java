
package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *Clase que representa cuando un cuidador se hizo cargo de una especie
 * @author IVAN
 */
public class CuidadorEspecie {
      private ObjectId id;
      private Date fechaInicio;

    public CuidadorEspecie(ObjectId id, Date fechaInicio) {
        this.id = id;
        this.fechaInicio = fechaInicio;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public CuidadorEspecie() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuidadorEspecie other = (CuidadorEspecie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        return true;
    }
      
      
}
