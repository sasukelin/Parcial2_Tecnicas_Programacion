public class Telefono extends Producto{
 private String modelo;
    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
 public Telefono (String nombre, String descripcion, double precio, double cantidadInventario, String modelo){
   super(nombre, descripcion, precio, cantidadInventario);
   this.modelo=modelo;
 }
}