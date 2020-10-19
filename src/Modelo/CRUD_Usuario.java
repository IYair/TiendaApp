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

            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
}
