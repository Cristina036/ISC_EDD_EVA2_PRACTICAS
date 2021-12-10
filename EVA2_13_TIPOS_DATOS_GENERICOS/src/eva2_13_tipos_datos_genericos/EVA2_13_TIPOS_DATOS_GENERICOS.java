package eva2_13_tipos_datos_genericos;

/**
 *
 * @author anacr
 */
public class EVA2_13_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba<Integer> prueba = new Prueba();
        prueba.setValor(25);
        System.out.println("Valor: " + prueba.getValor());
    }
    
}

class Prueba<T> { //La clase va a remplazar las t por el tipo de dato
    //ESTAMOS CREANDO UN TEMPLATE(PLANTILLA)

    private T valor;
    
    public Prueba() {
        
    }

    public Prueba(T valor) {
        this.valor = valor;
    }
    
    public T getValor() {
        return valor;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }
    
}
