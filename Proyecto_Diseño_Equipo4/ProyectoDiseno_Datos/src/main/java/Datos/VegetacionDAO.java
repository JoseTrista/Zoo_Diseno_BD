
package Datos;

import java.util.List;


public class VegetacionDAO 
{

    private Conexion conexion;

    public void recuperaVegetacion() {
        conexion = Conexion.getInstance();
    }
}
