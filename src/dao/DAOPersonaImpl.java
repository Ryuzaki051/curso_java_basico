package dao;

import MC_50_57.PersonaBD51;
import interfaces.DAOPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class DAOPersonaImpl extends Conexion implements DAOPersona{

    @Override
    public void registrar(PersonaBD51 per) throws Exception {
        try{
            this.conectar();
            PreparedStatement st=this.conexion.prepareStatement("INSERT INTO PERSONA(nombre,edad) VALUES(?,?)");
            st.setString(1,per.getNombre());
            st.setInt(2,per.getEdad());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(PersonaBD51 per) throws Exception {
    try{
        this.conectar();
        PreparedStatement st=this.conexion.prepareStatement("UPDATE PERSONA SET nombre=? WHERE id_persona=?");
        st.setString(1,per.getNombre());
        st.setInt(2,per.getId_persona());
        
        st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(PersonaBD51 per) throws Exception {
    try{
        this.conectar();
        PreparedStatement st=this.conexion.prepareStatement("DELETE FROM PERSONA WHERE id=?");
        st.setInt(1,per.getId_persona());
        st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }   
    }

    @Override
    public List<PersonaBD51> listar() throws Exception {
        List<PersonaBD51> lista=null;
        try{
        this.conectar();
            PreparedStatement st=this.conexion.prepareStatement("SELECT * FROM PERSONA");
            lista=new ArrayList();
            ResultSet rs=st.executeQuery();
            
            while(rs.next()){
                PersonaBD51 per=new PersonaBD51();
                per.setId_persona(rs.getInt("id_persona"));
                per.setNombre(rs.getString("nombre"));
                per.setEdad(rs.getInt("edad"));
                lista.add(per);
            }
            rs.close();
            st.close();
        
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        
        return lista;
    }
    
}