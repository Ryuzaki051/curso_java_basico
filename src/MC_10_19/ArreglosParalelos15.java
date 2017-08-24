package MC_10_19;

import java.util.Scanner;

public class ArreglosParalelos15 {
    public static void main(String... datos){
        String[] nombres=new String[3];
        int[] edades=new int[3];
        for(int i=0;i<3;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingresa el Nombre:");
            nombres[i]=sc.next();
           System.out.println("Ingresa la Edad:");
            edades[i]=sc.nextInt();
        }
        for (int i=0;i<3;i++){
            System.out.println(nombres[i]+" "+"Edad: "+edades[i]);  
        }   
    }   
}