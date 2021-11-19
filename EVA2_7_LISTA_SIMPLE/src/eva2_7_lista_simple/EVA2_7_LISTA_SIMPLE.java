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
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        miLista.printList();
        //INSERTAR AL INICIO
        /* miLista.insertAt(0, new Nodo(9999));
        System.out.println("\n DESPUES DE INSERTAR: ");
        miLista.printList();
         */
        //INSERTAR EN CUALQUIER PUNTO
        miLista.insertAt(4, new Nodo(9999));
        System.out.println("\n DESPUES DE INSERTAR: ");
        miLista.printList();
        System.out.println("Conteo: "+ miLista.length());
        //BORAR NODO
        miLista.deleteAt(4);
        System.out.println("\n DESPUES DE BORRAR: ");
        miLista.printList();
    }

}
