package MC_40_49;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alejandro
 */
public class HashSet40 {
    
    public static void main(String... listas){
        Set<String> lista=new HashSet<String>();
        lista.add("a");
        lista.add("b");//ejecuta los valores aleatorios
        lista.add("c"); // es una lista desordenada
        lista.add("d");
        lista.add("e");//no acepta elementos repetidos
        lista.add("e"); 
        lista.add("e");
        
        for(String s:lista){
            System.out.println("Letra: "+s);
        }   
    }
}