package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.Usuarios;
import Vista.modificar_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorModificarUsuario implements ActionListener{
    private Usuario modeloUsuario;
    private CRUD_Usuario crudUsuario;
    private modificar_Usuario vistaModificar;
    public Usuarios vistaUsuarios;
    
    public ControladorModificarUsuario(Usuario modeloUsuario, CRUD_Usuario crudUsuario, modificar_Usuario vistaModificar) {
        this.modeloUsuario = modeloUsuario;
        this.crudUsuario = crudUsuario;
        this.vistaModificar = vistaModificar;
        
        this.vistaModificar.jButton_modificar.addActionListener(this);
        this.vistaModificar.jButton_cancelar.addActionListener(this);
    }

    
   
    public void iniciar(){
        vistaModificar.setTitle("Modificacion de usuarios");
        vistaModificar.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x =String.valueOf(vistaUsuarios.n);
        vistaModificar.jTextId.setText(x);
        if(e.getSource()== vistaModificar.jButton_cancelar){
        
        }
        if(e.getSource()== vistaModificar.jButton_modificar){
            
            modeloUsuario.setId(Integer.parseInt(vistaModificar.jTextId.getText()));
            modeloUsuario.setPassword(vistaModificar.jTextField_contraseña.getText());
            modeloUsuario.setNombre(vistaModificar.jTextField_nombre.getText());
            modeloUsuario.setApellido(vistaModificar.jTextField_apellido.getText());
            modeloUsuario.setCorreo(vistaModificar.jTextField_correo.getText());
            modeloUsuario.setDateborn(vistaModificar.jTextField_fechaNacimiento.getText());

            if (crudUsuario.EditarUsuario(modeloUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Creado Correctamente");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear Usuario");
                Limpiar();
            }
        }
        
    }
    public void Limpiar() {
        vistaModificar.jTextField_contraseña.setText(null);
        vistaModificar.jTextField_nombre.setText(null);
        vistaModificar.jTextField_apellido.setText(null);
        vistaModificar.jTextField_correo.setText(null);
        vistaModificar.jTextField_fechaNacimiento.setText(null);

    }

}
