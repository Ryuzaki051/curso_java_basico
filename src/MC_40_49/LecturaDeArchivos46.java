package MC_40_49;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class LecturaDeArchivos46 {
    public static void main(String... lectura) throws EdadExcepcion44, Exception{
        /*
        FileReader archivo=new FileReader("c:\\java_prueba\\myfile.txt");
        BufferedReader buffer=new BufferedReader(archivo);
        
        String texto;
        while((texto=buffer.readLine())!=null){
            System.out.println(texto);
        }*/
        
        /*
        FileInputStream in=new FileInputStream("c:\\java_prueba\\myfile.txt");
        int respuesta=in.read();
        if(respuesta!=-1){
            System.out.println(respuesta);
        }*/
        
        FileInputStream in=new FileInputStream("c:\\java_prueba\\myfile.txt");
        Scanner tec=new Scanner(in,"UTF-8");
        
        String texto=tec.next();
        System.out.println(texto);
        
    }
    
}
