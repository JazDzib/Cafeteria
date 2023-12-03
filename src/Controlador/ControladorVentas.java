package Controlador;

import Modelo.RegistroVentas;

import java.util.ArrayList;

public class ControladorVentas {
    private ArrayList<RegistroVentas> ventasList;

    public ControladorVentas() {
        ventasList = new  ArrayList<>();
    }

    public ArrayList<RegistroVentas> getVentasList() {
        return ventasList;
    }

    public void setVentasList(ArrayList<RegistroVentas> ventasList) {
        this.ventasList = ventasList;
    }
}
