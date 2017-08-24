/*
 * Una interfaz es una coleccion de metodos abstractos y propiedades.
 */
package MC_30_39;

/**
 *
 * @author Alejandro
 */
public class Interfaces33 {
    public static void main(String... interfaces){
        Perro33 per=new Perro33();
        
        per.mostrarAnimal();
        String nombre=per.mostrarNombre();
        
        System.out.println(nombre);       
    }
}