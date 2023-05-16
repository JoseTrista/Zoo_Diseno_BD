package GUI;

import Clases.FabricaLogica;
import Clases.ILogica;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.TipoVegetacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class FrmRegistrarHabitat extends javax.swing.JFrame {

    ILogica logica;
    private DefaultListModel<Continente> disponiblesListModel = new DefaultListModel<>();
    private DefaultListModel<Continente> seleccionadosListModel = new DefaultListModel<>();
    Habitat hb = new Habitat();

    public FrmRegistrarHabitat() {

        logica = FabricaLogica.crearInstancia();

        initComponents();

        listaDisponibles.setModel(disponiblesListModel);
        listaSeleccionados.setModel(seleccionadosListModel);

    }

    public FrmRegistrarHabitat(List<Clima> clima, List<Continente> continentes, List<TipoVegetacion> vege) {

        logica = FabricaLogica.crearInstancia();

        initComponents();

        listaDisponibles.setModel(disponiblesListModel);
        listaSeleccionados.setModel(seleccionadosListModel);
        despliegaDatosRecuperados(clima, continentes, vege);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHabitat = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbClima = new javax.swing.JComboBox<>();
        cmbVegetacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selecGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDisponibles = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSeleccionados = new javax.swing.JList<>();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Favor de llenar los siguientes campos");

        jLabel3.setText("Clima");

        jLabel4.setText("Vegetación");

        cmbClima.setEnabled(false);

        cmbVegetacion.setEnabled(false);
        cmbVegetacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVegetacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Continentes");

        jLabel6.setText("Seleccionados");

        selecGuardar.setText("Guardar");
        selecGuardar.setEnabled(false);
        selecGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecGuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Registrar hábitat");

        listaDisponibles.setEnabled(false);
        jScrollPane1.setViewportView(listaDisponibles);

        listaSeleccionados.setEnabled(false);
        jScrollPane2.setViewportView(listaSeleccionados);

        btnagregar.setText("Agregar");
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Disponibles");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbVegetacion, 0, 116, Short.MAX_VALUE)
                            .addComponent(cmbClima, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(133, 133, 133)
                                .addComponent(btneliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selecGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnVerificar)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecGuardar)
                    .addComponent(btnRegresar))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selecGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecGuardarActionPerformed
        if (verificaCamposLlenos()) {
            if (hb == null) {
                hb = new Habitat();
            }
            if (logica.verificaNombreHabitat(txtHabitat.getText()) != null) {
                muestraError();
                return;
            }
            List<Continente> seleccionados = new ArrayList<>();
            for (int i = 0; i < seleccionadosListModel.size(); i++) {
                seleccionados.add(seleccionadosListModel.get(i));
            }
            hb.setClima2((Clima) cmbClima.getSelectedItem());
            hb.setVegetacion2((TipoVegetacion) cmbVegetacion.getSelectedItem());
            hb.setContinentes(seleccionados);
            hb.setNombre(txtHabitat.getText());
            logica.guardarHabitat(hb);
            muestraMensajeExitoso();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
        }


    }//GEN-LAST:event_selecGuardarActionPerformed


    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (this.txtHabitat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese nombre de el habitat a verificar");
        } else {
            reiniciaContinentes();
            hb = logica.verificaNombreHabitat(txtHabitat.getText());
            System.out.println(hb);
            if (hb != null) {
                muestraDatosHabitat(hb);
            } else {
                activaCampos();
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        int i = listaDisponibles.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModel.addElement(disponiblesListModel.getElementAt(i));
            disponiblesListModel.remove(i);

        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int i = listaSeleccionados.getSelectedIndex();
        if (i != -1) {
            disponiblesListModel.addElement(seleccionadosListModel.getElementAt(i));
            seleccionadosListModel.remove(i);
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void cmbVegetacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVegetacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVegetacionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmInicial fi = new FrmInicial();
        fi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public void despliegaDatosRecuperados(List<Clima> clima, List<Continente> continentes, List<TipoVegetacion> vege) {
        for (int i = 0; i < clima.size(); i++) {
            cmbClima.addItem(clima.get(i));
        }

        for (int i = 0; i < vege.size(); i++) {
            cmbVegetacion.addItem(vege.get(i));
        }
        for (int i = 0; i < continentes.size(); i++) {
            disponiblesListModel.addElement(continentes.get(i));
        }
    }

    public void muestraDatosHabitat(Habitat habitat) {
        cmbClima.setSelectedItem(habitat.getClima2());
        cmbVegetacion.setSelectedItem(habitat.getVegetacion2());

//        // Limpiar las listas de continentes disponibles y seleccionados
//        disponiblesListModel.clear();
//        seleccionadosListModel.clear();
        // Agregar los continentes disponibles
        
       
        List<Continente> continentesHabitat = habitat.getContinentes();
        for (Continente continente : continentesHabitat) {
            for (int i = 0; i < disponiblesListModel.size(); i++) {
                if (disponiblesListModel.get(i).equals(continente)) {
                    seleccionadosListModel.addElement(continente);
                    disponiblesListModel.removeElement(continente);
                }
            }
        }

//        // Agregar los continentes seleccionados
//        List<Continente> seleccionados = habitat.getContinentes();
//        for (Continente continente : seleccionados) {
//            seleccionadosListModel.addElement(continente);
//        }
        cmbClima.setEnabled(false);
        cmbVegetacion.setEnabled(false);
        listaDisponibles.setEnabled(false);
        listaSeleccionados.setEnabled(false);
        btnagregar.setEnabled(false);
        btneliminar.setEnabled(false);
        selecGuardar.setEnabled(false);
    }

    public void activaCampos() {
        cmbClima.setEnabled(true);
        cmbVegetacion.setEnabled(true);
        listaDisponibles.setEnabled(true);
        listaSeleccionados.setEnabled(true);
        btnagregar.setEnabled(true);
        btneliminar.setEnabled(true);
        selecGuardar.setEnabled(true);
    }

    public boolean verificaCamposLlenos() {
        String nombre = txtHabitat.getText();
        Clima clima = (Clima) cmbClima.getSelectedItem();
        TipoVegetacion vegetacion = (TipoVegetacion) cmbVegetacion.getSelectedItem();
        if (nombre.isEmpty() || clima == null || vegetacion == null || seleccionadosListModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
            return false;
        } else {
            return true;
        }
    }

    public void muestraError() {
        JOptionPane.showMessageDialog(this, "Habitat existente", "Mensaje error", JOptionPane.INFORMATION_MESSAGE);
    }

    public void muestraMensajeExitoso() {
        JOptionPane.showMessageDialog(this, "Habitat Registrada", "Mensaje Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void reiniciaContinentes() {
       
       while(!seleccionadosListModel.isEmpty()){
             disponiblesListModel.addElement(seleccionadosListModel.getElementAt(0));

                seleccionadosListModel.remove(0);
             
       }
    }

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
            java.util.logging.Logger.getLogger(FrmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //       new FrmRegistrarHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox<Clima> cmbClima;
    private javax.swing.JComboBox<TipoVegetacion> cmbVegetacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Continente> listaDisponibles;
    private javax.swing.JList<Continente> listaSeleccionados;
    private javax.swing.JButton selecGuardar;
    private javax.swing.JTextField txtHabitat;
    // End of variables declaration//GEN-END:variables
}
