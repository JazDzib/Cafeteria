package Controlador;


import Vista.MenuRegistroP;
import Vista.PrimeraPantalla;

public class ControladorGui {
    private ControladorPrincipal controladorPrincipal;
    private PrimeraPantalla pantallaPrincipal;
    private MenuRegistroP registromenu;

    public ControladorGui() {
        controladorPrincipal = new ControladorPrincipal();
        pantallaPrincipal = new PrimeraPantalla(controladorPrincipal);
        registromenu = new MenuRegistroP(controladorPrincipal);



    }

    public void iniciar() {
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }

}
