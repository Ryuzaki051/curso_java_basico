package MC_20_29;

/**
 *
 * @author Alejandro
 */
public class Poo24b {
    public static void main(String[] arg){
        Poo24a obj=new Poo24a("LG","Negro");
        obj.llamar();
        
        Poo24a obj2=new Poo24a("Samsung","Blanco");
        obj2.llamar();
        
        Poo24a obj3=new Poo24a("Samsung","Verde");
        obj3.llamarEspecial(obj2);   
    }   
}