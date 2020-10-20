package Controlador;

import Modelo.CRUD_Producto;
import Modelo.Producto;
import Vista.Productos;
import Vista.ingresarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

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
    if(e.getSource()==vistaProductos.btn_insertar){
            Producto modelo = new Producto();
            CRUD_Producto crudProducto = new CRUD_Producto();
             ingresarProducto vistaProducto = new ingresarProducto();
            ControladorRegisterProducto controlador = new ControladorRegisterProducto(modelo, crudProducto, vistaProducto);
            controlador.iniciar();
            vistaProducto.setVisible(true);
            vistaProducto.setLocationRelativeTo(null);
            vistaProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    }
    
    public void mostrarTablaProductos(){
        CRUD_Producto p = new CRUD_Producto();
            vistaProductos.jTableProductos.setModel(p.ObtenerProducto());
    }
}
