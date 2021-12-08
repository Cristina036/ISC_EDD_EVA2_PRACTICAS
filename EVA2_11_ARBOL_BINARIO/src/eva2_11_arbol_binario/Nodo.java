package eva2_11_arbol_binario;

/**
 *
 * @author anacr
 */
public class Nodo {

    private int dato; //VALOR
    private Nodo derecha; //REFERENCIA
    private Nodo izquierda;
    

//CONSTRUCTORES
    
    public Nodo() {//DEFAULT
        this.derecha = null;
        this.izquierda = null;

    }

    public Nodo(int dato) {
        this.dato = dato;
        this.derecha = null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getderecha() {
        return derecha;
    }
    public void setderecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    public void setizquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    public Nodo getizquierda() {
        return izquierda;
    }

}
