import java.util.ArrayList;

/** @version 1.0 sin vista desarrollado.
 * Se crean varios objetos/atributos de tipo MenuTienda.
 */
public class MenuTienda {

    private String codigo;
    private String categoria;
    private String producto;
    private Integer precio;

    private String descripcion;
 

    
    public MenuTienda(String codigo, String categoria, String producto, Integer precio, String descripcion) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.producto = producto;
        this.precio = precio;
        this.descripcion= descripcion;
    }//Contructor

    public MenuTienda(String codigo, String categoria, String producto, Integer precio) {
    }//Constructor

    /**Recibe el código del producto.
     * @return Código del producto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**Asigna el código del producto.
     * @param codigo Código del producto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**Recibe la categoría del producto.
     * @return Categoría del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**Asigna la categoría del producto.
     * @param categoria Categoría del producto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**Recibe el nombre del producto.
     * @return Nombre del producto.
     */
    public String getProducto() {
        return producto;
    }

    /**Asigna el nombre del producto.
     * @param producto Nombre del producto.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**Recibe el precio del producto.
     * @return Precio del producto.
     */
    public Integer getPrecio() {
        return precio;
    }

    /**Asigna el precio del producto.
     * @param precio Precio del producto.
     */
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    /**Recibe la descripción del producto.
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**Asigna la descripción del producto.
     * @param descripcion Descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    @Override
    public String toString() {
        return "MenuTienda{" +
                "codigo='" + codigo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
