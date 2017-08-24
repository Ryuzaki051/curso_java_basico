package MC_20_29;
/**
 * @author Alejandro
 */
public class PolimorfismoPerro29 extends PolimorfismoAnimal29{
    private String raza; //Se pueden añadir mas de un atributo

    public PolimorfismoPerro29(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
     
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrar(){
        System.out.println(getNombre()+"-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza()); 
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de carne");
    }   
}