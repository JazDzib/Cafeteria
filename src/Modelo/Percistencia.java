package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Percistencia {


  /*static ArrayList<Clientes> clientesList = new ArrayList<Clientes>();
     public void guardarClientes(ArrayList<MenuTienda> listClientes){
        try{
            ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("cliente.txt"));
            escribe.writeObject(listClientes);
            System.out.println("Se han guardado correctamente los clientes");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Clientes> cargarClientes(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.txt"));
            ArrayList<Clientes> agregarlista = (ArrayList<Clientes>) ois.readObject();
            clientesList.addAll(agregarlista);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return clientesList;
    }*/


        public static void guardarMenu(ArrayList<MenuTienda> menuTlist, String nombreArchivo) {
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
                salida.writeObject(menuTlist);
                System.out.println("Lista de platillos guardada con éxito en " + nombreArchivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public static ArrayList<MenuTienda> cargarMenu(String nombreArchivo) {
        ArrayList<MenuTienda> listaLeida = new ArrayList<>();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaLeida = (ArrayList<MenuTienda>) entrada.readObject();
            System.out.println("Lista de platillos cargada con éxito desde " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaLeida;
    }


}
