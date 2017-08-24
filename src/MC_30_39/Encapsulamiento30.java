package MC_30_39;
/**
 * @author Alejandro
 */
public class Encapsulamiento30 {
    /* 
    *   Encapsulacion es el conjunto de informacion almacenado
    *   en metodos y son utilizados para diferentes propositos
    *   sin modificar los atributos establecidos.
    */
    
    public static void main(String... encapsulamiento){
        String texto="HOLA, MUNDO";
        String[] vector=texto.split(","); //El metodo split es un metododo
    //construido para poder determinar un salto...
        System.out.println(vector[0]);   
    }   
}