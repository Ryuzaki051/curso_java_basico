package MC_40_49;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class ConexionADB49 {
    public static void main(String... jdbc) throws SQLException{
        
        //JDBC Driver nombre y base de datos
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/curso_sql";
        
        //Credenciales de la base de datos
        final String USER="root";
        final String PASS="12345";
        
        //Connection conexion=null;
        
        try(Connection conexion=DriverManager.getConnection(DB_URL,USER,PASS) ){//Usando with try resources
            Class.forName(JDBC_DRIVER);
            
            
            PreparedStatement st=(PreparedStatement) conexion.prepareStatement("INSERT INTO PERSONA(nombre,edad) VALUES('Abraham',28)");
            st.executeUpdate();
            st.close();
            
        }catch(Exception e){
            e.getMessage();
        }
        /*finally{
            if(conexion!=null){
                 if(!conexion.isClosed()){
                    conexion.close();
                }
            }
        }*/
        
    }
}

