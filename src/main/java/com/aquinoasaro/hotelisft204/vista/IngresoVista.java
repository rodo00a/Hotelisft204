 
package com.aquinoasaro.hotelisft204.vista;

import javax.swing.JOptionPane;

public class IngresoVista extends javax.swing.JFrame {


    
    public IngresoVista() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtContrasena = new javax.swing.JPasswordField();
        lblIngreso = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIngreso = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtContrasena.setText("jPasswordField1");

        lblIngreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIngreso.setText("Ingreso");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreo.setText("Correo Electronico");

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContrasena.setText("Contraseña");

        txtCorreo.setToolTipText("Ingrese su correo electronico");

        btnIngreso.setText("Ingreso");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnIngreso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRegistro))
                        .addComponent(txtCorreo)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblIngreso)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContrasena)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngreso)
                    .addComponent(btnRegistro))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
    
    // Usuario usuarioActual = obtenerUsuarioActual(); // Método para obtener el usuario actual

    if (txtCorreo.getText().equals("admin@java.com")) {
       HabitacionVista vHab = new HabitacionVista();
       vHab.setVisible(true);
       vHab.setLocationRelativeTo(null);
        this.setVisible(false);
       
    } else {
       RegistroPasajeroVista vistaReg = new RegistroPasajeroVista();
        vistaReg.setVisible(true);
        vistaReg.setLocationRelativeTo(null);
         this.setVisible(false);
    }
    
    

    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       RegistroVista vRegistrar = new RegistroVista();
       vRegistrar.setVisible(true);
       vRegistrar.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

 
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
