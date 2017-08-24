package MC_10_19;

import java.util.Scanner;

public class CicloDoWhile13 {
    public static void main(String[] arg){
        
        String opcion=""; //En la prueba 3 Requiere de inicializar una variable
         System.out.println("Ingrese Opcion: ");
         Scanner tec=new Scanner(System.in);
        while(tec.next().equals("Alex")){
            System.out.println("Ingrese Opcion: ");
            tec=new Scanner(System.in);
            opcion=tec.next(); 
        }
        
        /*Prueba 2
        do{
            System.out.println("Ingrese Opcion: ");
            Scanner tec=new Scanner(System.in);
            opcion=tec.next();
        }while(opcion.equals("Alex"));
        */
        
        
        /* Prueba 1
        int i=0;
        do{
            System.out.println(i); //Primero ejecuta la sentencia
            i++;
        }while(i<5); // Despues la condicion.*/ 
    }
}
