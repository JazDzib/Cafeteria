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
