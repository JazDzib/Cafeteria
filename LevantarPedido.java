/**Obtener información del cliente para realizar su pedido. Parte lógica de levantar pedido.
 * @version 1.0 falta registro de pedido.
 */
public class LevantarPedido {
    private String nombre;
    private int mesa;

    public LevantarPedido(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    /**Obtener nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**Aplicar nombre del cliente.
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Obtener número de mesa asignada.
     * @return Número de la mesa.
     */
    public int getMesa() {
        return mesa;
    }

    /**Aplicar número de mesa
     * @param mesa Número de la mesa.
     */
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    /**Despregar la lista de menu del día.
     */
    public void mostrarMenu(){}

    /**Tomar pedido en base al menú.
     */
    public void hacerPedido(){}

    /**Imprime el pedido.
     */
    public void mostrarPedido(){}
}
