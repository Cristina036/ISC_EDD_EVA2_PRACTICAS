package eva2_8_lista_doble;

/**
 *
 * @author anacr
 */
public class EVA2_8_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_Doble listaDoble = new Lista_Doble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        //INSERTAR AL INICIO
        listaDoble.insertAt(0, 999);
        System.out.println("\n DESPUES DE INSERTAR AL INICIO: ");
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        System.out.println("\n DESPUES DE BORRAR: ");
        listaDoble.deleteAt(0);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        //INSERTAR EN CUALQUIER PUNTO
        System.out.println("\n DESPUES DE INSERTAR: ");
        listaDoble.insertAt(4, 999);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());
        System.out.println("\n DESPUES DE BORRAR: ");
        listaDoble.deleteAt(4);
        listaDoble.printList();
        System.out.println("\nConteo: " + listaDoble.length());

    }

}
