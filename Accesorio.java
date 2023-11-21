public class Accesorio extends Producto{
        private String tipo;
    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public Accesorio (String nombre, String descripcion, double precio, double cantidadInventario, String tipo){
            super(nombre, descripcion, precio, cantidadInventario);
            this.tipo=tipo;
        }
}

