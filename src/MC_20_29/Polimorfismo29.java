package MC_20_29;
// Cambios/mutacion 
/**
 * @author Alejandro
 */
public class Polimorfismo29 {
    
    public static void main(String ... polimorfismo){
        PolimorfismoAnimal29 a=new PolimorfismoPerro29("Pastor Aleman","Kaiser","Carnivoro",5);
        a.alimentarse();
        
        PolimorfismoAnimal29 b=new PolimorfismoCaballo29();
        b.alimentarse();
        
        a.moverse();
    }
}