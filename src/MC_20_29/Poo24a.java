//Ejemplo de un celular utilizando la estructura de POO
package MC_20_29;

public class Poo24a {
    
    String nombre;  
    String color;
    
    //Se crea un constructor... Notarse que se crea con el nombre de la clase
    Poo24a(String nombre,String color){//puede o no contener parametros
        this.nombre=nombre; //Se manda a llamar a la variable global
        this.color=color;   // asignandose a la variable local (argumentos).
    } 

    public void llamar(){
        System.out.println(nombre+" "+color+" "+"Llamando....");
    }
    
    public void llamarEspecial(Poo24a celular){
        System.out.println(celular.nombre+"-"+celular.color+" "+"Llamando....");
    }   
}