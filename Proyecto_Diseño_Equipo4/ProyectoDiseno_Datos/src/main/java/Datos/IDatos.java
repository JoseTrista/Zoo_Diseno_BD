
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.QuejaRecorrido;
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
    
    public boolean guardaItinerario(Itinerario itinerario);
    
    public List<Cuidador> recuperaCuidadores();
    
    public List<Habitat> recuperaHabitats();
    
    public Especie verificaEspecie(String nombre);
    
    public boolean guardaEspecie(Especie especie);
    
    public Itinerario verificarItinerario(String nombre);
    
    public Itinerario recuperaItinerario();
    
    public void recuperaFechas();
    
    public void recuperaHoras();
    
    public boolean guardarQueja();
    
}
