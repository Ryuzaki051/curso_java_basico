package MC_20_29;

public class ModificadoresAcceso26a {
    public String nombre;//Este Acceso te permite visualizar este argumento en cualquier clase/paquete
    private String color;//Este acceso solo te permite trabajar con la misma clase
    protected String serie; // Este es mas utilizado al utilizar herencia
    String fecha; //Este argumento global trabaja en cualqueier clase que se encuentre dentro del paquete
    
    public ModificadoresAcceso26a(){
        
    }
    public ModificadoresAcceso26a(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }
    public ModificadoresAcceso26a(String nombre){
        this.nombre=nombre;
    }
}