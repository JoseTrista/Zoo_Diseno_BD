package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * Esta clase representa un continente.
 */
public class Continente {

    /**
     *
     * Identificador único del continente.
     */
    private ObjectId id;
    /**
     *
     * Nombre del continente.
     */
    private String nombreContinente;

    /**
     *
     * Constructor por defecto.
     */
    public Continente() {
    }

    /**
     *
     * Constructor que recibe los valores de id y nombre del continente.
     *
     * @param id Identificador único del continente.
     * @param nombreContinente Nombre del continente.
     */
    public Continente(ObjectId id, String nombreContinente) {
        this.id = id;
        this.nombreContinente = nombreContinente;
    }

    /**
     *
     * Obtiene el identificador único del continente.
     *
     * @return Identificador único del continente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Establece el identificador único del continente.
     *
     * @param id Identificador único del continente.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Obtiene el nombre del continente.
     *
     * @return Nombre del continente.
     */
    public String getNombreContinente() {
        return nombreContinente;
    }

    /**
     *
     * Establece el nombre del continente.
     *
     * @param nombreContinente Nombre del continente.
     */
    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    /**
     *
     * Sobrescribe el método hashCode().
     *
     * @return El valor del hash code.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * Sobrescribe el método equals().
     *
     * @param obj Objeto a comparar.
     * @return true si el objeto es igual a este continente, false en caso
     * contrario.
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
        final Continente other = (Continente) obj;
        if (!Objects.equals(this.nombreContinente, other.nombreContinente)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    /**
     *
     * Sobrescribe el método toString().
     *
     * @return Una cadena que representa este continente.
     */
    @Override
    public String toString() {
        return "Continente{" + "id=" + id + ", nombreContinente=" + nombreContinente + '}';
    }
}
