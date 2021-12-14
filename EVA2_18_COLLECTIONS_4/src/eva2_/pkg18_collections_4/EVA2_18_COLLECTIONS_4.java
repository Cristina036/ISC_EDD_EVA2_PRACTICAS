package eva2_.pkg18_collections_4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author anacr
 */
public class EVA2_18_COLLECTIONS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONJUNTOS
        //NO TIENE ELEMENTOS REPETIDOS
        Set<Integer> conjunto = new LinkedHashSet<>();
        //SE OMITEN EN LA IMPRESIÓN LOS VALORES REPETIDOS
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        System.out.println(conjunto);
    }

}
