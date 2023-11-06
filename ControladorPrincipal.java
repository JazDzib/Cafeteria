public class ControladorPrincipal {

    private VistaMenu vistamenu;
    private ControladorMenuT menut;

    private VistaControladorP vistacontroladorP;

    /**
     * @see VistaMenu Se crea un objeto de tipo VistaMenu.
     * @see VistaControladorP
     * @see ControladorMenuT Se crea un objeto de tipo ControladorMenuT.
     * @param vistacontroladorP
     */
    public ControladorPrincipal(VistaControladorP vistacontroladorP) {

        vistamenu = new VistaMenu();
        menut = new ControladorMenuT(vistamenu);

        this.vistacontroladorP = vistacontroladorP;
    }

    /**Dar acceso a cada función del software.
     * <p>Switch incompleto. Solo el primer caso contiene codificación.</p>
     * @see ControladorMenuT
     */
    public void MenuPrincipal(){
        Integer opcion=0;
        while(opcion != 4){
            switch (vistacontroladorP.Menu()){
                case 1:
                    menut.MenuDELaTienda();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    opcion = 4;

                    break;
            } //fin del switch
        } //fin del while
    }
}
