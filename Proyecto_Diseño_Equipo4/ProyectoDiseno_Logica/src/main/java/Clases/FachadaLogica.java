package Clases;

import java.util.ArrayList;
import java.util.List;

public class FachadaLogica implements ILogica {

    private ControlHabitat ch;

    @Override
    public void verificaNombreHabitat() {
        ch.verficicaHabitat();
    }

    @Override
    public void guardarHabitat() {
        ch.guardarHabitat();
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
