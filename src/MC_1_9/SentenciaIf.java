package MC_1_9;
/**
 * @author Alejandro
 */
public class SentenciaIf {
    public static void main(String... arg){
        //   = asignacion
        //   ==comparacion
        //   != comparacion inversa
        //   > mayor que < menor que
        //   >= mayor o igual que <= menor o igual que
        int x=20;
        int y=10;
        int mayor;
        
        if(x>y){
            mayor=x;
        }else{
            mayor=y;
        }
        System.out.println("Prueba 1:"+mayor);
        //La Sentencia anterior se puede resumir a la siguiente linea
        //          x Seria igual a if  
        mayor=(x>y) ? x : y ;
        //                y seria igual a else
        System.out.println("Prueba 2:"+mayor);
        
        /* Prueba 2
        if(x==50){
            System.out.println("Este es 50");
        }else if(x==40){
            System.out.println("Este es 40");
        }else if(x==30){
            System.out.println("Este es 30");
        }else if(x==20){
            System.out.println("Este es 20");
        }else{
            System.out.println("No estaba en ninguna de los valores anteriores");
        }*/
        
        /* Prueba 1
        if(x>50==true){ //No es necesario utilizar true
            System.out.println("Esto es una sentencia if");
        }else{
            System.out.println("Esto es una sentencia else");
        }*/
        
        
        
    }
    
}
