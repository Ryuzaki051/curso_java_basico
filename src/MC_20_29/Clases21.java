package MC_20_29;

public class Clases21 {
    //Por convencion las variables dentro de una clase deben de ser privados
    private String nombre;
    private int edad;
    
    public void Saludar(){
        nombre="Alejandro";
        edad=24;
        System.out.print("Hola "+nombre);
        System.out.print("\tEdad "+edad);
    }
    
    public static void main(String... arg){
        Clases21 clase=new Clases21();
        clase.Saludar();
        
    }   
}