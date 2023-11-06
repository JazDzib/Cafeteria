import java.util.ArrayList;
import java.util.Scanner;

/** Lo que el usuario vería en esta primera versión.
 * <p>Implementa lo que el sw reciba por parte del usuario (getter) y en dónde se guarda cierto dato (setter).</p>
 * <p>Además, muestra la respuesta del programa a lo que el usuario haya introducido.</p>
 * @version 1.0 sin aplicar interfaz.
 */
public class VistaMenu {

    Scanner lectura = new Scanner(System.in);

    /**Método que solicita código.
     * @return Recibe el código.
     */
    public String SolicitarCodigo(){
        System.out.println("Escr. Codigo. ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**Método que solicita categoría.
     * @return Recibe la categoría.
     */
    public String SolicitarCategria() {
        System.out.println("Escr. Categoria ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**Método que solicita producto.
     * @return Recibe el producto.
     */
    public String SolicitarProducto() {
        System.out.println("Escr. Producto ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }

    /**Método que solicita precio.
     * @return Recibe el precio.
     */
    public Integer SolicitarPrecio() {
        System.out.println("Escr. Precio");
        lectura = new Scanner(System.in);
        return lectura.nextInt();
    }

    /**Método que solicita descripción.
     * @return Recibe la descripción.
     */
    public String SolicitarDescripcion(){
        System.out.println("Escr. Descripcion del Producto ");
        lectura = new Scanner(System.in);
        return lectura.nextLine();
    }

    /**Método que imprime la información completa del ingrediente.
     * @param menuprod
     */
    public void imprimirInfoTotal(ArrayList<MenuTienda> menuprod){
        menuprod.forEach(System.out::println);
    }

    /**Método que despliega texto y recibe un elemento.
     * <p>Se da un espacio, "Opción:" para introducir el índice correspondiente a la acción que se desea realizar.</p>
     * @return Lee el índice que se ha escrito en la línea de "Opción:".
     */
    public Integer Menu(){
        lectura = new Scanner(System.in);
        System.out.println("======Menú=====");
        System.out.println("1-Agregar Producto al menu");
        System.out.println("2-Borrar Producto ");
        System.out.println("3-Modificar Menu");
        System.out.println("4-Desplegar lista");
        System.out.println("5-Salir");
        System.out.println("Opción: ");
        return lectura.nextInt();
    }

    /**Método que decide qué mensajes imprimir cuando se quiera eliminar un producto.
     * @param e Elige el mensaje que será enviado.
     */
    public void imprimeInfoBorrado(boolean e)
    {
        if (e) {
            prodEliminado();
        }else{
            prodNOEncontado();
        }
    }

    /**Métodos que despliegan mensajes según el estado del producto.
     * */
    public void prodEliminado(){
        System.out.println("++El producto fue  borrado++");
    }
    /**Métodos que despliegan mensajes según el estado del producto.
     * */
    public void prodModificdo(){
        System.out.println("++Modificación del producto Exitosa++");
    }
    /**Métodos que despliegan mensajes según el estado del producto.
     * */
    public void prodNOEncontado(){
        System.out.println("++No se encuentra el producto++");
    }

    /**Método que imprime los productos.
     * @param obj1 Toma la información de MenuTienda.
     */
    public void imprimirInfoProd(MenuTienda obj1){
        if (obj1 != null)
            System.out.println(obj1);
        else
            prodNOEncontado();
    }

    /**Método que despliega texto de modificación y recibe un índice respectivo a la modificación deseada.
     * @return Índice elegido.
     */
    public Integer MenuModificarMenu(){
        lectura = new Scanner(System.in);
        //lectura.useDelimiter("\n");
        System.out.println("===Menú modificación===");
        System.out.println("1-Categoria ");
        System.out.println("2-Producto");
        System.out.println("3-Precio");
        System.out.println("4-Descripcion");
        System.out.println("5-Salir");
        System.out.println("Opción :");
        return lectura.nextInt();
    }


}
