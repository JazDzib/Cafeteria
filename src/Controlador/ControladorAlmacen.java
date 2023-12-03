package Controlador;

import Modelo.Almacen;
import Modelo.MenuTienda;

import java.util.ArrayList;

public class ControladorAlmacen {
    private ArrayList<Almacen> almacenList;


    public ControladorAlmacen() {
        almacenList = new  ArrayList<>();
    }

    public ArrayList<Almacen> getAlmacenList() {
        return almacenList;
    }

    public void setAlmacenList(ArrayList<Almacen> almacenList) {
        this.almacenList = almacenList;
    }
}
