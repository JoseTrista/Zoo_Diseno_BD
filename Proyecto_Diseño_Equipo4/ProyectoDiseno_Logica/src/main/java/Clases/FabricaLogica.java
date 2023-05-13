
package Clases;

/**
 *
 * @author IVAN
 * 
 */
public class FabricaLogica {
    public static ILogica crearInstancia(){
        return new FachadaLogica();
    }
}
