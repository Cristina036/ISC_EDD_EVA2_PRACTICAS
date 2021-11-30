package eva2_8_lista_doble;

/**
 *
 * @author anacr
 */
public class Lista_Doble {

    private Nodo inicio; //PUNTO DE PARTIDA, ACCESO A LISTA, Agregar nodos, imprimir,etc
    private Nodo fin;
    private int tama; //CONTADOR DE NODOS

    public Lista_Doble() {
        inicio = null; //LISTA VACÍA
        fin = null;
        tama = 0;
    }

    //AGREGAR NODOS
    public void add(int valor) { //O(1)
        Nodo nuevo = new Nodo(valor);
        //HAY NODOS EN LA LISTA?
        if (inicio == null) { //LISTA VACIA
            inicio = nuevo; //CONECTAMOS EL PRIMER NODO A LA LISTA
            fin = nuevo;

        } else {//LISTA CON NODOS
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo; //NOS MOVEMOS AL FINAL DE LA LISTA
        }
        tama++;
    }

    public void printList() {
        Nodo temp = inicio;
        while (temp != null) { //MIENTRAS TEMP NO SEA NULL AVANZAMOS
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente(); //MOVER TEMP AL SIGUIENTE NODO
        }
    }

    public int length() {//N
        return tama;
    }

    public void clear() {//BORRAMOS TODOS LOS NODOS
        inicio = null;
        fin = null;
        tama--;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //RECUPERAR UN VALOR DE LA LISTA
    public int get(int pos) throws Exception {
        //VERIFICACIÓN
        //LISTA QUE ESTE VACÍA 
        if (isEmpty()) {//LISTA VACIA
            throw new Exception("No hay valores almacenados en la lista");
        } else {//POSICIÓN QUE NO EXISTA 
            if ((pos < 0) || (pos >= length())) {
                throw new Exception("El valor " + pos + " No es una posicón valida en la lista");
            }
        }
        //POSCICIÓN QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS

        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente(); //NOS MOVEMOS

        }
        return temp.getDato();
    }

    private void insertAtBeginning(Nodo nuevo) {
        nuevo.setSiguiente(inicio); //PRIMERO CONECTAR NUEVO NODO A LA LISTA
        inicio.setPrevio(nuevo); //CONECTAMOS NUEVO NODO A INICIO
        inicio = nuevo; //CONECTAR LISTA AL NUEVO NODO 
    }

    public void insertAt(int pos, int valor) {
        Nodo nuevo = new Nodo(valor);
        //VALIDAR
        //SITUACIONES Insertar al inicio
        if (pos == 0) {
            insertAtBeginning(nuevo);
        } else //Cualquier otro caso (nodo medio)
        {
            Nodo temp = inicio;
            for (int i = 0; i < pos; i++) { //NOS MOVEMOS A LA POSICIÓN DE INSERCIÓN
                temp = temp.getSiguiente(); //NOS MOVEMOS
            }
            nuevo.setSiguiente(temp); //CONECTAMOS NUEVO A LA LISTA
            nuevo.setPrevio(temp.getPrevio());

            temp.getPrevio().setSiguiente(nuevo);
            temp.setPrevio(nuevo);
        }
        tama++;
    }

    public void deleteAt(int pos) { //O(N)
        int iTamaLista = length(); //OBTENGO TAMAÑO LISTA
        //VALIDAR
        if (iTamaLista == 1) {
            clear();
        } else {
            //SITUACIONES Borrar un nodo al inicio
            if (pos == 0) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo temp = inicio;
                for (int i = 0; i < (pos-1); i++) {
                    temp = temp.getSiguiente(); //NOS MOVEMOS
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente()); //CONECTAMOS NUEVO A LA LISTA
                if (pos == (iTamaLista - 1)) { //VERIFICO SI ES EL ULTIMO NODO DE LA LISTA
                    fin = temp;
                }
            }
            tama--;
        }
    }
}
