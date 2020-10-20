
package Controlador;

import Modelo.CRUD_Producto;
import Modelo.Producto;
import Vista.Productos;
import Vista.modificarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorModificarProducto implements ActionListener{
    private Producto modeloProducto;
    private CRUD_Producto crudProducto;
    private modificarProducto vistaModificar;
    private Productos vistaProductos;

    public ControladorModificarProducto(Producto modeloProducto, CRUD_Producto crudProducto, modificarProducto vistaModificar) {
        this.modeloProducto = modeloProducto;
        this.crudProducto = crudProducto;
        this.vistaModificar = vistaModificar;
        
        this.vistaModificar.jButton_Modificar.addActionListener(this);
        this.vistaModificar.jButton_Cancelar.addActionListener(this);
    }
    
    public void iniciar(){
        vistaModificar.setTitle("Modificacion de Productos");
        vistaModificar.setLocationRelativeTo(null);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String y = String.valueOf(vistaProductos.s);
        vistaModificar.jTextField_Id.setText(y);
        if(e.getSource() == vistaModificar.jButton_Modificar){
        
            modeloProducto.setId(Integer.parseInt(vistaModificar.jTextField_Id.getText()));
            modeloProducto.setNombre(vistaModificar.jTextField_Nombre.getText());
            modeloProducto.setDescripcion(vistaModificar.jTextField_Descripción.getText());
            modeloProducto.setCategoria(vistaModificar.jTextField_Categoria.getText());
            modeloProducto.setPrecio(Double.parseDouble(vistaModificar.jTextField_Precio.getText()));

            if (crudProducto.EditarProducto(modeloProducto)) {
                JOptionPane.showMessageDialog(null, "Producto Modificado Correctamente");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar Producto");
                Limpiar();
            }
        }
    }
    public void Limpiar(){
        vistaModificar.jTextField_Nombre.setText(null);
        vistaModificar.jTextField_Descripción.setText(null);
        vistaModificar.jTextField_Categoria.setText(null);
        vistaModificar.jTextField_Precio.setText(null);
    }
    
}
