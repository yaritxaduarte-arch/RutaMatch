/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rutamatch.view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author yarit
 */
public class GUIPrincipal extends javax.swing.JFrame {

    private CardLayout cardLayout;
    //no se para que es pero claudia me dijo que lo pusiera para poder correrlo
    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(GUIPrincipal.class.getName());

    public GUIPrincipal() {
         initComponents();

         
        cardLayout = new CardLayout();
    
    }

    /**
     * This method is called from within the constructor...
     */
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelHome = new javax.swing.JPanel();
        PanelUsers = new javax.swing.JPanel();
        PanelListUser = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtSearchUsers = new javax.swing.JTextField();
        BtnSearchUser = new javax.swing.JButton();
        PanelEditUser = new javax.swing.JPanel();
        PanelCreateUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtEmailCreateUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNameCreateUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPhoneCreateUser = new javax.swing.JTextField();
        PanelVehicles = new javax.swing.JPanel();
        PanelCreateVehicles = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelTrips = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setPreferredSize(new java.awt.Dimension(100, 60));
        Header.setLayout(new java.awt.BorderLayout());

        jLabel7.setText("          Ruta Match");
        Header.add(jLabel7, java.awt.BorderLayout.CENTER);

        BtnExit.setText("Exit");
        BtnExit.addActionListener(this::BtnExitActionPerformed);
        Header.add(BtnExit, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", PanelHome);

        PanelUsers.setLayout(new java.awt.CardLayout());

        jLabel8.setText("Current Users");

        jLabel9.setText("Search: ");

        TxtSearchUsers.addActionListener(this::TxtSearchUsersActionPerformed);

        BtnSearchUser.setText("Search");
        BtnSearchUser.addActionListener(this::BtnSearchUserActionPerformed);

        javax.swing.GroupLayout PanelListUserLayout = new javax.swing.GroupLayout(PanelListUser);
        PanelListUser.setLayout(PanelListUserLayout);
        PanelListUserLayout.setHorizontalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListUserLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(TxtSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSearchUser))
                    .addComponent(jLabel8))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        PanelListUserLayout.setVerticalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtSearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchUser))
                .addContainerGap(345, Short.MAX_VALUE))
        );

        PanelUsers.add(PanelListUser, "card4");

        javax.swing.GroupLayout PanelEditUserLayout = new javax.swing.GroupLayout(PanelEditUser);
        PanelEditUser.setLayout(PanelEditUserLayout);
        PanelEditUserLayout.setHorizontalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        PanelEditUserLayout.setVerticalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        PanelUsers.add(PanelEditUser, "card2");

        jLabel1.setText("New user");

        jLabel2.setText("Name: ");

        TxtEmailCreateUser.addActionListener(this::TxtEmailCreateUserActionPerformed);

        jLabel3.setText("Email: ");

        jLabel4.setText("Phone: ");

        TxtPhoneCreateUser.addActionListener(this::TxtPhoneCreateUserActionPerformed);

        javax.swing.GroupLayout PanelCreateUserLayout = new javax.swing.GroupLayout(PanelCreateUser);
        PanelCreateUser.setLayout(PanelCreateUserLayout);
        PanelCreateUserLayout.setHorizontalGroup(
            PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelCreateUserLayout.createSequentialGroup()
                        .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtEmailCreateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(TxtNameCreateUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPhoneCreateUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCreateUserLayout.setVerticalGroup(
            PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNameCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEmailCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPhoneCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        PanelUsers.add(PanelCreateUser, "card3");

        jTabbedPane1.addTab(" Users", PanelUsers);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCreateVehiclesLayout = new javax.swing.GroupLayout(PanelCreateVehicles);
        PanelCreateVehicles.setLayout(PanelCreateVehiclesLayout);
        PanelCreateVehiclesLayout.setHorizontalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelCreateVehiclesLayout.setVerticalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelVehiclesLayout = new javax.swing.GroupLayout(PanelVehicles);
        PanelVehicles.setLayout(PanelVehiclesLayout);
        PanelVehiclesLayout.setHorizontalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(PanelCreateVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        PanelVehiclesLayout.setVerticalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PanelCreateVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehicles", PanelVehicles);

        jLabel5.setText("New Trip");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTripsLayout = new javax.swing.GroupLayout(PanelTrips);
        PanelTrips.setLayout(PanelTripsLayout);
        PanelTripsLayout.setHorizontalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        PanelTripsLayout.setVerticalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trips", PanelTrips);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmailCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailCreateUserActionPerformed

    private void TxtPhoneCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneCreateUserActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnExitActionPerformed

    private void TxtSearchUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchUsersActionPerformed

    private void BtnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSearchUserActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUIPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSearchUser;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelCreateUser;
    private javax.swing.JPanel PanelCreateVehicles;
    private javax.swing.JPanel PanelEditUser;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelListUser;
    private javax.swing.JPanel PanelTrips;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JPanel PanelVehicles;
    private javax.swing.JTextField TxtEmailCreateUser;
    private javax.swing.JTextField TxtNameCreateUser;
    private javax.swing.JTextField TxtPhoneCreateUser;
    private javax.swing.JTextField TxtSearchUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
