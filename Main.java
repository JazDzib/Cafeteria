// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/***
 * Clase Main
 *@author Jazmin Dzib, Valeria Puga
 * */

public class Main {
    public static void main(String[] args) {
        VistaControladorP vistacontroladorP = new VistaControladorP();
        ControladorPrincipal sistema   = new ControladorPrincipal(vistacontroladorP);
        sistema.MenuPrincipal();



    }
}
