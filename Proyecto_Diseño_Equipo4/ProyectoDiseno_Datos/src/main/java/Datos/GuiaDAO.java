/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;


import Dominio.Guia;
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
public class GuiaDAO <T> extends DAOBase<Guia>{
    
    private MongoDatabase conexion;
     
    public List<Guia> recuperaGuias() {
        conexion = Conexion.getInstance();
        MongoCollection<Guia> coleccionGuias = obtenerColeccion();
        List<Guia> guias = coleccionGuias.find().into(new ArrayList<>());
        return guias;
    }

    @Override
    public void guardar(Guia entidad) {
       MongoCollection<Guia> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Guia buscarPorID(ObjectId id) {
        Guia guia = obtenerColeccion().find(eq("_id", id)).first();
        return guia;
    }

    @Override
    public List<Guia> buscarTodos() {
        List<Guia> guias = new ArrayList<>();
        guias = obtenerColeccion().find().into(new ArrayList<>());
        return guias;
    }

    @Override
    public MongoCollection<Guia> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Guia> colleccionGuias = db.getCollection("Guia", Guia.class);
        return colleccionGuias;
    }
}
