package tiendaapp;
import Controlador.ControladorAdmInicio;
import Controlador.ControladorAdmUsuario;
import Controlador.ControladorLogin;
import Modelo.Usuario;
import Modelo.CRUD_Usuario;
import Vista.F_Administrador;
import Vista.Login;
import Vista.Usuarios;

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
       
        /*Usuario modelo = new Usuario();
        CRUD_Usuario crudUsuario = new CRUD_Usuario();
        Usuarios vistaUsuarios = new Usuarios();
        ControladorAdmUsuario controlador = new ControladorAdmUsuario(modelo,crudUsuario,vistaUsuarios);
        controlador.iniciar();
        vistaUsuarios.setVisible(true);*/
        

        /*F_Administrador vistaUsuarios = new F_Administrador();
        ControladorAdmInicio controlador = new ControladorAdmInicio(vistaUsuarios);
        controlador.iniciar();
        vistaUsuarios.setVisible(true);*/
       
    }
}