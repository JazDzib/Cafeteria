package Controlador;

import Modelo.Buscador;
import Modelo.MenuTienda;
import Modelo.Percistencia;

import Vista.VistaMenu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ControladorMenuT implements Buscador {
    private ArrayList<MenuTienda>menuTList;


    public ControladorMenuT() {
        menuTList = new  ArrayList<>();
    }
    public void setMenuTList(ArrayList<MenuTienda> menuTList) {
        this.menuTList = menuTList;
    }
    public ArrayList<MenuTienda> getMenuTList() {
        return menuTList;
    }

    @Override
    public int buscar(String codigo) {
        for (int i = 0; i < menuTList.size(); i++) {
            String newcodigo = menuTList.get(i).getCodigo();

            if (codigo.equals(menuTList.get(i).getCodigo())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    }
    public void iniciardatos (){

        menuTList= Percistencia.cargarMenu("ListaMenu.txt");

    }
    public void actualizarTablaPlatillos(JTable TablaInventario1, ArrayList<MenuTienda> menuTList) {
        DefaultTableModel tablaMenu = (DefaultTableModel) TablaInventario1.getModel();
        tablaMenu.setRowCount(0);
        iniciardatos();

        for (MenuTienda prodmenu : menuTList ) {

            tablaMenu.addRow(new Object[]{prodmenu.getCodigo(),prodmenu.getCategoria(),prodmenu.getProducto(),prodmenu.getPrecio(),prodmenu.getDescripcion()});
        }
    }

    /*private ArrayList<MenuTienda> menuTList;
    private VistaMenu vista; //Atributo de tipo Vista.VistaMenu
    private MenuRegistro MeRegistro;
    private MenuTienda menu1; //Atributo de tipo Modelo.MenuTienda

    ControladorMenuT(){
        menuTList =  new ArrayList<>();
        this.MeRegistro=MeRegistro;
    }//Constructor

    public ArrayList<MenuTienda> getMenuTList() {
        return menuTList;
    }

    public void setMenuTList(ArrayList<MenuTienda> menuTList) {
        this.menuTList = menuTList;
    }

    public void iniciardatos (){

       menuTList= Percistencia.cargarMenu("Menu.txt");

    }

    @Override
    public int buscar(String codigo) {
        for (int i = 0; i < menuTList.size(); i++) {
            String newcodigo = menuTList.get(i).getCodigo();

            if (codigo.equals(menuTList.get(i).getCodigo())) {
                System.out.println(i);
                return i;
            }//
        }
        return -1;//Código de producto no encotrado

    }


    public void agregarMenu() throws Exception {
        menu1 = new MenuTienda(vista.SolicitarCodigo(),
                vista.SolicitarCategria(),
                vista.SolicitarProducto(),
                vista.SolicitarPrecio(),
                vista.SolicitarDescripcion());
        menuTList.add(menu1);
        Percistencia.guardarMenu(menuTList,"Menu.txt");

    } //Método agregar productos




    public boolean eliminarMenu (String codigo){
            int compara = buscar(codigo);
            if (compara != -1) {
                menuTList.remove(compara);//elimina el producto del Array
                return true;
            }else {

                return false;
            }
    }//Metodo para eliminar productos*/





}
