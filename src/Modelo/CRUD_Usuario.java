/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Final
 */
public class CRUD_Usuario extends Conexion{
    
    public boolean RegistrarUsuario(Usuario usuario){
        CallableStatement ps=null;
        Connection con = getConexion();
        
        String sql = "{call PA_CreateUsuario (?,?,?,?,?)}";
}
}
