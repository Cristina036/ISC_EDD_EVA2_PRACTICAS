package eva2_4_gcd;

/**
 *
 * @author anacr
 */
public class EVA2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El MCD de 180 y 48 es "+ gcd(180,48)); //NO IMPORTA SI LOS VOLTEAMOS
    }

    public static int gcd(int iDividendo, int iDivisor) {

        if (iDivisor == 0) {
            return iDividendo;
        } else {
            int iResiduo = iDividendo % iDivisor;
            return gcd(iDivisor, iResiduo);
        }

    }
}
