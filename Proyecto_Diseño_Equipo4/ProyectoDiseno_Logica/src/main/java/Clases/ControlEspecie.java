/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Datos.FabricaDatos;
import Datos.FachadaDatos;
import Datos.IDatos;
import Dominio.Cuidador;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class ControlEspecie {
     public IDatos datos = new FachadaDatos();
        
    public List<Cuidador> RecuperaCuidadores(){
        datos = FabricaDatos.dameInstancia();
        return datos.recuperaCuidadores();
    }
}
