package com.mycompany.venta_producto;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AgregaVentas extends javax.swing.JFrame {

    int xMouse, yMouse;
    private DAODetalleVenta daoProducto = null;
    private DAOProducto daoprod = null;
    private boolean isNew = false;

    public AgregaVentas() {
        initComponents();
        daoProducto = new DAODetalleVenta();
        daoprod = new DAOProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Clave3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Cantidad = new javax.swing.JLabel();
        jTCantidad = new javax.swing.JTextField();
        Registrar2 = new javax.swing.JPanel();
        RegistratText2 = new javax.swing.JLabel();
        Clave8 = new javax.swing.JLabel();
        jTClave = new javax.swing.JTextField();
        Mostrar = new javax.swing.JScrollPane();
        DatosLava = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jInternalFrame1.setBackground(new java.awt.Color(102, 102, 255));
        jInternalFrame1.setVisible(true);

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("Catalogo de Productos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Clave3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Clave3.setText("Clave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Clave3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clave3)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Cantidad.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Cantidad.setText("Cantidad Productos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cantidad)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jTCantidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTCantidad.setForeground(new java.awt.Color(204, 204, 204));
        jTCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTCantidadMousePressed(evt);
            }
        });
        jTCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadActionPerformed(evt);
            }
        });

        Registrar2.setBackground(new java.awt.Color(0, 134, 190));
        Registrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Registrar2MouseClicked(evt);
            }
        });

        RegistratText2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        RegistratText2.setForeground(new java.awt.Color(255, 255, 255));
        RegistratText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistratText2.setText("Guardar");
        RegistratText2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistratText2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistratText2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistratText2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistratText2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Registrar2Layout = new javax.swing.GroupLayout(Registrar2);
        Registrar2.setLayout(Registrar2Layout);
        Registrar2Layout.setHorizontalGroup(
            Registrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar2Layout.createSequentialGroup()
                .addComponent(RegistratText2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        Registrar2Layout.setVerticalGroup(
            Registrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistratText2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Clave8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jTClave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTClave.setForeground(new java.awt.Color(204, 204, 204));
        jTClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTClaveMousePressed(evt);
            }
        });
        jTClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(226, 226, 226))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Registrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Clave8))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(Registrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(Clave8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Mostrar.setBackground(new java.awt.Color(204, 255, 204));
        Mostrar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                MostrarPropertyChange(evt);
            }
        });

        DatosLava.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Precio"
            }
        ));
        DatosLava.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DatosLava.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Mostrar.setViewportView(DatosLava);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantidadMousePressed

    private void jTCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantidadActionPerformed

    private void RegistratText2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistratText2MouseClicked

        DetalleVenta vp = new DetalleVenta();
        Producto prod = new Producto();
        Long id = Long.parseLong(jTClave.getText());
        prod = daoprod.findById(id);

        String nombre = prod.getNombre();
        int precio = (int) prod.getPrecio();
        int cantidad = Integer.parseInt(jTCantidad.getText());
        int sub = cantidad * precio;
        String sub2 = String.valueOf(sub);
        Long subtotal = Long.parseLong(sub2);
        Long iva = (subtotal * 16) / 100;
        Long total = (subtotal + iva);
        vp.setVentaID(1L);
        vp.setClave(id);
        vp.setProducto(nombre);
        vp.setSubtotal(subtotal);
        vp.setPrecio(precio);
        vp.setIva(iva);
        vp.setCantidad(cantidad);
        vp.setTotal(total);

        daoProducto.create(vp);
        JOptionPane.showMessageDialog(this, "El producto se ha almacenado correctamente!");
        jTClave.setText("");
        jTCantidad.setText("");
    }//GEN-LAST:event_RegistratText2MouseClicked

    private void RegistratText2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistratText2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistratText2MouseEntered

    private void RegistratText2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistratText2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistratText2MouseExited

    private void Registrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Registrar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Registrar2MouseClicked

    private void jTClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClaveMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveMousePressed

    private void jTClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Clave");
            model.addColumn("Nombre");
            model.addColumn("Precio");

            List<DetalleVenta> detalles = daoProducto.findAll();

            String[][] data = new String[detalles.size()][8];

            for (int i = 0; i < detalles.size(); i++) {
                DetalleVenta vp = detalles.get(i);
                
                data[i][0] = String.valueOf(vp.getVentaID()).toString();
                data[i][1] = String.valueOf(vp.getClave()).toString();
                data[i][2] = String.valueOf(vp.getProducto()).toString();
                data[i][3] = String.valueOf(vp.getPrecio()).toString();
                data[i][4] = String.valueOf(vp.getCantidad()).toString();
                data[i][5] = String.valueOf(vp.getSubtotal()).toString();
                data[i][6] = String.valueOf(vp.getTotal()).toString();
                data[i][7] = String.valueOf(vp.getIva()).toString();
                model.addRow(data);
            }

            DatosLava.setModel(model);

        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "\n ¡No Hay Datos para Mostrar!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void MostrarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_MostrarPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarPropertyChange

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
            java.util.logging.Logger.getLogger(AgregaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Clave3;
    private javax.swing.JLabel Clave8;
    private javax.swing.JTable DatosLava;
    private javax.swing.JScrollPane Mostrar;
    private javax.swing.JPanel Registrar2;
    private javax.swing.JLabel RegistratText2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTClave;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
