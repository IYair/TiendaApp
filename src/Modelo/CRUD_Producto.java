package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Final
 */
public class CRUD_Producto extends Conexion{
    
    public boolean RegistrarProducto(Producto producto) {
        CallableStatement ps = null;
        Connection con = getConexion();

        String sql = "{call PA_CreateProducto (?,?,?,?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean EliminarProducto(int producto) {
        CallableStatement ps = null;
        Connection con = getConexion();
        String sql = "{call PA_DeleteProducto (?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, producto);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public boolean EditarProducto(Producto producto) {
        CallableStatement ps = null;
        Connection con = getConexion();
        String sql = "{call PA_UpdateProducto(?,?,?,?,?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, producto.getId());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setString(4, producto.getCategoria());
            ps.setDouble(5, producto.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public DefaultTableModel ObtenerProducto() {
        DefaultTableModel Usuarios = new DefaultTableModel();
        Usuarios.addColumn("id");
        Usuarios.addColumn("Nombre");
        Usuarios.addColumn("F.Insercion");
        Usuarios.addColumn("Descripcion");
        Usuarios.addColumn("Categoria");
        Usuarios.addColumn("Precio");
        CallableStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "{call PA_ReadProducto}";
        try {
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Object dato[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    dato [i] = rs.getString(i+1);
                }
                Usuarios.addRow(dato);
            }
            
        } catch (SQLException ex) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CRUD_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Usuarios;
    }

}
