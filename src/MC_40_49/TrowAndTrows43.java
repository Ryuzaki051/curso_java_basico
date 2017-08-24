package MC_40_49;

/**
 *
 * @author Alejandro
 */
public class TrowAndTrows43 {
    
    private void metodo1(){
        try{
            metodo2();
        }catch(Exception e){
            
        }
    }
    
    private void metodo2(){
        try{
            metodo3();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
    
    private void metodo3() throws Exception {
        try{
            int division=1/0;
        }catch(Exception e){
            throw new Exception("Enviando Excepcion");
        }
    }
    
    
    public static void main(String... arg){
        TrowAndTrows43 obj=new TrowAndTrows43();
        obj.metodo1();
    }
}