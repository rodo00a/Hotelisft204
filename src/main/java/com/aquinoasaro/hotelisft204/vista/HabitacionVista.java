
package com.aquinoasaro.hotelisft204.vista;

import com.aquinoasaro.hotelisft204.modelo.Controlador;
import com.aquinoasaro.hotelisft204.modelo.Habitacion;
import com.aquinoasaro.hotelisft204.persistence.exceptions.PreexistingEntityException;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
  

public class HabitacionVista extends javax.swing.JFrame {

    Controlador control = null ;
    public HabitacionVista() {
        control = new Controlador();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumerohabitacion = new javax.swing.JLabel();
        btnHabitaciones = new javax.swing.JButton();
        txtNumerohabitacion = new javax.swing.JTextField();
        btnEntradapasajeros = new javax.swing.JButton();
        lblCamasimple = new javax.swing.JLabel();
        btnSalidapasajeros = new javax.swing.JButton();
        comboCamasimple = new javax.swing.JComboBox<>();
        btnFacturacion = new javax.swing.JButton();
        lblCamadoble = new javax.swing.JLabel();
        btnDesloguear = new javax.swing.JButton();
        comboCamadoble = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnCargahabitacion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ComboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNumerohabitacion.setText("Numero de Habitacion");

        btnHabitaciones.setText("Gestion Habitaciones");

        txtNumerohabitacion.setToolTipText("Ingrese el numero de habitacion");

        btnEntradapasajeros.setText("Registros Entrada");

        lblCamasimple.setText("Cantidad de camas simples");

        btnSalidapasajeros.setText("Registros Salida");

        comboCamasimple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));

        btnFacturacion.setText("Facturacion");

        lblCamadoble.setText("Cantidad de camas dobles");

        btnDesloguear.setText("Desloguear");

        comboCamadoble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        lblPrecio.setText("Precio por dia");

        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero Hab.", "Cant. Simples", "Cant. Dobles", "Precio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblHabitaciones);

        btnCerrar.setText("Volver");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCargahabitacion.setText("Agregar Habitacion");
        btnCargahabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargahabitacionActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupada", "Libre", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntradapasajeros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalidapasajeros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFacturacion))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCargahabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNumerohabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCamasimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCamadoble, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboCamasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboCamadoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                        .addComponent(btnDesloguear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHabitaciones)
                        .addComponent(btnDesloguear)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntradapasajeros)
                    .addComponent(btnSalidapasajeros)
                    .addComponent(btnFacturacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumerohabitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblCamasimple)
                        .addGap(18, 18, 18)
                        .addComponent(comboCamasimple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCamadoble)
                        .addGap(18, 18, 18)
                        .addComponent(comboCamadoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargahabitacion)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnCargahabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargahabitacionActionPerformed
        
        String numero = txtNumerohabitacion.getText();
        
        
        int camasSimples = Integer.parseInt(comboCamasimple.getSelectedItem().toString());
        int camasDobles = Integer.parseInt(comboCamadoble.getSelectedItem().toString());
        String precio = txtPrecio.getText();
        boolean estado = true;
      
         // Validar y convertir los datos según sea necesario (números, etc.)
        
            int numHab = Integer.parseInt(numero);
            double precioHab = Double.parseDouble(precio);
            //String ocupada = estado ? "true":"false";
            
            boolean ocupada = ComboEstado.getSelectedIndex() == 0; 
            /*if (tblHabitaciones.getSelectedItem().toString().equals("Ocupada")){
                ComboEstado.setSelectedIndex(0); 
            }
            else{
                if(tblHabitaciones.getSelectedItem().equals("Libre").toString()){
                    ComboEstado.setSelectedIndex(1);
                }
            }*/
          control.crearHabitacion(numHab, camasSimples, camasDobles, (int) precioHab, ocupada);
            
// Agregar los datos a la tabla
            Object[] nuevaFila = {numero, camasSimples, camasDobles, precio, estado,  };
            DefaultTableModel model = (DefaultTableModel) tblHabitaciones.getModel();
            model.addRow(nuevaFila);

         
            
    }//GEN-LAST:event_btnCargahabitacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //controlo que la trabla no este vacia
        if (tblHabitaciones.getRowCount() > 0){
            //contrla que se haya seleccionado una istancia
            if(tblHabitaciones.getSelectedRow()!=-1){
                //obtengo el Id de la habitacion a borra
                int Id = Integer.parseInt(String.valueOf(tblHabitaciones.getValueAt(tblHabitaciones.getSelectedRow(), 0)));
                //llamo al metodo borra
                control.borrarHabitacion(Id);

                // aviso al usuario que borró correctamente
                mostrarMensaje("Habitacion eliminada correctamente", "Info", "Borrado de Habitacion");

                cargarTabla();

            }
            else {
                mostrarMensaje("no selecciobo ninguna habitacion", "Error", "Error al seleccionar");
            }
        }
        else {
            mostrarMensaje("no hay nada para eliminar en esta tabla", "Error", "Error al seleccionar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
     IngresoVista princ = new IngresoVista();
     princ.setVisible(true);
     princ.setLocationRelativeTo(null);
     this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed
       public void mostrarMensaje(String mensaje, String tipo, String titulo) {
    JOptionPane optionPane = new JOptionPane(mensaje);

    if (tipo.equals("Info")) {
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    } else if (tipo.equals("Error")) {
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }

    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);     
       }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JButton btnCargahabitacion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDesloguear;
    private javax.swing.JButton btnEntradapasajeros;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnSalidapasajeros;
    private javax.swing.JComboBox<String> comboCamadoble;
    private javax.swing.JComboBox<String> comboCamasimple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamadoble;
    private javax.swing.JLabel lblCamasimple;
    private javax.swing.JLabel lblNumerohabitacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTextField txtNumerohabitacion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
            
       /* DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        
        };
        
        String titulos[]= {"Numero","Cant. Simples", "Cant. Dobles","Precio", "Estado"};
        tblHabitaciones.setColumnIdentifiers(titulos);*/
            DefaultTableModel tabla = new DefaultTableModel(
            new Object[][] {},
            new String[] { "Numero","Cant. Simples", "Cant. Dobles","Precio", "Ocupada"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
       
        List<Habitacion> listaHabs = control.traerHabs ();   
        
        if (listaHabs!=null){
        for (Habitacion habs : listaHabs ){
            Object[] objeto = {habs.getNumero(),habs.getCamasSingle(), habs.getCamasDobles(),
            habs.getPrecio(),habs.getReservas()};
            
            tabla.addRow(objeto);
                                           }
        }
          tblHabitaciones.setModel(tabla);                      }
    
}