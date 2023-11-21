public class Principal {
    /**
     * El primer metodo que se ejecutara en mi programa
     * @param args
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        // Crear el objeto llamado campeon
        Telefono telefono= new Telefono("samsung", "altagama", 50000);

        // Llamar a los métodos para obtener y mostrar las caracteristicas del Campeon
        String nombredelpersonaje = telefono.obtenerNombredelPersonaje();
        int nuemerodevidas = campeon.obtenerNuemrodevidas();
        String tipodeclase = campeon.obtenerTipodeclase();

        // Imprime la información obtenida del Campeon
        System.out.println(" NombredelPersonaje: " + nombredelpersonaje + " NumeroDeVidas: " + nuemerodevidas + " TipoDeClase: " + tipodeclase);

    }
}