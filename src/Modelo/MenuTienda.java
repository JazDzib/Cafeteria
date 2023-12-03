package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class MenuTienda implements Serializable {

    private String codigo;
    private String categoria;
    private String producto;
    private String precio;

    private String descripcion;
 

    
    public MenuTienda(String codigo, String categoria, String producto, String precio, String descripcion) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
        this.descripcion= descripcion;
    }//Contructor

    public MenuTienda(String codigo, String categoria, String producto, String precio) {
    }//Constructor

    //Getter and Setters
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

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    @Override
    public String toString() {
        return "Modelo.MenuTienda{" +
                "codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
