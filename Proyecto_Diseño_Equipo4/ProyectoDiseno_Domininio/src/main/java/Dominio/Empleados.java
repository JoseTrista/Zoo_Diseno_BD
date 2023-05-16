package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;


/**
 * Clase que representa a los empleados del Zoologico
 * @author IVAN
 */
public class Empleados {

    /**
     * Atributo que representa el id del empleado
     */
    private ObjectId id;

    /**
     * Atributo que representa el nombre del empleado
     */
    protected String nombre;
    /**
     * Atributo que representa la direccion del empleado
     */
    private String direccion;
    /**
     * Atributo que representa el telefono del empleado
     */
    private String telefono;

    /**
     * Atributo que representa la fecha de ingreso del empleado
     */
    private Date fechaIngreso;

    /**
     *
     * Devuelve el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre del empleado.
     *
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Devuelve la dirección del empleado.
     *
     * @return La dirección del empleado.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * Establece la dirección del empleado.
     *
     * @param direccion La nueva dirección del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * Devuelve el número de teléfono del empleado.
     *
     * @return El número de teléfono del empleado.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * Establece el número de teléfono del empleado.
     *
     * @param telefono El nuevo número de teléfono del empleado.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * Devuelve la fecha de ingreso del empleado al centro de cuidado de
     * animales.
     *
     * @return La fecha de ingreso del empleado.
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     *
     * Establece la fecha de ingreso del empleado al centro de cuidado de
     * animales.
     *
     * @param fechaIngreso La nueva fecha de ingreso del empleado.
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     *
     * Devuelve el identificador único del empleado en la base de datos.
     *
     * @return El identificador único del empleado.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Establece el identificador único del empleado en la base de datos.
     *
     * @param id El nuevo identificador único del empleado.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Devuelve un código hash para el objeto.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     *
     * Compara este objeto con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
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
        final Empleados other = (Empleados) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * Constructor por defecto de la clase Empleados.
     */
    public Empleados() {
    }

    /**
     *
     * Constructor para crear un objeto Empleados sin ID.
     *
     * @param nombre El nombre del empleado.
     * @param direccion La dirección del empleado.
     * @param telefono El número de teléfono del empleado.
     * @param fechaIngreso La fecha de ingreso del empleado.
     */
    public Empleados(String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     *
     * Constructor para crear un objeto Empleados con un ID específico.
     *
     * @param id El ID del empleado.
     * @param nombre El nombre del empleado.
     * @param direccion La dirección del empleado.
     * @param telefono El número de teléfono del empleado.
     * @param fechaIngreso La fecha de ingreso del empleado.
     */
    public Empleados(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

}
