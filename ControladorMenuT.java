import java.util.ArrayList;

/** Parte lógica del menú donde se muestran las funciones principales del software.
 * @version 1.0
 */
public class ControladorMenuT {
    private ArrayList<MenuTienda> menuTList;
    private VistaMenu vista; //Atributo de tipo VistaMenu
    private MenuTienda menu1; //Atributo de tipo MenuTienda

    ControladorMenuT(VistaMenu vista){
        menuTList =  new ArrayList<MenuTienda>();
        this.vista=vista;
    }//Constructor

    /**
     *Método agregar productos
     * @see VistaMenu Aquí se almacena el código de cada método.
     */
    public void addProductoT(){
        menu1 = new MenuTienda(vista.SolicitarCodigo(),
                vista.SolicitarCategria(),
                vista.SolicitarProducto(),
                vista.SolicitarPrecio(),
                vista.SolicitarDescripcion());
        menuTList.add(menu1);
    }

    /** Método que busca el código del producto.
      * @param codigo Código ingresado para que el producto sea encontrado.
     * @return Código de producto no encotrado
     */
    public Integer buscarProducto(String codigo){
            for (int i = 0; i < menuTList.size(); i++) {
                String obtenercodigo = menuTList.get(i).getCodigo();

                if (codigo.equals(menuTList.get(i).getCodigo())) {
                    System.out.println(i);
                    return i;
                }
            }
        return -1;
    }


    /** Método para eliminar productos.
     *
     * @param codigo Código que se va a comparar con un <i>if</i> y así sea removido de la lista de ingredientes.
     * @return Se devuelve, de tipo booleano, un <i>true</i> o <i>false</i>,
     * para detectar si la eliminación se ha realizado.
     */
        public boolean eliminarProducto (String codigo){
            int compara = buscarProducto(codigo);
            if (compara != -1) {
                menuTList.remove(compara);//elimina el producto del Array
                return true;
            }else {

                return false;
            }
        }

    /** Método para modificar los atributos.
     * @param codigo Se toma el código para mostrar la lista de datos a modificar.
     *               <p>Se toma un <i>switch</i> para mostrar, de forma ordenada, la serie de
     *               datos a modificar.</p>
     * @see VistaMenu
     */
    public void modificarMenu(String codigo) {
       int  compara = buscarProducto(codigo);
        if(compara != -1 ) {
            vista.imprimirInfoProd(menuTList.get(compara));
            Integer opcion = 0;
            while (opcion != 5) {
                switch (vista.MenuModificarMenu()) {
                    case 1:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setCategoria(vista.SolicitarCategria());

                        break;
                    case 2:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setProducto(vista.SolicitarProducto());

                        break;
                    case 3:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setPrecio(vista.SolicitarPrecio());

                        break;
                    case 4:

                        vista.imprimirInfoProd(menuTList.get(compara));
                        menuTList.get(compara).setDescripcion(vista.SolicitarDescripcion());

                        break;
                    case 5:
                        opcion = 5;
                        break;
                }//fin switch
            }//fin while
        }//fin if
    }

    /**
     * Menú con modificaciones hechas.
     * @see VistaMenu VistaMenu contiene lo que se le mostrará al usuario
     *                en esta versión sin interfaz.
     */
    public void MenuDELaTienda(){
        Integer opcion=0; ;
        while(opcion != 5){
            switch (vista.Menu()){
                case 1:
                    addProductoT();
                    break;
                case 2:
                    String  indice = vista.SolicitarCodigo();
                    vista.imprimeInfoBorrado(eliminarProducto(indice));

                    break;
                case 3:
                   vista.SolicitarCodigo();
                    modificarMenu(menu1.getCodigo());

                    break;
                case 4:
                    vista.imprimirInfoTotal(menuTList);

                    break;
                case 5:
                    opcion = 5;
                    break;
            } //fin switch
        } //fin while
    } //fin Menu de Tienda


}
