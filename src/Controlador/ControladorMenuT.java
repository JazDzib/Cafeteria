package Controlador;

import Modelo.Buscador;
import Modelo.MenuTienda;
import Modelo.Percistencia;


import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
       /* for (int i = 0; i < menuTList.size(); i++) {
            String newcodigo = menuTList.get(i).getCodigo();

            if (codigo.equals(menuTList.get(i).getCodigo())) {
                System.out.println(i);
                return i;
            }//
        }*/
        return -1;//Código de producto no encotrado

    }
    public void iniciardatos (){

        menuTList= Percistencia.cargarMenu("Menu.txt");

    }
    public void actualizarTablaPlatillos(JTable TablaInventario1, ArrayList<MenuTienda> menuTList) {
        DefaultTableModel tablaMenu = (DefaultTableModel) TablaInventario1.getModel();
        tablaMenu.setRowCount(0);

        for (MenuTienda prodmenu : menuTList ) {

            tablaMenu.addRow(new Object[]{prodmenu.getCodigo(),prodmenu.getCategoria(),prodmenu.getProducto(),prodmenu.getPrecio(),prodmenu.getDescripcion()});
        }
        }
    
    public void editarMenu(DefaultTableModel tablaMenu, JTable TablaInventario1, ArrayList<MenuTienda> menuTList){
        int selectedRow = TablaInventario1.getSelectedRow();
    
    String newCodigo = tablaMenu.getValueAt(selectedRow,0).toString();
    String newCategoria = tablaMenu.getValueAt(selectedRow,1).toString();
   String newProducto = tablaMenu.getValueAt(selectedRow,2).toString();
    String newPrecio = tablaMenu.getValueAt(selectedRow,3).toString();
   String newDescripcion = tablaMenu.getValueAt(selectedRow,4).toString();
    
        MenuTienda menuactu = menuTList.get(selectedRow);  
        menuactu.setCodigo(newCodigo);
        menuactu.setCategoria(newCategoria);
        menuactu.setProducto(newProducto);
        menuactu.setPrecio(newPrecio);
        menuactu.setDescripcion(newDescripcion);
        
        Percistencia.guardarMenu(menuTList, "Menu.txt");
    }
    public void eliminarPlato(ArrayList<MenuTienda> menuTlist, String codigo) {
        for (int i = 0; i < menuTList.size(); i++) {
            if (menuTList.get(i).getCodigo().equals(codigo)) {
                menuTList.remove(i);
                break;
            }
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
