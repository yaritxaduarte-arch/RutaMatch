package com.mycompany.rutamatch.view;

import com.mycompany.rutamatch.controller.ControllerVehiculo;
import com.mycompany.rutamatch.controller.ControllerConductor;
import com.mycompany.rutamatch.controller.ControllerPasajero;
import com.mycompany.rutamatch.modelo.Vehiculo;
import com.mycompany.rutamatch.modelo.Pasajero;
import com.mycompany.rutamatch.modelo.Conductor;
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
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import com.mycompany.rutamatch.modelo.IActualizable;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;


public class GUIPrincipal extends javax.swing.JFrame implements IActualizable{

    private CardLayout cardLayout;
    private static final java.util.logging.Logger logger = 
        java.util.logging.Logger.getLogger(GUIPrincipal.class.getName());

    public GUIPrincipal() {
         initComponents();
         
         //Para mostrar el calendario para elegir las fechas en crear/editar en pasajero y conductor
         TxtExpDateCreateDriver.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 seleccionarFecha(TxtExpDateCreateDriver);
             }
         });

         TxtExpDateEditDriver.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 seleccionarFecha(TxtExpDateEditDriver);
             }
         });

         TxtDateRegisterEditPass.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 seleccionarFecha(TxtDateRegisterEditPass);
             }
         });
         
         
         iniciarVideo();
        cardLayout = new CardLayout();
         
        ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "ListVehicles");
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
        
        
        //Lista Automaticamente las tablas esto lo hace llamando a los controllers
        ControllerVehiculo.registrarGUI(this);
        refrescarTablaVehiculos(ControllerVehiculo.listarVehiculos());
        
        ControllerConductor.registrarGUI(this);
        refrescarTablaConductores(ControllerConductor.listarConductores());
        
        ControllerPasajero.registrarGUI(this);
        refrescarTablaPasajero(ControllerPasajero.listarPasajero());

        
        TblListUsers.getColumnModel().getColumn(7).setCellRenderer(new com.mycompany.rutamatch.view.components.ButtonRenderer());
        TblListUsers.getColumnModel().getColumn(7).setMaxWidth(40);
        
}  
    private void refrescarTablaUsuarios() {
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
        new String[]{
            "ID", "Nombre", "Apellido", "Documento",
            "Tipo Documento", "Teléfono", "Correo",
            "Tipo Usuario", ""
        }, 0) {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
        };

    for (Conductor c : ControllerConductor.listarConductores()) {
        modelo.addRow(new Object[]{
            c.getId(),
            c.getNombre(),
            c.getApellido(),
            c.getDocumento(),
            c.getTipoDocumento(),
            c.getTelefono(),
            c.getCorreo(),
            "Driver",
            ""
        });
    }

    for (Pasajero p : ControllerPasajero.listarPasajeros()) {
        modelo.addRow(new Object[]{
            p.getId(),
            p.getNombre(),
            p.getApellido(),
            p.getDocumento(),
            p.getTipoDocumento(),
            p.getTelefono(),
            p.getCorreo(),
            "Passenger",
            ""
        });
    }

    TblListUsers.setModel(modelo);
    aplicarColumnaAccionesUsuarios();
    }
    
    private void refrescarTablaPasajero(java.util.List<Pasajero> lista) {
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
            new String[]{"ID", "Name", "LastName", "Document", "DocumentType", "Phone", "Email", ""}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (Pasajero p : lista) {
            modelo.addRow(new Object[]{
                p.getId(), p.getNombre(), p.getApellido(), p.getDocumento(),
                p.getTipoDocumento(), p.getTelefono(), p.getCorreo(), ""
            });
        }
        TblListPassanger.setModel(modelo);
        aplicarColumnaAccionesPasajeros();
    }  
    
    
    private void refrescarTablaConductores(java.util.List<Conductor> lista) {
    javax.swing.table.DefaultTableModel modelo =
        new javax.swing.table.DefaultTableModel(
            new String[]{
                "ID", "Nombre", "Apellido", "Documento",
                "Tipo Documento", "Teléfono", "Correo",
                "Licencia", "Categoría", "Vencimiento", ""
            }, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    for (Conductor c : lista) {
        modelo.addRow(new Object[]{
            c.getId(),
            c.getNombre(),
            c.getApellido(),
            c.getDocumento(),
            c.getTipoDocumento(),
            c.getTelefono(),
            c.getCorreo(),
            c.getLicencia(),
            c.getCategoriaLicencia(),
            c.getFechaVenciLicencia(),
            ""
        });
    }
    TblListDrivers.setModel(modelo);

    aplicarColumnaAccionesConductores();
}
 
    private void refrescarTablaVehiculos(java.util.List<Vehiculo> lista) {
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
            new String[]{"Placa", "Marca", "Modelo", "Año", "Color", "Combustible", "Chasis", ""}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (Vehiculo v : lista) {
            modelo.addRow(new Object[]{
                v.getPlaca(), v.getMarca(), v.getModelo(), v.getAnio(),
                v.getColor(), v.getTipoCombustible(), v.getNumeroChasis(), ""
            });
        }
        TblVehicles.setModel(modelo);
        aplicarColumnaAccionesVehiculos();
    }
    
    private void seleccionarFecha(javax.swing.JTextField campo) {
        JDateChooser calendario = new JDateChooser();
        calendario.setDateFormatString("yyyy-MM-dd");
        int opcion = JOptionPane.showConfirmDialog(
            this,
            calendario,
            "Seleccionar fecha",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (opcion == JOptionPane.OK_OPTION && calendario.getDate() != null) {

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            campo.setText(formato.format(calendario.getDate()));
        }
    }
    
    private void aplicarColumnaAccionesConductores() {
    TblListDrivers.getColumnModel().getColumn(10)
            .setCellRenderer(new ButtonRenderer());
    TblListDrivers.getColumnModel().getColumn(10)
            .setMaxWidth(40);
    TableOptionsHelper.configurarClicOpciones(
        TblListDrivers,10,
            
        row -> { // EDITAR
            TxtIDEditDriver.setText(
                    TblListDrivers.getValueAt(row, 0).toString()
            );
            TxtNameEditDriver.setText(
                    TblListDrivers.getValueAt(row, 1).toString()
            );
            TxtLastNameEditDriver.setText(
                    TblListDrivers.getValueAt(row, 2).toString()
            );
            TxtDocumentEditDriver.setText(
                    TblListDrivers.getValueAt(row, 3).toString()
            );
            TxtDocumentTypeEditDriver.setText(
                    TblListDrivers.getValueAt(row, 4).toString()
            );
            TxtPhoneEditDriver.setText(
                    TblListDrivers.getValueAt(row, 5).toString()
            );
            TxtEmailEditDriver.setText(
                    TblListDrivers.getValueAt(row, 6).toString()
            );
            TxtLicenceEditDriver.setText(
                    TblListDrivers.getValueAt(row, 7).toString()
            );

            TxtLicenceTypeEditDriver.setText(
                    TblListDrivers.getValueAt(row, 8).toString()
            );

            TxtExpDateEditDriver.setText(
                    TblListDrivers.getValueAt(row, 9).toString()
            );
            // El ID identifica al conductor, por eso no debería modificarse
            TxtIDEditDriver.setEditable(false);
        },
        row -> { // ELIMINAR
            String id = TblListDrivers.getValueAt(row, 0).toString();
            int confirm = JOptionPane.showConfirmDialog(
                    TblListDrivers,
                    "¿Seguro que quieres eliminar el conductor " + id + "?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    ControllerConductor.eliminarConductor(id);
                    JOptionPane.showMessageDialog(
                            TblListDrivers,
                            "Conductor eliminado correctamente."
                    );
                } catch (RuntimeException ex) {
                    JOptionPane.showMessageDialog(
                            TblListDrivers,
                            ex.getMessage()
                        );
                    }
                }
            }
        );
    }
   
    
    
    private void mostrarUsuarioEncontrado(Conductor conductor, Pasajero pasajero) {
        javax.swing.table.DefaultTableModel modelo =
            new javax.swing.table.DefaultTableModel(
                new String[]{
                    "ID", "Nombre", "Apellido", "Documento",
                    "Tipo Documento", "Teléfono", "Correo",
                    "Tipo Usuario", ""
                }, 0) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

        if (conductor != null) {

            modelo.addRow(new Object[]{
                conductor.getId(),
                conductor.getNombre(),
                conductor.getApellido(),
                conductor.getDocumento(),
                conductor.getTipoDocumento(),
                conductor.getTelefono(),
                conductor.getCorreo(),
                "Driver",
                ""
            });

        } else if (pasajero != null) {

            modelo.addRow(new Object[]{
                pasajero.getId(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getDocumento(),
                pasajero.getTipoDocumento(),
                pasajero.getTelefono(),
                pasajero.getCorreo(),
                "Passenger",
                ""
            });
        }

        TblListUsers.setModel(modelo);
        aplicarColumnaAccionesUsuarios();
    }

@Override
public void actualizar() {
    refrescarTablaUsuarios();
    refrescarTablaVehiculos(ControllerVehiculo.listarVehiculos());
}

private void aplicarColumnaAccionesUsuarios() {

    TblListUsers.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer());
    TblListUsers.getColumnModel().getColumn(8).setMaxWidth(40);

    TableOptionsHelper.configurarClicOpciones(
        TblListUsers,
        8,

        row -> { // Editar

            String tipo = TblListUsers.getValueAt(row, 7).toString();
            String id = TblListUsers.getValueAt(row, 0).toString();

            if (tipo.equalsIgnoreCase("Driver")) {

                Conductor conductor = ControllerConductor.buscarConductor(id);

                if (conductor != null) {
                    TxtIDEditDriver.setText(conductor.getId());
                    TxtNameEditDriver.setText(conductor.getNombre());
                    TxtLastNameEditDriver.setText(conductor.getApellido());
                    TxtDocumentEditDriver.setText(conductor.getDocumento());
                    TxtDocumentTypeEditDriver.setText(conductor.getTipoDocumento());
                    TxtPhoneEditDriver.setText(conductor.getTelefono());
                    TxtEmailEditDriver.setText(conductor.getCorreo());

                    TxtLicenceEditDriver.setText(conductor.getLicencia());
                    TxtLicenceTypeEditDriver.setText(conductor.getCategoriaLicencia());
                    TxtExpDateEditDriver.setText(conductor.getFechaVenciLicencia());

                    TxtIDEditDriver.setEditable(false);

                    ((java.awt.CardLayout) PanelUsers.getLayout())
                            .show(PanelUsers, "EditDriver");
                }

            } else {

                Pasajero pasajero = ControllerPasajero.buscarPasajero(id);

                if (pasajero != null) {
                    TxtIDEditPass.setText(pasajero.getId());
                    TxtNameEditPass.setText(pasajero.getNombre());
                    TxtLastNameEditPass.setText(pasajero.getApellido());
                    TxtDocumentEditPass.setText(pasajero.getDocumento());
                    TxtTypeDocumentEditPass.setText(pasajero.getTipoDocumento());
                    TxtPhoneEditPass.setText(pasajero.getTelefono());
                    TxtEmailEditPass.setText(pasajero.getCorreo());
                    TxtDateRegisterEditPass.setText(pasajero.getFechaRegistro());

                    TxtIDEditPass.setEditable(false);

                    ((java.awt.CardLayout) PanelUsers.getLayout())
                            .show(PanelUsers, "EditPassenger");
                }
            }
        },

        row -> { // Eliminar

            String tipo = TblListUsers.getValueAt(row, 7).toString();
            String id = TblListUsers.getValueAt(row, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(
                TblListUsers,
                "¿Seguro que quieres eliminar este usuario?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {

                try {

                    if (tipo.equalsIgnoreCase("Driver")) {
                        ControllerConductor.eliminarConductor(id);
                    } else {
                        ControllerPasajero.eliminarPasajero(id);
                    }

                    JOptionPane.showMessageDialog(
                        TblListUsers,
                        "Usuario eliminado correctamente."
                    );

                } catch (RuntimeException ex) {

                    JOptionPane.showMessageDialog(
                        TblListUsers,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
    );
}
    
    
    
    private void aplicarColumnaAccionesPasajeros() {
        TblListPassanger.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        TblListPassanger.getColumnModel().getColumn(7).setMaxWidth(40);

        TableOptionsHelper.configurarClicOpciones(TblListPassanger, 7,
            row -> { // Edit
                TxtIDEditPass.setText(TblListPassanger.getValueAt(row, 0).toString());
                TxtNameEditPass.setText(TblListPassanger.getValueAt(row, 1).toString());
                TxtLastNameEditPass.setText(TblListPassanger.getValueAt(row, 2).toString());
                TxtDocumentEditPass.setText(TblListPassanger.getValueAt(row, 3).toString());
                TxtTypeDocumentEditPass.setText(TblListPassanger.getValueAt(row, 4).toString());
                TxtEmailEditPass.setText(TblListPassanger.getValueAt(row, 5).toString());
                TxtPhoneEditPass.setText(TblListPassanger.getValueAt(row, 6).toString());
                ((java.awt.CardLayout) PanelUsers.getLayout()) .show(PanelUsers, "EditPassenger"); },
            row -> { // Delete
                String document = TblListPassanger.getValueAt(row, 0).toString();
                int confirm = JOptionPane.showConfirmDialog(TblListPassanger,
                        "¿Are you sure you want to remove this passenger? " + document + "?",
                        "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    try {
                        ControllerPasajero.eliminarPasajero(document);
                        JOptionPane.showMessageDialog(TblListPassanger, "Passenger successfully removed.");
                    } catch (RuntimeException ex) {
                        JOptionPane.showMessageDialog(TblListPassanger, ex.getMessage());
                    }
                }
            }
        );
    }
    
      
   
    
   
    private void aplicarColumnaAccionesVehiculos() {
        TblVehicles.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
        TblVehicles.getColumnModel().getColumn(7).setMaxWidth(40);

        TableOptionsHelper.configurarClicOpciones(TblVehicles, 7,
            row -> { // Edit
                TxtChangePlate.setText(TblVehicles.getValueAt(row, 0).toString());
                TxtChangeBrand.setText(TblVehicles.getValueAt(row, 1).toString());
                TxtChangeModel.setText(TblVehicles.getValueAt(row, 2).toString());
                TxtChangeYear.setText(TblVehicles.getValueAt(row, 3).toString());
                TxtChangeColor.setText(TblVehicles.getValueAt(row, 4).toString());
                TxtChangeFuelType.setText(TblVehicles.getValueAt(row, 5).toString());
                TxtChangeChassis.setText(TblVehicles.getValueAt(row, 6).toString());
                ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "EditVehicles");
            },
            row -> { // Delete
                String placa = TblVehicles.getValueAt(row, 0).toString();
                int confirm = JOptionPane.showConfirmDialog(TblVehicles,
                        "¿Seguro que quieres eliminar el vehículo " + placa + "?",
                        "Confirmar", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    try {
                        ControllerVehiculo.eliminarVehiculo(placa);
                        JOptionPane.showMessageDialog(TblVehicles, "Vehículo eliminado correctamente.");
                    } catch (RuntimeException ex) {
                        JOptionPane.showMessageDialog(TblVehicles, ex.getMessage());
                    }
                }
            }
        );
    }
    
    private String validarDatosVehiculo(String placa, String anioTexto, String marca,
        String modelo, String color, String tipoCombustible, String numeroChasis) {

    if (placa.isBlank() || marca.isBlank() || modelo.isBlank()
            || color.isBlank() || tipoCombustible.isBlank() || numeroChasis.isBlank()
            || anioTexto.isBlank()) {
        return "Todos los campos son obligatorios.";
    }

    // Placa colombiana: 3 letras + 3 números (ej: ABC123)
    if (!placa.matches("[A-Za-z]{3}[0-9]{3}")) {
        return "La placa debe tener el formato colombiano: 3 letras seguidas de 3 números (ej: ABC123).";
    }

    // Año: solo números, dentro de un rango razonable
    int anioActual = java.time.Year.now().getValue();
    int anio;
    try {
        anio = Integer.parseInt(anioTexto);
    } catch (NumberFormatException e) {
        return "El año debe ser un número válido.";
    }
    if (anio < 1900 || anio > anioActual + 1) {
        return "El año debe estar entre 1900 y " + (anioActual + 1) + ".";
    }

    // Chasis: exactamente 17 caracteres alfanuméricos (estándar VIN)
    if (!numeroChasis.matches("[A-Za-z0-9]{17}")) {
        return "El número de chasis debe tener exactamente 17 caracteres alfanuméricos.";
    }

    // Marca, modelo y color: solo letras y espacios
    if (!marca.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
        return "La marca solo debe contener letras.";
    }
    if (!color.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
        return "El color solo debe contener letras.";
    }
 
    return null; // todo válido
}
    
    private void limpiarCamposCreacionVehiculo() {
    TxtAddPlate.setText("");
    TxtAddBrand.setText("");
    TxtAddModel.setText("");
    TxtAddColor.setText("");
    TxtAddFuelType.setText("");
    TxtAddChassis.setText("");
    TxtAddYear.setText("");
 
}
    private void limpiarCamposCreacionDriver() {
    TxtIDCreateDriver.setText("");
    TxtNameCreateDriver.setText("");
    TxtLastNameCreateDriver.setText("");
    TxtDocumentCreateDriver.setText("");
    TxtDocumentTypeCreateDriver.setText("");
    TxtPhoneCreateDriver.setText("");
    TxtEmailCreateDriver.setText("");
    TxtLicenceCreateDriver.setText("");
    TxtLicenceTypeCreateDriver.setText("");
    TxtExpDateCreateDriver.setText("");
}

    public void limpiarCamposEditDriver() {
    TxtIDEditDriver.setText("");
    TxtNameEditDriver.setText("");
    TxtLastNameEditDriver.setText("");
    TxtDocumentEditDriver.setText("");
    TxtDocumentTypeEditDriver.setText("");
    TxtPhoneEditDriver.setText("");
    TxtEmailEditDriver.setText("");
    TxtLicenceEditDriver.setText("");
    TxtLicenceTypeEditDriver.setText("");
    TxtExpDateEditDriver.setText("");
    
}

    
    public void limpiarCamposEditPass() {
    TxtIDEditPass.setText("");
    TxtNameEditPass.setText("");
    TxtLastNameEditPass.setText("");
    TxtDocumentEditPass.setText("");
    TxtTypeDocumentEditPass.setText("");
    TxtPhoneEditPass.setText("");
    TxtEmailEditPass.setText("");
    TxtDateRegisterEditPass.setText("");
    }
    public void limpiarCamposAddPass() {
        TxtIDCreatePass.setText("");
        TxtNameCreatePass.setText("");
        TxtLastNameCreatePass.setText("");
        TxtDocumentCreatePass.setText("");
        TxtTypeDocumentCreatePass.setText("");
        TxtPhoneCreatePass.setText("");
        TxtEmailCreatePass.setText("");
        }
            
    private void limpiarCamposEdicionVehiculo() {
    TxtChangePlate.setText("");
    TxtChangeBrand.setText("");
    TxtChangeModel.setText("");
    TxtChangeColor.setText("");
    TxtChangeFuelType.setText("");
    TxtChangeChassis.setText("");
    TxtChangeYear.setText("");
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
        PanelListPassanger = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        TxtSearchTrips2 = new javax.swing.JTextField();
        BtnSearchTrips2 = new javax.swing.JButton();
        BtnAddTrips2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblListPassanger = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        PanelListUser = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        TxtSearchUser = new javax.swing.JTextField();
        BtnSearchTrips1 = new javax.swing.JButton();
        BtnAddUser = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblListUsers = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        PanelListDriver = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        TxtSearchTrips3 = new javax.swing.JTextField();
        BtnSearchTrips3 = new javax.swing.JButton();
        BtnAddTrips3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TblListDrivers = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        PanelAddDriver = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        TxtEmailCreateDriver = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        TxtNameCreateDriver = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        TxtPhoneCreateDriver = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        TxtIDCreateDriver = new javax.swing.JTextField();
        BtnCreateDriver = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        TxtLicenceCreateDriver = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        TxtLicenceTypeCreateDriver = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        TxtExpDateCreateDriver = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        TxtDocumentTypeCreateDriver = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        TxtDocumentCreateDriver = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        TxtLastNameCreateDriver = new javax.swing.JTextField();
        PanelEditPassenger = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TxtEmailEditPass = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        TxtNameEditPass = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        TxtPhoneEditPass = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        TxtIDEditPass = new javax.swing.JTextField();
        BtnEditPass = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        TxtLastNameEditPass = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        TxtDocumentEditPass = new javax.swing.JTextField();
        TxtTypeDocumentEditPass = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        TxtDateRegisterEditPass = new javax.swing.JTextField();
        PanelEditDriver = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        TxtEmailEditDriver = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        TxtNameEditDriver = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        TxtPhoneEditDriver = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        TxtIDEditDriver = new javax.swing.JTextField();
        BtnEditDriver = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        TxtLicenceEditDriver = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        TxtLicenceTypeEditDriver = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        TxtExpDateEditDriver = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        TxtDocumentEditDriver = new javax.swing.JTextField();
        TxtDocumentTypeEditDriver = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        TxtLastNameEditDriver = new javax.swing.JTextField();
        PanelAddPassenger = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtEmailCreatePass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNameCreatePass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPhoneCreatePass = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        TxtIDCreatePass = new javax.swing.JTextField();
        BtnCreatePassanger = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtLastNameCreatePass = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        TxtDocumentCreatePass = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        TxtTypeDocumentCreatePass = new javax.swing.JTextField();
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
        TxtChangeColor = new javax.swing.JTextField();
        BtnEditVehicles = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        TxtChangeFuelType = new javax.swing.JTextField();
        TxtChangeColor2 = new javax.swing.JTextField();
        TxtChangeChassis = new javax.swing.JLabel();
        TxtChangeYear = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
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
        TxtAddColor = new javax.swing.JTextField();
        BtnAddCreateVehicles = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        TxtAddFuelType = new javax.swing.JTextField();
        TxtAddChassis = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        TxtAddYear = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        PanelListVehicles = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        TxtSearchVehicles = new javax.swing.JTextField();
        BtnSearchVehicles = new javax.swing.JButton();
        BtnCreateVehicle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblVehicles = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

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
                .addContainerGap(250, Short.MAX_VALUE)
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
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel56.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 51));
        jLabel56.setText("Users / Passanger");

        jLabel57.setText("Search: ");

        TxtSearchTrips2.addActionListener(this::TxtSearchTrips2ActionPerformed);

        BtnSearchTrips2.setText("Search");
        BtnSearchTrips2.addActionListener(this::BtnSearchTrips2ActionPerformed);

        BtnAddTrips2.setText("Add");
        BtnAddTrips2.addActionListener(this::BtnAddTrips2ActionPerformed);

        TblListPassanger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDUser", "Name", "LastName", "Document", "DocumentType", "Phone", "Email", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TblListPassanger);
        if (TblListPassanger.getColumnModel().getColumnCount() > 0) {
            TblListPassanger.getColumnModel().getColumn(2).setHeaderValue("LastName");
        }

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setText("<-- ");
        jButton12.addActionListener(this::jButton12ActionPerformed);

        javax.swing.GroupLayout PanelListPassangerLayout = new javax.swing.GroupLayout(PanelListPassanger);
        PanelListPassanger.setLayout(PanelListPassangerLayout);
        PanelListPassangerLayout.setHorizontalGroup(
            PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListPassangerLayout.createSequentialGroup()
                .addGroup(PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListPassangerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelListPassangerLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSearchTrips2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSearchTrips2))))
                    .addGroup(PanelListPassangerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAddTrips2)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        PanelListPassangerLayout.setVerticalGroup(
            PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListPassangerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addGap(16, 16, 16)
                .addGroup(PanelListPassangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearchTrips2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips2)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAddTrips2)
                .addGap(25, 25, 25))
        );

        PanelUsers.add(PanelListPassanger, "ListPassanger");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 51));
        jLabel42.setText("Users");

        jLabel43.setText("Search: ");

        BtnSearchTrips1.setText("Search");
        BtnSearchTrips1.addActionListener(this::BtnSearchTrips1ActionPerformed);

        BtnAddUser.setText("Add");
        BtnAddUser.addActionListener(this::BtnAddUserActionPerformed);

        jButton2.setText("Drivers");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Passenger");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        TblListUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDUser", "Name", "LastName", "Document", "DocumentType", "Phone", "Email", "UserType", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TblListUsers);
        if (TblListUsers.getColumnModel().getColumnCount() > 0) {
            TblListUsers.getColumnModel().getColumn(2).setHeaderValue("LastName");
        }

        jButton4.setText("All");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout PanelListUserLayout = new javax.swing.GroupLayout(PanelListUser);
        PanelListUser.setLayout(PanelListUserLayout);
        PanelListUserLayout.setHorizontalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelListUserLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSearchTrips1))
                    .addGroup(PanelListUserLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3))
                    .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnAddUser)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PanelListUserLayout.setVerticalGroup(
            PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(20, 20, 20)
                .addGroup(PanelListUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips1)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAddUser)
                .addContainerGap())
        );

        PanelUsers.add(PanelListUser, "ListUsers");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 51));
        jLabel58.setText("Users / Drivers");

        jLabel59.setText("Search: ");

        BtnSearchTrips3.setText("Search");
        BtnSearchTrips3.addActionListener(this::BtnSearchTrips3ActionPerformed);

        BtnAddTrips3.setText("Add");
        BtnAddTrips3.addActionListener(this::BtnAddTrips3ActionPerformed);

        TblListDrivers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Document", "DocumentType", "Phone", "Email", "Licence", "TypeLicence", "Expiration date", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(TblListDrivers);

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("<-- ");
        jButton13.addActionListener(this::jButton13ActionPerformed);

        javax.swing.GroupLayout PanelListDriverLayout = new javax.swing.GroupLayout(PanelListDriver);
        PanelListDriver.setLayout(PanelListDriverLayout);
        PanelListDriverLayout.setHorizontalGroup(
            PanelListDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListDriverLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelListDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAddTrips3)
                    .addGroup(PanelListDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelListDriverLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelListDriverLayout.createSequentialGroup()
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtSearchTrips3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnSearchTrips3))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PanelListDriverLayout.setVerticalGroup(
            PanelListDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListDriverLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(16, 16, 16)
                .addGroup(PanelListDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearchTrips3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearchTrips3)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAddTrips3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanelUsers.add(PanelListDriver, "ListDriver");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 51));
        jLabel49.setText("Add Driver");

        jLabel65.setText("Name: ");

        TxtEmailCreateDriver.addActionListener(this::TxtEmailCreateDriverActionPerformed);

        jLabel66.setText("Email: ");

        jLabel67.setText("Phone: ");

        TxtPhoneCreateDriver.addActionListener(this::TxtPhoneCreateDriverActionPerformed);

        jLabel68.setText("ID:");

        TxtIDCreateDriver.addActionListener(this::TxtIDCreateDriverActionPerformed);

        BtnCreateDriver.setText("ADD");
        BtnCreateDriver.addActionListener(this::BtnCreateDriverActionPerformed);

        jLabel69.setText("License:");

        TxtLicenceCreateDriver.addActionListener(this::TxtLicenceCreateDriverActionPerformed);

        jLabel70.setText("LicenseType:");

        TxtLicenceTypeCreateDriver.addActionListener(this::TxtLicenceTypeCreateDriverActionPerformed);

        jLabel71.setText("License expiration date:");

        TxtExpDateCreateDriver.addActionListener(this::TxtExpDateCreateDriverActionPerformed);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("<-- ");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jLabel24.setText("Please enter the data:");

        jLabel72.setText("Document:");

        jLabel73.setText("DocumentType:");

        TxtDocumentCreateDriver.addActionListener(this::TxtDocumentCreateDriverActionPerformed);

        jLabel76.setText("Last Name: ");

        javax.swing.GroupLayout PanelAddDriverLayout = new javax.swing.GroupLayout(PanelAddDriver);
        PanelAddDriver.setLayout(PanelAddDriverLayout);
        PanelAddDriverLayout.setHorizontalGroup(
            PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDriverLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddDriverLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAddDriverLayout.createSequentialGroup()
                        .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnCreateDriver)
                                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel71)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtExpDateCreateDriver))
                                        .addGroup(PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel70)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtLicenceTypeCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel69)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtLicenceCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel68)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtIDCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel73)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtDocumentTypeCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel67)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtPhoneCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel66)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtEmailCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel72)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtDocumentCreateDriver))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel65)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtNameCreateDriver))
                                        .addGroup(PanelAddDriverLayout.createSequentialGroup()
                                            .addComponent(jLabel76)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtLastNameCreateDriver))))))
                        .addGap(0, 491, Short.MAX_VALUE))))
        );
        PanelAddDriverLayout.setVerticalGroup(
            PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddDriverLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(TxtIDCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(TxtNameCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(TxtLastNameCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDocumentCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73)
                    .addComponent(TxtDocumentTypeCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(TxtEmailCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(TxtPhoneCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(TxtLicenceCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(TxtLicenceTypeCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(TxtExpDateCreateDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnCreateDriver)
                .addContainerGap())
        );

        PanelUsers.add(PanelAddDriver, "AddDriver");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Edit Passanger");

        jLabel28.setText("Name: ");

        TxtEmailEditPass.addActionListener(this::TxtEmailEditPassActionPerformed);

        jLabel29.setText("Email: ");

        jLabel30.setText("Phone: ");

        TxtPhoneEditPass.addActionListener(this::TxtPhoneEditPassActionPerformed);

        jLabel55.setText("ID:");

        TxtIDEditPass.addActionListener(this::TxtIDEditPassActionPerformed);

        BtnEditPass.setText("Edit");
        BtnEditPass.addActionListener(this::BtnEditPassActionPerformed);

        jLabel31.setText("Last Name: ");

        TxtLastNameEditPass.addActionListener(this::TxtLastNameEditPassActionPerformed);

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("<-- ");
        jButton11.addActionListener(this::jButton11ActionPerformed);

        jLabel32.setText("Please enter the data you want to change:");

        jLabel40.setText("Document:");

        TxtDocumentEditPass.addActionListener(this::TxtDocumentEditPassActionPerformed);

        TxtTypeDocumentEditPass.addActionListener(this::TxtTypeDocumentEditPassActionPerformed);

        jLabel60.setText("TypeDocument:");

        jLabel61.setText("DateRegister:");

        TxtDateRegisterEditPass.addActionListener(this::TxtDateRegisterEditPassActionPerformed);

        javax.swing.GroupLayout PanelEditPassengerLayout = new javax.swing.GroupLayout(PanelEditPassenger);
        PanelEditPassenger.setLayout(PanelEditPassengerLayout);
        PanelEditPassengerLayout.setHorizontalGroup(
            PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDEditPass))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNameEditPass))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLastNameEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPhoneEditPass))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEmailEditPass))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDocumentEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTypeDocumentEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDateRegisterEditPass)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        PanelEditPassengerLayout.setVerticalGroup(
            PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditPassengerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(TxtIDEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TxtNameEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(TxtLastNameEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(TxtDocumentEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(TxtTypeDocumentEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(TxtEmailEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(TxtPhoneEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(TxtDateRegisterEditPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEditPass)
                .addContainerGap())
        );

        PanelUsers.add(PanelEditPassenger, "EditPassenger");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 51));
        jLabel45.setText("Edit Driver");

        jLabel46.setText("Name: ");

        TxtEmailEditDriver.addActionListener(this::TxtEmailEditDriverActionPerformed);

        jLabel47.setText("Email: ");

        jLabel48.setText("Phone: ");

        TxtPhoneEditDriver.addActionListener(this::TxtPhoneEditDriverActionPerformed);

        jLabel50.setText("ID:");

        TxtIDEditDriver.addActionListener(this::TxtIDEditDriverActionPerformed);

        BtnEditDriver.setText("Edit");
        BtnEditDriver.addActionListener(this::BtnEditDriverActionPerformed);

        jLabel51.setText("License:");

        TxtLicenceEditDriver.addActionListener(this::TxtLicenceEditDriverActionPerformed);

        jLabel63.setText("LicenseType:");

        TxtLicenceTypeEditDriver.addActionListener(this::TxtLicenceTypeEditDriverActionPerformed);

        jLabel64.setText("License expiration date:");

        TxtExpDateEditDriver.addActionListener(this::TxtExpDateEditDriverActionPerformed);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("<-- ");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        jLabel26.setText("Please enter the data you want to change:");

        jLabel74.setText("Document:");

        jLabel75.setText("DocumentType:");

        jLabel62.setText("LastName: ");

        javax.swing.GroupLayout PanelEditDriverLayout = new javax.swing.GroupLayout(PanelEditDriver);
        PanelEditDriver.setLayout(PanelEditDriverLayout);
        PanelEditDriverLayout.setHorizontalGroup(
            PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditDriverLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnEditDriver)
                        .addGroup(PanelEditDriverLayout.createSequentialGroup()
                            .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelEditDriverLayout.createSequentialGroup()
                                    .addComponent(jLabel64)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtExpDateEditDriver, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                                .addGroup(PanelEditDriverLayout.createSequentialGroup()
                                    .addComponent(jLabel75)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtDocumentTypeEditDriver))
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelEditDriverLayout.createSequentialGroup()
                                    .addComponent(jLabel74)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtDocumentEditDriver))
                                .addGroup(PanelEditDriverLayout.createSequentialGroup()
                                    .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtNameEditDriver, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addComponent(TxtEmailEditDriver)
                                        .addComponent(TxtLastNameEditDriver, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))))
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEditDriverLayout.createSequentialGroup()
                            .addComponent(jLabel48)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtPhoneEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEditDriverLayout.createSequentialGroup()
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtLicenceEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEditDriverLayout.createSequentialGroup()
                            .addComponent(jLabel63)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtLicenceTypeEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEditDriverLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 470, Short.MAX_VALUE))
        );
        PanelEditDriverLayout.setVerticalGroup(
            PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditDriverLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(TxtIDEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(TxtNameEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(TxtLastNameEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDocumentEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75)
                    .addComponent(TxtDocumentTypeEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(TxtEmailEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(TxtPhoneEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(TxtLicenceEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(TxtLicenceTypeEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(TxtExpDateEditDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnEditDriver)
                .addContainerGap())
        );

        PanelUsers.add(PanelEditDriver, "EditDriver");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("New Passanger");

        jLabel2.setText("Name: ");

        TxtEmailCreatePass.addActionListener(this::TxtEmailCreatePassActionPerformed);

        jLabel3.setText("Email: ");

        TxtNameCreatePass.addActionListener(this::TxtNameCreatePassActionPerformed);

        jLabel4.setText("Phone: ");

        TxtPhoneCreatePass.addActionListener(this::TxtPhoneCreatePassActionPerformed);

        jLabel44.setText("ID:");

        TxtIDCreatePass.addActionListener(this::TxtIDCreatePassActionPerformed);

        BtnCreatePassanger.setText("Add");
        BtnCreatePassanger.addActionListener(this::BtnCreatePassangerActionPerformed);

        jLabel6.setText("Last Name: ");

        TxtLastNameCreatePass.addActionListener(this::TxtLastNameCreatePassActionPerformed);

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("<-- ");
        jButton10.addActionListener(this::jButton10ActionPerformed);

        jLabel27.setText("Please enter the data:");

        jLabel33.setText("Document:");

        TxtDocumentCreatePass.addActionListener(this::TxtDocumentCreatePassActionPerformed);

        jLabel34.setText("TypeDocument:");

        TxtTypeDocumentCreatePass.addActionListener(this::TxtTypeDocumentCreatePassActionPerformed);

        javax.swing.GroupLayout PanelAddPassengerLayout = new javax.swing.GroupLayout(PanelAddPassenger);
        PanelAddPassenger.setLayout(PanelAddPassengerLayout);
        PanelAddPassengerLayout.setHorizontalGroup(
            PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCreatePassanger, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDCreatePass))
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNameCreatePass))
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLastNameCreatePass))
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPhoneCreatePass))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDocumentCreatePass))
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTypeDocumentCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEmailCreatePass)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        PanelAddPassengerLayout.setVerticalGroup(
            PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddPassengerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(TxtIDCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNameCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtLastNameCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(TxtDocumentCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(TxtTypeDocumentCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPhoneCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtEmailCreatePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(BtnCreatePassanger)
                .addContainerGap())
        );

        PanelUsers.add(PanelAddPassenger, "AddPassenger");

        jTabbedPane1.addTab("Users", PanelUsers);

        PanelHomeVehicles.setLayout(new java.awt.CardLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Edit Vehicles:");

        jLabel18.setText("Please enter the data you want to change:");

        jLabel19.setText("License plate: ");

        TxtChangePlate.addActionListener(this::TxtChangePlateActionPerformed);

        jLabel20.setText("Brand: ");

        TxtChangeBrand.addActionListener(this::TxtChangeBrandActionPerformed);

        jLabel21.setText("Model: ");

        TxtChangeModel.addActionListener(this::TxtChangeModelActionPerformed);

        jLabel23.setText("Color: ");

        TxtChangeColor.addActionListener(this::TxtChangeColorActionPerformed);

        BtnEditVehicles.setText("Edit");
        BtnEditVehicles.addActionListener(this::BtnEditVehiclesActionPerformed);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("<-- ");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jLabel35.setText("Fuel Type:");

        TxtChangeFuelType.addActionListener(this::TxtChangeFuelTypeActionPerformed);

        TxtChangeColor2.addActionListener(this::TxtChangeColor2ActionPerformed);

        TxtChangeChassis.setText("Chassis:");

        TxtChangeYear.addActionListener(this::TxtChangeYearActionPerformed);

        jLabel37.setText("Year:");

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
                                        .addComponent(TxtChangeColor))
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnEditVehicles, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TxtChangeModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtChangeFuelType))
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(TxtChangeChassis)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtChangeColor2))
                                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtChangeYear)))))
                        .addGap(112, 224, Short.MAX_VALUE))
                    .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                        .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelEditVehiclesLayout.setVerticalGroup(
            PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditVehiclesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(TxtChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TxtChangeFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtChangeChassis)
                    .addComponent(TxtChangeColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(TxtChangeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEditVehicles)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        PanelHomeVehicles.add(PanelEditVehicles, "EditVehicles");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Create Vehicles:");

        jLabel11.setText("Please enter the vehicle details:");

        jLabel12.setText("License plate: ");

        TxtAddPlate.addActionListener(this::TxtAddPlateActionPerformed);

        jLabel13.setText("Brand: ");

        TxtAddBrand.addActionListener(this::TxtAddBrandActionPerformed);

        jLabel14.setText("Model: ");

        TxtAddModel.addActionListener(this::TxtAddModelActionPerformed);

        jLabel17.setText("Color:");

        TxtAddColor.addActionListener(this::TxtAddColorActionPerformed);

        BtnAddCreateVehicles.setText("Add");
        BtnAddCreateVehicles.addActionListener(this::BtnAddCreateVehiclesActionPerformed);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("<-- ");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jLabel36.setText("Fuel Type:");

        TxtAddFuelType.addActionListener(this::TxtAddFuelTypeActionPerformed);

        TxtAddChassis.addActionListener(this::TxtAddChassisActionPerformed);

        jLabel38.setText("Chassis:");

        TxtAddYear.addActionListener(this::TxtAddYearActionPerformed);

        jLabel39.setText("Year:");

        javax.swing.GroupLayout PanelCreateVehiclesLayout = new javax.swing.GroupLayout(PanelCreateVehicles);
        PanelCreateVehicles.setLayout(PanelCreateVehiclesLayout);
        PanelCreateVehiclesLayout.setHorizontalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(TxtAddColor))
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnAddCreateVehicles, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtAddModel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtAddFuelType))
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtAddChassis))
                        .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtAddYear)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        PanelCreateVehiclesLayout.setVerticalGroup(
            PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateVehiclesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(TxtAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TxtAddFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(TxtAddChassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCreateVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TxtAddYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(BtnAddCreateVehicles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        PanelHomeVehicles.add(PanelCreateVehicles, "CreateVehicle");

        PanelListVehicles.setInheritsPopupMenu(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Vehicles");

        jLabel41.setText("Search: ");

        BtnSearchVehicles.setText("Search");
        BtnSearchVehicles.addActionListener(this::BtnSearchVehiclesActionPerformed);

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Add a new vehicle here:");

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
                        .addGroup(PanelListVehiclesLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtnCreateVehicle))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        PanelListVehiclesLayout.setVerticalGroup(
            PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListVehiclesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSearchVehicles)
                    .addComponent(TxtSearchVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(PanelListVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreateVehicle)
                    .addComponent(jLabel5))
                .addGap(228, 228, 228))
        );

        PanelHomeVehicles.add(PanelListVehicles, "ListVehicles");

        javax.swing.GroupLayout PanelVehiclesLayout = new javax.swing.GroupLayout(PanelVehicles);
        PanelVehicles.setLayout(PanelVehiclesLayout);
        PanelVehiclesLayout.setHorizontalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 315, Short.MAX_VALUE))
        );
        PanelVehiclesLayout.setVerticalGroup(
            PanelVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVehiclesLayout.createSequentialGroup()
                .addComponent(PanelHomeVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehicles", PanelVehicles);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtEmailCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailCreatePassActionPerformed

    private void TxtPhoneCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneCreatePassActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_BtnExitActionPerformed

    private void TxtAddPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddPlateActionPerformed

    private void TxtAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddBrandActionPerformed

    private void TxtAddModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddModelActionPerformed

    private void TxtAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddColorActionPerformed

    private void BtnAddCreateVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddCreateVehiclesActionPerformed
            String placa           = TxtAddPlate.getText().trim().toUpperCase();
            String marca            = TxtAddBrand.getText().trim();
            String modelo           = TxtAddModel.getText().trim();
            String color            = TxtAddColor.getText().trim();
            String tipoCombustible  = TxtAddFuelType.getText().trim();
            String numeroChasis     = TxtAddChassis.getText().trim().toUpperCase();
            String anioTexto        = TxtAddYear.getText().trim();

            String error = validarDatosVehiculo(placa, anioTexto, marca, modelo, color, tipoCombustible, numeroChasis);
            if (error != null) {
                JOptionPane.showMessageDialog(this, error, "Datos inválidos", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                Vehiculo nuevo = new Vehiculo(placa, Integer.parseInt(anioTexto), marca, modelo, color, tipoCombustible, numeroChasis);
                ControllerVehiculo.crearVehiculo(nuevo);
                JOptionPane.showMessageDialog(this, "Vehículo creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCamposCreacionVehiculo();
                java.awt.CardLayout cl = (java.awt.CardLayout) PanelHomeVehicles.getLayout();
                cl.show(PanelHomeVehicles, "ListVehicles"); 
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
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

    private void TxtChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeColorActionPerformed

    private void BtnEditVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditVehiclesActionPerformed
         String placa           = TxtChangePlate.getText().trim().toUpperCase();
    String marca           = TxtChangeBrand.getText().trim();
    String modelo          = TxtChangeModel.getText().trim();
    String color           = TxtChangeColor.getText().trim();
    String tipoCombustible = TxtChangeFuelType.getText().trim();
    String numeroChasis    = TxtChangeChassis.getText().trim().toUpperCase();
    String anioTexto       = TxtChangeYear.getText().trim();

    String error = validarDatosVehiculo(placa, anioTexto, marca, modelo, color, tipoCombustible, numeroChasis);
    if (error != null) {
        JOptionPane.showMessageDialog(this, error, "Datos inválidos", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Vehiculo actualizado = new Vehiculo(placa, Integer.parseInt(anioTexto), marca, modelo, color, tipoCombustible, numeroChasis);
        ControllerVehiculo.modificarVehiculo(actualizado);
        JOptionPane.showMessageDialog(this, "Vehículo actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarCamposEdicionVehiculo();
        java.awt.CardLayout cl = (java.awt.CardLayout) PanelHomeVehicles.getLayout();
        cl.show(PanelHomeVehicles, "ListVehicles"); 
    } catch (RuntimeException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }  
    }//GEN-LAST:event_BtnEditVehiclesActionPerformed

    private void BtnCreateVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateVehicleActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) PanelHomeVehicles.getLayout();
            cl.show(PanelHomeVehicles, "CreateVehicle"); // create
    }//GEN-LAST:event_BtnCreateVehicleActionPerformed

    private void BtnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddUserActionPerformed

    Object[] opciones = {"Driver", "Passager"};

    int seleccion = JOptionPane.showOptionDialog(
        this,                                   // componente padre
        "¿What type of user do you want to choose??",   // mensaje
        "New user",                        // título
        JOptionPane.YES_NO_OPTION,               // tipo (solo afecta iconos/orden por defecto)
        JOptionPane.QUESTION_MESSAGE,            // ícono
        null,                                    // ícono personalizado (null = default)
        opciones,                                // botones personalizados
        opciones[0]                              // botón por defecto
    );

    if (seleccion == 0) { // "Conductor"
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "AddDriver");
    } else if (seleccion == 1) { // "Pasajero"
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "AddPassenger");
    }
    // Si seleccion == JOptionPane.CLOSED_OPTION (-1), el usuario cerró el diálogo sin elegir: no hacer nada

    }//GEN-LAST:event_BtnAddUserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListDriver");
        refrescarTablaConductores(ControllerConductor.listarConductores());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListPassanger");
        refrescarTablaPasajero(ControllerPasajero.listarPasajero());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TxtIDCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDCreatePassActionPerformed

    private void BtnCreatePassangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreatePassangerActionPerformed
   String ID = TxtIDCreatePass.getText().trim().toUpperCase();
    String Name = TxtNameCreatePass.getText().trim();
    String LastName = TxtLastNameCreatePass.getText().trim();
    String Document = TxtDocumentCreatePass.getText().trim();
    String DocumentType = TxtTypeDocumentCreatePass.getText().trim();
    String Phone = TxtPhoneCreatePass.getText().trim();
    String Email = TxtEmailCreatePass.getText().trim();
    // Fecha de registro automática
    String fechaRegistro = java.time.LocalDate.now().toString();
    // Crear pasajero
    Pasajero nuevo = new Pasajero(
            Name,
            LastName,
            Document,
            DocumentType,
            Phone,
            Email,
            ID,
            fechaRegistro
    );
    // Validar los datos
    Boolean error = nuevo.validarDatosPasajero();
    if (error != true) {
        JOptionPane.showMessageDialog(
                this,
                error,
                "Datos inválidos",
                JOptionPane.ERROR_MESSAGE
        );
        return;
    }
    try {

        ControllerPasajero.crearPasajero(nuevo);

        JOptionPane.showMessageDialog(
                this,
                "Pasajero creado correctamente.",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE
        );
        limpiarCamposAddPass();

    } catch (RuntimeException ex) {

        JOptionPane.showMessageDialog(
                this,
                ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_BtnCreatePassangerActionPerformed

    private void TxtEmailEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailEditDriverActionPerformed

    private void TxtPhoneEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneEditDriverActionPerformed

    private void TxtIDEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDEditDriverActionPerformed

    private void BtnEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditDriverActionPerformed
        String ID = TxtIDEditDriver.getText().trim().toUpperCase();
String Name = TxtNameEditDriver.getText().trim();
String LastName = TxtLastNameEditDriver.getText().trim();
String Document = TxtDocumentEditDriver.getText().trim();
String DocumentType = TxtDocumentTypeEditDriver.getText().trim();
String Phone = TxtPhoneEditDriver.getText().trim();
String Email = TxtEmailEditDriver.getText().trim();

String License = TxtLicenceEditDriver.getText().trim().toUpperCase();
String CategoryLicense = TxtLicenceTypeEditDriver.getText().trim();
String ExpirationLicense = TxtExpDateEditDriver.getText().trim();

// Crear objeto actualizado
Conductor actualizado = new Conductor(
        ID,
        Name,
        LastName,
        Document,
        DocumentType,
        Phone,
        Email,
        License,
        CategoryLicense,
        ExpirationLicense
);

// Validar datos
String error = actualizado.validarDatosConductor();

if (error != null) {
    JOptionPane.showMessageDialog(
            this,
            error,
            "Datos inválidos",
            JOptionPane.ERROR_MESSAGE
    );
    return;
}

try {

    ControllerConductor.modificarConductor(actualizado);

    JOptionPane.showMessageDialog(
            this,
            "Conductor actualizado correctamente.",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE
    );

    limpiarCamposEditDriver();

} catch (RuntimeException ex) {

    JOptionPane.showMessageDialog(
            this,
            ex.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE
    );
}
    }//GEN-LAST:event_BtnEditDriverActionPerformed

    private void TxtLicenceEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLicenceEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLicenceEditDriverActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Developed by Ana Tique, Yaritxa Duarte, Laura Carvajal");    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "ListVehicles");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         ((java.awt.CardLayout) PanelHomeVehicles.getLayout()).show(PanelHomeVehicles, "ListVehicles");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void TxtLicenceTypeEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLicenceTypeEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLicenceTypeEditDriverActionPerformed

    private void TxtExpDateEditDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtExpDateEditDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtExpDateEditDriverActionPerformed

    private void TxtEmailCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailCreateDriverActionPerformed

    private void TxtPhoneCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneCreateDriverActionPerformed

    private void TxtIDCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDCreateDriverActionPerformed

    private void BtnCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateDriverActionPerformed
         String ID = TxtIDCreateDriver.getText().trim().toUpperCase();
         String Name = TxtNameCreateDriver.getText().trim();
         String LastName = TxtLastNameCreateDriver.getText().trim();
         String Document = TxtDocumentCreateDriver.getText().trim(); // TODO: agregar campo Documento
         String DocumentType = TxtDocumentTypeCreateDriver.getText().trim();
         String Phone = TxtPhoneCreateDriver.getText().trim();
         String Email = TxtEmailCreateDriver.getText().trim();
         String License = TxtLicenceCreateDriver.getText().trim().toUpperCase();
         String CategoryLicense = TxtLicenceTypeCreateDriver.getText().trim();
         String ExpirationLicense = TxtExpDateCreateDriver.getText().trim();
         // Crear conductor
         Conductor nuevo = new Conductor(
                 ID,
                 Name,
                 LastName,
                 Document,
                 DocumentType,
                 Phone,
                 Email,
                 License,
                 CategoryLicense,
                 ExpirationLicense
         );
         // Validar los datos
         String error = nuevo.validarDatosConductor();
         if (error != null) {
             JOptionPane.showMessageDialog(
                     this,
                     error,
                     "Datos inválidos",
                     JOptionPane.ERROR_MESSAGE);
             return;
         }
         try {
             ControllerConductor.crearConductor(nuevo);
             JOptionPane.showMessageDialog(
                     this,
                     "Conductor creado correctamente.",
                     "Éxito",
                     JOptionPane.INFORMATION_MESSAGE
             );
             limpiarCamposCreacionDriver();
             ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
         } catch (RuntimeException ex) {
             JOptionPane.showMessageDialog(
                     this,
                     ex.getMessage(),
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
    }//GEN-LAST:event_BtnCreateDriverActionPerformed

    private void TxtLicenceCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLicenceCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLicenceCreateDriverActionPerformed

    private void TxtLicenceTypeCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLicenceTypeCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLicenceTypeCreateDriverActionPerformed

    private void TxtExpDateCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtExpDateCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtExpDateCreateDriverActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void TxtLastNameCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLastNameCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLastNameCreatePassActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void TxtEmailEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailEditPassActionPerformed

    private void TxtPhoneEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPhoneEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPhoneEditPassActionPerformed

    private void TxtIDEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDEditPassActionPerformed
       
    }//GEN-LAST:event_TxtIDEditPassActionPerformed

    private void BtnEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditPassActionPerformed
                                      
    String ID = TxtIDEditPass.getText().trim().toUpperCase(); 
    String Name = TxtNameEditPass.getText().trim(); 
    String LastName = TxtLastNameEditPass.getText().trim(); 
    String Document = TxtDocumentEditPass.getText().trim(); 
    String DocumentType = TxtTypeDocumentEditPass.getText().trim(); 
    String Phone = TxtPhoneEditPass.getText().trim(); 
    String Email = TxtEmailEditPass.getText().trim(); 
    String FechaRegistro = TxtDateRegisterEditPass.getText().trim(); 

    // === VALIDACIONES DIRECTAS ===
    // Nombre: solamente letras y espacios
    if (!Name.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
        JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras y espacios.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return; // Detiene la ejecución del botón
    }

    // Apellido: solamente letras y espacios
    if (!LastName.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")) {
        JOptionPane.showMessageDialog(this, "El apellido solo debe contener letras y espacios.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Documento: solamente números
    if (!Document.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(this, "El documento solo debe contener números.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Teléfono: solamente números
    if (!Phone.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(this, "El teléfono solo debe contener números.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Correo electrónico
    if (!Email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
        JOptionPane.showMessageDialog(this, "El correo electrónico no tiene un formato válido.", "Error de validación", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // === CREACIÓN DEL OBJETO Y PROCESAMIENTO ===
    // Crear objeto actualizado 
    Pasajero actualizado = new Pasajero(Name, LastName, Document, DocumentType, Phone, Email, ID, FechaRegistro); 

    // Validación secundaria opcional (Si ya validaste arriba, esto podría no ser necesario, pero lo dejamos si tu clase hace otras revisiones)
    Boolean error = actualizado.validarDatosPasajero(); 
    if (error != true) { 
        JOptionPane.showMessageDialog(this, error, "Datos inválidos", JOptionPane.ERROR_MESSAGE); 
        return; 
    } 

    try { 
        ControllerPasajero.modificarPasajero(actualizado); 
        JOptionPane.showMessageDialog(this, "Pasajero actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE); 
        limpiarCamposEditPass(); 
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    } catch (RuntimeException ex) { 
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
    } 

        
    }//GEN-LAST:event_BtnEditPassActionPerformed

    private void TxtLastNameEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLastNameEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLastNameEditPassActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void BtnAddTrips2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTrips2ActionPerformed

        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "AddPassenger");
    }//GEN-LAST:event_BtnAddTrips2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void BtnAddTrips3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddTrips3ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "AddDriver");
    
    }//GEN-LAST:event_BtnAddTrips3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ((java.awt.CardLayout) PanelUsers.getLayout()).show(PanelUsers, "ListUsers");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void TxtDocumentCreateDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDocumentCreateDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDocumentCreateDriverActionPerformed

    private void TxtDocumentCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDocumentCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDocumentCreatePassActionPerformed

    private void TxtTypeDocumentCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTypeDocumentCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTypeDocumentCreatePassActionPerformed

    private void TxtChangeFuelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeFuelTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeFuelTypeActionPerformed

    private void TxtChangeColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeColor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeColor2ActionPerformed

    private void TxtChangeYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtChangeYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtChangeYearActionPerformed

    private void TxtAddFuelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddFuelTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddFuelTypeActionPerformed

    private void TxtAddChassisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddChassisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddChassisActionPerformed

    private void TxtAddYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAddYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAddYearActionPerformed

    private void BtnSearchVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchVehiclesActionPerformed
        String placa = TxtSearchVehicles.getText().trim().toUpperCase() ;

    if (placa.isBlank()) {
        JOptionPane.showMessageDialog(this, "Enter a license plate to search.");
        return;
    }

    Vehiculo encontrado = ControllerVehiculo.buscarVehiculo(placa);

    if (encontrado != null) {
        refrescarTablaVehiculos(java.util.List.of(encontrado));
    } else {
        JOptionPane.showMessageDialog(this, "No vehicle with that license plate was found. " + placa);
        refrescarTablaVehiculos(java.util.List.of());
    }
    }//GEN-LAST:event_BtnSearchVehiclesActionPerformed

    private void TxtDocumentEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDocumentEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDocumentEditPassActionPerformed

    private void TxtTypeDocumentEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTypeDocumentEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTypeDocumentEditPassActionPerformed

    private void TxtNameCreatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameCreatePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameCreatePassActionPerformed

    private void TxtDateRegisterEditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDateRegisterEditPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDateRegisterEditPassActionPerformed

    private void BtnSearchTrips1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchTrips1ActionPerformed
    String id = TxtSearchUser.getText().trim().toUpperCase();
    if (id.isBlank()) {
        JOptionPane.showMessageDialog(
            this,
            "Enter an ID to search.");
        return;
    }
    // Buscar conductor
    Conductor conductor = ControllerConductor.buscarConductor(id);
    if (conductor != null) {
        mostrarUsuarioEncontrado(conductor, null);
        return;
    }
    // Buscar pasajero
    Pasajero pasajero = ControllerPasajero.buscarPasajero(id);
    if (pasajero != null) {
        mostrarUsuarioEncontrado(null, pasajero);
        return;
    }
    // No encontrado
    JOptionPane.showMessageDialog(
        this,
        "No user with the ID " + id + " was found."
    );
    refrescarTablaUsuarios();
    }//GEN-LAST:event_BtnSearchTrips1ActionPerformed

    private void BtnSearchTrips3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchTrips3ActionPerformed
        String id = TxtSearchTrips3.getText().trim().toUpperCase() ;
    if (id.isBlank()) {
        JOptionPane.showMessageDialog(this, "Enter a ID to search.");
        return;
    }
    Conductor encontrado = ControllerConductor.buscarConductor(id);
    if (encontrado != null) {
        refrescarTablaConductores(java.util.List.of(encontrado));
    } else {
        JOptionPane.showMessageDialog(this, "No driver with that ID was found. " + id);
        refrescarTablaVehiculos(java.util.List.of());
    }
    }//GEN-LAST:event_BtnSearchTrips3ActionPerformed

    private void BtnSearchTrips2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchTrips2ActionPerformed
        String id = TxtSearchTrips2.getText().trim().toUpperCase() ;

    if (id.isBlank()) {
        JOptionPane.showMessageDialog(this, "Enter a ID to search.");
        return;
    }

    Pasajero encontrado = ControllerPasajero.buscarPasajero(id);

    if (encontrado != null) {
        refrescarTablaPasajero(java.util.List.of(encontrado));
    } else {
        JOptionPane.showMessageDialog(this, "No pasagger with that ID was found. " + id);
        refrescarTablaVehiculos(java.util.List.of());
    }
    }//GEN-LAST:event_BtnSearchTrips2ActionPerformed

    private void TxtSearchTrips2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchTrips2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSearchTrips2ActionPerformed

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
    private javax.swing.JButton BtnAddTrips2;
    private javax.swing.JButton BtnAddTrips3;
    private javax.swing.JButton BtnAddUser;
    private javax.swing.JButton BtnCreateDriver;
    private javax.swing.JButton BtnCreatePassanger;
    private javax.swing.JButton BtnCreateVehicle;
    private javax.swing.JButton BtnEditDriver;
    private javax.swing.JButton BtnEditPass;
    private javax.swing.JButton BtnEditVehicles;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnSearchTrips1;
    private javax.swing.JButton BtnSearchTrips2;
    private javax.swing.JButton BtnSearchTrips3;
    private javax.swing.JButton BtnSearchVehicles;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel JFXPanel;
    private javax.swing.JPanel PanelAddDriver;
    private javax.swing.JPanel PanelAddPassenger;
    private javax.swing.JPanel PanelCreateVehicles;
    private javax.swing.JPanel PanelEditDriver;
    private javax.swing.JPanel PanelEditPassenger;
    private javax.swing.JPanel PanelEditVehicles;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelHomeVehicles;
    private javax.swing.JPanel PanelListDriver;
    private javax.swing.JPanel PanelListPassanger;
    private javax.swing.JPanel PanelListUser;
    private javax.swing.JPanel PanelListVehicles;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JPanel PanelVehicles;
    private javax.swing.JTable TblListDrivers;
    private javax.swing.JTable TblListPassanger;
    private javax.swing.JTable TblListUsers;
    private javax.swing.JTable TblVehicles;
    private javax.swing.JTextField TxtAddBrand;
    private javax.swing.JTextField TxtAddChassis;
    private javax.swing.JTextField TxtAddColor;
    private javax.swing.JTextField TxtAddFuelType;
    private javax.swing.JTextField TxtAddModel;
    private javax.swing.JTextField TxtAddPlate;
    private javax.swing.JTextField TxtAddYear;
    private javax.swing.JTextField TxtChangeBrand;
    private javax.swing.JLabel TxtChangeChassis;
    private javax.swing.JTextField TxtChangeColor;
    private javax.swing.JTextField TxtChangeColor2;
    private javax.swing.JTextField TxtChangeFuelType;
    private javax.swing.JTextField TxtChangeModel;
    private javax.swing.JTextField TxtChangePlate;
    private javax.swing.JTextField TxtChangeYear;
    private javax.swing.JTextField TxtDateRegisterEditPass;
    private javax.swing.JTextField TxtDocumentCreateDriver;
    private javax.swing.JTextField TxtDocumentCreatePass;
    private javax.swing.JTextField TxtDocumentEditDriver;
    private javax.swing.JTextField TxtDocumentEditPass;
    private javax.swing.JTextField TxtDocumentTypeCreateDriver;
    private javax.swing.JTextField TxtDocumentTypeEditDriver;
    private javax.swing.JTextField TxtEmailCreateDriver;
    private javax.swing.JTextField TxtEmailCreatePass;
    private javax.swing.JTextField TxtEmailEditDriver;
    private javax.swing.JTextField TxtEmailEditPass;
    private javax.swing.JTextField TxtExpDateCreateDriver;
    private javax.swing.JTextField TxtExpDateEditDriver;
    private javax.swing.JTextField TxtIDCreateDriver;
    private javax.swing.JTextField TxtIDCreatePass;
    private javax.swing.JTextField TxtIDEditDriver;
    private javax.swing.JTextField TxtIDEditPass;
    private javax.swing.JTextField TxtLastNameCreateDriver;
    private javax.swing.JTextField TxtLastNameCreatePass;
    private javax.swing.JTextField TxtLastNameEditDriver;
    private javax.swing.JTextField TxtLastNameEditPass;
    private javax.swing.JTextField TxtLicenceCreateDriver;
    private javax.swing.JTextField TxtLicenceEditDriver;
    private javax.swing.JTextField TxtLicenceTypeCreateDriver;
    private javax.swing.JTextField TxtLicenceTypeEditDriver;
    private javax.swing.JTextField TxtNameCreateDriver;
    private javax.swing.JTextField TxtNameCreatePass;
    private javax.swing.JTextField TxtNameEditDriver;
    private javax.swing.JTextField TxtNameEditPass;
    private javax.swing.JTextField TxtPhoneCreateDriver;
    private javax.swing.JTextField TxtPhoneCreatePass;
    private javax.swing.JTextField TxtPhoneEditDriver;
    private javax.swing.JTextField TxtPhoneEditPass;
    private javax.swing.JTextField TxtSearchTrips2;
    private javax.swing.JTextField TxtSearchTrips3;
    private javax.swing.JTextField TxtSearchUser;
    private javax.swing.JTextField TxtSearchVehicles;
    private javax.swing.JTextField TxtTypeDocumentCreatePass;
    private javax.swing.JTextField TxtTypeDocumentEditPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
