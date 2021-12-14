package eva2_17_collections_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author anacr
 */
public class EVA2_17_COLLECTIONS_ITERATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);

        //ITERATOR.
        //Otra manera de recorrer toda la lista (inicio/fin)
        Iterator iterator= linkedList.iterator();
        while(iterator.hasNext()){//Hay un nodo siguiente?
            int iVal = (int)iterator.next();
            System.out.print("[" + iVal+ "]");
        }
    }

}
