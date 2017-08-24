package MC_50_57;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class ListarBD51 {
    
    public String solicitarValores(){
        Scanner tec=new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre = tec.next();
        return nombre;
    }
    
    
    public void registrarBD(String valor){
        //JDBC Driver nombre y base de datos
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/curso_sql";
        
        //Credenciales de la base de datos
        final String USER="root";
        final String PASS="12345";
 
        try(Connection conexion=DriverManager.getConnection(DB_URL,USER,PASS) ){//Usando with try resources
            Class.forName(JDBC_DRIVER);
            
            
            PreparedStatement st=(PreparedStatement) conexion.prepareStatement("INSERT INTO PERSONA(nombre) VALUES(?)");
            st.setString(1, valor);
            
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    public List<PersonaBD51> listar(){
        List<PersonaBD51> lista=null;
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/curso_sql";

        final String USER="root";
        final String PASS="12345";
 
        try(Connection conexion=DriverManager.getConnection(DB_URL,USER,PASS) ){
            Class.forName(JDBC_DRIVER);
            
            PreparedStatement st=(PreparedStatement) conexion.prepareStatement("SELECT * FROM PERSONA");
            
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
            e.getMessage();
        }   
        return lista;
    }
    
    public static void main(String... listardb) throws SQLException {
        ListarBD51 objeto=new ListarBD51();
        String valor=objeto.solicitarValores();
        
        if(valor!=null){
            objeto.registrarBD(valor);
        }
        
        //List<PersonaBD51> listaBD=objeto.listar(); opcion 1        
        for(PersonaBD51 per:objeto.listar()){
            System.out.println(per.getId_persona()+" "+per.getNombre()+" "+per.getEdad());
        }
        
        
    }
}