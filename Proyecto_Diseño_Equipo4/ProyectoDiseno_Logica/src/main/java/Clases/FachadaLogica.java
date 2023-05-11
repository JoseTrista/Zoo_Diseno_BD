
package Clases;

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
    public void recuperaDatosHabitat() {
       
    }
    
}
