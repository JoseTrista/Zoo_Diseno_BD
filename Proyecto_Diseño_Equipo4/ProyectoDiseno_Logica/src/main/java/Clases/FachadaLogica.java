package Clases;

import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.QuejaRecorrido;
import Dominio.ZonaDelParque;
import java.util.ArrayList;
import java.util.List;

public class FachadaLogica implements ILogica {

    ControlHabitat ch = new ControlHabitat();
    ControlItinerario ci = new ControlItinerario();
    ControlEspecie ce = new ControlEspecie();

    @Override
    public Habitat verificaNombreHabitat(String nombre) {
        Habitat hb = new Habitat();
        hb = ch.verificaHabitat(nombre);
        return hb;
    }

    @Override
    public boolean guardarHabitat(Habitat habitat) {
        ch.guardarHabitat(habitat);
        return true;
    }

    @Override
    public List<Object> recuperaDatosHabitat() {
        ch = new ControlHabitat();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ch.RecuperaClima());
        datosARecuperar.add(ch.RecuperaContinente());
        datosARecuperar.add(ch.RecuperaVegetacion());
        return datosARecuperar;
    }

    //@Override
    public void buscarItinerario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Itinerario verificaNombreItinerario(String nombre) {
        Itinerario it = new Itinerario();
        it = ci.verificaNombreItinerario(nombre);
        return it;
    }

    @Override
    public boolean  guardaItinerario(Itinerario itinerario) {
      ci.guardarItinerario(itinerario);
        return true;
    }

    @Override
    public List<Object> recuperaZonasyGuias() {
        ci = new ControlItinerario();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ci.recuperaGuias());
        datosARecuperar.add(ci.recuperaZonas());
        return datosARecuperar;
    }

    @Override
    public List<Object> recuperaCuidadoresyHabitatsyZonas() {
        ce = new ControlEspecie();
        ch = new ControlHabitat();
        ci = new ControlItinerario();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ce.RecuperaCuidadores());
        datosARecuperar.add(ch.RecuperaHabitats());
        datosARecuperar.add(ci.recuperaZonas());
        return datosARecuperar;
    }

    @Override
    public Especie verificaNombreEspecie(String nombre) {
        Especie hb = new Especie();
        hb = ce.verificaEspecieRegistrada(nombre);
        return hb;
    }

    @Override
    public boolean guardarEspecie(Especie especie) {
        ce.guardarEspecie(especie);
        return true;
    }

    @Override
    public void buscarItinerario(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

    @Override
    public List<Itinerario> recuperaItinerarios() {
       List<Itinerario> a=new ArrayList<>();
        return a;
    }

    @Override
    public List<Guia> recuperaGuia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardaQueja(QuejaRecorrido quejas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recuperaHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
