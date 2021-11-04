package eva2_6_nodos;

/**
 *
 * @author anacr
 */
public class EVA2_6_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 200;
        inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
        System.out.println(inicio.datos);
        System.out.println(inicio.referencia.datos);
    }

}

class Nodo {

    int datos; //LO QUE QUEREMOS ALMACENAR
    Nodo referencia; //PERMITE ENLZAR NODOS Y CREAR CADENAS(LISTAS)
}
