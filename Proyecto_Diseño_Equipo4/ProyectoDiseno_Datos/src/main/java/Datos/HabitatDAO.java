package Datos;

import Dominio.Habitat;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

public class HabitatDAO<T> extends DAOBase<Habitat> {

    private MongoDatabase conexion;

    public Habitat buscaHabitat(String nombre) {
        conexion = Conexion.getInstance();
        MongoCollection<Habitat> habitatCollection = conexion.getCollection("habitat", Habitat.class);
        return habitatCollection.find(eq("nombre", nombre)).first();
    }

    public boolean guardarHabitat(Habitat habitat) {
        conexion = Conexion.getInstance();
        MongoCollection<Habitat> coleccion = conexion.getCollection("habitat", Habitat.class);
        coleccion.insertOne(habitat);
        if (habitat.getId() != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void guardar(Habitat entidad) {
         MongoCollection<Habitat> coleccionP =obtenerColeccion();
        coleccionP.insertOne(entidad);
    }

    @Override
    public Habitat buscarPorID(ObjectId id) {
       Habitat habitat = obtenerColeccion().find(eq("_id", id)).first();
        return habitat;

    }

    @Override
    public List<Habitat> buscarTodos() {
      List<Habitat> habitat = new ArrayList<>();
        habitat = obtenerColeccion().find().into(new ArrayList<>());
        return habitat;

    }

    @Override
    public MongoCollection<Habitat> obtenerColeccion() {
        MongoDatabase db = Conexion.getInstance();
        MongoCollection<Habitat> coleccioHabitats = db.getCollection("Habitat", Habitat.class);
        return coleccioHabitats;
    }

   

}
