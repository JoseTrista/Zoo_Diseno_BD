
package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.TipoVegetacion;
import java.util.List;

public class FachadaDatos implements IDatos
{
    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion; 
    private HabitatDAO habitat;
    
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
        hb = habitat.buscaHabitat(nombre);
        return hb;
    }

    @Override
    public void guardaHabitat() {
       habitat.guardarHabitat();
    }

}
