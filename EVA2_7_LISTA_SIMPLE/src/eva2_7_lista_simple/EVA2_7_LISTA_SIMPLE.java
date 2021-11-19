package eva2_7_lista_simple;

/**
 *
 * @author anacr
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista = new Lista(); //LISTA VACÍA
        /*
        int[] miArray = new int[1000000];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo((int) (Math.random() * 1000)));
        }
         */
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        miLista.printList();
        System.out.println("\nConteo: " + miLista.length());

        //INSERTAR AL INICIO
        /* miLista.insertAt(0, Nodo(9999));
        System.out.println("\n DESPUES DE INSERTAR: ");
        miLista.printList();
         */
        //INSERTAR EN CUALQUIER PUNTO
        System.out.println("\n DESPUES DE INSERTAR: ");
        miLista.insertAt(4, 9999);
        miLista.printList();
        System.out.println("\nConteo: " + miLista.length());

        //BORAR NODO
        System.out.println("\n DESPUES DE BORRAR: ");
        miLista.deleteAt(4);
        miLista.printList();
        System.out.println("\nConteo: " + miLista.length());
        miLista.add(77777);
        System.out.println("\n DESPUES DE AGREGAR: ");
        miLista.printList();
        System.out.println("\nConteo: " + miLista.length());

        System.out.println("\nIMPRMIR DE FIN A INICIO");
        //Imprimir al reves
        for (int i = miLista.length() - 1; i >= 0; i--) {
            try {
                System.out.print(miLista.get(i) + " - ");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }     
    }

}
