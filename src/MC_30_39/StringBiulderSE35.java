package MC_30_39;
/**
 *
 * @author Alejandro
 */
public class StringBiulderSE35 {
    
    public static void main(String... ssargs){
        /*
        //Las clases String son inmutables
            String texto="Hola soy Alejandro ";
            texto+="Suscribete"+" al canal de youtube";
            System.out.println(texto);

            StringBuilder textoBuilder=new StringBuilder();
            textoBuilder.append("Hola soy JAVA ").append("Suscribete ").append("al canal");
            System.out.println(textoBuilder.toString());
        */
        //Se diferencia en el rendimiento
        
        long tiempo_inicio=System.nanoTime();
        StringBuilder builder=new StringBuilder(); 
        for(int i=0;i<1000;i++){
            builder.append(i);
        }
        
        long tiempo_fin=System.nanoTime();
        double diferencia=(tiempo_fin-tiempo_inicio);
        
        System.out.println(diferencia);
        
        //******************************************************
        long tiempo_inicio2=System.nanoTime();
        String texto="";
        for(int i=0;i<1000;i++){
            texto+=i;
        }
        
        long tiempo_fin2=System.nanoTime();
        double diferencia2=(tiempo_fin2-tiempo_inicio2);
        
        System.out.println(diferencia2);
    }
}