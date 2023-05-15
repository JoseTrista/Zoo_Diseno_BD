/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Cuidador;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class CuidadorDAO  <T> extends DAOBase<Cuidador>{

   private MongoDatabase conexion;

    public void recuperaCuidador() {
        conexion = Conexion.getInstance();
    }

    @Override
    public void guardar(Cuidador entidad) {
       MongoCollection<Cuidador> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Cuidador buscarPorID(ObjectId id) {
        Cuidador cuidador = obtenerColeccion().find(eq("_id", id)).first();
        return cuidador;
    }

    @Override
    public List<Cuidador> buscarTodos() {
        List<Cuidador> cuidadores = new ArrayList<>();
        cuidadores = obtenerColeccion().find().into(new ArrayList<>());
        return cuidadores;
    }

    @Override
    public MongoCollection<Cuidador> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Cuidador> coleccionCuidadores = db.getCollection("Cuidador", Cuidador.class);
        return coleccionCuidadores;
    }
    
}
