package MC_40_49;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */

public class ExcepcionesPersonalizadas44 {
    
    public static void main(String... args) throws Exception{
        Scanner tec=new Scanner(System.in);
        System.out.println("Ingresa la edad: ");
        int edad=tec.nextInt();
        final int EDAD_MAXIMA=100;
        try{
        if(edad<EDAD_MAXIMA){
            System.out.println("Bienvenido ");
        }else{
            throw new EdadExcepcion44("Edad no correcta...");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}