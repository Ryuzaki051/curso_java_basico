package MC_50_57;

import dao.DAOPersonaImpl;
import interfaces.DAOPersona;

/**
 *
 * @author Alejandro
 */
public class PatronDAO52 {
    
    public static void main(String... patrondao){
        PersonaBD51 persona=new PersonaBD51();
        persona.setId_persona(5);
        persona.setNombre("Daniela");
        persona.setEdad(20);
        
        
        //Insertar
        try{
            DAOPersona dao=new DAOPersonaImpl();
            dao.registrar(persona);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        //Modificar
        try{
            DAOPersona dao=new DAOPersonaImpl();
            dao.modificar(persona);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        //Eliminar
        try{
            DAOPersona dao=new DAOPersonaImpl();
            dao.eliminar(persona);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
        //listar
        try{
            DAOPersona dao=new DAOPersonaImpl();
            for(PersonaBD51 per:dao.listar()){
                System.out.println(per.getNombre()+" "+per.getEdad());
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
    }
    
}