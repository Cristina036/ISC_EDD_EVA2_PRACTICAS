package eva2_11_arbol_binario;

/**
 *
 * @author anacr
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null; //ARBOL VACIO
    }

    //APARTIR DE AQUI TODO ES RECURSIVO
    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        //VERIFICAR SI HAY NODOS EN EL ARBOL
        if (root == null) {//ARBOL VACIO
            root = nuevo;  //ARBOL NO TIENE FIN COMO TAL
        } else {
            //METODO RECURSIVO
            addRecu(root, nuevo);

        }
    }

    private void addRecu(Nodo actual, Nodo nuevo) {
        //VERIFICAR EL LADO AL QUE VA EL NODO 
        if (nuevo.getDato() < actual.getDato()) { //IZQ NUEVO MAYOR A ACTUAL
            if (actual.getizquierda() == null) {//TENEMOS ESPACIO AQUI INSERTAMOS AL NODO NUEVO 
                actual.setizquierda(nuevo);
            } else {//LLAMAR AL METODO RECURSIVO
                addRecu(actual.getizquierda(), nuevo);
            }
        } else if (nuevo.getDato() > actual.getDato()) {  //DERECHA 
            if (actual.getderecha() == null) {//TENEMOS ESPACIO AQUI INSERTAMOS AL NODO NUEVO
                actual.setderecha(nuevo);
            } else {
                addRecu(actual.getderecha(), nuevo);
            }
        } else {
            System.out.println("El valor ya existe en el árbol");
        }
    }

    //IMPRIMIR NODOS DEL ARBOL
    public void printPreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Nodo actual) {
        if (actual != null) {
            System.out.print("["+ actual.getDato() + "]"); //VISIT NODE
            PreOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            PreOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE

        }
    }

    public void printPostOrder() {
        PostOrder(root);
    }

    private void PostOrder(Nodo actual) {
        if (actual != null) {
            PostOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            PostOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE
            System.out.print("["+ actual.getDato() + "]"); //VISIT NODE

        }

    }

    public void printInOrder() {
        InOrder(root);
    }

    private void InOrder(Nodo actual) {
        if (actual != null) {
            InOrder(actual.getizquierda()); //TRAVERS LEFT SUBTREE
            System.out.print("["+ actual.getDato() + "]"); //VISIT NODE
            InOrder(actual.getderecha()); //TRAVERS RIGHT SUBTREE

        }

    }
}
