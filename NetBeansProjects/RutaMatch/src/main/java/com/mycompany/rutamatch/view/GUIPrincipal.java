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
        mainFrame.setLayout(cardLayout);

        // Vuelve a registrar los paneles con un nombre para poder mostrarlos
        mainFrame.add(LoginPanel, "login");
        mainFrame.add(panelSignUp, "signup");
        mainFrame.add(PanelPassanger, "home");
        HeaderPanel.setVisible(false);

        // Cuál se ve al arrancar
        cardLayout.show(mainFrame, "login");
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
        HeaderPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelHeaderRight = new javax.swing.JPanel();
        cmbMode = new javax.swing.JComboBox<>();
        lblUser = new javax.swing.JLabel();
        BtnLogout = new javax.swing.JButton();
        mainFrame = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtPasswordSignIn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtEmailSignIn1 = new javax.swing.JTextField();
        BtnSignIn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BtnSignUp = new javax.swing.JButton();
        panelSignUp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNameSignUp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtPhoneSignUp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtEmailSignUp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtPasswordSignUp = new javax.swing.JTextField();
        BtnSignUp1 = new javax.swing.JButton();
        PanelPassanger = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelPassangerHome = new javax.swing.JPanel();
        PanelFindTrip = new javax.swing.JPanel();
        PanelPassangerBookings = new javax.swing.JPanel();
        PanelDriver = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        PanelDriverHome = new javax.swing.JPanel();
        PanelDriverPublishTrip = new javax.swing.JPanel();
        PanelDriverVehicles = new javax.swing.JPanel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderPanel.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ruta Match");
        HeaderPanel.add(jLabel11, java.awt.BorderLayout.CENTER);

        cmbMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Passenger ", "Driver" }));
        cmbMode.addActionListener(this::cmbModeActionPerformed);
        panelHeaderRight.add(cmbMode);

        lblUser.setText("Yaritxa");
        panelHeaderRight.add(lblUser);

        BtnLogout.setText("Log Out");
        BtnLogout.addActionListener(this::BtnLogoutActionPerformed);
        panelHeaderRight.add(BtnLogout);

        HeaderPanel.add(panelHeaderRight, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("Welcome to RouteMatch");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Sign in ");

        jLabel3.setText("Email: ");

        TxtPasswordSignIn.addActionListener(this::TxtPasswordSignInActionPerformed);

        jLabel4.setText("Password:");

        TxtEmailSignIn1.addActionListener(this::TxtEmailSignIn1ActionPerformed);

        BtnSignIn.setText("Sign in");
        BtnSignIn.addActionListener(this::BtnSignInActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnSignIn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtEmailSignIn1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(TxtPasswordSignIn))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmailSignIn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPasswordSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSignIn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel6.setText("Don't you have an account yet?");

        BtnSignUp.setText("Sign Up");
        BtnSignUp.addActionListener(this::BtnSignUpActionPerformed);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(55, 55, 55)
                            .addComponent(BtnSignUp))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BtnSignUp))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jLabel5.setText("Sign up");

        jLabel7.setText("Name: ");

        jLabel8.setText("Phone: ");

        TxtPhoneSignUp.addActionListener(this::TxtPhoneSignUpActionPerformed);

        jLabel9.setText("Email: ");

        TxtEmailSignUp.addActionListener(this::TxtEmailSignUpActionPerformed);

        jLabel10.setText("Password:");

        TxtPasswordSignUp.addActionListener(this::TxtPasswordSignUpActionPerformed);

        BtnSignUp1.setText("Sign Up");
        BtnSignUp1.addActionListener(this::BtnSignUp1ActionPerformed);

        javax.swing.GroupLayout panelSignUpLayout = new javax.swing.GroupLayout(panelSignUp);
        panelSignUp.setLayout(panelSignUpLayout);
        panelSignUpLayout.setHorizontalGroup(
            panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpLayout.createSequentialGroup()
                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignUpLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel5))
                    .addGroup(panelSignUpLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnSignUp1)
                            .addGroup(panelSignUpLayout.createSequentialGroup()
                                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPhoneSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(713, Short.MAX_VALUE))
        );
        panelSignUpLayout.setVerticalGroup(
            panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignUpLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtPhoneSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtEmailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSignUpLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSignUp1))
                    .addComponent(TxtPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout PanelPassangerHomeLayout = new javax.swing.GroupLayout(PanelPassangerHome);
        PanelPassangerHome.setLayout(PanelPassangerHomeLayout);
        PanelPassangerHomeLayout.setHorizontalGroup(
            PanelPassangerHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        PanelPassangerHomeLayout.setVerticalGroup(
            PanelPassangerHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", PanelPassangerHome);

        javax.swing.GroupLayout PanelFindTripLayout = new javax.swing.GroupLayout(PanelFindTrip);
        PanelFindTrip.setLayout(PanelFindTripLayout);
        PanelFindTripLayout.setHorizontalGroup(
            PanelFindTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        PanelFindTripLayout.setVerticalGroup(
            PanelFindTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Find a Trip", PanelFindTrip);

        javax.swing.GroupLayout PanelPassangerBookingsLayout = new javax.swing.GroupLayout(PanelPassangerBookings);
        PanelPassangerBookings.setLayout(PanelPassangerBookingsLayout);
        PanelPassangerBookingsLayout.setHorizontalGroup(
            PanelPassangerBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        PanelPassangerBookingsLayout.setVerticalGroup(
            PanelPassangerBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("\tMy Bookings", PanelPassangerBookings);

        javax.swing.GroupLayout PanelPassangerLayout = new javax.swing.GroupLayout(PanelPassanger);
        PanelPassanger.setLayout(PanelPassangerLayout);
        PanelPassangerLayout.setHorizontalGroup(
            PanelPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelPassangerLayout.setVerticalGroup(
            PanelPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout PanelDriverHomeLayout = new javax.swing.GroupLayout(PanelDriverHome);
        PanelDriverHome.setLayout(PanelDriverHomeLayout);
        PanelDriverHomeLayout.setHorizontalGroup(
            PanelDriverHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        PanelDriverHomeLayout.setVerticalGroup(
            PanelDriverHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Home", PanelDriverHome);

        javax.swing.GroupLayout PanelDriverPublishTripLayout = new javax.swing.GroupLayout(PanelDriverPublishTrip);
        PanelDriverPublishTrip.setLayout(PanelDriverPublishTripLayout);
        PanelDriverPublishTripLayout.setHorizontalGroup(
            PanelDriverPublishTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        PanelDriverPublishTripLayout.setVerticalGroup(
            PanelDriverPublishTripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Publish Trip", PanelDriverPublishTrip);

        javax.swing.GroupLayout PanelDriverVehiclesLayout = new javax.swing.GroupLayout(PanelDriverVehicles);
        PanelDriverVehicles.setLayout(PanelDriverVehiclesLayout);
        PanelDriverVehiclesLayout.setHorizontalGroup(
            PanelDriverVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        PanelDriverVehiclesLayout.setVerticalGroup(
            PanelDriverVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("My Vehicles", PanelDriverVehicles);

        javax.swing.GroupLayout PanelDriverLayout = new javax.swing.GroupLayout(PanelDriver);
        PanelDriver.setLayout(PanelDriverLayout);
        PanelDriverLayout.setHorizontalGroup(
            PanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDriverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        PanelDriverLayout.setVerticalGroup(
            PanelDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(PanelPassanger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(panelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(PanelPassanger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(128, Short.MAX_VALUE)))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(408, 408, 408)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(447, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPasswordSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordSignInActionPerformed

    private void TxtEmailSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailSignIn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailSignIn1ActionPerformed

    private void BtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignInActionPerformed

        String email = TxtEmailSignIn1.getText().trim();
        String password = TxtPasswordSignIn.getText().trim();

        // 1. Validación de campos vacíos (esto SÍ es front)
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
            "Por favor llena todos los campos.",
            "Datos incompletos",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         // 2. (Opcional) Validación de formato básico de email, esto también es front
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this,
            "El correo ingresado no es válido.",
            "Formato incorrecto",
            JOptionPane.WARNING_MESSAGE);
        return;
    }

    }//GEN-LAST:event_BtnSignInActionPerformed

    private void BtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignUpActionPerformed
        cardLayout.show(mainFrame, "signup");
    }//GEN-LAST:event_BtnSignUpActionPerformed

    private void TxtPhoneSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneSignUpActionPerformed

    private void TxtEmailSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailSignUpActionPerformed

    private void TxtPasswordSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordSignUpActionPerformed

    private void BtnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSignUp1ActionPerformed
        String name = TxtNameSignUp.getText().trim();
        String phone = TxtPhoneSignUp.getText().trim();
        String email = TxtEmailSignUp.getText().trim();
        String password = TxtPasswordSignUp.getText().trim();

        // 1. Validación de campos vacíos (esto SÍ es front)
        if (email.isEmpty() || password.isEmpty() || phone.isEmpty() || name.isEmpty() ) {
            JOptionPane.showMessageDialog(this,
            "Por favor llena todos los campos.",
            "Datos incompletos",
            JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         // 2. (Opcional) Validación de formato básico de email, esto también es front
        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this,
            "El correo ingresado no es válido.",
            "Formato incorrecto",
            JOptionPane.WARNING_MESSAGE);
        return;
    }
    }//GEN-LAST:event_BtnSignUp1ActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void cmbModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbModeActionPerformed

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
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnSignIn;
    private javax.swing.JButton BtnSignUp;
    private javax.swing.JButton BtnSignUp1;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel PanelDriver;
    private javax.swing.JPanel PanelDriverHome;
    private javax.swing.JPanel PanelDriverPublishTrip;
    private javax.swing.JPanel PanelDriverVehicles;
    private javax.swing.JPanel PanelFindTrip;
    private javax.swing.JPanel PanelPassanger;
    private javax.swing.JPanel PanelPassangerBookings;
    private javax.swing.JPanel PanelPassangerHome;
    private javax.swing.JTextField TxtEmailSignIn1;
    private javax.swing.JTextField TxtEmailSignUp;
    private javax.swing.JTextField TxtNameSignUp;
    private javax.swing.JTextField TxtPasswordSignIn;
    private javax.swing.JTextField TxtPasswordSignUp;
    private javax.swing.JTextField TxtPhoneSignUp;
    private javax.swing.JComboBox<String> cmbMode;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JPanel panelHeaderRight;
    private javax.swing.JPanel panelSignUp;
    // End of variables declaration//GEN-END:variables
}
