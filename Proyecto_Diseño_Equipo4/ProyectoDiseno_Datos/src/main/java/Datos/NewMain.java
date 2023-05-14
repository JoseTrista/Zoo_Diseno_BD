package Datos;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.TipoVegetacion;

/**
 *
 * @author IVAN
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ContinenteDAO con = new ContinenteDAO();
        Continente cona = new Continente("America");
        Continente conaf = new Continente("Africa");
        Continente conaA = new Continente("Asia");
        Continente conaE = new Continente("Europa");
        Continente conaO = new Continente("Oceania");
        con.guardar(cona);
        con.guardar(conaf);
        con.guardar(conaA);
        con.guardar(conaE);
        con.guardar(conaO);

        VegetacionDAO vege = new VegetacionDAO();
        TipoVegetacion ve = new TipoVegetacion("Taiga");
        TipoVegetacion veB = new TipoVegetacion("Boscosa");
        TipoVegetacion veD = new TipoVegetacion("Desertica");
        TipoVegetacion veP = new TipoVegetacion("Praderas");
        vege.guardar(ve);
        vege.guardar(veB);
        vege.guardar(veD);
        vege.guardar(veP);

        ClimaDAO clima = new ClimaDAO();
        Clima cl = new Clima("Tropical");
        Clima clS = new Clima("Soleado");
        Clima clN = new Clima("Nublado");
        Clima clT = new Clima("Templado");
        Clima clP = new Clima("Polar");
        clima.guardar(cl);
        clima.guardar(clS);
        clima.guardar(clN);
        clima.guardar(clT);
        clima.guardar(clP);
    }

}
