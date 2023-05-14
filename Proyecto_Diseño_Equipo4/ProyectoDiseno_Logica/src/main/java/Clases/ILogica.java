package Clases;

import Dominio.Habitat;
import java.util.List;


public interface ILogica
{    
    public List<Object> recuperaDatosHabitat();
    
    public Habitat verificaNombreHabitat(String nombre);
    
    public void guardarHabitat();      
}
