
package Datos;

import Dominio.TipoVegetacion;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;


public class VegetacionDAO <T> extends DAOBase<TipoVegetacion>
{

    private MongoDatabase conexion;

    public void recuperaVegetacion() {
        conexion = Conexion.getInstance();
    }
    
    @Override
    public void guardar(TipoVegetacion entidad) {
       MongoCollection<TipoVegetacion> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public TipoVegetacion buscarPorID(ObjectId id) {
        TipoVegetacion vege = obtenerColeccion().find(eq("_id", id)).first();
        return vege;
    }

    @Override
    public List<TipoVegetacion> buscarTodos() {
        List<TipoVegetacion> vege = new ArrayList<>();
        vege = obtenerColeccion().find().into(new ArrayList<>());
        return vege;
    }

    @Override
    public MongoCollection<TipoVegetacion> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<TipoVegetacion> collecionVegetacion = db.getCollection("Vegetacion", TipoVegetacion.class);
        return collecionVegetacion;
    }

}
