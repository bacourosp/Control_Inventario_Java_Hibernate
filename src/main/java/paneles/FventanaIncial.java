package paneles;

//import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.PageAttributes.MediaType.C1;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelos.Usuario;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.JXCollapsiblePane;
import org.jdesktop.swingx.plaf.TaskPaneUI;
import org.pushingpixels.substance.api.skin.SubstanceAutumnLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlueSteelLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCeruleanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceCremeCoffeeLookAndFeel;
import org.pushingpixels.substance.internal.ui.SubstancePanelUI;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;

public class FventanaIncial extends javax.swing.JFrame {

    private static final String tabTomaFisicaTiendas = "Inventario Tiendas. ";
    private static final String tabAsignarMercancia = "Asignar Mercancia. ";
    private static final String tabTomaFisica = "Inventario Distribuidora. ";
    private static final String tabProducto = "Producto";
    private static final String tabSalida = "Mercancía Asignada a Tienda";
    private static final String tabFactura = "Registrar Container";
    private static final String tabClasificacion = "Clasificación";
    private static final String tabDepartamento = "Departamento";
    private static final String tabDivision = "División";
    private static final String tabMarca = "Marca";
    private static final String tabUbicacion = "Ubicación";
    private static final String tabProveedor = "Proveedor";
    private static final String tabContacto = "Contacto";
    private BufferedImage bg;
    public static List<List> listaUsuarioMain;

    public FventanaIncial() {
        initComponents();
    }

    public FventanaIncial(List<List> user) {
        FventanaIncial.listaUsuarioMain = user;

        initComponents();
        
        
        taskPaneProducto.add(jMenu2);
        
    }

    private void addPaneles(String titulo, Class panelNuevo) {
        try {

            int pos = isContained(titulo);
            if (pos == -1) {
                panel.addTab(titulo, (JPanel) panelNuevo.newInstance());
                panel.setSelectedIndex(panel.getTabCount() - 1);
            } else {
                panel.setSelectedIndex(pos);
            }

        } catch (InstantiationException | IllegalAccessException ex) {
            System.err.println("Exception AddPaneles" + ex);
        }
    }

    private int isContained(String titulo) {
        for (int i = 0; i < panel.getTabCount(); i++) {

            if (panel.getTabTitleAt(i).equals(titulo)) {
                return i;//si encontro, retorna la posicion

            }
        }

        return -1;//si nunca lo encontro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jpMenu = new javax.swing.JPopupMenu();
        jmConsultar = new javax.swing.JMenuItem();
        jmCrear = new javax.swing.JMenuItem();
        jmModificar = new javax.swing.JMenuItem();
        jmEliminar = new javax.swing.JMenuItem();
        jXCollapsiblePane2 = new org.jdesktop.swingx.JXCollapsiblePane();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jXCollapsiblePane1 = new org.jdesktop.swingx.JXCollapsiblePane();
        taskPaneModuloFacturacion = new org.jdesktop.swingx.JXTaskPane();
        taskPaneProducto = new org.jdesktop.swingx.JXTaskPane();
        btnCrudProducto = new javax.swing.JButton();
        btnCrudClasificacion = new javax.swing.JButton();
        btnCrudDepto = new javax.swing.JButton();
        btnCrudDivision = new javax.swing.JButton();
        btnCrudMarca = new javax.swing.JButton();
        taskPaneProveedores = new org.jdesktop.swingx.JXTaskPane();
        btnCrudProveedr = new javax.swing.JButton();
        btnCrudUbicacion = new javax.swing.JButton();
        btnCrudContact = new javax.swing.JButton();
        btnContainer = new javax.swing.JButton();
        taskPaneEtiquetas = new org.jdesktop.swingx.JXTaskPane();
        btnSalidaTienda = new javax.swing.JButton();
        taskPaneModuloTienda = new org.jdesktop.swingx.JXTaskPane();
        taskPaneModuloDeposito = new org.jdesktop.swingx.JXTaskPane();
        jButtonTomaFisica = new javax.swing.JButton();
        jXButton2 = new org.jdesktop.swingx.JXButton();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jXButton3 = new org.jdesktop.swingx.JXButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        try {
            bg = ImageIO.read(getClass().getResource("/iconos/logomiyake.png"));

        } catch (IOException ex) {
            Logger.getLogger(FventanaIncial.class

                .getName()).log(Level.SEVERE, null, ex);

        }
        panel = new com.ClosableTabbedPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 50, getWidth(), getHeight()-50, this);
            }

        };

        jXTaskPaneContainer1.setName("jXTaskPaneContainer1"); // NOI18N

        jpMenu.setName("jpMenu"); // NOI18N

        jmConsultar.setText("Consultar");
        jmConsultar.setName("jmConsultar"); // NOI18N
        jpMenu.add(jmConsultar);

        jmCrear.setText("Crear");
        jmCrear.setName("jmCrear"); // NOI18N
        jpMenu.add(jmCrear);

        jmModificar.setText("Modificar");
        jmModificar.setName("jmModificar"); // NOI18N
        jpMenu.add(jmModificar);

        jmEliminar.setText("Eliminar");
        jmEliminar.setName("jmEliminar"); // NOI18N
        jpMenu.add(jmEliminar);

        jXCollapsiblePane2.setComponentPopupMenu(jpMenu);
        jXCollapsiblePane2.setName("jXCollapsiblePane2"); // NOI18N

        jMenu2.setText("jMenu2");
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenu2.add(jMenuItem2);

        jMenu3.setText("jMenu3");
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenu2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 182, 201));
        setName("Form"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(107, 181, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.setForeground(new java.awt.Color(0, 73, 146));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setName("jPanel1"); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 80, 5);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415656208_Home.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415663705_reload_all_tabs.png"))); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415663403_010.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415656313_Exit.png"))); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 381));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jXCollapsiblePane1.setOpaque(false);
        jXCollapsiblePane1.setAlignmentX(0.0F);
        jXCollapsiblePane1.setName("jXCollapsiblePane1"); // NOI18N

        taskPaneModuloFacturacion.setTitle("Facturación");
        taskPaneModuloFacturacion.setName("taskPaneModuloFacturacion"); // NOI18N

        taskPaneProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415658077_database.png"))); // NOI18N
        taskPaneProducto.setSpecial(true);
        taskPaneProducto.setTitle("Productos");
        taskPaneProducto.setName("taskPaneProducto"); // NOI18N

        btnCrudProducto.setText("Producto");
        btnCrudProducto.setName("btnCrudProducto"); // NOI18N
        btnCrudProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrudProductoMouseEntered(evt);
            }
        });
        btnCrudProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudProductoActionPerformed(evt);
            }
        });
        taskPaneProducto.getContentPane().add(btnCrudProducto);

        btnCrudClasificacion.setText("Clasificación");
        btnCrudClasificacion.setName("btnCrudClasificacion"); // NOI18N
        btnCrudClasificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrudClasificacionMouseEntered(evt);
            }
        });
        btnCrudClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudClasificacionActionPerformed(evt);
            }
        });
        taskPaneProducto.getContentPane().add(btnCrudClasificacion);

        btnCrudDepto.setText("Departamento");
        btnCrudDepto.setName("btnCrudDepto"); // NOI18N
        btnCrudDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudDeptoActionPerformed(evt);
            }
        });
        taskPaneProducto.getContentPane().add(btnCrudDepto);

        btnCrudDivision.setText("División");
        btnCrudDivision.setName("btnCrudDivision"); // NOI18N
        btnCrudDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudDivisionActionPerformed(evt);
            }
        });
        taskPaneProducto.getContentPane().add(btnCrudDivision);

        btnCrudMarca.setText("Marca");
        btnCrudMarca.setComponentPopupMenu(jpMenu);
        btnCrudMarca.setName("btnCrudMarca"); // NOI18N
        btnCrudMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudMarcaActionPerformed(evt);
            }
        });
        taskPaneProducto.getContentPane().add(btnCrudMarca);

        taskPaneModuloFacturacion.getContentPane().add(taskPaneProducto);

        taskPaneProveedores.setCollapsed(true);
        taskPaneProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415665365_fork1.png"))); // NOI18N
        taskPaneProveedores.setSpecial(true);
        taskPaneProveedores.setTitle("Proveedores");
        taskPaneProveedores.setName("taskPaneProveedores"); // NOI18N

        btnCrudProveedr.setText("Proveedor");
        btnCrudProveedr.setName("btnCrudProveedr"); // NOI18N
        btnCrudProveedr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudProveedrActionPerformed(evt);
            }
        });
        taskPaneProveedores.getContentPane().add(btnCrudProveedr);

        btnCrudUbicacion.setText("Ubicación");
        btnCrudUbicacion.setName("btnCrudUbicacion"); // NOI18N
        btnCrudUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudUbicacionActionPerformed(evt);
            }
        });
        taskPaneProveedores.getContentPane().add(btnCrudUbicacion);

        btnCrudContact.setText("Contacto");
        btnCrudContact.setName("btnCrudContact"); // NOI18N
        btnCrudContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudContactActionPerformed(evt);
            }
        });
        taskPaneProveedores.getContentPane().add(btnCrudContact);

        btnContainer.setText("Registrar Container");
        btnContainer.setName("btnContainer"); // NOI18N
        btnContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContainerActionPerformed(evt);
            }
        });
        taskPaneProveedores.getContentPane().add(btnContainer);

        taskPaneModuloFacturacion.getContentPane().add(taskPaneProveedores);

        taskPaneEtiquetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Barcode.png"))); // NOI18N
        taskPaneEtiquetas.setSpecial(true);
        taskPaneEtiquetas.setTitle("Etiquetas");
        taskPaneEtiquetas.setName("taskPaneEtiquetas"); // NOI18N

        btnSalidaTienda.setText("Mercancía Asignada");
        btnSalidaTienda.setName("btnSalidaTienda"); // NOI18N
        btnSalidaTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaTiendaActionPerformed(evt);
            }
        });
        taskPaneEtiquetas.getContentPane().add(btnSalidaTienda);

        taskPaneModuloFacturacion.getContentPane().add(taskPaneEtiquetas);

        jXCollapsiblePane1.getContentPane().add(taskPaneModuloFacturacion);

        taskPaneModuloTienda.setTitle("Tienda");
        taskPaneModuloTienda.setName("taskPaneModuloTienda"); // NOI18N
        jXCollapsiblePane1.getContentPane().add(taskPaneModuloTienda);

        taskPaneModuloDeposito.setTitle("Depósito");
        taskPaneModuloDeposito.setName("taskPaneModuloDeposito"); // NOI18N

        jButtonTomaFisica.setText("Toma Fisica Distribuidora");
        jButtonTomaFisica.setName("jButtonTomaFisica"); // NOI18N
        jButtonTomaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTomaFisicaActionPerformed(evt);
            }
        });
        taskPaneModuloDeposito.getContentPane().add(jButtonTomaFisica);

        jXButton2.setText("Asignacion Mercancia General");
        jXButton2.setName("jXButton2"); // NOI18N
        jXButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton2ActionPerformed(evt);
            }
        });
        taskPaneModuloDeposito.getContentPane().add(jXButton2);

        jXButton1.setText("Toma Fisica Tiendas");
        jXButton1.setName("jXButton1"); // NOI18N
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton1ActionPerformed(evt);
            }
        });
        taskPaneModuloDeposito.getContentPane().add(jXButton1);

        jXButton3.setText("Consultar Inventario Por Tienda");
        jXButton3.setName("jXButton3"); // NOI18N
        jXButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton3ActionPerformed(evt);
            }
        });
        taskPaneModuloDeposito.getContentPane().add(jXButton3);

        jXCollapsiblePane1.getContentPane().add(taskPaneModuloDeposito);

        jButton1.setText("jButton1");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jXCollapsiblePane1.getContentPane().add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jXCollapsiblePane1.getContentPane().add(jButton2);

        jPanel2.add(jXCollapsiblePane1);

        jPanel3.add(jPanel2, java.awt.BorderLayout.LINE_START);

        panel.setAlignmentX(0.0F);
        panel.setAutoscrolls(true);
        panel.setMinimumSize(new java.awt.Dimension(100, 100));
        panel.setName("panel"); // NOI18N
        jPanel3.add(panel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrudClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudClasificacionActionPerformed
//       addPaneles(tabClasificacion, Pclasificacion.class);
    }//GEN-LAST:event_btnCrudClasificacionActionPerformed

    private void btnCrudMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudMarcaActionPerformed
//        addPaneles(tabMarca, Pmarca.class);
    }//GEN-LAST:event_btnCrudMarcaActionPerformed

    private void btnCrudDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudDeptoActionPerformed
        //    addPaneles(tabDepartamento, Pdepartamento.class);
    }//GEN-LAST:event_btnCrudDeptoActionPerformed

    private void btnCrudContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudContactActionPerformed
        //   addPaneles(tabContacto, Pcontacto.class);
    }//GEN-LAST:event_btnCrudContactActionPerformed

    private void btnCrudDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudDivisionActionPerformed
        //   addPaneles(tabDivision, Pdivision.class);
    }//GEN-LAST:event_btnCrudDivisionActionPerformed

    private void btnCrudProveedrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudProveedrActionPerformed
        //   addPaneles(tabProveedor, Pproveedor.class);
    }//GEN-LAST:event_btnCrudProveedrActionPerformed

    private void btnCrudProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudProductoActionPerformed
        //   addPaneles(tabProducto, Pproducto.class);
    }//GEN-LAST:event_btnCrudProductoActionPerformed

    private void btnCrudUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudUbicacionActionPerformed
        //   addPaneles(tabUbicacion, Pubicacion.class);
    }//GEN-LAST:event_btnCrudUbicacionActionPerformed

    private void btnContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContainerActionPerformed
        //   addPaneles(tabFactura, Pfactura.class);
    }//GEN-LAST:event_btnContainerActionPerformed

    private void btnSalidaTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaTiendaActionPerformed
        //   addPaneles(tabSalida, Psalida_p_tienda.class);
    }//GEN-LAST:event_btnSalidaTiendaActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String rutaJasper = "src/main/resources/reportes/imagenparametro.jasper";
        String rutaJrxml = "src/main/resources/reportes/imagenparametro.jrxml";
        String rutaImagen = "src/main/resources/imagenes/Salir.png";
        try {
            JasperPrint jasperPrint = null;

            Map<String, Object> parametro = new HashMap<>();

            BufferedImage imagen = ImageIO.read(getClass().getResource("/imagenes/Salir.png"));

            parametro.put("imagen", imagen);

            JasperCompileManager.compileReportToFile(rutaJrxml, rutaJasper);
            jasperPrint = JasperFillManager.fillReport(rutaJasper, parametro, new JREmptyDataSource());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setTitle("Imagen");
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        panel.removeAll();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String rutaJasper = "src/main/resources/reportes/ReporteConteoMercancia.jasper";
        String rutaJrxml = "src/main/resources/reportes/ReporteConteoMercancia.jrxml";

        try {
            JasperPrint jasperPrint = null;
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:postgresql://192.2.1.70:5432/miyake_pasantia", "postgres", "admin");
            JasperCompileManager.compileReportToFile(rutaJrxml, rutaJasper);
            jasperPrint = JasperFillManager.fillReport(rutaJasper, null, conexion);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setTitle("Reporte Conteo de Mercancía");
            jasperViewer.setVisible(true);

//            
//            JasperReport reporte = (JasperReport) JRLoader.loadObject("report2.jasper");
//            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion);
//            JRExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
//            exporter.exportReport();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonTomaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTomaFisicaActionPerformed

        addPaneles(tabTomaFisica, TomaFisicaInventarioDistribuidora.class);

    }//GEN-LAST:event_jButtonTomaFisicaActionPerformed

    private void jXButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton1ActionPerformed

        addPaneles(tabTomaFisicaTiendas, TomaFisicaInventarioTiendas.class);

    }//GEN-LAST:event_jXButton1ActionPerformed

    private void jXButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton2ActionPerformed

        addPaneles(tabAsignarMercancia, AsignarMercancia.class);

    }//GEN-LAST:event_jXButton2ActionPerformed

    private void jXButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton3ActionPerformed

        addPaneles(tabAsignarMercancia, JDConcultaInventario.class);

// TODO add your handling code here:
    }//GEN-LAST:event_jXButton3ActionPerformed

    private void btnCrudProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrudProductoMouseEntered
        Component cpm = (Component) evt.getSource();
        jpMenu.show(cpm,
                cpm.getWidth(),
                0);

    }//GEN-LAST:event_btnCrudProductoMouseEntered

    private void btnCrudClasificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrudClasificacionMouseEntered
        Component cpm = (Component) evt.getSource();
        jpMenu.show(cpm,
                cpm.getWidth(),
                0);
        
     
        
    }//GEN-LAST:event_btnCrudClasificacionMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new FventanaIncial().setVisible(true);
//                try {
//                   // UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
//
//                    //me gusta    UIManager.setLookAndFeel(new SubstanceCremeCoffeeLookAndFeel());
//                    //TaskPaneUI.createUI(new (TaskPaneUI)SubstanceCremeCoffeeLookAndFeel());
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(FventanaIncial.class.getName()).log(Level.SEVERE, null, ex);
//                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContainer;
    private javax.swing.JButton btnCrudClasificacion;
    private javax.swing.JButton btnCrudContact;
    private javax.swing.JButton btnCrudDepto;
    private javax.swing.JButton btnCrudDivision;
    private javax.swing.JButton btnCrudMarca;
    private javax.swing.JButton btnCrudProducto;
    private javax.swing.JButton btnCrudProveedr;
    private javax.swing.JButton btnCrudUbicacion;
    private javax.swing.JButton btnSalidaTienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonTomaFisica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXButton jXButton2;
    private org.jdesktop.swingx.JXButton jXButton3;
    private org.jdesktop.swingx.JXCollapsiblePane jXCollapsiblePane1;
    private org.jdesktop.swingx.JXCollapsiblePane jXCollapsiblePane2;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private javax.swing.JMenuItem jmConsultar;
    private javax.swing.JMenuItem jmCrear;
    private javax.swing.JMenuItem jmEliminar;
    private javax.swing.JMenuItem jmModificar;
    private javax.swing.JPopupMenu jpMenu;
    private com.ClosableTabbedPane panel;
    private org.jdesktop.swingx.JXTaskPane taskPaneEtiquetas;
    private org.jdesktop.swingx.JXTaskPane taskPaneModuloDeposito;
    private org.jdesktop.swingx.JXTaskPane taskPaneModuloFacturacion;
    private org.jdesktop.swingx.JXTaskPane taskPaneModuloTienda;
    private org.jdesktop.swingx.JXTaskPane taskPaneProducto;
    private org.jdesktop.swingx.JXTaskPane taskPaneProveedores;
    // End of variables declaration//GEN-END:variables
}
