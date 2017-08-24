package MC_10_19;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class CicloWhile11 {
    public static void main(String... args){
        
      
        String nombre="";
        
        while(!nombre.equals("Alex")){
            System.out.println("No eres Alex");
            Scanner teclado=new Scanner(System.in);    
            nombre=teclado.next();
               
        }
        System.out.println("Hola Alex");
        
        /* Prueba 2 Incrementos y Decrementos
        int i=0,l=10;
        int j=0,k=10;
        
        while(i<10 && j<10){
            System.out.println("i:"+i+"|"+"j:"+j+"|"+"K:"+k+"|"+"L:"+l);
            i++;
            ++j;
            k--;
            --l;
        }*/
        
        //(evitar)bucle= Sentencia que se realiza repetidas veces hasta que el ciclo
        //deje de cumplirse
        
        /* Prueba 1 Se repetira hasta que termine la secuencia / bucle infinito
        boolean condicion = true;
        while(condicion){
             System.out.println(condicion);
        }*/
    }
    
}
