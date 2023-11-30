package Modelo;

public class LevantarPedido {
    private String nombre;
    private int mesa;
    private int cantidad;

    public LevantarPedido(String nombre, int mesa, int cantidad) {
        this.nombre = nombre;
        this.mesa = mesa;
        this.cantidad = cantidad;
    }

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LevantarPedido{" +
                "nombre='" + nombre + '\'' +
                ", mesa=" + mesa +
                ", cantidad=" + cantidad +
                '}';
    }
}
