/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.ZonaDelParque;
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
public class ZonadelParqueDAO <T> extends DAOBase<ZonaDelParque> {
    private MongoDatabase conexion;
     
    public List<ZonaDelParque> recuperaZonas() {
        conexion = Conexion.getInstance();
        MongoCollection<ZonaDelParque> coleccionZonas = obtenerColeccion();
        List<ZonaDelParque> zonas = coleccionZonas.find().into(new ArrayList<>());
        return zonas;
    }

    @Override
    public void guardar(ZonaDelParque entidad) {
        MongoCollection<ZonaDelParque> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public ZonaDelParque buscarPorID(ObjectId id) {
         ZonaDelParque zona = obtenerColeccion().find(eq("_id", id)).first();
        return zona;
    }

    @Override
    public List<ZonaDelParque> buscarTodos() {
        List<ZonaDelParque> zonas = new ArrayList<>();
        zonas = obtenerColeccion().find().into(new ArrayList<>());
        return zonas;
    }

    @Override
    public MongoCollection<ZonaDelParque> obtenerColeccion() {
       MongoDatabase db = Conexion.getInstance();
       MongoCollection<ZonaDelParque> colleccionZonas = db.getCollection("Zonas_Parque", ZonaDelParque.class);
       return colleccionZonas;
    }
}
