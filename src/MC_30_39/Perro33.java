package MC_30_39;

/**
 *
 * @author Alejandro
 */
public class Perro33 implements Animal33 { // se utiliza el comando implements para heredar de la interfaz

    @Override
    public void mostrarAnimal() {
        System.out.print("Soy un mamifero, perro: ");
    }

    @Override
    public String mostrarNombre() {
        return "kaiser";
    }   
}