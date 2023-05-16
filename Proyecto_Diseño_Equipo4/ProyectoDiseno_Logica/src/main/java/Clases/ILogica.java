package Clases;

import Dominio.Especie;
import Dominio.Habitat;
import Dominio.ZonaDelParque;
import java.util.List;


public interface ILogica
{    
    public List<Object> recuperaDatosHabitat();
    
    public Habitat verificaNombreHabitat(String nombre);
    
    public boolean guardarHabitat(Habitat habitat);   
    
      public boolean guardarEspecie(Especie especie);   
    
    public List<Object> recuperaCuidadoresyHabitatsyZonas();
    
    public List<Object> recuperaZonasyGuias();
    
    public void buscarItinerario();
    
    public void verificaNombreItinerario();
    
    public void guardaItinerario();
    
   public Especie verificaNombreEspecie(String nombre);
}
