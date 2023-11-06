public class Almacen {

    private String codigo;
    private String ingrediente;
    private String categoria;
    private int cantidad;


    public Almacen(String codigo, String ingrediente, String categoria, int cantidad) {
        this.codigo = codigo;
        this.ingrediente = ingrediente;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
