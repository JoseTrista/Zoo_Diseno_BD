/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Dominio.Especie;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author IVAN
 */
public class EspecieDAO<T> extends DAOBase<Especie> {

    private MongoDatabase conexion;

    public Especie buscarEspecie(String nombre) {
        conexion = Conexion.getInstance();
        MongoCollection<Especie> especieCollection = conexion.getCollection("Especie", Especie.class);

        Pattern pattern = Pattern.compile(nombre, Pattern.CASE_INSENSITIVE);
        Bson filtro = Filters.regex("nombre", pattern);

        return especieCollection.find(filtro).first();
    }


    @Override
    public void guardar(Especie entidad) {
        MongoCollection<Especie> coleccionP = obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Especie buscarPorID(ObjectId id) {
        Especie especie = obtenerColeccion().find(eq("_id", id)).first();
        return especie;
    }

    @Override
    public List<Especie> buscarTodos() {
        List<Especie> especies = new ArrayList<>();
        especies = obtenerColeccion().find().into(new ArrayList<>());
        return especies;
    }

    @Override
    public MongoCollection<Especie> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Especie> collectionEspecies = db.getCollection("Especie", Especie.class);
        return collectionEspecies;
    }

}
