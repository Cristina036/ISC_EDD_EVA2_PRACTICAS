package eva2_16_collections_3;

import java.util.ArrayList;

/**
 *
 * @author anacr
 */
public class EVA2_16_COLLECTIONS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print("[" + arrayList.get(i) + "]");
        }
    }

}
