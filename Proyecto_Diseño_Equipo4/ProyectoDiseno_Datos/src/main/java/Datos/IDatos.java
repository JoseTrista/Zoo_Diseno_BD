
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.TipoVegetacion;
import Dominio.ZonaDelParque;
import java.util.List;


public interface IDatos 
{
    public List<Clima> recuperarClima();
    
    public List<Continente>recuperarContinente();
    
    public List<TipoVegetacion> recuperarVegetacion();
    
    public Habitat verificarHabitat(String nombre);
    
    public boolean guardaHabitat(Habitat habitat);
    
    public List<Guia> recuperaGuias();
    
    public List<ZonaDelParque> recuperaZonas();
    
    public Itinerario buscarItinerario(String nombre);
    
    public Itinerario guardaItinerario(Itinerario itinerario);
    
    public List<Cuidador> recuperaCuidadores(Cuidador cuidador);
    
    public List<Habitat> recuperaHabitat(Habitat habitat);
    
    public Especie verificaEspecie(String nombre);
    
    public boolean guardaEspecie(Especie especie);

}
