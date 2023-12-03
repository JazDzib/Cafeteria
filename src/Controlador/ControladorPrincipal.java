package Controlador;

import Controlador.ControladorMenuT;
import Modelo.MenuTienda;

import Vista.MenuRegistro;
import Vista.VistaControladorP;
import Vista.VistaMenu;
import Modelo.Percistencia;

import java.util.ArrayList;

public class ControladorPrincipal {



    private ControladorMenuT controlMenu;
    private Percistencia persistenciaA;
    private ControladorAlmacen controlAlmacen;
    private ControladorClientes controlClientes;
    private ControladorVentas controlVentas;

    public ControladorPrincipal() {
        controlMenu = new ControladorMenuT();
        persistenciaA = new Percistencia();
        controlAlmacen = new ControladorAlmacen();
        controlClientes = new ControladorClientes();
        controlVentas = new ControladorVentas();


        }
        public Percistencia obtenerPersistencia(){
            return persistenciaA;
        }

        public ControladorMenuT obtenerControladorMenu(){
            return controlMenu;
        }

        public ControladorAlmacen obtenerControladorAlmacen(){return controlAlmacen; }

        public ControladorClientes obtenerControladorClientes(){return controlClientes;}
        public ControladorVentas obtenerControladorVentas(){return controlVentas;}


    /*public void MenuPrincipal() throws Exception {
        Integer opcion=0;
        while(opcion != 9){
            switch (vistacontroladorP.Menu()){
                case 1:
                    controlMenu.MenuDELaTienda();
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
    }*/
}
