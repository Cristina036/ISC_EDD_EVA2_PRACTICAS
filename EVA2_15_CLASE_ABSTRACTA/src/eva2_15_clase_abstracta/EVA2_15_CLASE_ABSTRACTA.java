
package eva2_15_clase_abstracta;

/**
 *
 * @author anacr
 */
public class EVA2_15_CLASE_ABSTRACTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Prueba prueba = new Prueba();
       prueba.algo();
    }

}
abstract class Prueba{ //ABSTRACTO ---> LE FALTA IMPLEMENTACIÓN, ES EL PURO CUERPO
    abstract public void algo();
}
