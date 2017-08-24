package MC_50_57;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class InsersionConParametrosBD50 {
    
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
    
    public static void main(String... insersiondata) throws SQLException {
        InsersionConParametrosBD50 objeto=new InsersionConParametrosBD50();
        String valor=objeto.solicitarValores();
        
        if(valor!=null){
            objeto.registrarBD(valor);
        }
    }
}