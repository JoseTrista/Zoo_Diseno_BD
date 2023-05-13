
package Datos;

/**
 *
 * @author IVAN
 */
public class FabricaDatos {
     public static IDatos crearInstancia(){
        return new FachadaDatos();
    }
}
