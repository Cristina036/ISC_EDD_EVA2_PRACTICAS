package eva2_5_fibonacci;

/**
 *
 * @author anacr
 */
public class S_Fibonacci {

    public int iTama;

    public S_Fibonacci(int iTama) {

        this.iTama = iTama;
    }

    S_Fibonacci() { 

    }

    public void printSerie() {
        for (int i = 0; i < iTama; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    int fibonacci(int iValor) {
        if (iValor > 1) {
            return fibonacci(iValor - 1) + fibonacci(iValor - 2);
        } else if (iValor == 1) {
            return 1;
        } else if (iValor == 0) {
            return 0;
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    public int getTamaño() {
        return iTama;
    }

    public void setTamaño(int iTama) {
        this.iTama = iTama;
    }
}
