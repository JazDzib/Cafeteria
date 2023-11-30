package Controlador;

import Modelo.MenuTienda;
import Vista.VistaMenu;

import java.util.ArrayList;

public class ControladorMenuT {
    private ArrayList<MenuTienda> menuTList;
    private VistaMenu vista; //Atributo de tipo Vista.VistaMenu
    private MenuTienda menu1; //Atributo de tipo Modelo.MenuTienda

    ControladorMenuT(VistaMenu vista){
        menuTList =  new ArrayList<MenuTienda>();
        this.vista=vista;
    }//Constructor
    public void addProductoT() throws Exception {
        menu1 = new MenuTienda(vista.SolicitarCodigo(),
                vista.SolicitarCategria(),
                vista.SolicitarProducto(),
                vista.SolicitarPrecio(),
                vista.SolicitarDescripcion());
        menuTList.add(menu1);
    } //Método agregar productos



    public int buscarProducto(String codigo){
            for (int i = 0; i < menuTList.size(); i++) {
                String newcodigo = menuTList.get(i).getCodigo();

                if (codigo.equals(menuTList.get(i).getCodigo())) {
                    System.out.println(i);
                    return i;
                }//
            }
        return -1;//Código de producto no encotrado

    } //Método que buscas el codigo del producto



        public boolean eliminarProducto (String codigo){
            int compara = buscarProducto(codigo);
            if (compara != -1) {
                menuTList.remove(compara);//elimina el producto del Array
                return true;
            }else {

                return false;
            }
        }//Metodo para eliminar productos



    public void modificarMenu(String codigo) throws Exception {
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
            }//llave final del while
        }//llave final del if
    }//Método para modificar los atributos


    public void MenuDELaTienda() throws Exception {
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
            } //fin del switch
        } //fin del while
    } //fin de Menu de Tienda


}