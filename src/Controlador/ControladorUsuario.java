package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorUsuario implements ActionListener {

    private Usuario modeloUsuario;
    private CRUD_Usuario modeloCRUDUsuario;
    private Register vistaUsuario;

    public ControladorUsuario(Usuario usuario, CRUD_Usuario crudusuario, Register formularioUsuario) {
        this.modeloUsuario = usuario;
        this.vistaUsuario = formularioUsuario;
        this.modeloCRUDUsuario = crudusuario;

        this.vistaUsuario.jButtonRegistarse.addActionListener(this);
    }

    public void iniciar() {
        vistaUsuario.setTitle("Crear Usuario");
        vistaUsuario.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modeloUsuario.setPassword(vistaUsuario.jPasswordContraseña.getText());
        modeloUsuario.setNombre(vistaUsuario.jTextNombre.getText());
        modeloUsuario.setApellido(vistaUsuario.jTextApellido.getText());
        modeloUsuario.setCorreo(vistaUsuario.jTextCorreo.getText());
        modeloUsuario.setDateborn(vistaUsuario.jTextDateborn.getText());

        if (modeloCRUDUsuario.RegistrarUsuario(modeloUsuario)) {
            JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear Usuario");
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
