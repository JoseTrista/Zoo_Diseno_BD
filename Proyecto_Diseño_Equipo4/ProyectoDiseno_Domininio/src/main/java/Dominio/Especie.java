package Dominio;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que representa una especie del zoologico
 *
 * @author IVAN
 */
public class Especie {

    /**
     * Atributo que representa el id de la especie
     */
    private ObjectId id;

    /**
     * Atributo que representa el nombre de la especie
     */
    private String nombre;
    /**
     * Atributo que representa nombre cientifico de la especie
     */
    private String nombreCientifico;

    /**
     * Atributo que representa la descripcion de la especie
     */
    private String descripcion;

    /**
     * Lista de cuidadores que estan a cargo de una especie
     */
    private List<Cuidador> cuidadores;

    private List<Habitat> habitats;
    /**
     * Lista de animales que pertenecen a una especie
     */
    private List<Animal> animales;

    /**
     *
     * Método para obtener el nombre común de la especie.
     *
     * @return El nombre común de la especie.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Método para establecer el nombre común de la especie.
     *
     * @param nombre El nuevo nombre común de la especie.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Método para obtener el nombre científico de la especie.
     *
     * @return El nombre científico de la especie.
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     *
     * Método para establecer el nombre científico de la especie.
     *
     * @param nombreCientifico El nuevo nombre científico de la especie.
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     *
     * Método para obtener la descripción de la especie.
     *
     * @return La descripción de la especie.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * Método para establecer la descripción de la especie.
     *
     * @param descripcion La nueva descripción de la especie.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * Método para obtener el identificador de la especie.
     *
     * @return El identificador de la especie.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Método para establecer el identificador de la especie.
     *
     * @param id El nuevo identificador de la especie.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<Cuidador> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(List<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    /**
     *
     * Constructor vacío de la clase Especie.
     */
    public Especie() {
    }

    /**
     *
     * Constructor de la clase Especie con parámetros.
     *
     * @param id Identificador de la especie.
     * @param nombre Nombre común de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     */
    public Especie(ObjectId id, String nombre, String nombreCientifico, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    /**
     *
     * Constructor de la clase Especie con parámetros.
     *
     * @param nombre Nombre común de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     */
    public Especie(String nombre, String nombreCientifico, String descripcion) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.cuidadores = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.habitats = new ArrayList<>();
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    public Especie(String nombre, String nombreCientifico, String descripcion, List<Animal> animales) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.cuidadores = new ArrayList<>();
        this.animales = animales;
        this.habitats = new ArrayList<>();
    }

    public Especie(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
