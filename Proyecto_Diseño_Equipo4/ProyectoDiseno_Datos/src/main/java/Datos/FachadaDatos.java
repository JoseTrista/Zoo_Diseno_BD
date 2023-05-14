
package Datos;

import Dominio.Clima;
import Dominio.Continente;
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
    public void verificarHabitat() {
        habitat.buscaHabitat();
    }

    @Override
    public void guardaHabitat() {
       habitat.guardarHabitat();
    }

}
