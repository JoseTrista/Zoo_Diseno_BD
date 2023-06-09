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

public class FachadaDatos implements IDatos {

    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion;
    private CuidadorDAO cuidador;
    private HabitatDAO habitat;
    private HabitatDAO habitat2 = new HabitatDAO();
    private ItinerarioDAO itinerarioa;
    private GuiaDAO guia;
    private ZonadelParqueDAO zona;
    private EspecieDAO espe;

    @Override
    public List<Clima> recuperarClima() {
        clima = new ClimaDAO();
        return clima.buscarTodos();
    }

    @Override
    public List<Continente> recuperarContinente() {
        continente = new ContinenteDAO();
        return continente.buscarTodos();
    }

    @Override
    public List<TipoVegetacion> recuperarVegetacion() {
        vegetacion = new VegetacionDAO();
        return vegetacion.buscarTodos();
    }

    @Override
    public Habitat verificarHabitat(String nombre) {
        Habitat hb = new Habitat();
        hb = habitat2.buscaHabitat(nombre);
        return hb;
    }

    public Itinerario verificarItinerario(String nombre) {
        itinerarioa = new ItinerarioDAO();
        return itinerarioa.buscarnombreItinerario(nombre);
    }

    @Override
    public boolean guardaHabitat(Habitat habitat) {
        habitat2.guardarHabitat(habitat);
        return true;
    }

    @Override
    public List<Guia> recuperaGuias() {
        guia = new GuiaDAO();
        return guia.recuperaGuias();
    }

    @Override
    public List<ZonaDelParque> recuperaZonas() {
        zona = new ZonadelParqueDAO();
        return zona.recuperaZonas();
    }

    @Override
    public Itinerario buscarItinerario(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardaItinerario(Itinerario itinerario) {
        itinerarioa = new ItinerarioDAO();
        itinerarioa.guardaItinerario(itinerario);
        return true;
    }

    @Override
    public List<Cuidador> recuperaCuidadores() {
        cuidador = new CuidadorDAO();
        return cuidador.buscarTodos();
    }

    @Override
    public Especie verificaEspecie(String nombre) {
        espe = new EspecieDAO();
        return espe.buscarEspecie(nombre);
    }

    @Override
    public boolean guardaEspecie(Especie especie) {
        espe = new EspecieDAO();
        espe.guardar(especie);
        return true;
    }

    @Override
    public List<Habitat> recuperaHabitats() {
        habitat = new HabitatDAO();
        return habitat.buscarTodos();
    }

    @Override
    public List<Itinerario> recuperaItinerario() {
        itinerarioa = new ItinerarioDAO();
        return itinerarioa.buscarTodos();
    }   
    @Override
    public boolean actualizarItinerario(Itinerario itinerario) {
        itinerarioa = new ItinerarioDAO();
        return this.itinerarioa.actualizarItinerario(itinerario);
    }
    @Override
    public void recuperaFechas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recuperaHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarQueja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
