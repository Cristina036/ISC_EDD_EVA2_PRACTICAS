package eva2_9_queue;

/**
 *
 * @author anacr
 */
public class MyQueue extends Lista{
//COMO FILA DEL SUPERMERCADO
//LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA (METODO ADD)
//SOLO PODEMOS ACCEDER A LOS ELEMENTOS AL INICIO DE LA LISTA 
    
public int peek () throws Exception{ //REGRESA EL VALOR DEL ELEMENTO AL INICIO DE LA LISTA
        return get(0);
    }
public int poll () throws Exception{
 //Guardamos 
 int iVal= get(0);
 //Eliminamos 
 deleteAt(0);
//Enviamos el valor
return iVal;
     
}
    
}
