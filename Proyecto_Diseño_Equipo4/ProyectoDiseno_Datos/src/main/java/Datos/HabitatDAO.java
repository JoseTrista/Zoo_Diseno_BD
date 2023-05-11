
package Datos;

import java.util.List;


public class HabitatDAO 
{
   private Conexion conexion;
   public void buscaHabitat()
   {
       conexion = Conexion.getInstance();
   }
    
   public void guardarHabitat()
   {
       conexion = Conexion.getInstance();
   }
   
   
}
