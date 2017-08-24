package MC_1_9;
/**
 * @author Alejandro
 */
public class TiposDato {
    public static void main(String[ ] arg){
        //Los tipos de dato no pueden ser nulos
        //A excepcion de una clase wrapper como Integer si los acepta
        int var1=0; //Se debe de inicializar valor
        // var1=20.5;
        System.out.println(var1);
        
        //Conversion de datos 
        String numero="99";
        int suma=Integer.parseInt(numero)+1;
        System.out.println(suma);
        
        char caracter;
        caracter='A';
        System.out.println(caracter);
        
        Character obj=new Character('a');//no convencional
        System.out.println(obj);
        
        //Strings
        String texto1="Alejandro";
        String texto2="Inscribete";
        String texto3="Alejandro";
        String concatenado=texto1.concat(texto2);
        char captura=texto1.charAt(1);
        
        System.out.println("Strings : "+captura);
        
        int resultado=texto1.compareTo(texto2);
        int resultado2=texto1.compareToIgnoreCase(texto3);
        System.out.println("Strings : "+resultado+" "+resultado2+" "+concatenado);
        
        boolean prueba=texto1.contains("d");//indica si la letra existe en la palabra
        int prueba2=texto1.indexOf("e");//indica la posicion de la letra indicada
        
        String recorte=texto1.substring(3);    //Extrae una porcion del texto con substring
        //puede ser tambien por rangos (2,6)
        int cantidad =texto2.length();//indica la cantidad de caracteres en el que este almacenado la variable
        System.out.println("Strings : "+prueba2+"<-Indexof"+" | "+prueba+" <-Boolean"
                +" | "+recorte+" <-Substring"+" | "+cantidad+" <-Length");
    }
    
}
