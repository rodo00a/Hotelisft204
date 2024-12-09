  
package com.aquinoasaro.hotelisft204.vista;

import com.aquinoasaro.hotelisft204.modelo.Controlador;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RegistroVista extends javax.swing.JFrame {

   Controlador control = new Controlador(); 
    private double telefono = 0;
    private double documento = 0;
    public RegistroVista() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        lblContrasena = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnRestablecer = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        lblDocumentoidentidad = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtDocumento = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistro.setText("Registro");
        lblRegistro.setPreferredSize(new java.awt.Dimension(200, 25));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre");
        lblNombre.setPreferredSize(new java.awt.Dimension(200, 25));

        txtTelefono.setToolTipText("Ingrese su telefono de contacto");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreo.setText("Correo Electronico");
        lblCorreo.setPreferredSize(new java.awt.Dimension(200, 25));

        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContrasena.setText("Contraseña");
        lblContrasena.setPreferredSize(new java.awt.Dimension(200, 25));

        btnIngreso.setText("Ingreso");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        txtNombre.setToolTipText("Ingrese su nombre");
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 25));

        btnRestablecer.setText("Limpiar");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        txtCorreo.setToolTipText("Ingrese su correo electronico");
        txtCorreo.setPreferredSize(new java.awt.Dimension(200, 25));

        lblDocumentoidentidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDocumentoidentidad.setText("DNI");

        txtContrasena.setText("jPasswordField1");
        txtContrasena.setToolTipText("Ingrese una contraseña");
        txtContrasena.setPreferredSize(new java.awt.Dimension(200, 25));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        txtDocumento.setToolTipText("Ingrese su documento de Identidad (DNI)");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApellido.setText("Apellido");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefono.setText("Telefono");

        txtApellido.setToolTipText("Ingrese su apellido");

        btnCerrar.setText("Volver");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDocumentoidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDocumento)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoidentidad)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnIngreso)
                    .addComponent(btnRestablecer))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        
         String apellido = txtApellido.getText();
         String nombre = txtNombre.getText();
       
        String dniStr = txtDocumento.getText(); 
        // double dni = 0.0;
    try {
        documento = Double.parseDouble(dniStr);
    } catch (NumberFormatException e) {
        // Manejar el error, por ejemplo, mostrar un mensaje de error al usuario
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI.");
        return; // O puedes tomar otras acciones, como limpiar el campo de texto
    }
        String telefonoStr = txtTelefono.getText();
            try {
        telefono = Double.parseDouble(telefonoStr);
    } catch (NumberFormatException e) {
        // Manejar el error, por ejemplo, mostrar un mensaje de error al usuario
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el telefono.");
        return; // O puedes tomar otras acciones, como limpiar el campo de texto
    }
        String CorreoElectronico = txtCorreo.getText();
       // String contrasena = txtContrasena.getText(); 
        
        
       try {
    control.crearPasajero(apellido, nombre, documento, telefono, CorreoElectronico);
    JOptionPane.showMessageDialog(null, "Pasajero creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
} catch (PreexistingEntityException ex) {
    JOptionPane.showMessageDialog(null, "Ya existe un pasajero con ese DNI.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Error al convertir los datos: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        IngresoVista princ = new IngresoVista();
     princ.setVisible(true);
     princ.setLocationRelativeTo(null);
     
     this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        
        txtApellido.setText("");
        txtNombre.setText("");
        txtDocumento.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
       
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
           IngresoVista princ = new IngresoVista();
     princ.setVisible(true);
     princ.setLocationRelativeTo(null);
     
     this.setVisible(false);
    }//GEN-LAST:event_btnIngresoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDocumentoidentidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
