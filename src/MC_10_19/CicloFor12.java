package MC_10_19;

public class CicloFor12 {
    public static void main(String... argumentos){
        
        String[] array={"YouTube","Facebook","Twitter"};
        //System.out.println(array);//imprime un ID/Alias que se le asigna al arreglo
        for(int i=0; i<array.length;i++){
            System.out.println(i+" "+array[i]);
        }
        //Otro metodo de usar el ciclo for pero con arrays
        //Se utiliza mas en listas enlazadas
        for(String s:array){
            System.out.println(s);
        }
        
        
        
        
        /* Prueba 2
        for(int i=0;i<5;i++){
            if(i==2){
                //break;Termina el ciclo
                continue;
            }
            System.out.println(i);
        }*/
        
        /*Prueba 1
        for(int i=0;i<5;i++){
            //Codigo
            System.out.println("i: "+i);
            
        }
        for(int j=5;j>0;j--){
                System.out.println("j: "+j);
        }
        */
    }
}
