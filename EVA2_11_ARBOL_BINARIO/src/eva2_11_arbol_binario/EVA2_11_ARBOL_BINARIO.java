package eva2_11_arbol_binario;

/**
 *
 * @author anacr
 */
public class EVA2_11_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbolB = new ArbolBinario();
        arbolB.add(13);
        arbolB.add(10);
        arbolB.add(18);
        arbolB.add(2);
        arbolB.add(11);
        arbolB.add(17);
        arbolB.add(20);
        arbolB.add(16);
        System.out.println("Pre Order: ");
        arbolB.printPreOrder();
        System.out.println("");
        System.out.println("Post Order: ");
        arbolB.printPostOrder();
        System.out.println("");
        System.out.println("In Order: ");
        arbolB.printInOrder();
        System.out.println("");
    }

}
