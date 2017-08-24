package MC_40_49;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alejandro
 */
public class EscrituraDeArchivos47 {
    
    public static void main(String... escritura) throws IOException {
        FileWriter archivo=null;
        PrintWriter printer=null;
        
        try{
            //Para que no sobre escriba la informacion es necesario utilizar un true 
            archivo=new FileWriter("c:\\java_prueba\\myfile.txt",true);
            printer=new PrintWriter(archivo);
            
            printer.println("Esta es mi segunda linea");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(archivo!=null){
                archivo.close();
            }
        }
    }
    
}