package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class TipoVegetacion {

    /**
     * Atributo que representa el id de la vegetacion
     */
    private ObjectId id;

    /**
     * Atributo que representa el nombre de la vegetacion
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
     * Establece el identificador único de la vegetacion
     *
     * @param id el identificador único de la vegetacion
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Devuelve el nombre de la vegetacion
     *
     * @return el nombre de la vegetacion
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre de la vegetacion
     *
     * @param nombre el nombre dde la vegetacion
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoVegetacion(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Constructor que crea un nuevo objeto TipoVegetacion con un id y nombre
     * específicos.
     *
     * @param id el id del tipo de vegetación
     * @param nombre el nombre del tipo de vegetación
     */
    public TipoVegetacion(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     *
     * Constructor por defecto que crea un nuevo objeto TipoVegetacion sin
     * valores iniciales.
     */
    public TipoVegetacion() {
    }

    /**
     *
     * Calcula y devuelve un valor hash para este objeto.
     *
     * @return un valor hash para este objeto
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * Compara este objeto con otro objeto especificado para determinar si son
     * iguales.
     *
     * @param obj el objeto a comparar con este objeto
     * @return true si los objetos son iguales, false en caso contrario
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
        final TipoVegetacion other = (TipoVegetacion) obj;
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
     * Devuelve una representación en cadena de este objeto.
     *
     * @return una representación en cadena de este objeto
     */
    @Override
    public String toString() {
        return  nombre;
    }

}
