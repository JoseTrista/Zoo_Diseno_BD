package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * Clase que representa un guía turístico, que es un tipo de empleado.
 *
 * Hereda de la clase Empleados.
 *
 * @author IVAN
 */
public class Guia extends Empleados {

    /**
     *
     * Constructor por defecto para crear un objeto Guia sin ID.
     */
    public Guia() {
    }

    /**
     *
     * Constructor para crear un objeto Guia sin ID.
     *
     * @param nombre El nombre del guía.
     * @param direccion La dirección del guía.
     * @param telefono El número de teléfono del guía.
     * @param fechaIngreso La fecha de ingreso del guía.
     */
    public Guia(String nombre, String direccion, int telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    /**
     *
     * Constructor para crear un objeto Guia con un ID específico.
     *
     * @param id El ID del guía.
     * @param nombre El nombre del guía.
     * @param direccion La dirección del guía.
     * @param telefono El número de teléfono del guía.
     * @param fechaIngreso La fecha de ingreso del guía.
     */
    public Guia(ObjectId id, String nombre, String direccion, int telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }
}
