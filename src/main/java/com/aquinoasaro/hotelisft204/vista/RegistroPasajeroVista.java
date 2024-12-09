  
package com.aquinoasaro.hotelisft204.vista;

import javax.swing.JOptionPane;

public class RegistroPasajeroVista extends javax.swing.JFrame {


    public RegistroPasajeroVista() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrecio = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNumerohabitacion = new javax.swing.JTextField();
        btnReservahabitacion = new javax.swing.JButton();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        lvlApellido = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        lblNumerohabitacion = new javax.swing.JLabel();
        lblCamasimple = new javax.swing.JLabel();
        comboCamasimple = new javax.swing.JComboBox<>();
        lblCamadoble = new javax.swing.JLabel();
        comboCamaDoble = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        lblRegistroPasajero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("DOCUMENTO");

        btnReservahabitacion.setText("Reservar Habitacion");
        btnReservahabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservahabitacionActionPerformed(evt);
            }
        });

        lblDni.setText("Fecha Salida");

        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lvlApellido.setText("Fecha Ingreso");

        lblNumerohabitacion.setText("Numero Habitacion");

        lblCamasimple.setText("Cantidad Camas Simples");

        comboCamasimple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", " " }));

        lblCamadoble.setText("Cantidad Camas Dobles");

        comboCamaDoble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        lblPrecio.setText("Precio por Dia");

        btnBorrar.setText("Borrar");

        lblRegistroPasajero.setText("Registro Pasajero (Check in)");
        lblRegistroPasajero.setName("lblRegistroPasajero"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReservahabitacion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtFechaSalida)
                                    .addComponent(txtDni)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lvlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboCamasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCamaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumerohabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumerohabitacion)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(lblCamasimple, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblCamadoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistroPasajero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblRegistroPasajero))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lvlApellido)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(lblCamadoble))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCamaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecio)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumerohabitacion)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCamasimple)
                        .addGap(18, 18, 18)
                        .addComponent(comboCamasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnReservahabitacion)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservahabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservahabitacionActionPerformed
     
     String dniStr = txtDni.getText(); 
         double dni = 0.0;
    try {
        dni = Double.parseDouble(dniStr);
    } catch (NumberFormatException e) {
        // Manejar el error, por ejemplo, mostrar un mensaje de error al usuario
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI.");
        return; // O puedes tomar otras acciones, como limpiar el campo de texto
    }   
     String fechaIngreso = txtFechaIngreso.getText();
     String fechaSalida = txtFechaSalida.getText();
     
     
     
    }//GEN-LAST:event_btnReservahabitacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       IngresoVista princ = new IngresoVista();
     princ.setVisible(true);
     princ.setLocationRelativeTo(null);
     
     this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnReservahabitacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboCamaDoble;
    private javax.swing.JComboBox<String> comboCamasimple;
    private javax.swing.JLabel lblCamadoble;
    private javax.swing.JLabel lblCamasimple;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumerohabitacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRegistroPasajero;
    private javax.swing.JLabel lvlApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtNumerohabitacion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
