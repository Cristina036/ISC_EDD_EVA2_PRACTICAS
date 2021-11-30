package eva2_9_queue;

/**
 *
 * @author anacr
 */
public class EVA2_9_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(100);
        myQueue.add(200);
        myQueue.add(300);
        myQueue.add(400);
        myQueue.add(500);
        System.out.println("LISTA ORIGINAL");
        myQueue.printList();
        try {
            System.out.println("Primer elemento de la fila con peek: " + myQueue.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myQueue.printList();
        try {
            System.out.println("Primer elemento de la fila con poll: " + myQueue.poll());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myQueue.printList();
    }

}
