
package eva2_3_factorial;

/**
 *
 * @author anacr
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 5= "+ factorial(5));
        System.out.println("Factorial de 5= "+ factorialFor(5));
    }
public static int factorial(int iVal){
    if(iVal==0)
return 1;
else
    return iVal*factorial(iVal-1);
}
public static int factorialFor(int iVal){
    int iTemp=1;
    for (int i = iVal; i >0; i--) {
        iTemp= iTemp*i;
        
    }
    return iTemp;
}
}
