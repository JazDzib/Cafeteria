package Vista;

import java.util.Scanner;

public class VistaLevantarP {

    Scanner Lectura= new Scanner(System.in);

    public String SolicitarNombre () {
        System.out.println("Esc. el nombre");
        Lectura = new Scanner(System.in);
        return Lectura.next();

    }

    public int SolicitarMesa(){
        System.out.println("Escr. el numero de mesa");
        Lectura= new Scanner(System.in);
        return Lectura.nextInt();
    }

}
