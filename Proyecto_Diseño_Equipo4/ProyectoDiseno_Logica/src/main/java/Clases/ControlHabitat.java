
package Clases;

import Datos.FabricaDatos;
import Datos.FachadaDatos;
import Datos.IDatos;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.TipoVegetacion;
import java.util.List;

public class ControlHabitat  { 
    public IDatos datos = new FachadaDatos();
            
            
    public Habitat verificaHabitat(String nombre){
        Habitat habitat = new Habitat();
        habitat = datos.verificarHabitat(nombre);
        return habitat;
    }
    
    public boolean guardarHabitat(Habitat habitat){
        datos.guardaHabitat(habitat);
        return true;
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
