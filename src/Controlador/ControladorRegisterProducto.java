package Controlador;

import Modelo.CRUD_Producto;
import Modelo.Producto;
import Vista.ingresarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Final
 */
public class ControladorRegisterProducto implements ActionListener{
        private Producto modeloProducto;
        private CRUD_Producto crudProducto;
        private ingresarProducto vistaProducto;

    public ControladorRegisterProducto(Producto modeloProducto, CRUD_Producto crudProducto, ingresarProducto vistaProducto) {
        this.modeloProducto = modeloProducto;
        this.crudProducto = crudProducto;
        this.vistaProducto = vistaProducto;
        
        this.vistaProducto.jButton_Cancelar.addActionListener(this);
        this.vistaProducto.jButton_Guardar.addActionListener(this);
    }
    public void iniciar(){
        vistaProducto.setTitle("InsertarProducto");
        vistaProducto.setLocationRelativeTo(null);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vistaProducto.jButton_Guardar){
            modeloProducto.setNombre(vistaProducto.jTextField_Nombre.getText());
            modeloProducto.setDescripcion(vistaProducto.jTextField_Descripción.getText());
            modeloProducto.setCategoria(vistaProducto.jTextField_Categoria.getText());
            modeloProducto.setPrecio(Double.parseDouble(vistaProducto.jTextField_Precio.getText()));

            if (crudProducto.RegistrarProducto(modeloProducto)) {
                JOptionPane.showMessageDialog(null, "Producto Creado Correctamente");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear Producto");
                Limpiar();
            }
        }
        if(e.getSource()==vistaProducto.jButton_Cancelar){
        
        }
        
    }
    public void Limpiar() {
        vistaProducto.jTextField_Nombre.setText(null);
        vistaProducto.jTextField_Descripción.setText(null);
        vistaProducto.jTextField_Categoria.setText(null);
        vistaProducto.jTextField_Precio.setText(null);

    }

}
