
package Datos;

import Dominio.Habitat;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.List;


public class HabitatDAO 
{
   private MongoDatabase conexion;
   public Habitat buscaHabitat(String nombre)
   {
       conexion = Conexion.getInstance();
       MongoCollection<Habitat> habitatCollection = conexion.getCollection("habitat", Habitat.class);
       return habitatCollection.find(eq("nombre", nombre)).first();
   }
    
   public boolean guardarHabitat(Habitat habitat)
   {
       conexion = Conexion.getInstance();
       MongoCollection<Habitat> coleccion = conexion.getCollection("habitat", Habitat.class);
        coleccion.insertOne(habitat);
        if (habitat.getId() != null) {
            return true;
        } else {
            return false;
        }
   }
   
   
}
