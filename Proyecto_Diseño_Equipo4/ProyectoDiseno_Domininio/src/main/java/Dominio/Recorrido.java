
package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class Recorrido {
     private ObjectId id;
    private double longitud;
    private Date fechaHora;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Recorrido() {
    }

    public Recorrido(ObjectId id, double longitud, Date fechaHora) {
        this.id = id;
        this.longitud = longitud;
        this.fechaHora = fechaHora;
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
        final Recorrido other = (Recorrido) obj;
        if (Double.doubleToLongBits(this.longitud) != Double.doubleToLongBits(other.longitud)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fechaHora, other.fechaHora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recorrido{" + "id=" + id + ", longitud=" + longitud + ", fechaHora=" + fechaHora + '}';
    }
    
    
}
