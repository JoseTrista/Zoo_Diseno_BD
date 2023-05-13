package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase que repesenta una animal perteciente a una especie
 *
 * @author IVAN
 */
public class Animal {

    /**
     * Atributo que representa el id del animal
     */
    private ObjectId id;

    /**
     * Atributo que representa el nombre del animal
     */
    private String nombre;

    /**
     * Atributo que representa la edad del animal
     */
    private int edad;

    /**
     * Atributo que representa el sexo del animal
     */
    private boolean sexo;

    /**
     *
     * Método getter para obtener el identificador del animal.
     *
     * @return el identificador del animal.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Método setter para establecer el identificador del animal.
     *
     * @param id el nuevo identificador del animal.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Método getter para obtener el nombre del animal.
     *
     * @return el nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Método setter para establecer el nombre del animal.
     *
     * @param nombre el nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Método getter para obtener la edad del animal.
     *
     * @return la edad del animal.
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * Método setter para establecer la edad del animal.
     *
     * @param edad la nueva edad del animal.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * Método getter para obtener el sexo del animal.
     *
     * @return el sexo del animal.
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     *
     * Método setter para establecer el sexo del animal.
     *
     * @param sexo el nuevo sexo del animal.
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * Constructor por defecto de la clase Animal.
     */
    public Animal() {
    }

    /**
     *
     * Constructor con parámetros de la clase Animal.
     *
     * @param id el identificador del animal.
     * @param nombre el nombre del animal.
     * @param edad la edad del animal.
     * @param sexo el sexo del animal.
     */
    public Animal(ObjectId id, String nombre, int edad, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     *
     * Constructor con parámetros de la clase Animal.
     *
     * @param nombre el nombre del animal.
     * @param edad la edad del animal.
     * @param sexo el sexo del animal.
     */
    public Animal(String nombre, int edad, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     *
     * Devuelve el valor del código hash para el objeto Animal. Este método
     * sobrescribe el método hashCode de la clase Object.
     *
     * @return el valor del código hash para el objeto Animal
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     *
     * Indica si el objeto especificado es igual al objeto Animal actual. Este
     * método sobrescribe el método equals de la clase Object.
     *
     * @param obj el objeto que se va a comparar con el objeto Animal actual
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * Devuelve una representación en forma de cadena del objeto Animal. Este
     * método sobrescribe el método toString de la clase Object.
     *
     * @return una representación en forma de cadena del objeto Animal
     */
    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

}
