package MC_30_39;

/**
 *
 * @author Alejandro
 */
public class Persona31 {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarDeInstancia(){
        System.out.println(this.nombre+" "+this.edad);
    }
    
    public static void mostrarDeClase(){
        System.out.println("Metodo Estatico");
    }   
}