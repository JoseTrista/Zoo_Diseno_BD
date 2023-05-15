package Clases;

import Dominio.Habitat;
import java.util.ArrayList;
import java.util.List;

public class FachadaLogica implements ILogica {

    ControlHabitat ch = new ControlHabitat();

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
        ch=new ControlHabitat();
        List<Object> datosARecuperar = new ArrayList<>();
        datosARecuperar.add(ch.RecuperaClima());
        datosARecuperar.add(ch.RecuperaContinente());
        datosARecuperar.add(ch.RecuperaVegetacion());
        return datosARecuperar;
    }

}
