package MC_10_19;

import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class Arreglos14 {
    public static void main(String[] args){
        //Los arreglos son inmutables/ una vez establecido el limite del arreglo
        //no se puede modificar el contenido
       
        System.out.println("Ingrese el tamaño del Vector: ");
        Scanner tec=new Scanner(System.in);
        int tamanio=tec.nextInt();
        
        String[] vector=new String[tamanio];
        
        for(int i=0;i<vector.length;i++){
            System.out.println("Ingrese contenido para la posicion: "+i+": ");
            vector[i]=tec.next();
        }
        System.out.println("--------------------------------------------");
        for(String dato:vector){
            System.out.println(dato);
        }
        
        
        
        /* Prueba 1
        System.out.println("Ingrese el tamaño del Vector: ");
        Scanner tec=new Scanner(System.in);
        int tamanio=tec.nextInt();
        
        String[] vector=new String[tamanio];
        vector[0]="Alejandro";
        vector[1]="Abraham";
        vector[2]="Error";
       
        for(String s:vector){
            System.out.println(s);
        }
                */
    }   
}