/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Vector;
import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class F_Administrador extends javax.swing.JFrame {
   /* 
    Vista.Panel_Usuarios panel_usuarios;
    Vista.Panel_Ventas panel_Ventas;
    Vista.Panel_Almacen panel_Almacen;
    Vista.Panel_Productos panel_Productos;
    Vista.Panel_Administracion panel_Administracion;
    */
    
   /* public String validar_Panel_Usuarios = "0";
    public String validar_Panel_Ventas = "0";
    public String validar_Panel_Almacen = "0";
    public String validar_Panel_Productos = "0";
    public String validar_panel_Administracion = "0";*/
    
    public F_Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    /*
    private void abrir_Panel_Usuarios(){ //validacion con el metodo, para que no deje agregar mas pestañas cuando esté abierta una
        if(validar_Panel_Usuarios.equals("0")){
         panel_usuarios = new Panel_Usuarios();
        jTabbedPane_Administrador.addTab("", panel_usuarios);
        jTabbedPane_Administrador.setSelectedComponent(panel_usuarios);
        } else{ // si no, solamente se selecciona y no deja seguir abriendo mas pestañas iguales
        jTabbedPane_Administrador.setSelectedComponent(panel_usuarios);

        }
        validar_Panel_Usuarios = "1";  //esto hace que en dado caso la condicion entre al else
       
        
    }
    
     private void abrir_Panel_Ventas(){ //validacion con el metodo, para que no deje agregar mas pestañas cuando esté abierta una
         if(validar_Panel_Ventas.equals("0")){
         panel_Ventas = new Panel_Ventas();
        jTabbedPane_Administrador.addTab("", panel_Ventas);
        jTabbedPane_Administrador.setSelectedComponent(panel_Ventas);
        } else{ // si no, solamente se selecciona y no deja seguir abriendo mas pestañas iguales
        jTabbedPane_Administrador.setSelectedComponent(panel_Ventas);

        }
        validar_Panel_Ventas = "1";  //esto hace que en dado caso la condicion entre al else
       
        
    }
    
     private void abrir_Panel_Almacen(){ //validacion con el metodo, para que no deje agregar mas pestañas cuando esté abierta una
         if(validar_Panel_Almacen.equals("0")){
         panel_Almacen = new Panel_Almacen();
        jTabbedPane_Administrador.addTab("", panel_Almacen);
        jTabbedPane_Administrador.setSelectedComponent(panel_Almacen);
        } else{ // si no, solamente se selecciona y no deja seguir abriendo mas pestañas iguales
        jTabbedPane_Administrador.setSelectedComponent(panel_Almacen);

        }
        validar_Panel_Almacen = "1";  //esto hace que en dado caso la condicion entre al else
       
        
    }
     
     private void abrir_Panel_Productos(){ //validacion con el metodo, para que no deje agregar mas pestañas cuando esté abierta una
        if(validar_Panel_Productos.equals("0")){
         panel_Productos = new Panel_Productos();
        jTabbedPane_Administrador.addTab("", panel_Productos);
        jTabbedPane_Administrador.setSelectedComponent(panel_Productos);
        } else{ // si no, solamente se selecciona y no deja seguir abriendo mas pestañas iguales
        jTabbedPane_Administrador.setSelectedComponent(panel_Productos);

        }
        validar_Panel_Productos = "1";  //esto hace que en dado caso la condicion entre al else
       
        
    }
     
     private void abrir_Panel_Administracion(){ //validacion con el metodo, para que no deje agregar mas pestañas cuando esté abierta una
        if(validar_panel_Administracion.equals("0")){
         panel_Administracion = new Panel_Administracion();
        jTabbedPane_Administrador.addTab("", panel_Administracion);
        jTabbedPane_Administrador.setSelectedComponent(panel_Administracion);
        } else{ // si no, solamente se selecciona y no deja seguir abriendo mas pestañas iguales
        jTabbedPane_Administrador.setSelectedComponent(panel_Administracion);

        }
        validar_panel_Administracion = "1";  //esto hace que en dado caso la condicion entre al else
       
        
    }
    */
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Productos = new javax.swing.JButton();
        btn_Usuarios = new javax.swing.JButton();
        jLabel_bienvenido = new javax.swing.JLabel();
        jTabbedPane_Administrador = new javax.swing.JTabbedPane();
        jPanel_Inicio_color = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Inferior_Autores = new javax.swing.JPanel();
        jLabel_autores = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_ordenes = new javax.swing.JButton();
        btn_domicilio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE VENTAS");
        setBackground(new java.awt.Color(89, 164, 240));
        setLocation(new java.awt.Point(300, 150));

        btn_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_productos.png"))); // NOI18N
        btn_Productos.setText("Productos");
        btn_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseClicked(evt);
            }
        });
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });

        btn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_usuarios.png"))); // NOI18N
        btn_Usuarios.setText("Usuarios");
        btn_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UsuariosMouseClicked(evt);
            }
        });
        btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuariosActionPerformed(evt);
            }
        });

        jLabel_bienvenido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_bienvenido.setText("Bienvenido:");

        jTabbedPane_Administrador.setBackground(new java.awt.Color(18, 102, 198));

        jPanel_Inicio_color.setBackground(new java.awt.Color(47, 47, 133));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/carrito-de-compras-256px.png"))); // NOI18N
        jLabel1.setText("BIENVENIDOS AL SISTEMA");

        jPanel_Inferior_Autores.setBackground(java.awt.Color.darkGray);

        jLabel_autores.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel_autores.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_autores.setText("Desarrollado por: Eduardo D. Aubry Ramirez e Irmin Y. Chan Canul ");

        javax.swing.GroupLayout jPanel_Inferior_AutoresLayout = new javax.swing.GroupLayout(jPanel_Inferior_Autores);
        jPanel_Inferior_Autores.setLayout(jPanel_Inferior_AutoresLayout);
        jPanel_Inferior_AutoresLayout.setHorizontalGroup(
            jPanel_Inferior_AutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Inferior_AutoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_autores)
                .addContainerGap())
        );
        jPanel_Inferior_AutoresLayout.setVerticalGroup(
            jPanel_Inferior_AutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Inferior_AutoresLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel_autores)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_Inicio_colorLayout = new javax.swing.GroupLayout(jPanel_Inicio_color);
        jPanel_Inicio_color.setLayout(jPanel_Inicio_colorLayout);
        jPanel_Inicio_colorLayout.setHorizontalGroup(
            jPanel_Inicio_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Inicio_colorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Inferior_Autores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_Inicio_colorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Inicio_colorLayout.setVerticalGroup(
            jPanel_Inicio_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Inicio_colorLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addComponent(jPanel_Inferior_Autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane_Administrador.addTab("Inicio", jPanel_Inicio_color);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        btn_ordenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_ventas.png"))); // NOI18N
        btn_ordenes.setText("Ordenes");
        btn_ordenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ordenesMouseClicked(evt);
            }
        });
        btn_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenesActionPerformed(evt);
            }
        });

        btn_domicilio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/domicilio.png"))); // NOI18N
        btn_domicilio.setText("Domicilio");
        btn_domicilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_domicilioMouseClicked(evt);
            }
        });
        btn_domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_domicilioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Administrador)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_bienvenido)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Usuarios)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Productos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ordenes)
                        .addGap(18, 18, 18)
                        .addComponent(btn_domicilio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_bienvenido)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane_Administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
      //  abrir_Panel_Productos();
        
     
  
            }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuariosActionPerformed
    }//GEN-LAST:event_btn_UsuariosActionPerformed

    private void btn_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ordenesActionPerformed

    private void btn_domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_domicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_domicilioActionPerformed

    private void btn_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuariosMouseClicked


        //this.dispose();

    }//GEN-LAST:event_btn_UsuariosMouseClicked

    private void btn_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseClicked


    }//GEN-LAST:event_btn_ProductosMouseClicked

    private void btn_ordenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordenesMouseClicked

    }//GEN-LAST:event_btn_ordenesMouseClicked

    private void btn_domicilioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_domicilioMouseClicked

    }//GEN-LAST:event_btn_domicilioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Administrador().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Productos;
    public javax.swing.JButton btn_Usuarios;
    public javax.swing.JButton btn_domicilio;
    public javax.swing.JButton btn_ordenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_autores;
    private javax.swing.JLabel jLabel_bienvenido;
    private javax.swing.JPanel jPanel_Inferior_Autores;
    private javax.swing.JPanel jPanel_Inicio_color;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane_Administrador;
    // End of variables declaration//GEN-END:variables
}

