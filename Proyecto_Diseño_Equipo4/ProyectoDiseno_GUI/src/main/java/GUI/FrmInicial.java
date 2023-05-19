package GUI;

import Clases.FabricaLogica;
import Clases.ILogica;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.TipoVegetacion;
import Dominio.ZonaDelParque;
import java.util.List;

/**
 * Frame Inicial
 * @author Equipo04
 */
public class FrmInicial extends javax.swing.JFrame {

    ILogica logica;
    

    /**
     * Constructor por default para el frame FrmInicial.
     */
    public FrmInicial() {
        logica = FabricaLogica.crearInstancia();
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

        jPanel1 = new javax.swing.JPanel();
        selecHabitat = new javax.swing.JButton();
        selecRegistraroActualizarEspecie = new javax.swing.JButton();
        selecRegistrarActualizarItinerario = new javax.swing.JButton();
        selecRegistrarQueja = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        selecHabitat.setBackground(new java.awt.Color(153, 153, 153));
        selecHabitat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        selecHabitat.setText("Registrar Hábitats");
        selecHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecHabitatActionPerformed(evt);
            }
        });

        selecRegistraroActualizarEspecie.setBackground(new java.awt.Color(153, 153, 153));
        selecRegistraroActualizarEspecie.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        selecRegistraroActualizarEspecie.setText("Registrar Especie");
        selecRegistraroActualizarEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecRegistraroActualizarEspecieActionPerformed(evt);
            }
        });

        selecRegistrarActualizarItinerario.setBackground(new java.awt.Color(153, 153, 153));
        selecRegistrarActualizarItinerario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        selecRegistrarActualizarItinerario.setText("Registrar Itinerario");
        selecRegistrarActualizarItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecRegistrarActualizarItinerarioActionPerformed(evt);
            }
        });

        selecRegistrarQueja.setBackground(new java.awt.Color(153, 153, 153));
        selecRegistrarQueja.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        selecRegistrarQueja.setText("Registrar Queja");
        selecRegistrarQueja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecRegistrarQuejaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goat.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecRegistrarActualizarItinerario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(selecRegistraroActualizarEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecRegistrarQueja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selecHabitat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(selecHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(selecRegistraroActualizarEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(selecRegistrarActualizarItinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(selecRegistrarQueja, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ménu Principal - ZOO \"EL MAYO\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón que nos redireccionará al frame FrmRegistrarHabitat con todos los datos para su construcción.
     * @param evt Evento que acciona el botón.
     */
    private void selecHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecHabitatActionPerformed
        List<Object> lista = logica.recuperaDatosHabitat();
        List<Continente> continente = (List<Continente>) lista.get(1);

        List<TipoVegetacion> vegetacion = (List<TipoVegetacion>) lista.get(2);
        List<Clima> climas = (List<Clima>) lista.get(0);

        FrmRegistrarHabitat frmRegistro = new FrmRegistrarHabitat(climas, continente, vegetacion);
        frmRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selecHabitatActionPerformed

    /**
     * Botón que nos redireccionará al frame FrmRegistrar_ActualizarEspecie con todos los datos para su construcción.
     * @param evt Evento que acciona el botón.
     */
    private void selecRegistraroActualizarEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecRegistraroActualizarEspecieActionPerformed
        List<Object> lista = logica.recuperaCuidadoresyHabitatsyZonas();
        List<Cuidador> listCuidador = (List<Cuidador>) lista.get(0);
        List<Habitat> listHabitat = (List<Habitat>) lista.get(1);
        List<ZonaDelParque> listaZona = (List<ZonaDelParque>) lista.get(2);
        
        FrmRegistrar_ActualizarEspecie frmEspecie = new FrmRegistrar_ActualizarEspecie(listCuidador, listHabitat, listaZona);
        frmEspecie.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selecRegistraroActualizarEspecieActionPerformed

    /**
     * Método para mostrar un mensaje de error respecto al Inicio.
     */
    public void muestraError() {
    }

    /**
     * Botón que nos redireccionará al frame FrmItinerarios con todos los datos para su construcción.
     * @param evt Evento que acciona el botón.
     */
    private void selecRegistrarActualizarItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecRegistrarActualizarItinerarioActionPerformed
        List<Object> lista = logica.recuperaZonasyGuias();
        
        List<Guia> ListGuia = (List<Guia>) lista.get(0);
        List<ZonaDelParque> ListZona = (List<ZonaDelParque>) lista.get(1);
        System.out.println(ListGuia.size());
        System.out.println(ListZona.size());
        FrmItinerarios frmIti = new FrmItinerarios(ListGuia,ListZona);
        frmIti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selecRegistrarActualizarItinerarioActionPerformed

    /**
     * Botón que nos redireccionará al frame FrmRegistrarQueja con todos los datos para su construcción.
     * @param evt Evento que acciona el botón.
     */
    private void selecRegistrarQuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecRegistrarQuejaActionPerformed
        List<Itinerario> lista = logica.recuperaItinerarios();
        FrmRegistrarQueja frmQueja = new FrmRegistrarQueja(lista);
        frmQueja.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_selecRegistrarQuejaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton selecHabitat;
    private javax.swing.JButton selecRegistrarActualizarItinerario;
    private javax.swing.JButton selecRegistrarQueja;
    private javax.swing.JButton selecRegistraroActualizarEspecie;
    // End of variables declaration//GEN-END:variables
}
