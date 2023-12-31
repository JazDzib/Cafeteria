package Modelo;

public class Almacen {

    private String codigo;
    private String categoria;
    private String nombre;
    private int existencia;

    public Almacen(String codigo, String categoria, String nombre, int existencia) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", existencia=" + existencia +
                '}';
    }
}
