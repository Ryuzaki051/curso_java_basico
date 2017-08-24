package MC_20_29;

/**
 * @author Alejandro
 */
public abstract class PolimorfismoAnimal29 {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;

    public PolimorfismoAnimal29(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    
    public PolimorfismoAnimal29(){}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void alimentarse();
    
    public void moverse(){
        System.out.println("El animal se esta moviendo");
    }
}