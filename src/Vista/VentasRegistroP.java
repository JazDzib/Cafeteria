/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ControladorPrincipal;

/**
 *
 * @author Jazmin Dzib
 */
public class VentasRegistroP extends javax.swing.JPanel {
    private ControladorPrincipal controladorG;
    /**
     * Creates new form VentasRegistroP
     */
    public VentasRegistroP(ControladorPrincipal controladorG) {
        initComponents();
        this.controladorG = controladorG;
        controladorG.obtenerControladorVentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        RegistroPanelVentas = new javax.swing.JPanel();
        REGScrollVentas = new javax.swing.JScrollPane();
        TablaClienteFrecuente2 = new javax.swing.JTable();
        REGBVEditarVenta = new javax.swing.JButton();
        REGBVEliminarVenta = new javax.swing.JButton();
        REGBVAnadirVenta = new javax.swing.JButton();
        VENTAS = new javax.swing.JLabel();
        RegistroPanelVentas1 = new javax.swing.JPanel();
        REGScrollVentas1 = new javax.swing.JScrollPane();
        TablaClienteFrecuente3 = new javax.swing.JTable();
        REGBVEditarVenta1 = new javax.swing.JButton();
        REGBVEliminarVenta1 = new javax.swing.JButton();
        REGBVAnadirVenta1 = new javax.swing.JButton();
        VENTAS1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        RegistroPanelVentas.setBackground(new java.awt.Color(66, 96, 87));

        TablaClienteFrecuente2.setAutoCreateRowSorter(true);
        TablaClienteFrecuente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Existencia"
            }
        ));
        TablaClienteFrecuente2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        TablaClienteFrecuente2.setColumnSelectionAllowed(true);
        TablaClienteFrecuente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaClienteFrecuente2.setShowHorizontalLines(true);
        TablaClienteFrecuente2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TablaClienteFrecuente2ComponentAdded(evt);
            }
        });
        REGScrollVentas.setViewportView(TablaClienteFrecuente2);

        REGBVEditarVenta.setBackground(new java.awt.Color(215, 201, 134));
        REGBVEditarVenta.setText("EDITAR");
        REGBVEditarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVEditarVentaActionPerformed(evt);
            }
        });

        REGBVEliminarVenta.setBackground(new java.awt.Color(215, 139, 134));
        REGBVEliminarVenta.setText("ELIMINAR");
        REGBVEliminarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVEliminarVentaActionPerformed(evt);
            }
        });

        REGBVAnadirVenta.setBackground(new java.awt.Color(176, 215, 134));
        REGBVAnadirVenta.setText("AÑADIR");
        REGBVAnadirVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVAnadirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVAnadirVentaActionPerformed(evt);
            }
        });

        VENTAS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        VENTAS.setForeground(new java.awt.Color(215, 215, 153));
        VENTAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VENTAS.setText("V E N T A S");

        javax.swing.GroupLayout RegistroPanelVentasLayout = new javax.swing.GroupLayout(RegistroPanelVentas);
        RegistroPanelVentas.setLayout(RegistroPanelVentasLayout);
        RegistroPanelVentasLayout.setHorizontalGroup(
            RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                        .addComponent(REGBVAnadirVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelVentasLayout.createSequentialGroup()
                        .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(REGBVEliminarVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(REGBVEditarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                        .addGap(217, 217, 217))))
            .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(VENTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(61, 61, 61)))
            .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(REGScrollVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );
        RegistroPanelVentasLayout.setVerticalGroup(
            RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelVentasLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(REGBVAnadirVenta)
                .addGap(18, 18, 18)
                .addComponent(REGBVEliminarVenta)
                .addGap(18, 18, 18)
                .addComponent(REGBVEditarVenta)
                .addGap(33, 33, 33))
            .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(VENTAS)
                    .addContainerGap(324, Short.MAX_VALUE)))
            .addGroup(RegistroPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentasLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(REGScrollVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroPanelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroPanelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegistroPanelVentas1.setBackground(new java.awt.Color(66, 96, 87));

        TablaClienteFrecuente3.setAutoCreateRowSorter(true);
        TablaClienteFrecuente3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Nombre", "Precio", "ProdVend"
            }
        ));
        TablaClienteFrecuente3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        TablaClienteFrecuente3.setColumnSelectionAllowed(true);
        TablaClienteFrecuente3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaClienteFrecuente3.setShowHorizontalLines(true);
        TablaClienteFrecuente3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TablaClienteFrecuente3ComponentAdded(evt);
            }
        });
        REGScrollVentas1.setViewportView(TablaClienteFrecuente3);
        TablaClienteFrecuente3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        REGBVEditarVenta1.setBackground(new java.awt.Color(215, 201, 134));
        REGBVEditarVenta1.setText("EDITAR");
        REGBVEditarVenta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVEditarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVEditarVenta1ActionPerformed(evt);
            }
        });

        REGBVEliminarVenta1.setBackground(new java.awt.Color(215, 139, 134));
        REGBVEliminarVenta1.setText("ELIMINAR");
        REGBVEliminarVenta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVEliminarVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVEliminarVenta1ActionPerformed(evt);
            }
        });

        REGBVAnadirVenta1.setBackground(new java.awt.Color(176, 215, 134));
        REGBVAnadirVenta1.setText("AÑADIR");
        REGBVAnadirVenta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGBVAnadirVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBVAnadirVenta1ActionPerformed(evt);
            }
        });

        VENTAS1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        VENTAS1.setForeground(new java.awt.Color(215, 215, 153));
        VENTAS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VENTAS1.setText("V E N T A S");

        javax.swing.GroupLayout RegistroPanelVentas1Layout = new javax.swing.GroupLayout(RegistroPanelVentas1);
        RegistroPanelVentas1.setLayout(RegistroPanelVentas1Layout);
        RegistroPanelVentas1Layout.setHorizontalGroup(
            RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPanelVentas1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addGroup(RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroPanelVentas1Layout.createSequentialGroup()
                        .addComponent(REGBVAnadirVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelVentas1Layout.createSequentialGroup()
                        .addGroup(RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(REGBVEliminarVenta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(REGBVEditarVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                        .addGap(217, 217, 217))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelVentas1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(REGScrollVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentas1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(VENTAS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(61, 61, 61)))
        );
        RegistroPanelVentas1Layout.setVerticalGroup(
            RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroPanelVentas1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(REGScrollVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(REGBVAnadirVenta1)
                .addGap(18, 18, 18)
                .addComponent(REGBVEliminarVenta1)
                .addGap(18, 18, 18)
                .addComponent(REGBVEditarVenta1)
                .addGap(33, 33, 33))
            .addGroup(RegistroPanelVentas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(RegistroPanelVentas1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(VENTAS1)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroPanelVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroPanelVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaClienteFrecuente2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaClienteFrecuente2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaClienteFrecuente2ComponentAdded

    private void REGBVEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVEditarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVEditarVentaActionPerformed

    private void REGBVEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVEliminarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVEliminarVentaActionPerformed

    private void REGBVAnadirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVAnadirVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVAnadirVentaActionPerformed

    private void TablaClienteFrecuente3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaClienteFrecuente3ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaClienteFrecuente3ComponentAdded

    private void REGBVEditarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVEditarVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVEditarVenta1ActionPerformed

    private void REGBVEliminarVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVEliminarVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVEliminarVenta1ActionPerformed

    private void REGBVAnadirVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBVAnadirVenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBVAnadirVenta1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGBVAnadirVenta;
    private javax.swing.JButton REGBVAnadirVenta1;
    private javax.swing.JButton REGBVEditarVenta;
    private javax.swing.JButton REGBVEditarVenta1;
    private javax.swing.JButton REGBVEliminarVenta;
    private javax.swing.JButton REGBVEliminarVenta1;
    private javax.swing.JScrollPane REGScrollVentas;
    private javax.swing.JScrollPane REGScrollVentas1;
    private javax.swing.JPanel RegistroPanelVentas;
    private javax.swing.JPanel RegistroPanelVentas1;
    private javax.swing.JTable TablaClienteFrecuente2;
    private javax.swing.JTable TablaClienteFrecuente3;
    private javax.swing.JLabel VENTAS;
    private javax.swing.JLabel VENTAS1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    // End of variables declaration//GEN-END:variables
}
