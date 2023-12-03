package Controlador;


import Vista.MenuRegistro;
import Vista.PrimeraPantalla;

public class ControladorGui {
    private ControladorPrincipal controladorPrincipal;
    private PrimeraPantalla pantallaPrincipal;
    private MenuRegistro registromenu;

    public ControladorGui() {
        controladorPrincipal = new ControladorPrincipal();
        pantallaPrincipal = new PrimeraPantalla(controladorPrincipal);
        registromenu = new MenuRegistro(controladorPrincipal);



    }

    public void iniciar() {
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }

}
