package com.mycompany.venta_producto;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AgregaProductos extends javax.swing.JFrame {

    int xMouse, yMouse;
    private DAOProducto daoProducto = null;
    private boolean isNew = false;

    public AgregaProductos() {
        initComponents();
        daoProducto = new DAOProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Clave3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Clave5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Clave6 = new javax.swing.JLabel();
        jTNombre1 = new javax.swing.JTextField();
        jTPrecio2 = new javax.swing.JTextField();
        Actualizart2 = new javax.swing.JPanel();
        ActualizarText2 = new javax.swing.JLabel();
        Registrar2 = new javax.swing.JPanel();
        RegistratText2 = new javax.swing.JLabel();
        Borrart4 = new javax.swing.JPanel();
        BorrarText4 = new javax.swing.JLabel();
        jTClaveBorrar2 = new javax.swing.JTextField();
        Clave8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Clave12 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Clave5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Clave5.setText("Nombre del Producto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Clave5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clave5)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Clave6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Clave6.setText("Precio del producto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Clave6, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clave6)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jTNombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTNombre1.setForeground(new java.awt.Color(204, 204, 204));
        jTNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTNombre1MousePressed(evt);
            }
        });
        jTNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombre1ActionPerformed(evt);
            }
        });

        jTPrecio2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTPrecio2.setForeground(new java.awt.Color(204, 204, 204));
        jTPrecio2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTPrecio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTPrecio2MousePressed(evt);
            }
        });
        jTPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecio2ActionPerformed(evt);
            }
        });

        Actualizart2.setBackground(new java.awt.Color(0, 134, 190));

        ActualizarText2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        ActualizarText2.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ActualizarText2.setText("Actualizar");
        ActualizarText2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarText2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarText2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActualizarText2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActualizarText2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Actualizart2Layout = new javax.swing.GroupLayout(Actualizart2);
        Actualizart2.setLayout(Actualizart2Layout);
        Actualizart2Layout.setHorizontalGroup(
            Actualizart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actualizart2Layout.createSequentialGroup()
                .addComponent(ActualizarText2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        Actualizart2Layout.setVerticalGroup(
            Actualizart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ActualizarText2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

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

        Borrart4.setBackground(new java.awt.Color(0, 134, 190));

        BorrarText4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        BorrarText4.setForeground(new java.awt.Color(255, 255, 255));
        BorrarText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarText4.setText("Borrar");
        BorrarText4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarText4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarText4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrarText4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrarText4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Borrart4Layout = new javax.swing.GroupLayout(Borrart4);
        Borrart4.setLayout(Borrart4Layout);
        Borrart4Layout.setHorizontalGroup(
            Borrart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Borrart4Layout.createSequentialGroup()
                .addComponent(BorrarText4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        Borrart4Layout.setVerticalGroup(
            Borrart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrarText4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jTClaveBorrar2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTClaveBorrar2.setForeground(new java.awt.Color(204, 204, 204));
        jTClaveBorrar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTClaveBorrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTClaveBorrar2MousePressed(evt);
            }
        });
        jTClaveBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClaveBorrar2ActionPerformed(evt);
            }
        });

        Clave8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Clave12.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Clave12.setText("Clave Borrar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Clave12, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clave12)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

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
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(Actualizart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(Registrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(Clave8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Borrart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTClaveBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(27, 27, 27)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actualizart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTClaveBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Borrart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(Clave8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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


    private void jTNombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTNombre1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombre1MousePressed

    private void jTNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombre1ActionPerformed

    private void jTPrecio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPrecio2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecio2MousePressed

    private void jTPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecio2ActionPerformed

    private void ActualizarText2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarText2MouseClicked
        Producto p = daoProducto.findById(Long.parseLong(jTClave.getText()));
        p.setNombre(jTNombre1.getText());
        double precio = Double.parseDouble(jTPrecio2.getText());
        p.setPrecio(precio);
        Long id = Long.parseLong(jTClave.getText());
        p.setClave(id);
        daoProducto.update(p, id);
        JOptionPane.showMessageDialog(this, "Se actualizo");
        
        jTClave.setText("");
        jTNombre1.setText("");
        jTPrecio2.setText("");
    }//GEN-LAST:event_ActualizarText2MouseClicked

    private void ActualizarText2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarText2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarText2MouseEntered

    private void ActualizarText2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarText2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarText2MouseExited

    private void RegistratText2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistratText2MouseClicked
        Producto P = new Producto();
        P.setNombre(jTNombre1.getText());
        double precio = Double.parseDouble(jTPrecio2.getText());
        P.setPrecio(precio);
        Long id = Long.parseLong(jTClave.getText());
        P.setClave(id);
        daoProducto.create(P);
        JOptionPane.showMessageDialog(this, "El producto se ha almacenado correctamente!");
        jTClave.setText("");
        jTNombre1.setText("");
        jTPrecio2.setText("");
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

    private void BorrarText4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarText4MouseClicked
        Producto p = daoProducto.findById(Long.parseLong(jTClaveBorrar2.getText()));
        if (p != null) {
            daoProducto.delete(Long.parseLong(jTClaveBorrar2.getText()));
            JOptionPane.showMessageDialog(this, "Se elimino");
        } else {
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }
        jTClaveBorrar2.setText("");
    }//GEN-LAST:event_BorrarText4MouseClicked

    private void BorrarText4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarText4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarText4MouseEntered

    private void BorrarText4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarText4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarText4MouseExited

    private void jTClaveBorrar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClaveBorrar2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveBorrar2MousePressed

    private void jTClaveBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClaveBorrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClaveBorrar2ActionPerformed

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
            
            List<Producto> productos = daoProducto.findAll();
            
            String[][] data =  new String[productos.size()][3];
            
            for (int i = 0; i< productos.size(); i++){
                Producto prod = productos.get(i);
                data[i][0] = String.valueOf(prod.getClave()).toString();
                data[i][1] = prod.getNombre().toString();
                data[i][2] = String.valueOf(prod.getPrecio()).toString();
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
            java.util.logging.Logger.getLogger(AgregaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualizarText2;
    private javax.swing.JPanel Actualizart2;
    private javax.swing.JLabel BorrarText4;
    private javax.swing.JPanel Borrart4;
    private javax.swing.JLabel Clave12;
    private javax.swing.JLabel Clave3;
    private javax.swing.JLabel Clave5;
    private javax.swing.JLabel Clave6;
    private javax.swing.JLabel Clave8;
    private javax.swing.JTable DatosLava;
    private javax.swing.JScrollPane Mostrar;
    private javax.swing.JPanel Registrar2;
    private javax.swing.JLabel RegistratText2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTClave;
    private javax.swing.JTextField jTClaveBorrar2;
    private javax.swing.JTextField jTNombre1;
    private javax.swing.JTextField jTPrecio2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
