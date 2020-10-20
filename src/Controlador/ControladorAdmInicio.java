
package Controlador;

import Modelo.CRUD_Producto;
import Modelo.CRUD_Usuario;
import Modelo.Producto;
import Modelo.Usuario;
import Vista.F_Administrador;
import Vista.Productos;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Final
 */
public class ControladorAdmInicio implements ActionListener{
    private F_Administrador vistaAdmi;
    
    public ControladorAdmInicio(F_Administrador vistaAdmi) {
        this.vistaAdmi = vistaAdmi;
        
        this.vistaAdmi.btn_Usuarios.addActionListener(this);
        this.vistaAdmi.btn_Productos.addActionListener(this);
        this.vistaAdmi.btn_ordenes.addActionListener(this);
        this.vistaAdmi.btn_domicilio.addActionListener(this);
    }
    public void iniciar(){
    vistaAdmi.setTitle("Administrador");
    vistaAdmi.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vistaAdmi.btn_Usuarios){
            Usuario modelo = new Usuario();
            CRUD_Usuario crudUsuario = new CRUD_Usuario();
            Usuarios vistaUsuarios = new Usuarios();
            ControladorAdmUsuario controlador = new ControladorAdmUsuario(modelo,crudUsuario,vistaUsuarios);
            controlador.iniciar();
            vistaUsuarios.setVisible(true);
        }
        if(e.getSource()== vistaAdmi.btn_Productos){
            Producto modelo = new Producto();
            CRUD_Producto crudProducto = new CRUD_Producto();
            Productos vistaProducto = new Productos();
            ControladorAdmProducto controlador = new ControladorAdmProducto(vistaProducto, modelo, crudProducto);
            controlador.iniciar();
            vistaProducto.setVisible(true);
        }
    }
    
}
