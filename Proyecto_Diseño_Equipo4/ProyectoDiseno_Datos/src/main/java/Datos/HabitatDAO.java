
package Datos;

import com.mongodb.client.MongoDatabase;
import java.util.List;


public class HabitatDAO 
{
   private MongoDatabase conexion;
   public void buscaHabitat()
   {
       conexion = Conexion.getInstance();
   }
    
   public void guardarHabitat()
   {
       conexion = Conexion.getInstance();
   }
   
   
}
