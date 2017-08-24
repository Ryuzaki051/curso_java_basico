package MC_10_19;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class VectoresOrdenamiento17 {
    public static void main(String... arg){
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
        //Ordenamiento de menor a mayor con el vector edades
        //Bubble Sort
        int aux;
        for(int i=0;i<2;i++){
            for(int j=0;j<2-i;j++){
                if(edades[j]>edades[j+1]){
                    aux=edades[j];
                    edades[j]=edades[j+1];
                    edades[j+1]=aux;
                }
            }
        }
        System.out.println("Ordenamiento de edades:");
        for(Integer valor:edades){
            System.out.println(valor);
        }
        
        //Ordenamiento de Cadenas
        String aux1;
        for(int i=0;i<2;i++){
            for(int j=0;j<2-i;j++){
                if(nombres[j].compareTo(nombres[j+1])>0){
                    aux1=nombres[j];
                    nombres[j]=nombres[j+1];
                    nombres[j+1]=aux1;
                }
            }
        }
        
        for(String valor: nombres){
            System.out.println(valor);
        }
     
    }
}