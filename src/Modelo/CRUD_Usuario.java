package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Final
 */
public class CRUD_Usuario extends Conexion {

    public boolean RegistrarUsuario(Usuario usuario) {
        CallableStatement ps = null;
        Connection con = getConexion();

        String sql = "{call PA_CreateUsuario (?,?,?,?,?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, usuario.getPassword());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getCorreo());
            ps.setString(5, usuario.getDateborn());
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

    public boolean EliminarUsuario(Usuario usuario) {
        CallableStatement ps = null;
        Connection con = getConexion();
        String sql = "{call PA_DeleteUsuario (?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, usuario.getId());
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

    public boolean EditarUsuario(Usuario usuario) {
        CallableStatement ps = null;
        Connection con = getConexion();
        String sql = "{call PA_UpdateUsuario(?,?,?,?,?,?)}";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, usuario.getId());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getApellido());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getDateborn());
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

    public DefaultTableModel ObtenerUsuario() {
        DefaultTableModel Usuarios = new DefaultTableModel();
        Usuarios.addColumn("id");
        Usuarios.addColumn("Password");
        Usuarios.addColumn("Nombre");
        Usuarios.addColumn("Apellido");
        Usuarios.addColumn("Correo");
        Usuarios.addColumn("F.Nacimiento");
        Usuarios.addColumn("F.Registro");
        Usuarios.addColumn("Estado");
        CallableStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "{call PA_ReadUsuario}";
        try {
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                Object dato[] = new Object[8];
                for (int i = 0; i < 8; i++) {
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

    public boolean Login(Usuario usuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "select * from Usuario where Correo=? and Password=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, usuario.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto");
            }
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
}
