/** Lugar de registro y control de ingredientes para los platillos.
 * @version 1.0 sin aplicación de base de datos.
 * */
public class Almacen {

    private String codigo;
    private String ingrediente;
    private String categoria;
    private int cantidad;

/**
 * @param cantidad Guardar la cantidad de ingredientes disponibles para preparar los platillos.
 * @param codigo Tener un código asignado para cada uno de los ingredientes.
 * @param ingrediente Nombre del ingrediente.
 */
    public Almacen(String codigo, String ingrediente, String categoria, int cantidad) {
        this.codigo = codigo;
        this.ingrediente = ingrediente;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

         /**Inicio getters y setters*/

/**
 * @return Código del ingrediente.
 * */
    public String getCodigo() {
        return codigo;
    }

/**
 * @param codigo Código del ingrediente obtenido.
 *               Será asignado al ingrediente que se está implementando o
 *               será usado para identificar dicho ingrediente dentro del almacén.
 * */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

/**
 * @return Nombre del ingrediente.
 * */
    public String getIngrediente() {
        return ingrediente;
    }

/**
 * @param ingrediente Nombre del ingrediente obtenido.
 *                    Será asignado al ingrediente que se está implementando o
 *                    será usado para identificar dicho ingrediente dentro del almacén.
 * */
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

/**
 * @return Categoría del ingrediente.
 *         <p>Ciertos grupos de ingredientes están agrupados en categorías, para facilitar la búsqueda de los mismos.</p>
 * */
    public String getCategoria() {
        return categoria;
    }

 /**
 * @param categoria Asigna la categoría del ingrediente.
 * */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

/**
 * @return Cantidad existente del ingrediente.
 * */
    public int getCantidad() {
        return cantidad;
    }


/**
 * @param cantidad Cantidad existente del ingrediente.
 * */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

          /**Fin getters y setters*/
}
