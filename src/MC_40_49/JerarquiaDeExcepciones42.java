package MC_40_49;
/**
 *
 * @author Alejandro
 */
public class JerarquiaDeExcepciones42 {
    
    public void proceso(){
        int a=7,b=0;
        int division=a/b;
        System.out.println(division);
    }
   
    public static void main(String... arg){
        try{
            JerarquiaDeExcepciones42 obj=new JerarquiaDeExcepciones42();
            obj.proceso();
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Bloque Finally");
        }
        //**********************************
        
        try{
            JerarquiaDeExcepciones42 obj=new JerarquiaDeExcepciones42();
            obj.proceso();
        }catch(Exception ex){ //Excepcion Generica....
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Bloque Finally");
        }
        
    }   
}