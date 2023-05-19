package GUI;

import Clases.FabricaLogica;
import Clases.ILogica;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.TipoVegetacion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 * Frame para RegistrarHábitat.
 * @author Equipo04
 */
public class FrmRegistrarHabitat extends javax.swing.JFrame {

    ILogica logica;
    private DefaultListModel<Continente> disponiblesListModel = new DefaultListModel<>();
    private DefaultListModel<Continente> seleccionadosListModel = new DefaultListModel<>();
    Habitat hb = new Habitat();

    
    /**
     * Constructor por default para el frame FrmRegistrarHábitat.
     */
    public FrmRegistrarHabitat() {

        logica = FabricaLogica.crearInstancia();

        initComponents();

        listaDisponibles.setModel(disponiblesListModel);
        listaSeleccionados.setModel(seleccionadosListModel);

    }

    /**
     * Constructor con parámetros para el frame RegistrarHábitat.
     * @param clima Lista con todos los climas que se tengan registrados.
     * @param continentes Lista con todos los continentes que se tengan registrados.
     * @param vege Lista con todas las vegetaciones que se tengan registrados.
     */
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

        jPanel1 = new javax.swing.JPanel();
        txtHabitat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbClima = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbVegetacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDisponibles = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSeleccionados = new javax.swing.JList<>();
        btnagregar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        selecGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtHabitat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHabitatKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        btnVerificar.setBackground(new java.awt.Color(153, 153, 153));
        btnVerificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Favor de llenar los siguientes campos");

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(263, 67));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrar hábitat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Clima:");

        cmbClima.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Vegetación:");

        cmbVegetacion.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Continentes");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Disponibles");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Seleccionados");

        listaDisponibles.setEnabled(false);
        jScrollPane1.setViewportView(listaDisponibles);

        listaSeleccionados.setEnabled(false);
        jScrollPane2.setViewportView(listaSeleccionados);

        btnagregar.setBackground(new java.awt.Color(153, 153, 153));
        btnagregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.setEnabled(false);
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(153, 153, 153));
        btneliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        selecGuardar.setBackground(new java.awt.Color(153, 153, 153));
        selecGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        selecGuardar.setText("Guardar");
        selecGuardar.setEnabled(false);
        selecGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(153, 153, 153));
        btnRegresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tigre.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnVerificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(268, 359, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbVegetacion, 0, 142, Short.MAX_VALUE)
                                    .addComponent(cmbClima, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerificar)
                            .addComponent(jLabel3)
                            .addComponent(cmbClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecGuardar)
                                .addGap(44, 44, 44)
                                .addComponent(btnRegresar)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btneliminar))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón para verificar que los campos han sido llenados.De ser así se guardarán los datos, de lo contrario saltará un error.
     * @param evt Evento que acciona el botón.
     */
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


    /**
     * Botón para verificar el nombre ingresado por el usuario en el campo txtHabitat
     * .De haber un registro que coincida con lo escrito, saltará una pantalla con la información del hábitat,
     * de lo contrario se habilitarán los campos para rellenar la información de registro.
     * @param evt Evento que acciona el botón.
     */
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

    /**
     * Botón para pasar un registro de continente de la lista "Disponibles" a "Seleccionados".
     * @param evt Evento que acciona el botón.
     */
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        int i = listaDisponibles.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModel.addElement(disponiblesListModel.getElementAt(i));
            disponiblesListModel.remove(i);

        }

    }//GEN-LAST:event_btnagregarActionPerformed

    /**
     * Botón para eliminar un registro de continente de la lista "Seleccionados" a "Disponibles".
     * @param evt Evento que acciona el botón.
     */
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int i = listaSeleccionados.getSelectedIndex();
        if (i != -1) {
            disponiblesListModel.addElement(seleccionadosListModel.getElementAt(i));
            seleccionadosListModel.remove(i);
        }


    }//GEN-LAST:event_btneliminarActionPerformed


    /**
     * Botón que te permite regresar al frame FrmInicial.
     * @param evt Evento que acciona el botón.
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmInicial fi = new FrmInicial();
        fi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtHabitatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHabitatKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_SPACE) {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
        }
        txtHabitat.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtHabitat.getText().length() >= 20) {
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_txtHabitatKeyTyped

    /**
     * Método que añadirá a los comboBox de Clima, Vegetación y Continentes los datos recuperados en las listas de sus respectivos objetos.
     * @param clima Lista con todos los objetos tipo Clima registrados.
     * @param continentes Lista con todos los objetos tipo Continente registrados.
     * @param vege Lista con todos los objetos tipo TipoVegetacion registrados.
     */
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

    /**
     * Método para mostrar los datos de un hábitat que ya haya sido registrado. 
     * @param habitat Objeto tipo Habitat del cual se mostrarán los datos.
     */
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

    /**
     * Método que activará los campos para rellenar del frame.
     */
    public void activaCampos() {
        cmbClima.setEnabled(true);
        cmbVegetacion.setEnabled(true);
        listaDisponibles.setEnabled(true);
        listaSeleccionados.setEnabled(true);
        btnagregar.setEnabled(true);
        btneliminar.setEnabled(true);
        selecGuardar.setEnabled(true);
    }

    /**
     * Método que verificará si todos los campos rellenables tienen algún registro en ellos.
     * @return De estar llenos todos los campos, se regresará un boolean con valor True, de lo contrario se regresará un False y un mensaje de error.
     */
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

    /**
     * Método para mostrar un mensaje de error respecto al Hábitat.
     */
    public void muestraError() {
        JOptionPane.showMessageDialog(this, "Habitat existente", "Mensaje error", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Método para mostrar un mensaje de éxito respecto al Hábitat.
     */
    public void muestraMensajeExitoso() {
        JOptionPane.showMessageDialog(this, "Habitat Registrada", "Mensaje Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que retornará a la posición inicial la lista de continenes de "Disponibles" y vaciará la lista "Seleccionados".
     */
    public void reiniciaContinentes() {
       
       while(!seleccionadosListModel.isEmpty()){
             disponiblesListModel.addElement(seleccionadosListModel.getElementAt(0));

                seleccionadosListModel.remove(0);
             
       }
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Continente> listaDisponibles;
    private javax.swing.JList<Continente> listaSeleccionados;
    private javax.swing.JButton selecGuardar;
    private javax.swing.JTextField txtHabitat;
    // End of variables declaration//GEN-END:variables
}
