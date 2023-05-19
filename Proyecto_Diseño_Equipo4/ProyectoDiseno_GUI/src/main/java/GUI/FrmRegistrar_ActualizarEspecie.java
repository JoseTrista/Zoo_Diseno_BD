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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Frame para Registrar o Actualizar Especie
 *
 * @author Equipo04
 */
public class FrmRegistrar_ActualizarEspecie extends javax.swing.JFrame {

    ILogica logica;
    private DefaultListModel<Cuidador> disponiblesListModelCuidador = new DefaultListModel<>();
    private DefaultListModel<Cuidador> seleccionadosListModelCuidador = new DefaultListModel<>();
    private DefaultListModel<Habitat> disponiblesListModelHabitat = new DefaultListModel<>();
    private DefaultListModel<Habitat> seleccionadosListModelHabitat = new DefaultListModel<>();
    Especie sp = new Especie();
    List<Animal> animalesAgregados = new ArrayList<>();

    /**
     * Constructor por default para el frame FrmRegistrar_ActualizarEspecie.
     */
    public FrmRegistrar_ActualizarEspecie() {
        logica = FabricaLogica.crearInstancia();
        initComponents();

        listaDisponiblesCuidadores.setModel(disponiblesListModelCuidador);
        listaSeleccionadosCuidadores.setModel(seleccionadosListModelCuidador);

        listaDisponiblesHabitats.setModel(disponiblesListModelHabitat);
        listaSeleccionadosHabitats.setModel(seleccionadosListModelHabitat);
        this.desactivaCampos();
    }

    /**
     * Constructor con parámetros para el frame FrmRegistrar_ActualizarEspecie.
     *
     * @param ListCuidador Lista con todos los Cuidadores que se tengan
     * registrados.
     * @param ListHabitat Lista con todos los Habitats que se tengan
     * registrados.
     * @param ListZona Lista con todas las Zonas que se tengan registradas.
     */
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

    /**
     * Método que añadirá al comboBox de Zonas del parque y las listas de
     * Cuidador y Hábitat sus datos.
     *
     * @param ListCuidador Lista con todos los objetos tipo Cuidador
     * registrados.
     * @param ListHabitat Lista con todos los objetos tipo Habitat registrados.
     * @param ListZona Lista con todos los objetos tipo ZonaDelParque
     * registrados.
     */
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
        btnEditarAnimales = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre especie animal:");

        txtVerficar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerficarKeyTyped(evt);
            }
        });

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

        txtNombreCientifico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCientificoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Habitat:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cuidador");

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

        btnEditarAnimales.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarAnimales.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEditarAnimales.setText("Editar Animales");
        btnEditarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAnimalesActionPerformed(evt);
            }
        });

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
                                        .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVerficar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCuidador)
                            .addComponent(btnAgregarCuidador))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAnimales))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarHabitat)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregarHabitat))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerificar)
                            .addComponent(jLabel9)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtVerficar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerificar)
                        .addGap(8, 8, 8)))
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGuardar)
                                    .addComponent(btnEditarAnimales))
                                .addGap(31, 31, 31)
                                .addComponent(btnRegresar)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnAgregarCuidador)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCuidador))
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
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    /**
     * Botón para verificar los datos escritos en txtVerificar.De haber un
     * registro que coincida, se mostrarán sus datos, de lo contrario se
     * habilitarán los campos para rellenar.
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (this.txtVerficar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese nombre de la especie a verificar");
        } else {
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

    /**
     * Botón para pasar un registro de Cuidador de la lista "Disponibles" a
     * "Seleccionados".
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnAgregarCuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuidadorActionPerformed
        // TODO add your handling code here:
        int i = listaDisponiblesCuidadores.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModelCuidador.addElement(disponiblesListModelCuidador.getElementAt(i));
            disponiblesListModelCuidador.remove(i);
        }
    }//GEN-LAST:event_btnAgregarCuidadorActionPerformed

    /**
     * Botón para pasar un registro de Hábitat de la lista "Disponibles" a
     * "Seleccionados".
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnAgregarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabitatActionPerformed
        // TODO add your handling code here:
        int i = listaDisponiblesHabitats.getSelectedIndex();
        if (i != -1) {
            seleccionadosListModelHabitat.addElement(disponiblesListModelHabitat.getElementAt(i));
            disponiblesListModelHabitat.remove(i);
        }
    }//GEN-LAST:event_btnAgregarHabitatActionPerformed

    /**
     * Botón para eliminar un registro de Cuidador de la lista "Seleccionados" a
     * "Disponibles".
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnEliminarCuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuidadorActionPerformed
        // TODO add your handling code here:
        int i = listaSeleccionadosCuidadores.getSelectedIndex();
        if (i != -1) {
            disponiblesListModelCuidador.addElement(seleccionadosListModelCuidador.getElementAt(i));
            seleccionadosListModelCuidador.remove(i);
        }
    }//GEN-LAST:event_btnEliminarCuidadorActionPerformed

    /**
     * Botón para eliminar un registro de Habitat de la lista "Seleccionados" a
     * "Disponibles".
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnEliminarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabitatActionPerformed
        // TODO add your handling code here:
        int i = listaSeleccionadosHabitats.getSelectedIndex();
        if (i != -1) {
            disponiblesListModelHabitat.addElement(seleccionadosListModelHabitat.getElementAt(i));
            seleccionadosListModelHabitat.remove(i);
        }
    }//GEN-LAST:event_btnEliminarHabitatActionPerformed

    /**
     * Botón para verificar que los campos han sido llenados.De ser así se
     * guardarán los datos, de lo contrario saltará un error.
     *
     * @param evt Evento que acciona el botón.
     */
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
            sp.setAnimales(animalesAgregados);
            logica.guardarEspecie(sp);

            muestraMensajeExitoso();

            FrmInicial a = new FrmInicial();
            this.dispose();
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * Botón que te permite regresar al frame FrmInicial.
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmInicial fi = new FrmInicial();
        fi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * Botón que te permite crear y acceder a una nueva instancia del JDialog
     * DlgAnimales
     *
     * @param evt Evento que acciona el botón.
     */
    private void btnEditarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAnimalesActionPerformed
        // TODO add your handling code here:
        System.out.println(animalesAgregados.size());
        DlgAnimales a = new DlgAnimales(this, true, animalesAgregados);
        a.setVisible(true);
        System.out.println(animalesAgregados.size());
    }//GEN-LAST:event_btnEditarAnimalesActionPerformed

    private void txtVerficarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerficarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_SPACE) {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
        }
        txtVerficar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtVerficar.getText().length() >= 50) {
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_txtVerficarKeyTyped

    private void txtNombreCientificoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCientificoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_SPACE) {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
        }
        txtNombreCientifico.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtNombreCientifico.getText().length() >= 50) {
                    e.consume();
                }
            }
        });
    }//GEN-LAST:event_txtNombreCientificoKeyTyped

    /**
     * Método que verificará si todos los campos rellenables tienen algún
     * registro en ellos.
     *
     * @return De estar llenos todos los campos, se regresará un boolean con
     * valor True, de lo contrario se regresará un False.
     */
    public boolean verificaCamposLlenos() {

        String desc = txtDescripcion.getText();
        String nCien = txtNombreCientifico.getText();
        ZonaDelParque zon = (ZonaDelParque) cmbZonas.getSelectedItem();

        if (zon == null || desc.isEmpty() || nCien.isEmpty() || seleccionadosListModelCuidador.isEmpty() || seleccionadosListModelHabitat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método que activará los campos para rellenar del frame.
     */
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

    /**
     * Método que desactivará los campos para rellenar del frame.
     */
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

    /**
     * Método que retornará a la posición inicial la lista de Cuidadores de
     * "Disponibles" y vaciará la lista "Seleccionados".
     */
    public void reiniciaCuidadores() {

        while (!seleccionadosListModelCuidador.isEmpty()) {
            disponiblesListModelCuidador.addElement(seleccionadosListModelCuidador.getElementAt(0));

            seleccionadosListModelCuidador.remove(0);

        }
    }

    /**
     * * Método que retornará a la posición inicial la lista de Habitat de
     * "Disponibles" y vaciará la lista "Seleccionados".
     */
    public void reiniciaHabitats() {

        while (!seleccionadosListModelHabitat.isEmpty()) {
            disponiblesListModelHabitat.addElement(seleccionadosListModelHabitat.getElementAt(0));

            seleccionadosListModelHabitat.remove(0);

        }
    }

    /**
     * Método para mostrar un mensaje de error respecto al
     * Registrar_ActualizarEspecie.
     */
    public void muestraError() {
        JOptionPane.showMessageDialog(this, "Especie existente", "Mensaje error", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método para mostrar un mensaje de éxito respecto al
     * Registrar_ActualizarEspecie.
     */
    public void muestraMensajeExitoso() {
        JOptionPane.showMessageDialog(this, "Especie Registrada", "Mensaje Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método para mostrar los datos de una Especie que ya haya sido registrado.
     *
     * @param especie Objeto tipo Especie del cual se mostrarán los datos.
     */
    public void muestraDatosEspecie(Especie especie) {

        cmbZonas.setSelectedItem(especie.getNombre());
        txtNombreCientifico.setText(especie.getNombreCientifico());
        animalesAgregados = especie.getAnimales();
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
