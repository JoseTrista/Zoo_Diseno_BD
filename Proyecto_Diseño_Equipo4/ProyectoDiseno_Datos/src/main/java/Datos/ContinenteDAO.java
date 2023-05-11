
package Datos;

import java.util.List;


public class ContinenteDAO 
{
    
    private Conexion conexion;

    public void recuperarContinente() {
       conexion = Conexion.getInstance();
    }
}
