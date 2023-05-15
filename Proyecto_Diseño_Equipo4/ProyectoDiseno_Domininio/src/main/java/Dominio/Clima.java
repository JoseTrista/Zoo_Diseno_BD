package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase que representa los climas de los habitats
 *
 * @author IVAN
 */
public class Clima {

    /**
     * Atributo que representa el id del clima
     */
    private ObjectId id;

    /**
     * Atributo que representa el nombre del clima
     */
    private String nombre;

    /**
     *
     * Devuelve el identificador único del clima.
     *
     * @return el identificador único del clima
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Establece el identificador único del clima.
     *
     * @param id el identificador único del clima a establecer
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Devuelve el nombre del clima.
     *
     * @return el nombre del clima
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre del clima.
     *
     * @param nombre el nombre del clima a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Constructor de la clase Clima.
     *
     * @param id el identificador único del clima
     * @param nombre el nombre del clima
     */
    public Clima(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     *
     * Constructor sin argumentos de la clase Clima.
     * @param nombre
     */
    public Clima(String nombre) {
        this.nombre = nombre;
    }

    public Clima() {
    }

    /**
     *
     * Devuelve el hash code del clima.
     *
     * @return el hash code del clima
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     *
     * Compara el clima con otro objeto y devuelve true si son iguales, es
     * decir, si el objeto es de la clase Clima y tiene el mismo identificador
     * único y el mismo nombre.
     *
     * @param obj el objeto a comparar
     * @return true si son iguales, false en caso contrario
     */
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
        final Clima other = (Clima) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     *
     * Devuelve una representación en formato String del objeto Clima.
     *
     * @return una representación en formato String del objeto Clima
     */
    @Override
    public String toString() {
        return nombre;
    }

}
