
package com.mycompany.rutamatch.view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import com.mycompany.rutamatch.view.components.ButtonRenderer;
import com.mycompany.rutamatch.view.components.TableOptionsHelper;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import java.awt.BorderLayout;

public class GUIPrincipal extends javax.swing.JFrame {

    private CardLayout cardLayout;
    //no se para que es pero claudia me dijo que lo pusiera para poder correrlo
    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(GUIPrincipal.class.getName());

    public GUIPrincipal() {
         initComponents();
         iniciarVideo();
         
        cardLayout = new CardLayout();
        ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "ListVehicles");
        ((java.awt.CardLayout) PanelTripsHome.getLayout()).show(PanelTripsHome, "ListTrips");
        
        TblVehicles.getColumnModel().getColumn(4).setCellRenderer(new com.mycompany.rutamatch.view.components.ButtonRenderer());
        TblVehicles.getColumnModel().getColumn(4).setMaxWidth(40);
        
        TblTrips.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        TblTrips.getColumnModel().getColumn(6).setMaxWidth(40);
        
        cargarDatosDePrueba();
        
         TableOptionsHelper.configurarClicOpciones(TblVehicles, 4,
               row -> { // Edit
        TxtChangePlate.setText(TblVehicles.getValueAt(row, 0).toString());
        TxtChangeBrand.setText(TblVehicles.getValueAt(row, 1).toString());
        TxtChangeModel.setText(TblVehicles.getValueAt(row, 2).toString());
        TxtChangeCapacity.setText(TblVehicles.getValueAt(row, 3).toString());
        ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "EditVehicles");
            },
            row -> { // Delete
        int confirm = JOptionPane.showConfirmDialog(TblVehicles,
            "¿Seguro que quieres eliminar esta fila?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            ((javax.swing.table.DefaultTableModel) TblVehicles.getModel()).removeRow(row);
        }
    }
);
          
          TableOptionsHelper.configurarClicOpciones(TblTrips, 6, // columna 6 porque Trips tiene más columnas
        row -> {
         TxtDateChangeTrips.setText(TblTrips.getValueAt(row, 2).toString().split(" ")[0]);
         TxtHourChangeTrips.setText(TblTrips.getValueAt(row, 2).toString().split(" ")[1]);
         TxtChangeSpots.setText(TblTrips.getValueAt(row, 3).toString());
         TxtChangeDriver.setText(TblTrips.getValueAt(row, 5).toString());
         ((java.awt.CardLayout) PanelTripsHome.getLayout()).show(PanelTripsHome, "EditTrips");
     },
    row -> {
        int confirm = JOptionPane.showConfirmDialog(TblTrips,
            "¿Seguro que quieres eliminar esta fila?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            ((javax.swing.table.DefaultTableModel) TblTrips.getModel()).removeRow(row);
        }
    }
);
          
    }
    private void iniciarVideo() {
      javafx.embed.swing.JFXPanel videoPanel = new javafx.embed.swing.JFXPanel();

      JFXPanel.setLayout(new BorderLayout());      // ← el panel dentro de Home
      JFXPanel.add(videoPanel, BorderLayout.CENTER);

      Platform.runLater(() -> {
          String ruta = getClass()
        .getResource("/com/mycompany/rutamatch/img/carrito_movimiento.mp4")
        .toExternalForm();

          Media media = new Media(ruta);
          MediaPlayer player = new MediaPlayer(media);
          player.setCycleCount(MediaPlayer.INDEFINITE);
          player.setMute(true);

          MediaView mediaView = new MediaView(player);
          mediaView.setPreserveRatio(false);

          StackPane root = new StackPane(mediaView);
          Scene scene = new Scene(root);
          videoPanel.setScene(scene);
          player.play();
      });
    }
    
    private void cargarDatosDePrueba() {
    javax.swing.table.DefaultTableModel modelVehicles = 
        (javax.swing.table.DefaultTableModel) TblVehicles.getModel();
    modelVehicles.setRowCount(0); // limpia lo que traiga por defecto
    modelVehicles.addRow(new Object[]{"ABC123", "Toyota", "Corolla", 4, "..."});
    modelVehicles.addRow(new Object[]{"XYZ789", "Mazda", "3", 5, "..."});
    modelVehicles.addRow(new Object[]{"LMN456", "Chevrolet", "Spark", 4, "..."});

    javax.swing.table.DefaultTableModel modelTrips = 
        (javax.swing.table.DefaultTableModel) TblTrips.getModel();
    modelTrips.setRowCount(0);
    modelTrips.addRow(new Object[]{"T1", "Scheduled", "25/12/2024 14:30", 3, "ABC123", "Juan Pérez", "..."});
    modelTrips.addRow(new Object[]{"T2", "Completed", "20/12/2024 09:00", 0, "XYZ789", "Ana Gómez", "..."});
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
        jPanel1 = new javax.swing.JPanel();
        BtnExit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelHome = new javax.swing.JPanel();
        JFXPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        PanelUsers = new javax.swing.JPanel();
        PanelListUser = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        TxtSearchTrips1 = new javax.swing.JTextField();
        BtnSearchTrips1 = new javax.swing.JButton();
        BtnAddTrips1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblListUsers = new javax.swing.JTable();
        PanelEditUser = new javax.swing.JPanel();
        PanelCreateDriver = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        TxtEmailCreateUser1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        TxtNameCreateUser1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        TxtPhoneCreateUser1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        TxtTypeCreateUser1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        TxtIDCreateUser1 = new javax.swing.JTextField();
        BtnCreateUser1 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PanelCreateUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtEmailCreateUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNameCreateUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPhoneCreateUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtTypeCreateUser = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        TxtIDCreateUser = new javax.swing.JTextField();
        BtnCreateUser = new javax.swing.JButton();
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
        PanelListVehicles = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        TxtSearchVehicles = new javax.swing.JTextField();
        BtnSearchVehicles = new javax.swing.JButton();
        BtnCreateVehicle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblVehicles = new javax.swing.JTable();
        PanelTrips = new javax.swing.JPanel();
        PanelTripsHome = new javax.swing.JPanel();
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
        PanelListTrips = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtSearchTrips = new javax.swing.JTextField();
        BtnSearchTrips = new javax.swing.JButton();
        BtnAddTrips = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTrips = new javax.swing.JTable();

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

        Header.setBackground(new java.awt.Color(204, 204, 255));
        Header.setPreferredSize(new java.awt.Dimension(100, 60));
        Header.setLayout(new java.awt.BorderLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("   Ruta Match");
        Header.add(jLabel7, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        BtnExit.setBackground(new java.awt.Color(255, 102, 102));
        BtnExit.setForeground(new java.awt.Color(204, 204, 255));
        BtnExit.setText("Exit");
        BtnExit.setPreferredSize(new java.awt.Dimension(60, 25));
        BtnExit.addActionListener(this::BtnExitActionPerformed);

        jButton5.setText("?");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton5))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Header.add(jPanel1, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        PanelHome.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        jLabel52.setFont(new java.awt.Font("Segoe UI", 3, 52)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 102));
        jLabel52.setText("Welcome ");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 102));
        jLabel54.setText("Ruta Match");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 102));
        jLabel53.setText("to");

        javax.swing.GroupLayout JFXPanelLayout = new javax.swing.GroupLayout(JFXPanel);
        JFXPanel.setLayout(JFXPanelLayout);
        JFXPanelLayout.setHorizontalGroup(
            JFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFXPanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFXPanelLayout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addGroup(JFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(JFXPanelLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)))
                .addGap(373, 373, 373))
        );
        JFXPanelLayout.setVerticalGroup(
            JFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFXPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(JFXPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(JFXPanelLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(6959, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JFXPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JFXPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", PanelHome);

        PanelUsers.setLayout(new java.awt.CardLayout());

        jLabel42.setText("Users");

        jLabel43.setText("Search: ");

        BtnSearchTrips1.setText("Search");

        BtnAddTrips1.setText("Add");
        BtnAddTrips1.addActionListener(this::BtnAddTrips1ActionPerformed);

        jButton2.setText("Drivers");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Passenger");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        TblListUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDUser", "Name", "Email", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TblListUsers);

        javax.swing.GroupLayout PanelListUserLayout = new javax.swing.GroupLayout(PanelListUser);
        PanelListUser.setLayout(PanelListUserLayout);
        PanelListUserLayout.setHorizontalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelListUserLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSearchTrips1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSearchTrips1))
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelListUserLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnAddTrips1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(589, Short.MAX_VALUE))
        );
        PanelListUserLayout.setVerticalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(5, 5, 5)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearchTrips1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips1)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAddTrips1)
                .addGap(25, 25, 25))
        );

        PanelUsers.add(PanelListUser, "card4");

        javax.swing.GroupLayout PanelEditUserLayout = new javax.swing.GroupLayout(PanelEditUser);
        PanelEditUser.setLayout(PanelEditUserLayout);
        PanelEditUserLayout.setHorizontalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
        );
        PanelEditUserLayout.setVerticalGroup(
            PanelEditUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7483, Short.MAX_VALUE)
        );

        PanelUsers.add(PanelEditUser, "card2");

        jLabel45.setText("New Driver");

        jLabel46.setText("Name: ");

        TxtEmailCreateUser1.addActionListener(this::TxtEmailCreateUser1ActionPerformed);

        jLabel47.setText("Email: ");

        jLabel48.setText("Phone: ");

        TxtPhoneCreateUser1.addActionListener(this::TxtPhoneCreateUser1ActionPerformed);

        jLabel49.setText("UserType:");

        TxtTypeCreateUser1.addActionListener(this::TxtTypeCreateUser1ActionPerformed);

        jLabel50.setText("ID:");

        TxtIDCreateUser1.addActionListener(this::TxtIDCreateUser1ActionPerformed);

        BtnCreateUser1.setText("Add");
        BtnCreateUser1.addActionListener(this::BtnCreateUser1ActionPerformed);

        jLabel51.setText("License");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        javax.swing.GroupLayout PanelCreateDriverLayout = new javax.swing.GroupLayout(PanelCreateDriver);
        PanelCreateDriver.setLayout(PanelCreateDriverLayout);
        PanelCreateDriverLayout.setHorizontalGroup(
            PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateDriverLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnCreateUser1)
                        .addGroup(PanelCreateDriverLayout.createSequentialGroup()
                            .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel49)
                                .addComponent(jLabel50)
                                .addComponent(jLabel51))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtEmailCreateUser1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNameCreateUser1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtPhoneCreateUser1)
                                .addComponent(TxtTypeCreateUser1)
                                .addComponent(TxtIDCreateUser1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(675, Short.MAX_VALUE))
        );
        PanelCreateDriverLayout.setVerticalGroup(
            PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateDriverLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(TxtIDCreateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(TxtNameCreateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(TxtEmailCreateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(TxtPhoneCreateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(TxtTypeCreateUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCreateDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(BtnCreateUser1)
                .addGap(25, 25, 25))
        );

        PanelUsers.add(PanelCreateDriver, "card5");

        jLabel1.setText("New user");

        jLabel2.setText("Name: ");

        TxtEmailCreateUser.addActionListener(this::TxtEmailCreateUserActionPerformed);

        jLabel3.setText("Email: ");

        jLabel4.setText("Phone: ");

        TxtPhoneCreateUser.addActionListener(this::TxtPhoneCreateUserActionPerformed);

        jLabel8.setText("UserType:");

        TxtTypeCreateUser.addActionListener(this::TxtTypeCreateUserActionPerformed);

        jLabel44.setText("ID:");

        TxtIDCreateUser.addActionListener(this::TxtIDCreateUserActionPerformed);

        BtnCreateUser.setText("Add");
        BtnCreateUser.addActionListener(this::BtnCreateUserActionPerformed);

        javax.swing.GroupLayout PanelCreateUserLayout = new javax.swing.GroupLayout(PanelCreateUser);
        PanelCreateUser.setLayout(PanelCreateUserLayout);
        PanelCreateUserLayout.setHorizontalGroup(
            PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnCreateUser)
                        .addGroup(PanelCreateUserLayout.createSequentialGroup()
                            .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel8)
                                .addComponent(jLabel44))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtEmailCreateUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNameCreateUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtPhoneCreateUser)
                                .addComponent(TxtTypeCreateUser)
                                .addComponent(TxtIDCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))))
                .addContainerGap(675, Short.MAX_VALUE))
        );
        PanelCreateUserLayout.setVerticalGroup(
            PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(TxtIDCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtTypeCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCreateUser)
                .addGap(25, 25, 25))
        );

        PanelUsers.add(PanelCreateUser, "card3");

        jTabbedPane1.addTab("Users", PanelUsers);

        PanelHomeVehicles.setLayout(new java.awt.CardLayout());

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

        javax.swing.GroupLayout PanelEditVehiclesLayout = new javax.swing.GroupLayout(PanelEditVehicles);
        PanelEditVehicles.setLayout(PanelEditVehiclesLayout);
        PanelEditVehiclesLayout.setHorizontalGroup(
            PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnEditVehicles, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TxtChangeModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(112, 224, Short.MAX_VALUE))
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEditVehicles)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        PanelHomeVehicles.add(PanelEditVehicles, "EditVehicles");

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

        javax.swing.GroupLayout PanelCreateVehiclesLayout = new javax.swing.GroupLayout(PanelCreateVehicles);
        PanelCreateVehicles.setLayout(PanelCreateVehiclesLayout);
        PanelCreateVehiclesLayout.setHorizontalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAddBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(TxtAddPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtAddCapacity))
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnAddCreateVehicles, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel16)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        PanelCreateVehiclesLayout.setVerticalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
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
                .addGap(12, 12, 12)
                .addComponent(BtnAddCreateVehicles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PanelHomeVehicles.add(PanelCreateVehicles, "CreateVehicle");

        PanelListVehicles.setInheritsPopupMenu(true);

        jLabel9.setText("Vehicles");

        jLabel41.setText("Search: ");

        BtnSearchVehicles.setText("Search");

        BtnCreateVehicle.setText("Add");
        BtnCreateVehicle.addActionListener(this::BtnCreateVehicleActionPerformed);

        TblVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Plate", "Brand", "Model", "Capacity", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return false; // ninguna celda editable directamente
            }
        });
        jScrollPane2.setViewportView(TblVehicles);

        javax.swing.GroupLayout PanelListVehiclesLayout = new javax.swing.GroupLayout(PanelListVehicles);
        PanelListVehicles.setLayout(PanelListVehiclesLayout);
        PanelListVehiclesLayout.setHorizontalGroup(
            PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListVehiclesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(PanelListVehiclesLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(TxtSearchVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSearchVehicles))
                    .addGroup(PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnCreateVehicle)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PanelListVehiclesLayout.setVerticalGroup(
            PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListVehiclesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSearchVehicles)
                    .addComponent(TxtSearchVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BtnCreateVehicle)
                .addGap(244, 244, 244))
        );

        PanelHomeVehicles.add(PanelListVehicles, "ListVehicles");

        javax.swing.GroupLayout PanelVehiclesLayout = new javax.swing.GroupLayout(PanelVehicles);
        PanelVehicles.setLayout(PanelVehiclesLayout);
        PanelVehiclesLayout.setHorizontalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 474, Short.MAX_VALUE))
        );
        PanelVehiclesLayout.setVerticalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehicles", PanelVehicles);

        PanelTripsHome.setLayout(new java.awt.CardLayout());

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
                .addContainerGap(280, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(BtnAddCreateVehicles1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        PanelTripsHome.add(PanelCreateTrips, "createTrips");

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
                .addContainerGap(280, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(BtnAddCreateVehicles2)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        PanelTripsHome.add(PanelEditTrips, "EditTrips");

        jLabel5.setText("Trips");

        jLabel6.setText("Search: ");

        BtnSearchTrips.setText("Search");

        BtnAddTrips.setText("Add");
        BtnAddTrips.addActionListener(this::BtnAddTripsActionPerformed);

        TblTrips.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdTrip", "Trip status", "Date", "Available spots", "IdVehicle", "Driver", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return false; // ninguna celda editable directamente
            }
        });
        jScrollPane1.setViewportView(TblTrips);

        javax.swing.GroupLayout PanelListTripsLayout = new javax.swing.GroupLayout(PanelListTrips);
        PanelListTrips.setLayout(PanelListTripsLayout);
        PanelListTripsLayout.setHorizontalGroup(
            PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListTripsLayout.createSequentialGroup()
                .addGroup(PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAddTrips)
                    .addGroup(PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelListTripsLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelListTripsLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(TxtSearchTrips, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(BtnSearchTrips))
                        .addGroup(PanelListTripsLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelListTripsLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel6)
                    .addContainerGap(572, Short.MAX_VALUE)))
        );
        PanelListTripsLayout.setVerticalGroup(
            PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListTripsLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearchTrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAddTrips)
                .addGap(16, 16, 16))
            .addGroup(PanelListTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelListTripsLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel6)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );

        PanelTripsHome.add(PanelListTrips, "ListTrips");

        javax.swing.GroupLayout PanelTripsLayout = new javax.swing.GroupLayout(PanelTrips);
        PanelTrips.setLayout(PanelTripsLayout);
        PanelTripsLayout.setHorizontalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTripsHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTripsLayout.setVerticalGroup(
            PanelTripsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTripsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTripsHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        System.exit(0); 
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnAddTripsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTripsActionPerformed
                         
        java.awt.CardLayout cl = (java.awt.CardLayout) PanelTripsHome.getLayout();
        cl.show(PanelTripsHome, "createTrips");

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

    private void BtnCreateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateVehicleActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) PanelHomeVehicles.getLayout();
            cl.show(PanelHomeVehicles, "CreateVehicle"); // create
    }//GEN-LAST:event_BtnCreateVehicleActionPerformed

    private void BtnAddTrips1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTrips1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddTrips1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TxtTypeCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTypeCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTypeCreateUserActionPerformed

    private void TxtIDCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDCreateUserActionPerformed

    private void BtnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateUserActionPerformed

    private void TxtEmailCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailCreateUser1ActionPerformed

    private void TxtPhoneCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneCreateUser1ActionPerformed

    private void TxtTypeCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTypeCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTypeCreateUser1ActionPerformed

    private void TxtIDCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDCreateUser1ActionPerformed

    private void BtnCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateUser1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Developed by Ana Tique, Yaritxa Duarte, Laura Carvajal");    
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton BtnAddTrips1;
    private javax.swing.JButton BtnCreateUser;
    private javax.swing.JButton BtnCreateUser1;
    private javax.swing.JButton BtnCreateVehicle;
    private javax.swing.JButton BtnEditVehicles;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSearchTrips;
    private javax.swing.JButton BtnSearchTrips1;
    private javax.swing.JButton BtnSearchVehicles;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel JFXPanel;
    private javax.swing.JPanel PanelCreateDriver;
    private javax.swing.JPanel PanelCreateTrips;
    private javax.swing.JPanel PanelCreateUser;
    private javax.swing.JPanel PanelCreateVehicles;
    private javax.swing.JPanel PanelEditTrips;
    private javax.swing.JPanel PanelEditUser;
    private javax.swing.JPanel PanelEditVehicles;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHomeVehicles;
    private javax.swing.JPanel PanelListTrips;
    private javax.swing.JPanel PanelListUser;
    private javax.swing.JPanel PanelListVehicles;
    private javax.swing.JPanel PanelTrips;
    private javax.swing.JPanel PanelTripsHome;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JPanel PanelVehicles;
    private javax.swing.JTable TblListUsers;
    private javax.swing.JTable TblTrips;
    private javax.swing.JTable TblVehicles;
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
    private javax.swing.JTextField TxtEmailCreateUser1;
    private javax.swing.JFormattedTextField TxtHourChangeTrips;
    private javax.swing.JFormattedTextField TxtHourCreateTrips1;
    private javax.swing.JTextField TxtIDCreateUser;
    private javax.swing.JTextField TxtIDCreateUser1;
    private javax.swing.JTextField TxtNameCreateUser;
    private javax.swing.JTextField TxtNameCreateUser1;
    private javax.swing.JTextField TxtPhoneCreateUser;
    private javax.swing.JTextField TxtPhoneCreateUser1;
    private javax.swing.JTextField TxtSearchTrips;
    private javax.swing.JTextField TxtSearchTrips1;
    private javax.swing.JTextField TxtSearchVehicles;
    private javax.swing.JTextField TxtTypeCreateUser;
    private javax.swing.JTextField TxtTypeCreateUser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
