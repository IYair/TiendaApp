/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class F_Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form F_Usuarios
     */
    public F_Usuarios() {
        initComponents();this.setExtendedState(MAXIMIZED_BOTH); // hace full screen
        this.setLocationRelativeTo(null);
        btn_carrito_compras.setBorder(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_banner = new javax.swing.JPanel();
        jLabel_productos = new javax.swing.JLabel();
        btn_carrito_compras = new javax.swing.JButton();
        btn_mi_cuenta = new javax.swing.JButton();
        jPanel_productos = new javax.swing.JPanel();
        label_miel1 = new javax.swing.JLabel();
        jLabel_miel2 = new javax.swing.JLabel();
        jLabel_miel3 = new javax.swing.JLabel();
        jLabel_miel1 = new javax.swing.JLabel();
        jLabel_miel_osito = new javax.swing.JLabel();
        jLabel_miel_botella = new javax.swing.JLabel();
        jLabel_precio1 = new javax.swing.JLabel();
        jLabel_precio2 = new javax.swing.JLabel();
        jLabel_precio3 = new javax.swing.JLabel();
        jButton_agregarCarrito1 = new javax.swing.JButton();
        jButton_agregarCarrito2 = new javax.swing.JButton();
        jButton_agregarCarrito3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_banner.setBackground(new java.awt.Color(185, 226, 140));

        jLabel_productos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/mercado.png"))); // NOI18N
        jLabel_productos.setText("Productos");

        btn_carrito_compras.setBackground(new java.awt.Color(185, 226, 140));
        btn_carrito_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/carro-de-la-compra.png"))); // NOI18N
        btn_carrito_compras.setBorder(null);
        btn_carrito_compras.setBorderPainted(false);
        btn_carrito_compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_carrito_comprasMouseClicked(evt);
            }
        });
        btn_carrito_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrito_comprasActionPerformed(evt);
            }
        });

        btn_mi_cuenta.setBackground(new java.awt.Color(185, 226, 140));
        btn_mi_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/perfil-del-usuario.png"))); // NOI18N
        btn_mi_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mi_cuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bannerLayout = new javax.swing.GroupLayout(jPanel_banner);
        jPanel_banner.setLayout(jPanel_bannerLayout);
        jPanel_bannerLayout.setHorizontalGroup(
            jPanel_bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bannerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_productos)
                .addContainerGap(555, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mi_cuenta)
                .addGap(18, 18, 18)
                .addComponent(btn_carrito_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_bannerLayout.setVerticalGroup(
            jPanel_bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bannerLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel_productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_mi_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_carrito_compras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        label_miel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/miel.png"))); // NOI18N

        jLabel_miel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/miel2.png"))); // NOI18N

        jLabel_miel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/miel3.png"))); // NOI18N

        jLabel_miel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_miel1.setText("Miel Carlota 500ml");

        jLabel_miel_osito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_miel_osito.setText("Miel pura 300ml");

        jLabel_miel_botella.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_miel_botella.setText("Botella miel 750ml");

        jLabel_precio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_precio1.setText("$ 50 mxn");

        jLabel_precio2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_precio2.setText("$ 30 mxn");

        jLabel_precio3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_precio3.setText("$ 120 mxn");

        jButton_agregarCarrito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_agregarcarrito.png"))); // NOI18N

        jButton_agregarCarrito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_agregarcarrito.png"))); // NOI18N

        jButton_agregarCarrito3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/iconos/icon_agregarcarrito.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_productosLayout = new javax.swing.GroupLayout(jPanel_productos);
        jPanel_productos.setLayout(jPanel_productosLayout);
        jPanel_productosLayout.setHorizontalGroup(
            jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_productosLayout.createSequentialGroup()
                        .addComponent(jLabel_miel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_miel_osito)
                            .addComponent(jLabel_precio2)
                            .addComponent(jButton_agregarCarrito2))
                        .addContainerGap(590, Short.MAX_VALUE))
                    .addGroup(jPanel_productosLayout.createSequentialGroup()
                        .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_productosLayout.createSequentialGroup()
                                .addComponent(label_miel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_miel1)
                                    .addComponent(jLabel_precio1)
                                    .addComponent(jButton_agregarCarrito1)))
                            .addGroup(jPanel_productosLayout.createSequentialGroup()
                                .addComponent(jLabel_miel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_miel_botella)
                                    .addComponent(jLabel_precio3)
                                    .addComponent(jButton_agregarCarrito3))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_productosLayout.setVerticalGroup(
            jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_productosLayout.createSequentialGroup()
                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_miel1)
                    .addGroup(jPanel_productosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_miel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_precio1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_agregarCarrito1)))
                .addGap(60, 60, 60)
                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_miel2)
                    .addGroup(jPanel_productosLayout.createSequentialGroup()
                        .addComponent(jLabel_miel_osito)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_precio2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_agregarCarrito2)))
                .addGap(65, 65, 65)
                .addGroup(jPanel_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_miel3)
                    .addGroup(jPanel_productosLayout.createSequentialGroup()
                        .addComponent(jLabel_miel_botella)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_precio3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_agregarCarrito3)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_carrito_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrito_comprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrito_comprasActionPerformed

    private void btn_carrito_comprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_carrito_comprasMouseClicked
        Carro_compra carro = new Carro_compra();
        carro.setVisible(true);
        carro.pack();
        carro.setLocationRelativeTo(null);
        carro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_btn_carrito_comprasMouseClicked

    private void btn_mi_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mi_cuentaMouseClicked
ordenes_Pendientes ordenes_pendientes = new ordenes_Pendientes();
        ordenes_pendientes.setVisible(true);
        ordenes_pendientes.pack();
        ordenes_pendientes.setLocationRelativeTo(null);
       // metodo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.dispose();
        

    }//GEN-LAST:event_btn_mi_cuentaMouseClicked

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
            java.util.logging.Logger.getLogger(F_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_carrito_compras;
    private javax.swing.JButton btn_mi_cuenta;
    private javax.swing.JButton jButton_agregarCarrito1;
    private javax.swing.JButton jButton_agregarCarrito2;
    private javax.swing.JButton jButton_agregarCarrito3;
    private javax.swing.JLabel jLabel_miel1;
    private javax.swing.JLabel jLabel_miel2;
    private javax.swing.JLabel jLabel_miel3;
    private javax.swing.JLabel jLabel_miel_botella;
    private javax.swing.JLabel jLabel_miel_osito;
    private javax.swing.JLabel jLabel_precio1;
    private javax.swing.JLabel jLabel_precio2;
    private javax.swing.JLabel jLabel_precio3;
    private javax.swing.JLabel jLabel_productos;
    private javax.swing.JPanel jPanel_banner;
    private javax.swing.JPanel jPanel_productos;
    private javax.swing.JLabel label_miel1;
    // End of variables declaration//GEN-END:variables
}
