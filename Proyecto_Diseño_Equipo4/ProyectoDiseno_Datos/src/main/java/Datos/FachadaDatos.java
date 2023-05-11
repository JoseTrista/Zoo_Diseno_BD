
package Datos;

public class FachadaDatos implements IDatos
{
    private ContinenteDAO continente;
    private ClimaDAO clima;
    private VegetacionDAO vegetacion; 
    private HabitatDAO habitat;
    
    @Override
    public void recuperarClima() {
       clima.recuperaClima();
    }

    @Override
    public void recuperarContinente() {
       continente.recuperarContinente();
    }

    @Override
    public void recuperarVegetacion() {
       vegetacion.recuperaVegetacion();
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
