
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.TipoVegetacion;
import java.util.List;


public interface IDatos 
{
    public List<Clima> recuperarClima();
    
    public List<Continente>recuperarContinente();
    
    public List<TipoVegetacion> recuperarVegetacion();
    
    public Habitat verificarHabitat(String nombre);
    
    public boolean guardaHabitat(Habitat habitat);
}
