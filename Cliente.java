import java.util.List;
import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private double direccionEnvio;
    private List<Pedido> pedidos;

        public Cliente(String nombre, Double direccionEnvio){

            this.nombre=nombre;
            this.direccionEnvio=direccionEnvio;
            this.pedidos = new ArrayList<>();
        }

    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public String getNombre() {
            return this.nombre;
        }
    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public Double getdireccionEnvio(){
            return this.direccionEnvio;
        }
    /*
     * Complejidad temporal: O(1) Tiempo constante.
     */
        public String gelistaPedido(){
            return (this.pedidos = new ArrayList<>()).toString();
        }

}


