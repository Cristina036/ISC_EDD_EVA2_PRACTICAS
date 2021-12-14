
package eva2_10_stack;

/**
 *
 * @author anacr
 */
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyStack myStack = new MyStack();
        myStack.add(100);
        myStack.add(200);
        myStack.add(300);
        myStack.add(400);
        myStack.add(500);
        System.out.println("LISTA ORIGINAL");
        myStack.printList();
        try {
            System.out.println("Primer elemento de la fila con peek: " + myStack.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myStack.printList();
        try {
            System.out.println("Primer elemento de la fila con poll: " + myStack.pop());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myStack.printList();
    }

}
