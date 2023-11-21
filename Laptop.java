public class Laptop extends Producto{
        private String especificaciones;

    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public Laptop (String nombre, String descripcion, double precio, double cantidadInventario, String especificaciones){
            super(nombre, descripcion, precio, cantidadInventario);
            this.especificaciones=especificaciones;
        }
    }


