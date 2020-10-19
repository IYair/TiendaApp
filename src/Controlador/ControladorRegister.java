package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.Login;
import Vista.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorRegister implements ActionListener {

    private Usuario modeloUsuario;
    private CRUD_Usuario modeloCRUDUsuario;
    private Register vistaUsuario;

    public ControladorRegister(Usuario usuario, CRUD_Usuario crudusuario, Register formularioUsuario) {
        this.modeloUsuario = usuario;
        this.vistaUsuario = formularioUsuario;
        this.modeloCRUDUsuario = crudusuario;

        this.vistaUsuario.jButtonRegistarse.addActionListener(this);
        this.vistaUsuario.jButtonCancelar.addActionListener(this);
    }

    public void iniciar() {
        vistaUsuario.setTitle("Crear Usuario");
        vistaUsuario.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaUsuario.jButtonRegistarse) {
            modeloUsuario.setPassword(vistaUsuario.jPasswordContraseña.getText());
            modeloUsuario.setNombre(vistaUsuario.jTextNombre.getText());
            modeloUsuario.setApellido(vistaUsuario.jTextApellido.getText());
            modeloUsuario.setCorreo(vistaUsuario.jTextCorreo.getText());
            modeloUsuario.setDateborn(vistaUsuario.jTextDateborn.getText());

            if (modeloCRUDUsuario.RegistrarUsuario(modeloUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear Usuario");
                Limpiar();
            }
        }
        if (e.getSource() == vistaUsuario.jButtonCancelar) {
            Usuario modelo = new Usuario();
            CRUD_Usuario crudUsuario = new CRUD_Usuario();
            Login vistaLogin = new Login();
            ControladorLogin controlador = new ControladorLogin(modelo, crudUsuario, vistaLogin);
            controlador.iniciar();
            vistaLogin.setVisible(true);
            vistaLogin.setLocationRelativeTo(null);
            vistaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public void Limpiar() {
        vistaUsuario.jPasswordContraseña.setText(null);
        vistaUsuario.jTextNombre.setText(null);
        vistaUsuario.jTextApellido.setText(null);
        vistaUsuario.jPasswordContraseña.setText(null);
        vistaUsuario.jTextDateborn.setText(null);

    }
}