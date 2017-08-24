package MC_40_49;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alejandro
 */
public class TryWithResource48 {
    
    public static void main(String... escritura) throws IOException {
        PrintWriter printer=null;
        
        //Para que no sobre escriba la informacion es necesario utilizar un true 
        try(FileWriter archivo=new FileWriter("c:\\java_prueba\\myfile.txt",true)){
            printer=new PrintWriter(archivo);
            
            printer.println("MI tercera linea");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
