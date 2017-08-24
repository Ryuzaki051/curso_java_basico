package MC_20_29;

public class AlcanceDeLasVariables23 {
    int edad=23;//variable global
    
    public void mostrarEdad(){
        System.out.println(edad);
    }
    
    public void mostrarEdad2(){
        //variable local
        int edad=24;//Recomendable no repetir el nombre de la variable local con la global
        System.out.println(edad);
    }
    
    public static void main(String... args){
        AlcanceDeLasVariables23 obj=new AlcanceDeLasVariables23();
        obj.mostrarEdad();
        obj.mostrarEdad2();
    }
}