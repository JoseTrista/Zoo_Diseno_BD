package Clases;

import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.QuejaRecorrido;
import java.util.List;

public interface ILogica {

    public List<Object> recuperaDatosHabitat();

    public Habitat verificaNombreHabitat(String nombre);

    public boolean guardarHabitat(Habitat habitat);

    public boolean guardarEspecie(Especie especie);

    public List<Object> recuperaCuidadoresyHabitatsyZonas();
    
    public boolean actualizarItinerario(Itinerario itinerario);
    
    public List<Object> recuperaZonasyGuias();

    public void buscarItinerario(String nombre);

    public Itinerario verificaNombreItinerario(String nombre);

    public boolean guardaItinerario(Itinerario itinerario);

    public Especie verificaNombreEspecie(String nombre);

    public List<Itinerario> recuperaItinerarios();
    
    public List<Guia> recuperaGuia();

    public void recuperaHoras();
    
    public boolean guardaQueja(QuejaRecorrido quejas);
}
