import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Final
 */
public class TiendaApp {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String UrlConexion ="jdbc:sqlserver://ENYAOFICIAL\\MMSQLSERVER:1433;databaseName=TiendaOnline;user=sa;password=12345;";
        Connection con= DriverManager.getConnection(UrlConexion);
        
        System.out.println("Conexion establecida");
    }
}
