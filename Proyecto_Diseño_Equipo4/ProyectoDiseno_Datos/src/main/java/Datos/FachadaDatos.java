
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.TipoVegetacion;
import Dominio.ZonaDelParque;
import java.util.List;

public class FachadaDatos implements IDatos
{
    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion; 
    private HabitatDAO habitat2 = new HabitatDAO();
    
    @Override
    public List<Clima> recuperarClima() {
     clima=new ClimaDAO();
     return  clima.buscarTodos();
       
    }

    @Override
    public List<Continente> recuperarContinente() {
          continente=new ContinenteDAO();
       return  continente.buscarTodos();
    }

    @Override
    public List<TipoVegetacion> recuperarVegetacion() {
          vegetacion=new VegetacionDAO();
       return  vegetacion.buscarTodos();
    }

    @Override
    public Habitat verificarHabitat(String nombre) {
        Habitat hb = new Habitat();
        hb = habitat2.buscaHabitat(nombre);
        return hb;
    }

    @Override
    public boolean guardaHabitat(Habitat habitat) {
        habitat2.guardarHabitat(habitat);
        return true;
    }

    @Override
    public List<Guia> recuperaGuias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ZonaDelParque> recuperaZonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Itinerario buscarItinerario(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Itinerario guardaItinerario(Itinerario itinerario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
