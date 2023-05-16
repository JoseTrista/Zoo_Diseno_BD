package Clases;

import Dominio.Habitat;
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

    @Override
    public void buscarItinerario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verificaNombreItinerario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardaItinerario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> recuperaZonasyGuias() {
        ci = new ControlItinerario();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ci.recuperaZonas());
        datosARecuperar.add(ci.recuperaGuias());
        return datosARecuperar;
    }

    @Override
    public List<Object> recuperaCuidadoresyHabitats() {
        ce = new ControlEspecie();
        ch = new ControlHabitat();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ce.RecuperaCuidadores());
        datosARecuperar.add(ch.RecuperaHabitats());
        return datosARecuperar;
    }
}
