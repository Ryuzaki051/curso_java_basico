package MC_10_19;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class EntradaDatos10 {
    public static void main(String ... argumentos){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Cual es tu nombre:");
        String nombre=teclado.next();
        System.out.println("Mi nombre es: "+nombre);
        //Dependiendo del tipo de dato puede ser introducido el valor
        //int,double,float etc...
        System.out.println("Cual es tu Edad:");
        int edad=teclado.nextInt();
        System.out.println("Mi edad es: "+edad);
    }
    
}
