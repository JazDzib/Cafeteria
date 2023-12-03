/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Jazmin Dzib
 */
public class RegistroDatosC extends javax.swing.JPanel {

    /**
     * Creates new form RegistroDatosC
     */
    public RegistroDatosC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroPanelRegistroClientes = new javax.swing.JPanel();
        FieldNombreTitulo = new javax.swing.JLabel();
        AddClienteNombre = new javax.swing.JTextField();
        REGISTRODECLIENTE = new javax.swing.JLabel();
        FieldApellidoTitulo = new javax.swing.JLabel();
        AddClienteApellido = new javax.swing.JTextField();
        FielEdadTitulo = new javax.swing.JLabel();
        FieldDomicilioTitulo = new javax.swing.JLabel();
        AddClienteDomicilio = new javax.swing.JTextField();
        FieldCorreoTitulo = new javax.swing.JLabel();
        AddClienteCorreo = new javax.swing.JTextField();
        FieldTelefonoTitulo = new javax.swing.JLabel();
        AddClienteNumero = new javax.swing.JTextField();
        REGBAnadirCliente = new javax.swing.JButton();
        AddClienteEdad = new javax.swing.JTextField();
        REGBActualizarCliente = new javax.swing.JButton();

        RegistroPanelRegistroClientes.setBackground(new java.awt.Color(66, 96, 87));
        RegistroPanelRegistroClientes.setPreferredSize(new java.awt.Dimension(820, 355));

        FieldNombreTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FieldNombreTitulo.setText("Nombre:");

        AddClienteNombre.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteNombreActionPerformed(evt);
            }
        });

        REGISTRODECLIENTE.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        REGISTRODECLIENTE.setForeground(new java.awt.Color(215, 215, 153));
        REGISTRODECLIENTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REGISTRODECLIENTE.setText("REGISTRO DE CLIENTE");
        REGISTRODECLIENTE.setToolTipText("");
        REGISTRODECLIENTE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        REGISTRODECLIENTE.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        REGISTRODECLIENTE.setFocusable(false);
        REGISTRODECLIENTE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        FieldApellidoTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FieldApellidoTitulo.setText("Apellido:");

        AddClienteApellido.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteApellidoActionPerformed(evt);
            }
        });

        FielEdadTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FielEdadTitulo.setText("Edad:");

        FieldDomicilioTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FieldDomicilioTitulo.setText("Domicilio:");

        AddClienteDomicilio.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteDomicilio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteDomicilioActionPerformed(evt);
            }
        });

        FieldCorreoTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FieldCorreoTitulo.setText("Correo electrónico:");

        AddClienteCorreo.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteCorreoActionPerformed(evt);
            }
        });

        FieldTelefonoTitulo.setForeground(new java.awt.Color(215, 215, 153));
        FieldTelefonoTitulo.setText("Teléfono:");

        AddClienteNumero.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteNumero.setText("(+52)");
        AddClienteNumero.setAutoscrolls(false);
        AddClienteNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddClienteNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteNumeroActionPerformed(evt);
            }
        });

        REGBAnadirCliente.setBackground(new java.awt.Color(192, 192, 136));
        REGBAnadirCliente.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        REGBAnadirCliente.setForeground(new java.awt.Color(94, 94, 46));
        REGBAnadirCliente.setText("Añadir");
        REGBAnadirCliente.setToolTipText("");
        REGBAnadirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        REGBAnadirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBAnadirClienteActionPerformed(evt);
            }
        });

        AddClienteEdad.setBackground(new java.awt.Color(248, 248, 185));
        AddClienteEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(174, 174, 126), 3, true));
        AddClienteEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClienteEdadActionPerformed(evt);
            }
        });

        REGBActualizarCliente.setBackground(new java.awt.Color(192, 192, 136));
        REGBActualizarCliente.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        REGBActualizarCliente.setForeground(new java.awt.Color(94, 94, 46));
        REGBActualizarCliente.setText("Actualizar");
        REGBActualizarCliente.setToolTipText("");
        REGBActualizarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        REGBActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGBActualizarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistroPanelRegistroClientesLayout = new javax.swing.GroupLayout(RegistroPanelRegistroClientes);
        RegistroPanelRegistroClientes.setLayout(RegistroPanelRegistroClientesLayout);
        RegistroPanelRegistroClientesLayout.setHorizontalGroup(
            RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPanelRegistroClientesLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroPanelRegistroClientesLayout.createSequentialGroup()
                        .addComponent(REGBAnadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(REGBActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroPanelRegistroClientesLayout.createSequentialGroup()
                            .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AddClienteCorreo)
                                .addComponent(FieldCorreoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                            .addGap(74, 74, 74)
                            .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FieldTelefonoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddClienteNumero)))
                        .addComponent(AddClienteDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FieldDomicilioTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroPanelRegistroClientesLayout.createSequentialGroup()
                            .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldNombreTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RegistroPanelRegistroClientesLayout.createSequentialGroup()
                                    .addComponent(FieldApellidoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))
                                .addComponent(AddClienteApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FielEdadTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddClienteEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(REGISTRODECLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegistroPanelRegistroClientesLayout.setVerticalGroup(
            RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroPanelRegistroClientesLayout.createSequentialGroup()
                .addComponent(REGISTRODECLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldNombreTitulo)
                    .addComponent(FieldApellidoTitulo)
                    .addComponent(FielEdadTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClienteApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClienteEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(FieldDomicilioTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddClienteDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCorreoTitulo)
                    .addComponent(FieldTelefonoTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddClienteCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddClienteNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroPanelRegistroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(REGBActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(REGBAnadirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(RegistroPanelRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(RegistroPanelRegistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddClienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteNombreActionPerformed

    private void AddClienteApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteApellidoActionPerformed

    private void AddClienteDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteDomicilioActionPerformed

    private void AddClienteCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteCorreoActionPerformed

    private void AddClienteNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteNumeroActionPerformed

    private void REGBAnadirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBAnadirClienteActionPerformed

        //agregarcliente();
        AddClienteNombre.setText("");
        AddClienteApellido.setText("");
        AddClienteEdad.setText("");
        AddClienteDomicilio.setText("");
        AddClienteCorreo.setText("");
        AddClienteNumero.setText("(+52)");

        /***
        curso video 18 lenght()[desde-hasta]
        */
    }//GEN-LAST:event_REGBAnadirClienteActionPerformed

    private void AddClienteEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClienteEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddClienteEdadActionPerformed

    private void REGBActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGBActualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGBActualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddClienteApellido;
    private javax.swing.JTextField AddClienteCorreo;
    private javax.swing.JTextField AddClienteDomicilio;
    private javax.swing.JTextField AddClienteEdad;
    private javax.swing.JTextField AddClienteNombre;
    private javax.swing.JTextField AddClienteNumero;
    private javax.swing.JLabel FielEdadTitulo;
    private javax.swing.JLabel FieldApellidoTitulo;
    private javax.swing.JLabel FieldCorreoTitulo;
    private javax.swing.JLabel FieldDomicilioTitulo;
    private javax.swing.JLabel FieldNombreTitulo;
    private javax.swing.JLabel FieldTelefonoTitulo;
    private javax.swing.JButton REGBActualizarCliente;
    private javax.swing.JButton REGBAnadirCliente;
    private javax.swing.JLabel REGISTRODECLIENTE;
    private javax.swing.JPanel RegistroPanelRegistroClientes;
    // End of variables declaration//GEN-END:variables
}