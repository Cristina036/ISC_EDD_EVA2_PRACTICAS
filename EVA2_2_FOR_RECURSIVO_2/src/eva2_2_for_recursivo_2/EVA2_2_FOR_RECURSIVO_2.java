package eva2_2_for_recursivo_2;

/**
 *
 * @author anacr
 */
public class EVA2_2_FOR_RECURSIVO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fakeForDown(5);
    }

    public static void fakeForDown(int iVal) {
        System.out.print(iVal + "-");
        if (iVal > 2) {
            fakeForDown(iVal - 1);
        }
    }

}
