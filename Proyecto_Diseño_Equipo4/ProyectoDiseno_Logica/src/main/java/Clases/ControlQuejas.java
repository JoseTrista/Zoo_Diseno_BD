package Clases;

import Datos.FabricaDatos;
import Datos.FachadaDatos;
import Datos.IDatos;
import Dominio.Itinerario;

/**
 *
 * @author IVAN
 */
public class ControlQuejas {

    public IDatos datos = new FachadaDatos();

    public Itinerario recuperaItinerario() {
        datos = FabricaDatos.dameInstancia();
        Itinerario itinerario = new Itinerario();
        return itinerario;
    }


    public void recuperaGuia() {

    }

    public void guardaQueja() {

    }
}
