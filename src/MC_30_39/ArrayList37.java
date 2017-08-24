package MC_30_39;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */

public class ArrayList37 {
    
    public static void main(String... args){
        
        //Prueba de rendimiento en comparacion de listas
        long inicio1=System.currentTimeMillis();
        //*****************************************************
        List<Integer> lista1=new ArrayList();
        //Se van a iterar mas elementos
        for(int i=0;i<1000000;i++){
            lista1.add(i);
        }
        
        /*
        lista1.add(1); // 1 procesador y asigna 1 bloque
        lista1.add(2); // 1 procesador y asigna 1 bloque
        lista1.add(3); // 1 procesador y asigna 1 bloque
        lista1.add(4); // 1 procesador y asigna 1 bloque
        lista1.add(5); // 1 procesador y asigna 1 bloque
        */
        
        long fin1=System.currentTimeMillis();
        
        System.out.println(fin1-inicio1);
        
        //*****************************************************
        long inicio2=System.currentTimeMillis();
        List<Integer> lista2=new ArrayList(1000000);
        
        for(int i=0;i<1000000;i++){
            lista2.add(i);
        }
        
        
        // 1 procesador y asigna 5 bloques
        /*
        lista2.add(1); // a cada bloque
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        */
        long fin2=System.currentTimeMillis();
        
        System.out.println(fin2-inicio2);
        
    }
}