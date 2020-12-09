package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
    private static String user = "root";
    private static String password = "MySQL23";
    private static String url = "jdbc:mysql://localhost:8080/simplelogin?autoReconnet=true&&useSSL=false";
    
    public Connection getConnect(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(url,user,password);
        }catch(SQLException | ClassNotFoundException except){
            System.err.println(except.toString());
        }
        return conexion;
    }
}