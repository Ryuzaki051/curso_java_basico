package MC_20_29;
/**
 * @author Alejandro
 */
public class HerenciaPerro28 extends HerenciaAnimal28{
     private String raza; //Se pueden añadir mas de un atributo

    public HerenciaPerro28(String raza, String nombre, String tipo_alimentacion, int edad) {
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
}