import java.util.Scanner;

/**Muestra al usuario la parte principal del software, que contiene un menú principal con cada una de las funciones.
 */
public class VistaControladorP {
    private Scanner lectura;

    /**Muestra una lista de acciones
     * <p>Es lo primero que el usuario ve al entrar a esta primera versión del software.</p>
     * <p>Se da un espacio, "Opción:" para introducir el índice correspondiente a la acción que se desea realizar.</p>
     * @return Lee el índice que se ha escrito en la línea de "Opción:".
     */
    public Integer Menu(){
        lectura = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1- Menu Tienda ");
        System.out.println("2- Registro de Pedido ");
        System.out.println("3- Almacen ");
        System.out.println("4- Registro de Ventas");
        System.out.println("5- Clientes");
        System.out.println("6- Mesas y sillas");
        System.out.println("7- Ticket");
        System.out.println("8- Generador de reportes");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    /**
     * "Gracias por utilizar el sistema"
     */
    public void MsgGracias(){
        System.out.println("Gracias por utilizar el sistema");
    }

    public void MsgVersion(){
        System.out.println("Control Escolar ver. 0.1");
    }
}
