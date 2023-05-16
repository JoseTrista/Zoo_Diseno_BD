/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Itinerario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
        MongoCollection<Itinerario> itinerarioCollection = conexion.getCollection("Especie", Itinerario.class);
        //return itinerarioCollection.find(eq("nombre", nombre)).first();
        return null;
    }
    
    public Itinerario guardaItinerario(Itinerario itinerario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Itinerario entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Itinerario buscarPorID(ObjectId id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Itinerario> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MongoCollection<Itinerario> obtenerColeccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
