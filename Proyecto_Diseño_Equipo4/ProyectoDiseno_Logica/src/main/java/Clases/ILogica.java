package Clases;

import Dominio.Habitat;
import java.util.List;


public interface ILogica
{    
    public List<Object> recuperaDatosHabitat();
    
    public Habitat verificaNombreHabitat(String nombre);
    
    public boolean guardarHabitat(Habitat habitat);      
    
    public List<Object> recuperaZonasyGuias();
    
    public void buscarItinerario();
    
    public void verificaNombreItinerario();
    
    public void guardaItinerario();
}
