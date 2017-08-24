package MC_20_29;
/**
 * @author Alejandro
 */
public class GettersAndSettersA27 {
    private String nombre;
    private String color;
    private String serie;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }  
    
    public void mostrar(){
        System.out.println(nombre+"-"+color+"-"+serie);
    }
}