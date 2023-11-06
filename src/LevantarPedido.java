public class LevantarPedido {
    private String nombre;
    private int mesa;

    public LevantarPedido(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    //setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    //metodos

    public void mostrarMenu(){
        //despregar la lista de menu del dia

    }

    public void hacerPedido(){
        //tomar pedido en base al menu
    }
    public void mostrarPedido(){
        //imprimira el pedido
    }
}
