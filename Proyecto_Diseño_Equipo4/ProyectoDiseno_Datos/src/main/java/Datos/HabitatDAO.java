
package Datos;

import Dominio.Habitat;
import com.mongodb.client.MongoDatabase;
import java.util.List;


public class HabitatDAO 
{
   private MongoDatabase conexion;
   public Habitat buscaHabitat(String nombre)
   {
       conexion = Conexion.getInstance();
       return null;
   }
    
   public void guardarHabitat()
   {
       conexion = Conexion.getInstance();
   }
   
   
}
