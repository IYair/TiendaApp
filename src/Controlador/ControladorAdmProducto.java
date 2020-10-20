package Controlador;

import Modelo.CRUD_Producto;
import Modelo.Producto;
import Vista.Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Final
 */
public class ControladorAdmProducto implements ActionListener{

    public ControladorAdmProducto(Productos vistaProductos, Producto modeloProducto, CRUD_Producto modeloProductoCRUD) {
        this.vistaProductos = vistaProductos;
        this.modeloProducto = modeloProducto;
        this.modeloProductoCRUD = modeloProductoCRUD;
        
        this.vistaProductos.btn_insertar.addActionListener(this);
        this.vistaProductos.btn_eliminar.addActionListener(this);
        this.vistaProductos.btn_modificar.addActionListener(this);
        this.vistaProductos.jButtonActualizar.addActionListener(this);
    }
    private Productos vistaProductos;
    private Producto modeloProducto;
    private CRUD_Producto modeloProductoCRUD;
    
    
    
    public void iniciar(){
        vistaProductos.setTitle("Administracion de Productos");
        vistaProductos.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()== vistaProductos.jButtonActualizar){
        mostrarTablaProductos();
    }
    }
    
    public void mostrarTablaProductos(){
        CRUD_Producto p = new CRUD_Producto();
            vistaProductos.jTableProductos.setModel(p.ObtenerProducto());
    }
}
