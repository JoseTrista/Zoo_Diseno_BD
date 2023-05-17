/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Especie;
import Dominio.Itinerario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author jctri
 */
public class ItinerarioDAO<T> extends DAOBase<Itinerario> {

    private MongoDatabase conexion;

    public Itinerario buscarnombreItinerario(String nombre) {
        conexion = Conexion.getInstance();
        MongoCollection<Itinerario> itinerarioCollection = conexion.getCollection("Itinerario", Itinerario.class);
        return itinerarioCollection.find(eq("nombre", nombre)).first();
    }

    public Itinerario guardaItinerario(Itinerario itinerario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Itinerario entidad) {
        MongoCollection<Itinerario> coleccionI = obtenerColeccion();
        coleccionI.insertOne(entidad);
    }

    @Override
    public Itinerario buscarPorID(ObjectId id) {
        Itinerario itinerario = obtenerColeccion().find(eq("_id", id)).first();
        return itinerario;
    }

    @Override
    public List<Itinerario> buscarTodos() {
        List<Itinerario> itinerarios = new ArrayList<>();
        itinerarios = obtenerColeccion().find().into(new ArrayList<>());
        return itinerarios;
    }

    @Override
    public MongoCollection<Itinerario> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Itinerario> collectionItinerarios = db.getCollection("Itinerario", Itinerario.class);
        return collectionItinerarios;
    }
}
