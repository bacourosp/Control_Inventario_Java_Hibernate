/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.anotaciones.util;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelos.Clasificacion;
import modelos.Contacto;
import modelos.Departamento;
import modelos.Division;
import modelos.EntradaProveedor;
import modelos.Factura;
import modelos.InventarioTienda;

import modelos.Marca;

import modelos.Producto;
import modelos.Proveedor;
import modelos.SalidaParaTienda;
import modelos.SalidaParaTiendaDetalle;
import modelos.Ubicacion;
import modelos.Usuario;

public abstract class JavaUtil {

    public static final String cons_seleccionar = "Seleccionar";
    public static final String cons_rutaFacturasDigitales = "\\\\192.2.1.99\\datos_usuarios en D\\PASANTIA2014\\ARCHIVOS FACTURAS DIGITALES\\";
    public static final double iva = 0.12;
    public static final DecimalFormat dosDecimales = new DecimalFormat("#.##");
    private static int cont = 0;

    //tratar de hacerlo con beans o xml para ser generico con proyecto
    //se puede hacer metodo que regrese toda su info con un map o list

    public static Vector<Object> getGenericRowTable(Object o) {
        Vector<Object> oneRow = new Vector<>();

        try {

            if (o instanceof Division) {
                Division d = (Division) o;
                oneRow.add(d.getIdDivision());
                oneRow.add(d.getNombre());
            }
            if (o instanceof Departamento) {
                Departamento d = (Departamento) o;
                oneRow.add(d.getIdDepartamento());
                oneRow.add(d.getNombre());
                oneRow.add(d.getIdDivision() == null ? null : d.getIdDivision().getNombre());

            }
            if (o instanceof Clasificacion) {
                Clasificacion c = (Clasificacion) o;
                oneRow.add(c.getIdClasificacion());
                oneRow.add(c.getNombre());
                oneRow.add(c.getIdDepartamento() == null ? null : c.getIdDepartamento().getNombre());
            }

            if (o instanceof Marca) {
                Marca m = (Marca) o;
                oneRow.add(m.getIdMarca());
                oneRow.add(m.getNombre());
            }

            if (o instanceof Ubicacion) {
                Ubicacion u = (Ubicacion) o;
                oneRow.add(u.getIdUbicacion());
                oneRow.add(u.getPais());
                oneRow.add(u.getCiudad());
                oneRow.add(u.getDireccion());
            }

            if (o instanceof Contacto) {
                Contacto c = (Contacto) o;
                oneRow.add(c.getIdContacto());
                oneRow.add(c.getNombre());
                oneRow.add(c.getPuesto());
                oneRow.add(c.getTelefono1());
                oneRow.add(c.getTelefono2());
                oneRow.add(c.getEmail());
            }
            if (o instanceof Usuario) {
                Usuario u = (Usuario) o;
                oneRow.add(u.getNombre());
                oneRow.add(u.getDescripcion());
                oneRow.add(u.getTipoUsuario());
                oneRow.add(u.getTienda());
            }
            if (o instanceof Proveedor) {
                Proveedor p = (Proveedor) o;
                oneRow.add(p.getNombre());
                oneRow.add(p.getTelefono1());
                oneRow.add(p.getTelefono2());
                oneRow.add(p.getFax());
                oneRow.add(p.getCodPostal());
                oneRow.add(p.getEmail());
                oneRow.add(p.getIdContactoGerente() == null ? null : p.getIdContactoGerente().getNombre());
                oneRow.add(p.getIdContacto1() == null ? null : p.getIdContacto1().getNombre());
                oneRow.add(p.getIdContacto2() == null ? null : p.getIdContacto2().getNombre());
                oneRow.add(p.getFechaCreacion());
                oneRow.add(p.getFechaModificacion());
            }
            if (o instanceof Producto) {
                Producto p = (Producto) o;
                oneRow.add(p.getIdProducto());
                oneRow.add(p.getReferenciaProducto());
                oneRow.add(p.getDescripcion());
                oneRow.add(p.getIdClasificacion().getNombre());
                oneRow.add(p.getIdMarca().getNombre());
                oneRow.add(p.getIdProveedor().getNombre());
                oneRow.add(p.getPrecioOriginal());
            }

            if (o instanceof SalidaParaTiendaDetalle) {
                SalidaParaTiendaDetalle s = (SalidaParaTiendaDetalle) o;
                oneRow.add(s.getProducto().getIdProducto());
                oneRow.add(s.getProducto().getReferenciaProducto());
                oneRow.add(s.getProducto().getDescripcion());
                oneRow.add(s.getCantidadProducto());
                oneRow.add(s.getNroBulto());
            }
            if (o instanceof Factura) {
                Factura f = (Factura) o;
                oneRow.add(f.getNroFactura());
                oneRow.add(f.getTotalFactura());
                oneRow.add(f.getRecibidoPor());
                oneRow.add(f.getEmbarcadoVia());
                oneRow.add(f.getIdAlmacen().getNombre());
                oneRow.add(f.getIdProveedor().getNombre());

            }

            if (o instanceof EntradaProveedor) {
                EntradaProveedor ep = (EntradaProveedor) o;
                oneRow.add(ep.getIdProducto().getIdProducto());
                oneRow.add(ep.getIdProducto().getDescripcion());
                oneRow.add(ep.getCantidadSet());
                oneRow.add(ep.getCantidadProducto());
                oneRow.add(ep.getCantidadSet() * ep.getCantidadProducto());
                oneRow.add(ep.getNroBulto());
                oneRow.add(ep.getFechaRecepcion());
            }
            if (o instanceof InventarioTienda) {
                InventarioTienda inv = (InventarioTienda) o;
                oneRow.add(inv.getAlmacen().getNombre());
                oneRow.add(inv.getProducto().getIdClasificacion().getNombre());
                oneRow.add(inv.getProducto().getIdProducto());
                oneRow.add(inv.getProducto().getReferenciaProducto());
                oneRow.add(inv.getProducto().getIdMarca().getNombre());
                oneRow.add(inv.getProducto().getDescripcion());
                oneRow.add(inv.getCantidad());

            }
            if (o instanceof SalidaParaTienda) {
                SalidaParaTienda sa = (SalidaParaTienda) o;
                oneRow.add(sa.getIdAlmacenDesde().getNombre());
                oneRow.add(sa.getIdUsuario2());
                oneRow.add(sa.getIdAlmacenHasta().getNombre());
                oneRow.add(sa.getIdAlmacenHasta().getTelefono1());
                oneRow.add(sa.getRevisado());
                oneRow.add(sa.getTotal());
                oneRow.add(sa.getFechaAsignacion());
            }

            if (o instanceof SalidaParaTiendaDetalle) {
                SalidaParaTiendaDetalle sd = (SalidaParaTiendaDetalle) o;
                oneRow.add(sd.getProducto().getIdProducto());
                oneRow.add(sd.getProducto().getReferenciaProducto());
                oneRow.add(sd.getProducto().getDescripcion());
                oneRow.add(sd.getProducto().getIdMarca().getNombre());
                oneRow.add(sd.getProducto().getUltimaActividad());
            }

        } catch (Exception ex) {
            Logger.getLogger(JavaUtil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, cont);
        }
        return oneRow;
    }

    public static Vector<String> getGenericHeaderTable(Object o) {

        Vector<String> header = new Vector<>();

        try {
            if (o instanceof Division) {
                header.add("ID Division");
                header.add("Nombre");
            }
            if (o instanceof Departamento) {
                header.add("ID Departamento");
                header.add("Nombre");
                header.add("Division");
            }
            if (o instanceof Clasificacion) {
                header.add("ID Clasificación");
                header.add("Nombre Clasificación");
                header.add("Departamento");
            }
            if (o instanceof Marca) {
                header.add("ID Marca");
                header.add("Nombre Marca");
            }
            if (o instanceof Ubicacion) {
                header.add("ID Ubicación");
                header.add("Pais");
                header.add("Ciudad");
                header.add("Dirección");
            }
            if (o instanceof Contacto) {
                header.add("Id Contacto");
                header.add("Nombre");
                header.add("Puesto");
                header.add("Telefono 1");
                header.add("Telefono 2");
                header.add("Correo");
            }
            if (o instanceof Usuario) {
                header.add("Nombre");
                header.add("Descripción");
                header.add("Tipo de Usuario");
                header.add("Tienda");
            }
            if (o instanceof Proveedor) {
                header.add("Nombre");
                header.add("Telefono 1");
                header.add("Telefono 2");
                header.add("Fax");
                header.add("Código Postal");
                header.add("Correo");
                header.add("Gerente");
                header.add("Contacto");
                header.add("Otro Contacto");
                header.add("Fecha de Creación");
                header.add("Fecha de Modificación");
            }

            if (o instanceof Producto) {
                header.add("Código Producto");
                header.add("Referencia");
                header.add("Código Externo");
                header.add("Descripción");
                header.add("Clasificación");
                header.add("Marca");
                header.add("Proveedor");
                header.add("Precio Original");
                header.add("Precio de venta");

            }

            if (o instanceof SalidaParaTiendaDetalle) {
                header.add("Codigo");
                header.add("Referencia");
                header.add("Descripcion");
                header.add("Cantidad");
                header.add("Precio");
                header.add("Bulto");
            }

            if (o instanceof EntradaProveedor) {
                header.add("Codigo Producto");
                header.add("Descripcion");
                header.add("UM");
                header.add("Cantidad Producto");
                header.add("Total Conteo");
                header.add("Nro bulto");
                header.add("Fecha recepcion");
            }
            if (o instanceof Factura) {

                header.add("Nro Factura");
                header.add("Total Factura");
                header.add("Recibido Por");
                header.add("Embarcado Via");
                header.add("Almacen");
                header.add("Proveedor");
            }
            if (o instanceof InventarioTienda) {

                header.add("Almacen");
                header.add("Clasificacion");
                header.add("Nro Producto");
                header.add("Ref Producto");
                header.add("Marca");
                header.add("Descripcion");
                header.add("Cantidad");

            }
            if (o instanceof SalidaParaTienda) {

                header.add("Almacen Distribuidor");
                header.add("Asignado Por");
                header.add("Almacen Asignado");
                header.add("Telefono");
                header.add("Estatus de Pedido");
                header.add("Total");
                header.add("Fecha");
            }

//             if(o instanceof SalidaParaTiendaDetalle){
//                
//                 header.add("Nombre Almacen");
//                 header.add("Id Almacen");
//                 header.add("Estatus de Pedido");
//                 header.add("Total");
//                 header.add("Fecha");
//            }
        } catch (Exception ex) {
            Logger.getLogger(JavaUtil.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, cont);
        }

        return header;
    }

    public static void displayResult(List resultList, JTable tabla) {
        if (resultList == null || resultList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros");
            return;
        }

        Vector<String> tableHeaders = getGenericHeaderTable(resultList.get(0));
        Vector tableData = new Vector();

        cont = 0;
        for (Object o : resultList) {
            tableData.add(getGenericRowTable(o));
            cont++;
        }

        tabla.setModel(new DefaultTableModel(tableData, tableHeaders));
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void createJDialogGeneric(JPanel panelagregar) {
        JDialog dialogo = new JDialog();
        dialogo.getContentPane().setLayout(new BorderLayout());
        dialogo.getContentPane().add(new JScrollPane(panelagregar), BorderLayout.CENTER);
        dialogo.pack();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        Point p
                = new Point(
                        (int) ((d.getWidth() - dialogo.getWidth()) / 2),
                        (int) ((d.getHeight() - dialogo.getHeight()) / 2));
        dialogo.setLocation(p);
        dialogo.setModal(true);
        dialogo.setVisible(true);
    }

    public static void setTableCellAlignment(int alignment, JTable table) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(alignment);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.setDefaultRenderer(table.getColumnClass(i), renderer);
        }
        table.updateUI();
    }

    public static void copyFile(String source, String dest) throws FileNotFoundException, IOException {
        if (source == null || dest == null || source.equals("") || dest.equals("")) {
            return;
        }
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
