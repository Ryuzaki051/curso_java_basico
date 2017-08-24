package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class Conexion {
    protected Connection conexion;
    //JDBC Driver nombre y base de datos
    private final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private final String DB_URL="jdbc:mysql://localhost:3306/curso_sql";
        
    //Credenciales de la base de datos
    private final String USER="root";
    private final String PASS="12345";
    
    public void conectar () throws Exception{
        try {
            conexion=DriverManager.getConnection(DB_URL,USER,PASS);
            Class.forName(JDBC_DRIVER);
            
            
        }catch(Exception e){
            throw e;
        }
    }
    
    public void cerrar() throws SQLException{
        if(conexion!=null){
            if(conexion.isClosed()){
                conexion.close();
            }
        }
    }
}