/*
 * Metodos de Instancia y metodos de clase static
 */
package MC_30_39;

/**
 *
 * @author Alejandro
 */
public class ClaseStatic31 {
    
    public static void main(String... statico){
        Persona31 p=new Persona31();
        p.setEdad(34);
        p.setNombre("Alejandro");
        //Este metodo es heredado desde la clase persona31 con el objeto p
        p.mostrarDeInstancia();
        //Este metodo no se puede heredar por objeto solo por clase
        Persona31.mostrarDeClase();
    }
}