package MC_20_29;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Switch20 {
    public static void main(String...arg){
        //Apartir del jdk 1.7 el comando switch acepta cadenas de caracteres
        //anteriormente solo se aceptaban variables de tipo entero
        Scanner tec=new Scanner(System.in);
        String resultado=tec.next();
        switch(resultado){
            case "Abraham":
                System.out.println("Hola Abraham");
                break;
            case "Alejandro":
                System.out.println("Hola Alex");
                break;
            
            default:
                System.out.println("Hola por Defecto");
                break;
        }
        System.out.println("Fin Switch");
    }   
}