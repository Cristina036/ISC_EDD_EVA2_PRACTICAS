package eva2_10_stack;

/**
 *
 * @author anacr
 */
public class MyStack extends Lista {


    public int peek() throws Exception { 
        return get(4);
    }

    public int pop() throws Exception {
        //Guardamos 
        int iVal = get(4);
        //Eliminamos 
        deleteAt(4);
//Enviamos el valor
        return iVal;
    }
}
