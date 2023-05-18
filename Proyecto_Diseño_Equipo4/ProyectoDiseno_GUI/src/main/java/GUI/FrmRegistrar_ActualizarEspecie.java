/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clases.FabricaLogica;
import Clases.ILogica;
import Dominio.Animal;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import Dominio.ZonaDelParque;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo4
 */
public class FrmRegistrar_ActualizarEspecie extends javax.swing.JFrame {

    ILogica logica;
    private DefaultListModel<Cuidador> disponiblesListModelCuidador = new DefaultListModel<>();
    private DefaultListModel<Cuidador> seleccionadosListModelCuidador = new DefaultListModel<>();
    private DefaultListModel<Habitat> disponiblesListModelHabitat = new DefaultListModel<>();
    private DefaultListModel<Habitat> seleccionadosListModelHabitat = new DefaultListModel<>();
    Especie sp = new Especie();
    List<Animal> animalesAgregados = new ArrayList<>();

    public FrmRegistrar_ActualizarEspecie() {
        logica = FabricaLogica.crearInstancia();
        initComponents();

        listaDisponiblesCuidadores.setModel(disponiblesListModelCuidador);
        listaSeleccionadosCuidadores.setModel(seleccionadosListModelCuidador);

        listaDisponiblesHabitats.setModel(disponiblesListModelHabitat);
        listaSeleccionadosHabitats.setModel(seleccionadosListModelHabitat);
        this.desactivaCampos();
    }

    public FrmRegistrar_ActualizarEspecie(List<Cuidador> ListCuidador, List<Habitat> ListHabitat, List<ZonaDelParque> ListZona) {
        logica = FabricaLogica.crearInstancia();
        initComponents();

        listaDisponiblesCuidadores.setModel(disponiblesListModelCuidador);
        listaSeleccionadosCuidadores.setModel(seleccionadosListModelCuidador);

        listaDisponiblesHabitats.setModel(disponiblesListModelHabitat);
        listaSeleccionadosHabitats.setModel(seleccionadosListModelHabitat);
        despliegaDatosEspecie(ListCuidador, ListHabitat, ListZona);
        this.desactivaCampos();

    }

    public void despliegaDatosEspecie(List<Cuidador> ListCuidador, List<Habitat> ListHabitat, List<ZonaDelParque> ListZona) {
        for (int i = 0; i < ListCuidador.size(); i++) {
            disponiblesListModelCuidador.addElement(ListCuidador.get(i));
        }

        for (int i = 0; i < ListHabitat.size(); i++) {
            disponiblesListModelHabitat.addElement(ListHabitat.get(i));
        }

        for (int i = 0; i < ListZona.size(); i++) {
            cmbZonas.addItem(ListZona.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVerficar = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCientifico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEditarAnimales = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDisponiblesCuidadores = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDisponiblesHabitats = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaSeleccionadosCuidadores = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaSeleccionadosHabitats = new javax.swing.JList<>();
        btnAgregarCuidador = new javax.swing.JButton();
        btnEliminarCuidador = new javax.swing.JButton();
        btnAgregarHabitat = new javax.swing.JButton();
        btnEliminarHabitat = new javax.swing.JButton();
        cmbZonas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre especie animal:");

        btnVerificar.setBackground(new java.awt.Color(153, 153, 153));
        btnVerificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVerificar.setText("Verificar especie");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre científico especie:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Habitat:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cuidador");

        btnEditarAnimales.setText("EditarAnimales");
        btnEditarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAnimalesActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaDisponiblesCuidadores);

        jScrollPane3.setViewportView(listaDisponiblesHabitats);

        jScrollPane4.setViewportView(listaSeleccionadosCuidadores);

        jScrollPane5.setViewportView(listaSeleccionadosHabitats);

        btnAgregarCuidador.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarCuidador.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAgregarCuidador.setText("Agregar cuidador");
        btnAgregarCuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuidadorActionPerformed(evt);
            }
        });

        btnEliminarCuidador.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarCuidador.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminarCuidador.setText("Eliminar Cuidador");
        btnEliminarCuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuidadorActionPerformed(evt);
            }
        });

        btnAgregarHabitat.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarHabitat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAgregarHabitat.setText("Agregar habitat");
        btnAgregarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabitatActionPerformed(evt);
            }
        });

        btnEliminarHabitat.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarHabitat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminarHabitat.setText("Eliminar habitat");
        btnEliminarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabitatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Zonas del Parque:");

        btnGuardar.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandarojo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(331, 331, 331)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(77, 77, 77)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVerficar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarAnimales)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarCuidador)
                                    .addComponent(btnAgregarCuidador))))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerificar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarHabitat)
                            .addComponent(btnAgregarHabitat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVerficar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cmbZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAgregarCuidador)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCuidador)
                        .addGap(474, 474, 474)
                        .addComponent(btnEditarAnimales))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnAgregarHabitat)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarHabitat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Especie");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (this.txtVerficar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese nombre de la especie a verificar");
        }else{
            reiniciaCuidadores();
            reiniciaHabitats();
            sp = logica.verificaNombreEspecie(txtVerficar.getText());
            System.out.println(sp);
            if (sp != null) {
                JOptionPane.showMessageDialog(this, "Especie Encontrada");
                muestraDatosEspecie(sp);
                desactivaCampos();
            } else {
                txtDescripcion.setText("");
                txtNombreCientifico.setText("");
                activaCampos();
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnAgregarCuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuidadorActionPerformed
        // TODO add your handling code here:
        int i = listaDisponiblesCuidadores.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModelCuidador.addElement(disponiblesListModelCuidador.getElementAt(i));
            disponiblesListModelCuidador.remove(i);
        }
    }//GEN-LAST:event_btnAgregarCuidadorActionPerformed

    private void btnAgregarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabitatActionPerformed
        // TODO add your handling code here:
        int i = listaDisponiblesHabitats.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModelHabitat.addElement(disponiblesListModelHabitat.getElementAt(i));
            disponiblesListModelHabitat.remove(i);
        }
    }//GEN-LAST:event_btnAgregarHabitatActionPerformed

    private void btnEliminarCuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuidadorActionPerformed
        // TODO add your handling code here:
        int i = listaSeleccionadosCuidadores.getSelectedIndex();
        if (i != -1) {
            disponiblesListModelCuidador.addElement(seleccionadosListModelCuidador.getElementAt(i));
            seleccionadosListModelCuidador.remove(i);
        }
    }//GEN-LAST:event_btnEliminarCuidadorActionPerformed

    private void btnEliminarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabitatActionPerformed
        // TODO add your handling code here:
        int i = listaSeleccionadosHabitats.getSelectedIndex();
        if (i != -1) {
            disponiblesListModelHabitat.addElement(seleccionadosListModelHabitat.getElementAt(i));
            seleccionadosListModelHabitat.remove(i);
        }
    }//GEN-LAST:event_btnEliminarHabitatActionPerformed

    private void btnEditarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAnimalesActionPerformed
        FrmEditarAnimales fEditar = new FrmEditarAnimales(this);
        fEditar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarAnimalesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (verificaCamposLlenos()) {
            if (sp == null) {
                sp = new Especie();
            }

//             if (logica.verificaNombreEspecie(txtVerficar.getText()) != null) {
//                muestraError();
//                return;
//            }
//            
            // logica.verificaNombreEspecie(txtVerficar.getText()!=null)
            if (logica.verificaNombreEspecie(txtVerficar.getText()) != null) {
                muestraError();
                return;
            }
            List<Cuidador> seleccionadosCuidadores = new ArrayList<>();
            for (int i = 0; i < seleccionadosListModelCuidador.size(); i++) {
                seleccionadosCuidadores.add(seleccionadosListModelCuidador.get(i));
            }

            List<Habitat> seleccionadosHabitat = new ArrayList<>();
            for (int i = 0; i < seleccionadosListModelHabitat.size(); i++) {
                seleccionadosHabitat.add(seleccionadosListModelHabitat.get(i));
            }

            sp.setNombre(txtVerficar.getText());
            sp.setDescripcion(txtDescripcion.getText());
            sp.setNombreCientifico(txtNombreCientifico.getText());
            // sp.setClima2((Clima) cmbClima.getSelectedItem());

            sp.setCuidadores(seleccionadosCuidadores);
            sp.setHabitats(seleccionadosHabitat);
            logica.guardarEspecie(sp);

            muestraMensajeExitoso();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmInicial fi = new FrmInicial();
        fi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public boolean verificaCamposLlenos() {
        
        String desc = txtDescripcion.getText();
        String nCien = txtNombreCientifico.getText();
        ZonaDelParque zon = (ZonaDelParque) cmbZonas.getSelectedItem();

        if ( zon == null || desc.isEmpty() || nCien.isEmpty() || seleccionadosListModelCuidador.isEmpty() || seleccionadosListModelHabitat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
            return false;
        } else {
            return true;
        }
    }

    public void activaCampos() {
        txtDescripcion.setEnabled(true);
        txtNombreCientifico.setEnabled(true);
        
        cmbZonas.setEnabled(true);
        btnAgregarCuidador.setEnabled(true);
        btnAgregarHabitat.setEnabled(true);
        btnEliminarCuidador.setEnabled(true);
        btnEliminarHabitat.setEnabled(true);
        listaDisponiblesCuidadores.setEnabled(true);
        listaDisponiblesHabitats.setEnabled(true);
        listaSeleccionadosCuidadores.setEnabled(true);
        listaSeleccionadosHabitats.setEnabled(true);
    }

    public void desactivaCampos() {
        txtDescripcion.setEnabled(false);
        txtNombreCientifico.setEnabled(false);
        
        cmbZonas.setEnabled(false);
        btnAgregarCuidador.setEnabled(false);
        btnAgregarHabitat.setEnabled(false);
        btnEliminarCuidador.setEnabled(false);
        btnEliminarHabitat.setEnabled(false);
        listaDisponiblesCuidadores.setEnabled(false);
        listaDisponiblesHabitats.setEnabled(false);
        listaSeleccionadosCuidadores.setEnabled(false);
        listaSeleccionadosHabitats.setEnabled(false);
    }

    public void reiniciaCuidadores() {

        while (!seleccionadosListModelCuidador.isEmpty()) {
            disponiblesListModelCuidador.addElement(seleccionadosListModelCuidador.getElementAt(0));

            seleccionadosListModelCuidador.remove(0);

        }
    }

    public void reiniciaHabitats() {

        while (!seleccionadosListModelHabitat.isEmpty()) {
            disponiblesListModelHabitat.addElement(seleccionadosListModelHabitat.getElementAt(0));

            seleccionadosListModelHabitat.remove(0);

        }
    }

    public void muestraError() {
        JOptionPane.showMessageDialog(this, "Especie existente", "Mensaje error", JOptionPane.INFORMATION_MESSAGE);
    }

    public void muestraMensajeExitoso() {
        JOptionPane.showMessageDialog(this, "Especie Registrada", "Mensaje Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void muestraDatosEspecie(Especie especie) {

        cmbZonas.setSelectedItem(especie.getNombre());
        txtNombreCientifico.setText(especie.getNombreCientifico());
        
        txtDescripcion.setText(especie.getDescripcion());

//        // Limpiar las listas de continentes disponibles y seleccionados
//        disponiblesListModel.clear();
//        seleccionadosListModel.clear();
        // Agregar los continentes disponibles
        List<Cuidador> cuidadoresEspecie = especie.getCuidadores();
        for (Cuidador cuidador : cuidadoresEspecie) {
            for (int i = 0; i < disponiblesListModelCuidador.size(); i++) {
                if (disponiblesListModelCuidador.get(i).equals(cuidador)) {
                    seleccionadosListModelCuidador.addElement(cuidador);
                    disponiblesListModelCuidador.removeElement(cuidador);
                }
            }
        }

        List<Habitat> habitasEspecie = especie.getHabitats();
        for (Habitat habitat : habitasEspecie) {
            for (int i = 0; i < disponiblesListModelHabitat.size(); i++) {
                if (disponiblesListModelHabitat.get(i).equals(habitat)) {
                    seleccionadosListModelHabitat.addElement(habitat);
                    disponiblesListModelHabitat.removeElement(habitat);
                }
            }
        }

    }

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
            java.util.logging.Logger.getLogger(FrmRegistrar_ActualizarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar_ActualizarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar_ActualizarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrar_ActualizarEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrar_ActualizarEspecie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCuidador;
    private javax.swing.JButton btnAgregarHabitat;
    private javax.swing.JButton btnEditarAnimales;
    private javax.swing.JButton btnEliminarCuidador;
    private javax.swing.JButton btnEliminarHabitat;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<ZonaDelParque> cmbZonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<Cuidador> listaDisponiblesCuidadores;
    private javax.swing.JList<Habitat> listaDisponiblesHabitats;
    private javax.swing.JList<Cuidador> listaSeleccionadosCuidadores;
    private javax.swing.JList<Habitat> listaSeleccionadosHabitats;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreCientifico;
    private javax.swing.JTextField txtVerficar;
    // End of variables declaration//GEN-END:variables
}
