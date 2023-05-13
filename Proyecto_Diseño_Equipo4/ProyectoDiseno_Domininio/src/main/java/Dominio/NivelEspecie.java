package Dominio;


import org.bson.types.ObjectId;

/**
 *
 * Representa la relación entre un Cuidador y una Especie que tiene asignada,
 * incluyendo información
 *
 * como el nivel de conocimiento de la especie por parte del cuidador con esa especie.
 */
public class NivelEspecie {

    /**
     * Identificador único de la relación entre el Cuidador y la Especie
     */
    private ObjectId id;

    /**
     * Nivel de conocimiento de la especie por parte del Cuidador
     */
    private String nivelConocimientoEspecie;

   

    /**
     *
     * Obtiene el identificador único de la relación entre el Cuidador y la
     * Especie.
     *
     * @return el identificador único de la relación entre el Cuidador y la
     * Especie.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     *
     * Establece el identificador único de la relación entre el Cuidador y la
     * Especie.
     *
     * @param id el identificador único de la relación entre el Cuidador y la
     * Especie.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     *
     * Obtiene el nivel de conocimiento de la especie por parte del Cuidador.
     *
     * @return el nivel de conocimiento de la especie por parte del Cuidador.
     */
    public String getNivelConocimientoEspecie() {
        return nivelConocimientoEspecie;
    }

    /**
     *
     * Establece el nivel de conocimiento de la especie por parte del Cuidador.
     *
     * @param nivelConocimientoEspecie el nivel de conocimiento de la especie
     * por parte del Cuidador.
     */
    public void setNivelConocimientoEspecie(String nivelConocimientoEspecie) {
        this.nivelConocimientoEspecie = nivelConocimientoEspecie;
    }

   

    /**
     *
     * Crea una instancia de la clase Cuidador_Especie sin especificar los
     * valores de sus atributos.
     */
    public NivelEspecie() {
    }

    /**
     *
     * Crea una instancia de la clase ConocimientoEspecie especificando los valores
     * de sus atributos excepto el identificador.
     *
     * @param nivelConocimientoEspecie el nivel de conocimiento de la especie
     * por parte del Cuidador.
     */
    public NivelEspecie(String nivelConocimientoEspecie) {
        this.nivelConocimientoEspecie = nivelConocimientoEspecie;
       
    }

    /**
     * Crea una instancia de la clase Cuidador_Especie especificando los valores
     * de sus atributos
     *
     * @param id identificador de la relacion entre el cuidador y la especie
     * @param nivelConocimientoEspecie el nivel de conocimiento de la especie
     * por parte del Cuidador.
     */
    public NivelEspecie(ObjectId id, String nivelConocimientoEspecie) {
        this.id = id;
        this.nivelConocimientoEspecie = nivelConocimientoEspecie;
       
    }

}
