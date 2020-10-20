package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.F_Administrador;
import Vista.Register;
import Vista.Usuarios;
import Vista.modificar_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorAdmUsuario implements ActionListener {

    private Usuario modeloUsuario;
    private CRUD_Usuario modeloUsuarioCRUD;
    private Usuarios vistaUsuarios;

    public ControladorAdmUsuario(Usuario usuario, CRUD_Usuario crudUsuario, Usuarios vistaUsuarios) {
        this.vistaUsuarios = vistaUsuarios;
        this.modeloUsuario = usuario;
        this.modeloUsuarioCRUD = crudUsuario;
        
        this.vistaUsuarios.jButtonActualizar.addActionListener(this);
        this.vistaUsuarios.jButtonInsertar.addActionListener(this);
        this.vistaUsuarios.btn_modificar.addActionListener(this);
    }
    public void iniciar(){
        vistaUsuarios.setTitle("Administracion de usuarios");
        vistaUsuarios.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource()== vistaUsuarios.jButtonActualizar) {
            mostrarTablaUsuarios();
        }
        if(e.getSource()==vistaUsuarios.jButtonInsertar){
            Usuario modelo = new Usuario();
            CRUD_Usuario crudUsuario = new CRUD_Usuario();
            Register vista = new Register();
            ControladorRegister controlador = new ControladorRegister(modelo, crudUsuario, vista);
            controlador.iniciar();
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if(e.getSource()== vistaUsuarios.btn_home){
            F_Administrador vistaAdministrador = new F_Administrador();
            ControladorAdmInicio controlador = new ControladorAdmInicio(vistaAdministrador);
            controlador.iniciar();
            vistaAdministrador.setVisible(true);
            vistaAdministrador.pack();
            vistaAdministrador.setLocationRelativeTo(null);
            vistaAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        }
        if (e.getSource() == vistaUsuarios.btn_modificar) {
            /*Usuario modelo = new Usuario();
            CRUD_Usuario crudUsuario = new CRUD_Usuario();
            modificar_Usuario vistaModificar = new modificar_Usuario();
            ControladorModificar controlador = new ControladorModificar(modelo,crudUsuario,vistaModificar);
            controlador.iniciar();
            vistaModificar.setVisible(true);
            vistaModificar.setLocationRelativeTo(null);
            vistaModificar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        }
    }

    public void mostrarTablaUsuarios(){
        CRUD_Usuario p = new CRUD_Usuario();
            vistaUsuarios.jTableUsuarios.setModel(p.ObtenerUsuario());
    }
    
}
