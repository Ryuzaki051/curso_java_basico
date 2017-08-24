package MC_20_29;

/**
 *
 * @author Alejandro
 */
public class Constructores25 {
    String nombre;
    String color;
    
    public Constructores25(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }
    public Constructores25(){
        System.out.println("Hola soy un constructor");
    }
    
    public void llamando(){
        System.out.println(nombre+" - "+color+" esta llamando...");
    }
    
    public static void main(String... ejamplo){
         
    }
}