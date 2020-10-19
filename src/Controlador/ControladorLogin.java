package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.Login;
import Vista.Register;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Final
 */
public class ControladorLogin implements ActionListener {

    private Usuario modeloUsuario;
    private CRUD_Usuario modeloCRUDUsuario;
    private Login vistaUsuario;

    public ControladorLogin(Usuario usuario, CRUD_Usuario crudusuario, Login formularioUsuario) {
        this.modeloUsuario = usuario;
        this.vistaUsuario = formularioUsuario;
        this.modeloCRUDUsuario = crudusuario;

        this.vistaUsuario.jButtonLogin.addActionListener(this);
        this.vistaUsuario.jButtonClickRegister.addActionListener(this);
    }

    public void iniciar() {
        vistaUsuario.setTitle("Login");
        vistaUsuario.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaUsuario.jButtonLogin) {
            modeloUsuario.setPassword(vistaUsuario.jPasswordContraseña.getText());
            modeloUsuario.setCorreo(vistaUsuario.jTextUsuario.getText());

            if (modeloCRUDUsuario.Login(modeloUsuario)) {
                Limpiar();
            } else {
                Limpiar();
            }
        }
        if (e.getSource() == vistaUsuario.jButtonClickRegister) {
            Usuario modelo = new Usuario();
            CRUD_Usuario crudUsuario = new CRUD_Usuario();
            Register vista = new Register();
            ControladorRegister controlador = new ControladorRegister(modelo, crudUsuario, vista);
            controlador.iniciar();
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }

    public void Limpiar() {
        vistaUsuario.jPasswordContraseña.setText(null);
        vistaUsuario.jTextUsuario.setText(null);
    }
}
