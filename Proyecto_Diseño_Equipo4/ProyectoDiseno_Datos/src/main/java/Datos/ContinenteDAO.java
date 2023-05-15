
package Datos;

import Dominio.Continente;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class ContinenteDAO <T> extends DAOBase<Continente>
{
    private MongoDatabase conexion;

    public void recuperarContinente() {
       conexion = Conexion.getInstance();
    }
  
    @Override
    public void guardar(Continente entidad) {
       MongoCollection<Continente> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Continente buscarPorID(ObjectId id) {
        Continente continente = obtenerColeccion().find(eq("_id", id)).first();
        return continente;
    }

    @Override
    public List<Continente> buscarTodos() {
        List<Continente> continente = new ArrayList<>();
        continente = obtenerColeccion().find().into(new ArrayList<>());
        return continente;
    }

    @Override
    public MongoCollection<Continente> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Continente> coleccionContinentes = db.getCollection("Continentes", Continente.class);
        return coleccionContinentes;
    }
}
