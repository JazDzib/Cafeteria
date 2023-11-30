package Controlador;

import Controlador.ControladorMenuT;
import Vista.VistaControladorP;
import Vista.VistaMenu;

public class ControladorPrincipal {

    private VistaMenu vistamenu;
    private ControladorMenuT menut;

    private VistaControladorP vistacontroladorP;

    public ControladorPrincipal(VistaControladorP vistacontroladorP) {

        vistamenu = new VistaMenu();
        menut = new ControladorMenuT(vistamenu);

        this.vistacontroladorP = vistacontroladorP;




    }

    public void MenuPrincipal() throws Exception {
        Integer opcion=0;
        while(opcion != 9){
            switch (vistacontroladorP.Menu()){
                case 1:
                    menut.MenuDELaTienda();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:


                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    opcion = 9;

                    break;

            } //fin del switch
        } //fin del while
    }
}
