package Datos;

import Dominio.Clima;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class ClimaDAO<T> extends DAOBase<Clima> {

    private MongoDatabase conexion;

    public void recuperaClima() {
        conexion = Conexion.getInstance();
    }

    @Override
    public void guardar(Clima entidad) {
       MongoCollection<Clima> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Clima buscarPorID(ObjectId id) {
        Clima clima = obtenerColeccion().find(eq("_id", id)).first();
        return clima;
    }

    @Override
    public List<Clima> buscarTodos() {
        List<Clima> climas = new ArrayList<>();
        climas = obtenerColeccion().find().into(new ArrayList<>());
        return climas;
    }

    @Override
    public MongoCollection<Clima> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Clima> colleccionClimas = db.getCollection("Clima", Clima.class);
        return colleccionClimas;
    }
}
