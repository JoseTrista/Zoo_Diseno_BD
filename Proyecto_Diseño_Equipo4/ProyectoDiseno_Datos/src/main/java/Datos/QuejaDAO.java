/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.QuejaRecorrido;
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
public class QuejaDAO <T> extends DAOBase<QuejaRecorrido>
{

    private MongoDatabase conexion;

    public void recuperaQuejas() {
        conexion = Conexion.getInstance();
    }
    
    @Override
    public void guardar(QuejaRecorrido entidad) {
       MongoCollection<QuejaRecorrido> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public QuejaRecorrido buscarPorID(ObjectId id) {
        QuejaRecorrido quej = obtenerColeccion().find(eq("_id", id)).first();
        return quej;
    }

    @Override
    public List<QuejaRecorrido> buscarTodos() {
        List<QuejaRecorrido> quej = new ArrayList<>();
        quej = obtenerColeccion().find().into(new ArrayList<>());
        return quej;
    }

    @Override
    public MongoCollection<QuejaRecorrido> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<QuejaRecorrido> quejas = db.getCollection("QuejaRecorrido", QuejaRecorrido.class);
        return quejas;
    }

}

