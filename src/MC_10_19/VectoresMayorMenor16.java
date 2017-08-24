package MC_10_19;

import java.util.Scanner;

public class VectoresMayorMenor16 {
    public static void main(String... datos){
        //Llenando el arreglo
        String[] nombres=new String[3];
        int[] edades=new int[3];
        for(int i=0;i<3;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingresa el Nombre:");
            nombres[i]=sc.next();
           System.out.println("Ingresa la Edad:");
            edades[i]=sc.nextInt();
        }
        System.out.println("----------------------------------");
        //Encontrar el mayor elemento
        int mayor=edades[0];
        int posicion=0;
        for(int i=0;i<3;i++){ 
            if(edades[i]>mayor){// Determina si es mayor /si es menor modificarlo por <
                mayor=edades[i];
                posicion=i;
            }
        }
        System.out.println("El mayor es:"+mayor);
        System.out.println("Su edad es:"+nombres[posicion]);
    }
}