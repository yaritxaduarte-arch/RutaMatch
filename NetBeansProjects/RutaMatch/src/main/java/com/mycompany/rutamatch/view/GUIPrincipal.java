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
        jLabel25 = new javax.swing.JLabel();
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
        PanelHomeVehicles = new javax.swing.JPanel();
        PanelEditVehicles = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtChangePlate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtChangeBrand = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtChangeModel = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TxtChangeCapacity = new javax.swing.JTextField();
        BtnEditVehicles = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PanelCreateVehicles = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtAddPlate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtAddBrand = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtAddModel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TxtAddCapacity = new javax.swing.JTextField();
        BtnAddCreateVehicles = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelTrips = new javax.swing.JPanel();
        PanelTripshHome = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtSearchTrips = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnSearchTrips = new javax.swing.JButton();
        BtnAddTrips = new javax.swing.JButton();
        PanelCreateTrips = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TxtAddSpots = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TxtAddDriver = new javax.swing.JTextField();
        BtnAddCreateVehicles1 = new javax.swing.JButton();
        TxtDateCreateTrips = new javax.swing.JFormattedTextField();
        TxtHourCreateTrips1 = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        TxtAddDriver1 = new javax.swing.JTextField();
        PanelEditTrips = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TxtChangeSpots = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        TxtChangeDriver = new javax.swing.JTextField();
        BtnAddCreateVehicles2 = new javax.swing.JButton();
        TxtDateChangeTrips = new javax.swing.JFormattedTextField();
        TxtHourChangeTrips = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        TxtAddDriver3 = new javax.swing.JTextField();

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

        jLabel25.setText("jLabel25");

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
            .addGap(0, 798, Short.MAX_VALUE)
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(818, Short.MAX_VALUE))
        );

        PanelUsers.add(PanelListUser, "card4");

        javax.swing.GroupLayout PanelEditUserLayout = new javax.swing.GroupLayout(PanelEditUser);
        PanelEditUser.setLayout(PanelEditUserLayout);
        PanelEditUserLayout.setHorizontalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        PanelEditUserLayout.setVerticalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
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
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtEmailCreateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(TxtNameCreateUser, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPhoneCreateUser))
                .addContainerGap(393, Short.MAX_VALUE))
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
                .addContainerGap(752, Short.MAX_VALUE))
        );

        PanelUsers.add(PanelCreateUser, "card3");

        jTabbedPane1.addTab(" Users", PanelUsers);

        jLabel15.setText("Edit Vehicles:");

        jLabel18.setText("Please enter the data you want to change:");

        jLabel19.setText("License plate: ");

        TxtChangePlate.addActionListener(this::TxtChangePlateActionPerformed);

        jLabel20.setText("Brand: ");

        TxtChangeBrand.addActionListener(this::TxtChangeBrandActionPerformed);

        jLabel21.setText("Model: ");

        TxtChangeModel.addActionListener(this::TxtChangeModelActionPerformed);

        jLabel23.setText("Passenger capacity:");

        TxtChangeCapacity.addActionListener(this::TxtChangeCapacityActionPerformed);

        BtnEditVehicles.setText("Edit");
        BtnEditVehicles.addActionListener(this::BtnEditVehiclesActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelEditVehiclesLayout = new javax.swing.GroupLayout(PanelEditVehicles);
        PanelEditVehicles.setLayout(PanelEditVehiclesLayout);
        PanelEditVehiclesLayout.setHorizontalGroup(
            PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtChangeBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(TxtChangePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtChangeCapacity))
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BtnEditVehicles))
                                            .addComponent(TxtChangeModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelEditVehiclesLayout.setVerticalGroup(
            PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TxtChangePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TxtChangeBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxtChangeModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TxtChangeCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEditVehicles)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditVehiclesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel10.setText("Create Vehicles");

        jLabel11.setText("Please enter the vehicle details:");

        jLabel12.setText("License plate: ");

        TxtAddPlate.addActionListener(this::TxtAddPlateActionPerformed);

        jLabel13.setText("Brand: ");

        TxtAddBrand.addActionListener(this::TxtAddBrandActionPerformed);

        jLabel14.setText("Model: ");

        TxtAddModel.addActionListener(this::TxtAddModelActionPerformed);

        jLabel17.setText("Passenger capacity:");

        TxtAddCapacity.addActionListener(this::TxtAddCapacityActionPerformed);

        BtnAddCreateVehicles.setText("Add");
        BtnAddCreateVehicles.addActionListener(this::BtnAddCreateVehiclesActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCreateVehiclesLayout = new javax.swing.GroupLayout(PanelCreateVehicles);
        PanelCreateVehicles.setLayout(PanelCreateVehiclesLayout);
        PanelCreateVehiclesLayout.setHorizontalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtAddBrand))
                                .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtAddPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(112, Short.MAX_VALUE)))
                    .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                        .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtAddCapacity))
                                .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnAddCreateVehicles))
                                        .addComponent(TxtAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelCreateVehiclesLayout.setVerticalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtAddPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtAddBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxtAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtAddCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAddCreateVehicles)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateVehiclesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout PanelHomeVehiclesLayout = new javax.swing.GroupLayout(PanelHomeVehicles);
        PanelHomeVehicles.setLayout(PanelHomeVehiclesLayout);
        PanelHomeVehiclesLayout.setHorizontalGroup(
            PanelHomeVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeVehiclesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCreateVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(PanelHomeVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHomeVehiclesLayout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(PanelEditVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );
        PanelHomeVehiclesLayout.setVerticalGroup(
            PanelHomeVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeVehiclesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCreateVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
            .addGroup(PanelHomeVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHomeVehiclesLayout.createSequentialGroup()
                    .addGap(323, 323, 323)
                    .addComponent(PanelEditVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelVehiclesLayout = new javax.swing.GroupLayout(PanelVehicles);
        PanelVehicles.setLayout(PanelVehiclesLayout);
        PanelVehiclesLayout.setHorizontalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        PanelVehiclesLayout.setVerticalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehicles", PanelVehicles);

        jLabel5.setText("Trips");

        jLabel6.setText("Search: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnSearchTrips.setText("Search");

        BtnAddTrips.setText("Add");
        BtnAddTrips.addActionListener(this::BtnAddTripsActionPerformed);

        jLabel24.setText("Edit Trips");

        jLabel26.setText("Please enter the trip details:");

        jLabel27.setText("Date:");

        jLabel28.setText("Hour: ");

        jLabel29.setText("Spots:");

        TxtAddSpots.addActionListener(this::TxtAddSpotsActionPerformed);

        jLabel31.setText("Driver:");

        TxtAddDriver.addActionListener(this::TxtAddDriverActionPerformed);

        BtnAddCreateVehicles1.setText("Add");
        BtnAddCreateVehicles1.addActionListener(this::BtnAddCreateVehicles1ActionPerformed);

        TxtDateCreateTrips.addActionListener(this::TxtDateCreateTripsActionPerformed);

        TxtHourCreateTrips1.addActionListener(this::TxtHourCreateTrips1ActionPerformed);

        jLabel32.setText("Vehicle:");

        TxtAddDriver1.addActionListener(this::TxtAddDriver1ActionPerformed);

        javax.swing.GroupLayout PanelCreateTripsLayout = new javax.swing.GroupLayout(PanelCreateTrips);
        PanelCreateTrips.setLayout(PanelCreateTripsLayout);
        PanelCreateTripsLayout.setHorizontalGroup(
            PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel30))
                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDateCreateTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtHourCreateTrips1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnAddCreateVehicles1)
                                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtAddDriver))
                                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                                        .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel29))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtAddSpots, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtAddDriver1, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelCreateTripsLayout.setVerticalGroup(
            PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TxtDateCreateTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHourCreateTrips1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(TxtAddSpots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(TxtAddDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel30))
                    .addGroup(PanelCreateTripsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCreateTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAddDriver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(BtnAddCreateVehicles1)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel33.setText("EditTrips");

        jLabel34.setText("Please enter the data you want to change:");

        jLabel35.setText("Date:");

        jLabel36.setText("Hour: ");

        jLabel37.setText("Spots:");

        TxtChangeSpots.addActionListener(this::TxtChangeSpotsActionPerformed);

        jLabel39.setText("Driver:");

        TxtChangeDriver.addActionListener(this::TxtChangeDriverActionPerformed);

        BtnAddCreateVehicles2.setText("Add");
        BtnAddCreateVehicles2.addActionListener(this::BtnAddCreateVehicles2ActionPerformed);

        TxtDateChangeTrips.addActionListener(this::TxtDateChangeTripsActionPerformed);

        TxtHourChangeTrips.addActionListener(this::TxtHourChangeTripsActionPerformed);

        jLabel40.setText("Vehicle:");

        TxtAddDriver3.addActionListener(this::TxtAddDriver3ActionPerformed);

        javax.swing.GroupLayout PanelEditTripsLayout = new javax.swing.GroupLayout(PanelEditTrips);
        PanelEditTrips.setLayout(PanelEditTripsLayout);
        PanelEditTripsLayout.setHorizontalGroup(
            PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditTripsLayout.createSequentialGroup()
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel38))
                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEditTripsLayout.createSequentialGroup()
                                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDateChangeTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtHourChangeTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnAddCreateVehicles2)
                                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtChangeDriver))
                                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                                        .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel37))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtChangeSpots, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtAddDriver3, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelEditTripsLayout.setVerticalGroup(
            PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditTripsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TxtDateChangeTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHourChangeTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(TxtChangeSpots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TxtChangeDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38))
                    .addGroup(PanelEditTripsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEditTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAddDriver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(BtnAddCreateVehicles2)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTripshHomeLayout = new javax.swing.GroupLayout(PanelTripshHome);
        PanelTripshHome.setLayout(PanelTripshHomeLayout);
        PanelTripshHomeLayout.setHorizontalGroup(
            PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAddTrips)
                            .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(176, 176, 176)
                                .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                                        .addComponent(TxtSearchTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnSearchTrips)))))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelCreateTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelEditTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(155, Short.MAX_VALUE)))
        );
        PanelTripshHomeLayout.setVerticalGroup(
            PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSearchTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAddTrips)
                .addContainerGap(525, Short.MAX_VALUE))
            .addGroup(PanelTripshHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelTripshHomeLayout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(PanelCreateTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)
                    .addComponent(PanelEditTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelTripsLayout = new javax.swing.GroupLayout(PanelTrips);
        PanelTrips.setLayout(PanelTripsLayout);
        PanelTripsLayout.setHorizontalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTripshHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        PanelTripsLayout.setVerticalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTripshHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BtnAddTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTripsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddTripsActionPerformed

    private void TxtAddPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddPlateActionPerformed

    private void TxtAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddBrandActionPerformed

    private void TxtAddModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddModelActionPerformed

    private void TxtAddCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddCapacityActionPerformed

    private void BtnAddCreateVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCreateVehiclesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddCreateVehiclesActionPerformed

    private void TxtChangePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangePlateActionPerformed

    private void TxtChangeBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeBrandActionPerformed

    private void TxtChangeModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeModelActionPerformed

    private void TxtChangeCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeCapacityActionPerformed

    private void BtnEditVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditVehiclesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditVehiclesActionPerformed

    private void TxtAddSpotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddSpotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddSpotsActionPerformed

    private void TxtAddDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddDriverActionPerformed

    private void BtnAddCreateVehicles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCreateVehicles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddCreateVehicles1ActionPerformed

    private void TxtDateCreateTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateCreateTripsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateCreateTripsActionPerformed

    private void TxtHourCreateTrips1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHourCreateTrips1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHourCreateTrips1ActionPerformed

    private void TxtAddDriver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddDriver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddDriver1ActionPerformed

    private void TxtChangeSpotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeSpotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeSpotsActionPerformed

    private void TxtChangeDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeDriverActionPerformed

    private void BtnAddCreateVehicles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCreateVehicles2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddCreateVehicles2ActionPerformed

    private void TxtDateChangeTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateChangeTripsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateChangeTripsActionPerformed

    private void TxtHourChangeTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHourChangeTripsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHourChangeTripsActionPerformed

    private void TxtAddDriver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddDriver3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddDriver3ActionPerformed

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
    private javax.swing.JButton BtnAddCreateVehicles;
    private javax.swing.JButton BtnAddCreateVehicles1;
    private javax.swing.JButton BtnAddCreateVehicles2;
    private javax.swing.JButton BtnAddTrips;
    private javax.swing.JButton BtnEditVehicles;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSearchTrips;
    private javax.swing.JButton BtnSearchUser;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelCreateTrips;
    private javax.swing.JPanel PanelCreateUser;
    private javax.swing.JPanel PanelCreateVehicles;
    private javax.swing.JPanel PanelEditTrips;
    private javax.swing.JPanel PanelEditUser;
    private javax.swing.JPanel PanelEditVehicles;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHomeVehicles;
    private javax.swing.JPanel PanelListUser;
    private javax.swing.JPanel PanelTrips;
    private javax.swing.JPanel PanelTripshHome;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JPanel PanelVehicles;
    private javax.swing.JTextField TxtAddBrand;
    private javax.swing.JTextField TxtAddCapacity;
    private javax.swing.JTextField TxtAddDriver;
    private javax.swing.JTextField TxtAddDriver1;
    private javax.swing.JTextField TxtAddDriver3;
    private javax.swing.JTextField TxtAddModel;
    private javax.swing.JTextField TxtAddPlate;
    private javax.swing.JTextField TxtAddSpots;
    private javax.swing.JTextField TxtChangeBrand;
    private javax.swing.JTextField TxtChangeCapacity;
    private javax.swing.JTextField TxtChangeDriver;
    private javax.swing.JTextField TxtChangeModel;
    private javax.swing.JTextField TxtChangePlate;
    private javax.swing.JTextField TxtChangeSpots;
    private javax.swing.JFormattedTextField TxtDateChangeTrips;
    private javax.swing.JFormattedTextField TxtDateCreateTrips;
    private javax.swing.JTextField TxtEmailCreateUser;
    private javax.swing.JFormattedTextField TxtHourChangeTrips;
    private javax.swing.JFormattedTextField TxtHourCreateTrips1;
    private javax.swing.JTextField TxtNameCreateUser;
    private javax.swing.JTextField TxtPhoneCreateUser;
    private javax.swing.JTextField TxtSearchTrips;
    private javax.swing.JTextField TxtSearchUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
