package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Guia;
import Dominio.ZonaDelParque;
import Dominio.TipoVegetacion;
import java.util.Date;

/**
 *
 * @author IVAN
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ContinenteDAO con = new ContinenteDAO();
//        Continente cona = new Continente("America");
//        Continente conaf = new Continente("Africa");
//        Continente conaA = new Continente("Asia");
//        Continente conaE = new Continente("Europa");
//        Continente conaO = new Continente("Oceania");
//        con.guardar(cona);
//        con.guardar(conaf);
//        con.guardar(conaA);
//        con.guardar(conaE);
//        con.guardar(conaO);
//
//        VegetacionDAO vege = new VegetacionDAO();
//        TipoVegetacion ve = new TipoVegetacion("Taiga");
//        TipoVegetacion veB = new TipoVegetacion("Boscosa");
//        TipoVegetacion veD = new TipoVegetacion("Desertica");
//        TipoVegetacion veP = new TipoVegetacion("Praderas");
//        vege.guardar(ve);
//        vege.guardar(veB);
//        vege.guardar(veD);
//        vege.guardar(veP);
//
//        ClimaDAO clima = new ClimaDAO();
//        Clima cl = new Clima("Tropical");
//        Clima clS = new Clima("Soleado");
//        Clima clN = new Clima("Nublado");
//        Clima clT = new Clima("Templado");
//        Clima clP = new Clima("Polar");
//        clima.guardar(cl);
//        clima.guardar(clS);
//        clima.guardar(clN);
//        clima.guardar(clT);
//        clima.guardar(clP);
        
//        GuiaDAO guia = new GuiaDAO();
//        Guia g1 = new Guia("jose", "Amberes 314", "6442062325", new Date(120,0,13));
//        guia.guardar(g1);
// 
//        ZonadelParqueDAO zona = new ZonadelParqueDAO();
//        ZonaDelParque z1 = new ZonaDelParque("Mamiferos", 10);
//        ZonaDelParque z2 = new ZonaDelParque("Terrario", 15);
//        ZonaDelParque z3 = new ZonaDelParque("Aviario", 20);
//        ZonaDelParque z4 = new ZonaDelParque("Reptiles", 30);
//        ZonaDelParque z5 = new ZonaDelParque("Insectos", 40);
//        zona.guardar(z1);
//        zona.guardar(z2);
//        zona.guardar(z3);
//        zona.guardar(z4);
//        zona.guardar(z5);

          CuidadorDAO cuidador = new CuidadorDAO();
          Cuidador c1 = new Cuidador("Jesus Villanueva", "Plano oriente", "6441879625", new Date(110, 05,12));
          
          cuidador.guardar(c1);
    }

}
