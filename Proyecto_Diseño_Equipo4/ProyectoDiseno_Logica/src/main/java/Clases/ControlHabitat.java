
package Clases;

import Datos.FabricaDatos;
import Datos.IDatos;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.TipoVegetacion;
import java.util.List;

public class ControlHabitat  { 
    public IDatos datos;
            
            
    public void verficicaHabitat(){
        
    }
    
    public void guardarHabitat(){
        //Accede a datos mediante la fachada
    }
    
    public List<Clima> RecuperaClima(){
        datos=FabricaDatos.dameInstancia();
        return datos.recuperarClima();
        
    }
    
    public List<TipoVegetacion> RecuperaVegetacion(){
         datos=FabricaDatos.dameInstancia();
        return datos.recuperarVegetacion();
    }
    
    public List<Continente> RecuperaContinente(){
         datos=FabricaDatos.dameInstancia();
        return datos.recuperarContinente();
    }    
    
}
