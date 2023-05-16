/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Datos.FabricaDatos;
import Datos.FachadaDatos;
import Datos.IDatos;
import Dominio.Guia;
import Dominio.Itinerario;
import Dominio.ZonaDelParque;
import java.util.List;

/**
 *
 * @author Equipo4
 */
public class ControlItinerario {
    public IDatos datos = new FachadaDatos();
    
    public List<ZonaDelParque> recuperaZonas(){
       datos=FabricaDatos.dameInstancia();
       return datos.recuperaZonas();
    }
    
    public List<Guia> recuperaGuias(){
       datos=FabricaDatos.dameInstancia();
       return datos.recuperaGuias();
    }
    
    public void buscarItinerario(){
        
    }
    
    public void verificaNombreItinerario(String nombre){
        Itinerario itinerario = new Itinerario();
        itinerario = datos.verificarItinerario(nombre);
        return;
    }
    
    public void guardaItinerario(){
        
    }
}
