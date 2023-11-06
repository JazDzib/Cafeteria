import java.util.Scanner;

/**Parte visual para levantar pedido, en esta versión sin uso de interfaz.
 * @version 1.0 Clases de lógica del pedido sin desarrollar.
 * <p>Sin interfaz.</p>
 * <p>No conectado a su clase que controla su lógica.</p>
 * @see LevantarPedido
 */
public class VistaLevantarP {

    Scanner Lectura= new Scanner(System.in);

    /**Se pide el nombre del cliente.
     * @return Recibe el nombre.
     */
    public String SolicitarNombre () {
        System.out.println("Esc. el nombre");
        Lectura = new Scanner(System.in);
        return Lectura.next();

    }

    /**Se asigna un número de mesa.
     * @return Número de mesa.
     */
    public int SolicitarMesa(){
        System.out.println("Escr. el numero de mesa");
        Lectura= new Scanner(System.in);
        return Lectura.nextInt();
    }

}
