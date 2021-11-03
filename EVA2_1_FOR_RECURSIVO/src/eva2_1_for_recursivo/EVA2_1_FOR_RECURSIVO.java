
package eva2_1_for_recursivo;

/**
 *
 * @author anacr
 */
public class EVA2_1_FOR_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      recursivo();
    }
public static void recursivo(){ //METODO RECURSIVO
    System.out.println("Hola mundo");
    recursivo();
}
}
