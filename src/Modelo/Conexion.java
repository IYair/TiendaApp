package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Final
 */
public class Conexion {
    
    String UrlConexion ="jdbc:sqlserver://ENYAOFICIAL\\MMSQLSERVER:1433;databaseName=TiendaOnline;user=sa;password=12345;";
    private Connection conexion=null;
    public Connection getConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = (Connection) DriverManager.getConnection(UrlConexion);
            System.out.println("Conexcion Establecida");

        } catch (SQLException ex) {
            
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
