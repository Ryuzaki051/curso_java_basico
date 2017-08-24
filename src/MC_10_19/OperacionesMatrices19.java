package MC_10_19;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class OperacionesMatrices19 {
public static void main(String... arg){
        Scanner tec=new Scanner(System.in);
        //                Filas[0]Columnas[0]
        int[][] numeros=new int[3][3];
        
        //Llenado de la Matriz
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese elemento para la posicion:"+"Fila: "+i+" Columna:"+j);
                numeros[i][j]=tec.nextInt();
            }
        }
        System.out.print("\n");
        //impresion de la matriz
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                //Imprime solo la primera fila
                /*
                if(i==0){
                    System.out.print(numeros[i][j]);
                }else{
                    System.out.print(0);
                }*/
                
                //Imprime la primera columna
                /*
                if(j==0){
                    System.out.print(numeros[i][j]);
                }else{
                    System.out.print(0);
                }*/
                
                
                //imprime en diagonal
                /*
                if(i==j){
                    System.out.print(numeros[i][j]);
                }else{
                    System.out.print(0);
                }*/
                
            }
            System.out.print("\n");
        }
    }      
}