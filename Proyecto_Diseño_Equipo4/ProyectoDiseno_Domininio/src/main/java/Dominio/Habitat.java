package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase que representa un habitat
 * @author IVAN
 */
public class Habitat {

    /**
     * Identificador único del hábitat.
     */
    private ObjectId id;

    /**
     * Nombre del hábitat.
     */
    private String nombre;

    /**
     * Lista de climas asociados al hábitat.
     */
    private List<Clima> clima;

    /**
     * Lista de continentes en los que se encuentra el hábitat.
     */
    private List<Continente> continentes;

    /**
     * Lista de tipos de vegetación presentes en el hábitat.
     */
    private List<TipoVegetacion> vegetacion;

    /**
     * Método getter para el identificador único del hábitat.
     *
     * @return Identificador único del hábitat.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método setter para el identificador único del hábitat.
     *
     * @param id Identificador único del hábitat.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método getter para el nombre del hábitat.
     *
     * @return Nombre del hábitat.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para el nombre del hábitat.
     *
     * @param nombre Nombre del hábitat.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para la lista de climas asociados al hábitat.
     *
     * @return Lista de climas asociados al hábitat.
     */
    public List<Clima> getClima() {
        return clima;
    }

    /**
     * Método setter para la lista de climas asociados al hábitat.
     *
     * @param clima Lista de climas asociados al hábitat.
     */
    public void setClima(List<Clima> clima) {
        this.clima = clima;
    }

    /**
     * Método getter para la lista de continentes en los que se encuentra el
     * hábitat.
     *
     * @return Lista de continentes en los que se encuentra el hábitat.
     */
    public List<Continente> getContinentes() {
        return continentes;
    }

    /**
     * Método setter para la lista de continentes en los que se encuentra el
     * hábitat.
     *
     * @param continentes Lista de continentes en los que se encuentra el
     * hábitat.
     */
    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

    /**
     *
     * Obtiene la lista de tipos de vegetación del hábitat.
     *
     * @return Lista de tipos de vegetación.
     */
    public List<TipoVegetacion> getVegetacion() {
        return vegetacion;
    }

    /**
     *
     * Establece la lista de tipos de vegetación del hábitat.
     *
     * @param vegetacion Nueva lista de tipos de vegetación.
     */
    public void setVegetacion(List<TipoVegetacion> vegetacion) {
        this.vegetacion = vegetacion;
    }

    /**
     * Constructor de la clase.
     *
     * @param id Identificador único del hábitat.
     * @param nombre Nombre del hábitat.
     */
    public Habitat(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.clima = new ArrayList<>();
        this.continentes = new ArrayList<>();
        this.vegetacion = new ArrayList<>();
    }

    /**
     * Constructor por defecto de la clase
     */
    public Habitat() {
    }

    /**
     *
     * Genera y devuelve el código hash del hábitat.
     *
     * @return Código hash del hábitat.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * Compara el hábitat con otro objeto dado para determinar si son iguales.
     *
     * @param obj Objeto a comparar con el hábitat.
     * @return true si los objetos son iguales, false si son diferentes.
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
        final Habitat other = (Habitat) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.clima, other.clima)) {
            return false;
        }
        if (!Objects.equals(this.continentes, other.continentes)) {
            return false;
        }
        if (!Objects.equals(this.vegetacion, other.vegetacion)) {
            return false;
        }
        return true;
    }

    /**
     *
     * Genera y devuelve una cadena que representa al hábitat.
     *
     * @return Cadena que representa al hábitat.
     */
    @Override
    public String toString() {
        return "Habitat{" + "id=" + id + ", nombre=" + nombre + ", clima=" + clima + ", continentes=" + continentes + ", vegetacion=" + vegetacion + '}';
    }
}
