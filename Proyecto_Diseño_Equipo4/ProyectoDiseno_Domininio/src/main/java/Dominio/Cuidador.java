package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;


/**
 *
 * Esta clase representa un Cuidador de un zoologico
 *
 * Extiende de la clase Empleados
 */
public class Cuidador extends Empleados {

    /**
     *
     * Constructor por defecto de la clase Cuidador.
     */
    public Cuidador() {
    }

    /**
     *
     * Constructor que crea un objeto Cuidador con los siguientes atributos:
     *
     * @param nombre Nombre del cuidador.
     * @param direccion Dirección del cuidador.
     * @param telefono Número de teléfono del cuidador.
     * @param fechaIngreso Fecha de ingreso del cuidador
     */
    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    /**
     *
     * Constructor que crea un objeto Cuidador con los siguientes atributos:
     *
     * @param id Identificador único del cuidador en la base de datos.
     * @param nombre Nombre del cuidador.
     * @param direccion Dirección del cuidador.
     * @param telefono Número de teléfono del cuidador.
     * @param fechaIngreso Fecha de ingreso del cuidador .
     */
    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }

}
