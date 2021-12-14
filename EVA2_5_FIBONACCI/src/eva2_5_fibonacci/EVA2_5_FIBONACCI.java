package eva2_5_fibonacci;

/**
 *
 * @author anacr
 */
public class EVA2_5_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        S_Fibonacci Sus1 = new S_Fibonacci(10);
        System.out.println("Sucesión de Fibonacci de tamaño " + Sus1.iTama);
        Sus1.printSerie();

    }

}
