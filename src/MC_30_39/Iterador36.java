package MC_30_39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Iterador36 {
    
    public static void main(String... listas){
        //En versiones JDK 1.7 inferior el tipo de lista es
        //List<String> lista=new ArrayList<tipodecampo>();
        
        Persona34 per1=new Persona34();
        per1.setCuenta(1);
        per1.setNobmre("Alejandro");
        per1.setMonto(2000);
        
        Persona34 per2=new Persona34();
        per2.setCuenta(2);
        per2.setNobmre("Abraham");
        per2.setMonto(3000);
        
        Persona34 per3=new Persona34();
        per3.setCuenta(3);
        per3.setNobmre("Mayra");
        per3.setMonto(1500);
        
        List<Persona34> lista=new ArrayList();
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
        for(Persona34 s:lista){
            //Despliega los datos correctos
            System.out.println(s.getCuenta());
            System.out.println(s.getNobmre());
            System.out.println(s.getMonto());
            
            //solo muestra el id del objeto
            System.out.println(s);
        }
        
        
        /*
        Ejemplo (2)
        List<String> lista=new ArrayList();
        lista.add("Alejandro");
        lista.add("Abraham");
        lista.add("Meléndez Ramos");
        
        Iterator<String> iterador=lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        */
        //***************************************************
        /*
        Ejemplo (1)
        List<String> lista=new ArrayList();
        lista.add("Alejandro");
        lista.add("Abraham");
        lista.add("Meléndez Ramos");
        for(String s:lista){
            System.out.println(s);
        } */
    }
    
}
