package MC_40_49;

/**
 *
 * @author Alejandro
 */
public class Excepciones41 {
    
    private void proceso1(){
        int a=7,b=0;
        int division=a/b;
        System.out.println(division);
    }
    
    public static void main(String... arg){
        
        try{
        // Proceso 1
            Excepciones41 obj=new Excepciones41();
        obj.proceso1();
        
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Bloque Finally");
        }
        
        
        
        
        //***********************************************************
        //Formas de aplicar la excepcion
        //Metodo 1
        try{
        // Elabora el proceso    
        }
        catch(Exception ex){
            //Si hay error interviene la excepcion
        }
        finally{
         // Si o si ejecuta la accion
        }
        //***********************************************************
        //Metodo 2
        try{
           //Ejecuta el proceso 
        }
        finally{
        //Si o si ejecuta el proceso
        }
        //***********************************************************
        //Metodo3
        try{
            //Ejecuta el proceso
        }
        catch(Exception e)
        {
            //detecta el error en el proceso
        }
        //***********************************************************
    }
}