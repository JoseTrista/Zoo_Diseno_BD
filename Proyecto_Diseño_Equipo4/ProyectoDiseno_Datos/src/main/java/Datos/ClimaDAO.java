
package Datos;

import java.util.List;

public class ClimaDAO 
{
    private Conexion conexion;

    public void recuperaClima() {
      conexion = Conexion.getInstance();
    }
}
