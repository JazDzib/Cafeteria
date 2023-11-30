package Modelo;

public class RegistroVentas {

    private String codigo;
    private String fecha;
     private int precio;
     private int prodVend;

    public RegistroVentas(String id, String fecha, int precio, int prodVend) {
        this.codigo= id;
        this.fecha = fecha;
        this.precio = precio;
        this.prodVend = prodVend;
    }

    public String getId() {
        return codigo;
    }

    public void setId(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getProdVend() {
        return prodVend;
    }

    public void setProdVend(int prodVend) {
        this.prodVend = prodVend;
    }

    @Override
    public String toString() {
        return "RegistroVentas{" +
                "id='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", prodVend=" + prodVend +
                '}';
    }
}
