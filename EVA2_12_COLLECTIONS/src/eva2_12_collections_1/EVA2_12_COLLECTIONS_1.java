
package eva2_12_collections_1;

import java.util.LinkedList;

/**
 *
 * @author anacr
 */
public class EVA2_12_COLLECTIONS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        
        
        
        
    }

}
