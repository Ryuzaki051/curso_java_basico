package MC_30_39;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alejandro
 */
public class HashMap39 {
    public static void main(String ... mapas){
    //Tipos de declaracion
    Map diccionario0=new HashMap();
    HashMap diccionario1=new HashMap();
    
    //En ves de usar el metodo add se usa put
    diccionario1.put("user", "Alejandro");
    //              Key          value
    diccionario1.put("youtube", "www.youtube.com");
    diccionario1.put("facebook", "www.facebook.com");
    diccionario1.put("twitter", "www.twitter.com");
    
    String contenido=diccionario1.get("user").toString();
    boolean respuesta=diccionario1.containsKey("twitter"); //verdadero
    boolean respuesta2=diccionario1.containsKey("instagram"); // false
    
    System.out.println("Si la llave se encuentra: "+respuesta);
    System.out.println("Si no existe la llave: "+respuesta2);
    System.out.println("Muestra el contenido: "+contenido);
    
    }
}