package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class ZonaDelParque {

    private ObjectId id;
    private String nombre;
    private double extension;
    private List<Especie> especies;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    public ZonaDelParque() {
    }

    public ZonaDelParque(String nombre, double extension) {
        this.nombre = nombre;
        this.extension = extension;
        this.especies = new ArrayList<>();
    }

    public ZonaDelParque(ObjectId id, String nombre, double extension) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
        this.especies = new ArrayList<>();
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
        final ZonaDelParque other = (ZonaDelParque) obj;
        if (Double.doubleToLongBits(this.extension) != Double.doubleToLongBits(other.extension)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.especies, other.especies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ZonaDelParque{" + "nombre=" + nombre + ", extension=" + extension + ", especies=" + especies + '}';
    }

}
