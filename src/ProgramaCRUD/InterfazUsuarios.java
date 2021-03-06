/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaCRUD;

import ConexionCRUD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author stee-
 */
public class InterfazUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterfazUsuarios
     */
    public InterfazUsuarios() {
        initComponents();
        BloquearControles();
        CargarCBTipoUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneNuevoUsuario = new javax.swing.JTabbedPane();
        jPanelCrear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCedula = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfContrasena = new javax.swing.JTextField();
        jcbTipoUsuario = new javax.swing.JComboBox<>();
        jbCrearUsuario = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jPanelModificar = new javax.swing.JPanel();
        jcbTipoUsuarioMod = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfContrasenaMod = new javax.swing.JTextField();
        jtfApellidoMod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfNombreMod = new javax.swing.JTextField();
        jtfCedulaMod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbActualizarUsuarioMod = new javax.swing.JButton();
        jbCerrarMod = new javax.swing.JButton();
        jbEliminarUsuarioMod = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbBuscarUsuarioMod = new javax.swing.JButton();
        jbCancelarUsuarioMod = new javax.swing.JButton();

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Tipo de usuario: ");

        jtfCedula.setPreferredSize(new java.awt.Dimension(150, 25));

        jtfNombre.setPreferredSize(new java.awt.Dimension(150, 25));

        jtfApellido.setPreferredSize(new java.awt.Dimension(150, 25));

        jtfContrasena.setPreferredSize(new java.awt.Dimension(150, 25));

        jcbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTipoUsuario.setPreferredSize(new java.awt.Dimension(150, 25));

        jbCrearUsuario.setText("Crear usuario");
        jbCrearUsuario.setPreferredSize(new java.awt.Dimension(150, 50));
        jbCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearUsuarioActionPerformed(evt);
            }
        });

        jbCerrar.setText("CERRAR");
        jbCerrar.setToolTipText("");
        jbCerrar.setPreferredSize(new java.awt.Dimension(150, 50));
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearLayout = new javax.swing.GroupLayout(jPanelCrear);
        jPanelCrear.setLayout(jPanelCrearLayout);
        jPanelCrearLayout.setHorizontalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearLayout.createSequentialGroup()
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 511, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCrearUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelCrearLayout.setVerticalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jbCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneNuevoUsuario.addTab("Crear nuevo Usuario", jPanelCrear);

        jcbTipoUsuarioMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTipoUsuarioMod.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel6.setText("Tipo de usuario: ");

        jLabel7.setText("Contraseña");

        jtfContrasenaMod.setPreferredSize(new java.awt.Dimension(150, 25));

        jtfApellidoMod.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel8.setText("Apellido");

        jLabel9.setText("Nombre");

        jtfNombreMod.setPreferredSize(new java.awt.Dimension(150, 25));

        jtfCedulaMod.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel10.setText("Cedula:");

        jbActualizarUsuarioMod.setText("Actualizar usuario");
        jbActualizarUsuarioMod.setPreferredSize(new java.awt.Dimension(150, 50));
        jbActualizarUsuarioMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarUsuarioModActionPerformed(evt);
            }
        });

        jbCerrarMod.setText("CERRAR");
        jbCerrarMod.setToolTipText("");
        jbCerrarMod.setPreferredSize(new java.awt.Dimension(150, 50));
        jbCerrarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarModActionPerformed(evt);
            }
        });

        jbEliminarUsuarioMod.setText("Eliminar usuario");
        jbEliminarUsuarioMod.setPreferredSize(new java.awt.Dimension(150, 50));
        jbEliminarUsuarioMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarUsuarioModActionPerformed(evt);
            }
        });

        jbBuscarUsuarioMod.setLabel("Buscar usuario");
        jbBuscarUsuarioMod.setPreferredSize(new java.awt.Dimension(150, 50));
        jbBuscarUsuarioMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarUsuarioModActionPerformed(evt);
            }
        });

        jbCancelarUsuarioMod.setLabel("Cancelar");
        jbCancelarUsuarioMod.setPreferredSize(new java.awt.Dimension(150, 50));
        jbCancelarUsuarioMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarUsuarioModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelModificarLayout = new javax.swing.GroupLayout(jPanelModificar);
        jPanelModificar.setLayout(jPanelModificarLayout);
        jPanelModificarLayout.setHorizontalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModificarLayout.createSequentialGroup()
                                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                                        .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfContrasenaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                                        .addComponent(jtfCedulaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                                        .addComponent(jbBuscarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                                        .addComponent(jcbTipoUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbActualizarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbCerrarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModificarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCancelarUsuarioMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEliminarUsuarioMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelModificarLayout.setVerticalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCedulaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfContrasenaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbTipoUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbActualizarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbCancelarUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCerrarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneNuevoUsuario.addTab("Modificar usuarios existentes", jPanelModificar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneNuevoUsuario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneNuevoUsuario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarUsuarioModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarUsuarioModActionPerformed
        // TODO add your handling code here:
        BuscarUsuarioPorCedula();
    }//GEN-LAST:event_jbBuscarUsuarioModActionPerformed

    private void jbCancelarUsuarioModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarUsuarioModActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        BloquearControles();
        DesbloquearCostrolesIniciales();
    }//GEN-LAST:event_jbCancelarUsuarioModActionPerformed

    private void jbCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearUsuarioActionPerformed
        // TODO add your handling code here:
        InsertarUsuario();

    }//GEN-LAST:event_jbCrearUsuarioActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        CerrarVentana();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbCerrarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarModActionPerformed
        // TODO add your handling code here:
        CerrarVentana();
    }//GEN-LAST:event_jbCerrarModActionPerformed

    private void jbActualizarUsuarioModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarUsuarioModActionPerformed
        // TODO add your handling code here:
        ActualizarUsuario();
    }//GEN-LAST:event_jbActualizarUsuarioModActionPerformed

    private void jbEliminarUsuarioModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarUsuarioModActionPerformed
        // TODO add your handling code here:
        EliminarUsuario();
    }//GEN-LAST:event_jbEliminarUsuarioModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCrear;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneNuevoUsuario;
    private javax.swing.JButton jbActualizarUsuarioMod;
    private javax.swing.JButton jbBuscarUsuarioMod;
    private javax.swing.JButton jbCancelarUsuarioMod;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbCerrarMod;
    private javax.swing.JButton jbCrearUsuario;
    private javax.swing.JButton jbEliminarUsuarioMod;
    private javax.swing.JComboBox<String> jcbTipoUsuario;
    private javax.swing.JComboBox<String> jcbTipoUsuarioMod;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfApellidoMod;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCedulaMod;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfContrasenaMod;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreMod;
    // End of variables declaration//GEN-END:variables

    private void CerrarVentana() {
        this.setVisible(false);
        LimpiarCampos();
        BloquearControles();
        DesbloquearCostrolesIniciales();
    }

    private void BloquearControles() {
        jtfNombreMod.setEnabled(false);
        jtfApellidoMod.setEnabled(false);
        jtfContrasenaMod.setEnabled(false);
        jcbTipoUsuarioMod.setEnabled(false);
        jbActualizarUsuarioMod.setEnabled(false);
        jbEliminarUsuarioMod.setEnabled(false);
        jbCancelarUsuarioMod.setEnabled(false);
        jbCerrarMod.setEnabled(true);
    }

    private void BloquearControlesCuandoModifica() {
        jtfCedulaMod.setEnabled(false);
        jbCerrarMod.setEnabled(false);
    }

    private void DesbloquearControlesCuandoModifica() {
        jtfNombreMod.setEnabled(true);
        jtfApellidoMod.setEnabled(true);
        jtfContrasenaMod.setEnabled(true);
        jcbTipoUsuarioMod.setEnabled(true);
        jbActualizarUsuarioMod.setEnabled(true);
        jbEliminarUsuarioMod.setEnabled(true);
        jbCancelarUsuarioMod.setEnabled(true);
    }

    private void DesbloquearCostrolesIniciales() {
        jtfCedulaMod.setEnabled(true);
        jbBuscarUsuarioMod.setEnabled(true);
        jbCerrarMod.setEnabled(true);
    }

    private void LimpiarCampos() {
        jtfCedulaMod.setText("");
        jtfNombreMod.setText("");
        jtfApellidoMod.setText("");
        jtfContrasenaMod.setText("");
        jcbTipoUsuarioMod.setSelectedIndex(1);
    }

    public void CargarCBTipoUsuarios() {
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            String sqlIns = "select * from usuarios group by usu_perfil; ";
            java.sql.Statement psd = cn.createStatement();
            ResultSet rs = psd.executeQuery(sqlIns);
            DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
            DefaultComboBoxModel dcbmMod = new DefaultComboBoxModel();
            jcbTipoUsuario.setModel(dcbm);
            jcbTipoUsuarioMod.setModel(dcbmMod);
            while (rs.next()) {
                jcbTipoUsuarioMod.addItem(rs.getString(5));
                jcbTipoUsuario.addItem(rs.getString(5));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, title, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarUsuarioPorCedula() {
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            String sqlIns = "SELECT * FROM USUARIOS WHERE USU_CEDULA='" + jtfCedulaMod.getText() + "';";
            java.sql.Statement psd = cn.createStatement();
            ResultSet rs = psd.executeQuery(sqlIns);
            if (rs.next()) {
                jtfNombreMod.setText(rs.getString(2));
                jtfApellidoMod.setText(rs.getString(3));
                jtfContrasenaMod.setText(rs.getString(4));
                jcbTipoUsuarioMod.setSelectedItem(rs.getString(5));
                BloquearControlesCuandoModifica();
                DesbloquearControlesCuandoModifica();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no encontrado!", "Advertencia", 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, title, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void InsertarUsuario() {
        if (jtfCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nro. de cedula", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jtfCedula.requestFocus();
        } else if (jtfNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jtfNombre.requestFocus();
        } else if (jtfApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Apellido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jtfApellido.requestFocus();
        } else if (jtfContrasena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la contraseña", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jtfApellido.requestFocus();
        } else {
            try {

                String cedula = jtfCedula.getText();
                String nombre = jtfNombre.getText();
                String apellido = jtfApellido.getText();
                String contrasena = jtfContrasena.getText();
                String tipoPerfil = jcbTipoUsuario.getSelectedItem().toString();

                Conexion cc = new Conexion();
                Connection cn = cc.conectar();
                String sqlIns = "";
                sqlIns = "insert into usuarios values(?,?,?,?,?)";
                PreparedStatement psd = cn.prepareStatement(sqlIns);
                psd.setString(1, cedula);
                psd.setString(2, nombre);
                psd.setString(3, apellido);
                psd.setString(4, contrasena);
                psd.setString(5, tipoPerfil);

                psd.executeUpdate();
                LimpiarCampos();
                JOptionPane.showMessageDialog(this, "Registro agregado exitosamente!");
                cn.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, title, JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void ActualizarUsuario() {
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            String sqlUpd = "";
            sqlUpd = "UPDATE usuarios SET usu_nombre='" + jtfNombreMod.getText()
                    + "', usu_apellido='" + jtfApellidoMod.getText()
                    + "', usu_clave='" + jtfContrasenaMod.getText()
                    + "', usu_perfil='" + jcbTipoUsuarioMod.getSelectedItem().toString()
                    + "' WHERE usu_cedula='" + jtfCedulaMod.getText() + "';";
            PreparedStatement psd = cn.prepareStatement(sqlUpd);
            int n = psd.executeUpdate();
            if (n > 0) {
                LimpiarCampos();
                BloquearControles();
                DesbloquearCostrolesIniciales();
                JOptionPane.showMessageDialog(this, "Datos actualizados correctamente!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, title, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void EliminarUsuario() {
        try {
            if (JOptionPane.showConfirmDialog(this,
                    "Seguro que desea eliminar este registro?",
                    "Confirmar eliminar registro",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == 0) {
                Conexion cc = new Conexion();
                Connection cn = cc.conectar();
                String sqlDel = "DELETE FROM usuarios WHERE usu_cedula='" + jtfCedulaMod.getText() + "';";
                PreparedStatement psd = cn.prepareStatement(sqlDel);
                int n = psd.executeUpdate();
                if (n > 0) {
                    LimpiarCampos();
                    BloquearControles();
                    DesbloquearCostrolesIniciales();
                    JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente!", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, title, JOptionPane.ERROR_MESSAGE);
        }
    }
}
