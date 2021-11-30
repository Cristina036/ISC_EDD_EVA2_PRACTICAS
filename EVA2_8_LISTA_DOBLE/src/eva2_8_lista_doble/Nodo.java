package eva2_8_lista_doble;

/**
 *
 * @author anacr
 */
public class Nodo {

    private int dato; //VALOR
    private Nodo siguiente; //REFERENCIA
    private Nodo previo;
    

//CONSTRUCTORES
    
    public Nodo() {//DEFAULT
        this.siguiente = null;
        this.previo = null;

    }

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    public Nodo getPrevio() {
        return previo;
    }

}
