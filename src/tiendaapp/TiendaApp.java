package tiendaapp;
import Controlador.ControladorLogin;
import Modelo.Usuario;
import Modelo.CRUD_Usuario;
import Vista.Login;

/**
 *
 * @author Final
 */
public class TiendaApp {
    
    public static void main(String[] args) {
        Usuario modelo = new Usuario();
        CRUD_Usuario crudUsuario = new CRUD_Usuario();
        Login vistaLogin = new Login();
        ControladorLogin controlador = new ControladorLogin(modelo,crudUsuario,vistaLogin);
        controlador.iniciar();
        vistaLogin.setVisible(true);
       //Conexion con = new Conexion();
       //con.getConexion();
       
    }
}