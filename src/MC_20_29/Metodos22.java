package MC_20_29;

public class Metodos22 {
    private String nombre;
    private int edad;
    
    public void saludar(String nombre){
        System.out.print("Hola "+nombre);
    }
    public String despedir(String nombre,int edad){//Puede aceptar n cantidad de argumentos
       return nombre + edad;
    }
    
    public static void main(String... alex){
        Metodos22 obj=new Metodos22();
        obj.saludar("Alejandro");
        String recepcion=obj.despedir("\nAbraham ",24);
        System.out.print(recepcion);
    
    }
}