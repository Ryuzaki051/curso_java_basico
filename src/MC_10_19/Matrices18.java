package MC_10_19;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Matrices18 {
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
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(numeros[i][j]+"\t");
                
            }
            System.out.print("\n");
        }
    }   
}