package Controlador;

import Modelo.Clientes;
import Modelo.MenuTienda;

import java.util.ArrayList;

public class ControladorClientes {
    private ArrayList<Clientes> clientesList;


    public ControladorClientes () {
        clientesList = new  ArrayList<>();
    }

    public ArrayList<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(ArrayList<Clientes> clientesList) {
        this.clientesList = clientesList;
    }
}
