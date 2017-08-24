package MC_40_49;

import java.io.File;

/**
 *
 * @author Alejandro
 */
public class File45 {
    
    public static void main(String... archivos) throws EdadExcepcion44, Exception{
        File archivo=new File("c:\\java_prueba\\renombre.txt");
        File directorio=new File("c:\\java_prueba\\java\\");
        File directorios=new File("c:\\java_prueba\\java\\carpeta1\\carpeta2");
        
        boolean respuesta=archivo.exists();//verifica que el archivo existe
        boolean respuesta2=directorio.mkdir();//verifica que el directorio existe, si no crea un directorio
        boolean respuesta3=directorios.mkdirs();//Crea directorios en caso de que no existan

        //Para renombrar el archivo existente se usa la siguiente linea
        //boolean respuesta4=archivo.renameTo(new File("c:\\java_prueba\\renombre.txt"));
        System.out.println(respuesta);
        //Para eliminar el archivo:
        boolean eliminado=archivo.delete();
        System.out.println(eliminado);
        
        
    } 
}