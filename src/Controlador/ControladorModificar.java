package Controlador;

import Modelo.CRUD_Usuario;
import Modelo.Usuario;
import Vista.modificar_Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Final
 */
public class ControladorModificar implements ActionListener{
    private Usuario modeloUsuario;
    private CRUD_Usuario crudUsuario;
    private modificar_Usuario vistaModificar;
    
    public ControladorModificar(Usuario modeloUsuario, CRUD_Usuario crudUsuario, modificar_Usuario vistaModificar) {
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
        if(e.getSource()== vistaModificar.jButton_cancelar){
        
        }
        
    }

}
