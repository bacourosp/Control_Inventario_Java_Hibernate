/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import hibernate.anotaciones.util.JavaUtil;
import hibernate.anotaciones.util.ObjectModelDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelos.Departamento;
import modelos.Division;

/**
 *
 * @author Usuario
 */
public class Fdepartamento extends javax.swing.JFrame {
    
    private List resultList_departamento;
    private List resultList_division;
    private int pos;
    
    public Fdepartamento() {
        initComponents();
        
        tablaDeletDep.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    
                    if (tablaDeletDep.getSelectedRow() == -1) {
                        return;
                    }
                    pos = tablaDeletDep.getSelectedRow();
                    
                }
            }
        });
        
        tablaModfDep.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    
                    if (tablaModfDep.getSelectedRow() == -1) {
                        return;
                    }
                    pos = tablaModfDep.getSelectedRow();
                    Departamento d = (Departamento) resultList_departamento.get(pos);
                    idDepartamento.setText(d.getIdDepartamento().toString());
                    modfNombre.setText(d.getNombre());
                    cb_divisionModificar.setSelectedItem(d.getIdDivision().getNombre());
                }
            }
        ;
    }
    
    );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScrudDep = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoDepartamentos = new org.jdesktop.swingx.JXTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bCrear = new javax.swing.JButton();
        nuevDep = new javax.swing.JTextField();
        cb_divisionCrear = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        bCrearDivision = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaModfDep = new org.jdesktop.swingx.JXTable();
        jLabel3 = new javax.swing.JLabel();
        modfNombre = new javax.swing.JTextField();
        cb_divisionModificar = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        idDepartamento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bCrearDivision1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDeletDep = new org.jdesktop.swingx.JXTable();
        bDelet_dep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelScrudDep.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelScrudDepStateChanged(evt);
            }
        });

        listadoDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Departamento", "Nombre", "Division"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listadoDepartamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelScrudDep.addTab("Consultar", jPanel1);

        jLabel1.setText("Nombre del Departamento");

        bCrear.setText("Crear Departamento");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de division");

        bCrearDivision.setText("Crear División");
        bCrearDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuevDep)
                            .addComponent(cb_divisionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(bCrearDivision))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(bCrear)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nuevDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_divisionCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bCrearDivision))
                .addGap(18, 18, 18)
                .addComponent(bCrear)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        panelScrudDep.addTab("Crear", jPanel2);

        tablaModfDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Departamento", "Nombre", "Division"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaModfDep);

        jLabel3.setText("Nombre Departamento");

        jLabel4.setText("Division a la que Pertenece");

        bModificar.setText("Modificar Departamento");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        idDepartamento.setText("ID Departamento");

        jLabel6.setText("ID Departamento");

        bCrearDivision1.setText("Crear División");
        bCrearDivision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearDivision1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(modfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_divisionModificar, javax.swing.GroupLayout.Alignment.LEADING, 0, 252, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(30, 30, 30)
                                        .addComponent(idDepartamento)))
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 72, Short.MAX_VALUE)
                                .addComponent(bModificar)
                                .addGap(60, 60, 60))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCrearDivision1)
                        .addGap(77, 77, 77))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idDepartamento))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_divisionModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(bCrearDivision1)
                .addGap(18, 18, 18)
                .addComponent(bModificar)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelScrudDep.addTab("Modificar", jPanel3);

        tablaDeletDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Departamento", "Nombre", "Division"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDeletDep);

        bDelet_dep.setText("Eliminar");
        bDelet_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelet_depActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bDelet_dep)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addComponent(bDelet_dep)
                .addGap(124, 124, 124))
        );

        panelScrudDep.addTab("Eliminar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelScrudDep, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelScrudDep)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelScrudDepStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelScrudDepStateChanged
        if (panelScrudDep.getSelectedIndex() == 0) {
            String sql = "FROM Departamento d order by d.idDepartamento asc";
            List resultList = ObjectModelDAO.getResultQuery(sql);
            
            JavaUtil.displayResult(resultList, listadoDepartamentos);
            listadoDepartamentos.setEditable(false);
        }
        
        if (panelScrudDep.getSelectedIndex() == 1) {
            nuevDep.setText("");
            resultList_division = ObjectModelDAO.getResultQuery("FROM Division d order by d.idDivision asc");
            cb_divisionCrear.removeAllItems();
            for (Object object : resultList_division) {
                Division d = (Division) object;
                cb_divisionCrear.addItem(d.getNombre());
            }
        }
        
        if (panelScrudDep.getSelectedIndex() == 2) {
            idDepartamento.setText("");
            modfNombre.setText("");
            resultList_division = ObjectModelDAO.getResultQuery("FROM Division d order by d.idDivision asc");
            cb_divisionModificar.removeAllItems();
            for (Object object : resultList_division) {
                Division d = (Division) object;
                cb_divisionModificar.addItem(d.getNombre());
            }
            String sql = "FROM Departamento d order by d.idDepartamento asc";
            resultList_departamento = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList_departamento, tablaModfDep);
            tablaModfDep.setEditable(false);
            pos = -1;
            cb_divisionModificar.setSelectedIndex(pos);
            
        }
        
        if (panelScrudDep.getSelectedIndex() == 3) {
            String sql = "FROM Departamento d order by d.idDepartamento asc";
            resultList_departamento = ObjectModelDAO.getResultQuery(sql);
            
            JavaUtil.displayResult(resultList_departamento, tablaDeletDep);
            pos = -1;
            tablaDeletDep.setEditable(false);
        }
    }//GEN-LAST:event_panelScrudDepStateChanged

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        if (!nuevDep.getText().equals("")) {
            if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de crear "
                    + " un nuevo departamento : " + nuevDep.getText() + "?",
                    "Información", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
//                ObjectModelDAO.saveObject(new Departamento(
//                        nuevDep.getText(),
//                        (Division) resultList_departamento.get(cb_divisionCrear.getSelectedIndex()))
//                );
                
            }
        }

    }//GEN-LAST:event_bCrearActionPerformed

    private void bDelet_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelet_depActionPerformed
        if (pos == -1) {
            return;
        }
        
        String valor = tablaDeletDep.getValueAt(tablaDeletDep.getSelectedRow(), tablaDeletDep.getSelectedColumn()).toString();
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el"
                + " Departamento " + valor + "?", "Información", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            
            ObjectModelDAO.deleteObject(resultList_departamento.get(pos));
            String sql = "FROM Departamento d order by d.idDepartamento asc";
            resultList_departamento = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList_departamento, tablaDeletDep);
            pos = -1;
            tablaDeletDep.setEditable(false);
        }
    }//GEN-LAST:event_bDelet_depActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        if (pos == -1 || modfNombre.getText().equals("")) {
            return;
        }
        
        String valor = tablaModfDep.getValueAt(tablaModfDep.getSelectedRow(), 1).toString();//1 por el nombre
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de modificar el"
                + " Departamento " + valor + "?", "Información", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            
            int posOr = this.pos;
            Departamento d = (Departamento) resultList_departamento.get(posOr);
            d.setNombre(modfNombre.getText());
            d.setIdDivision((Division) resultList_division.get(cb_divisionModificar.getSelectedIndex()));
            ObjectModelDAO.updateObject(d);
            
            resultList_division = ObjectModelDAO.getResultQuery("FROM Division d order by d.idDivision asc");
            cb_divisionModificar.removeAllItems();
            for (Object object : resultList_division) {
                Division div = (Division) object;
                cb_divisionModificar.addItem(div.getNombre());
            }
            String sql = "FROM Departamento d order by d.idDepartamento asc";
            resultList_departamento = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList_departamento, tablaModfDep);
            tablaModfDep.setEditable(false);
            tablaModfDep.setRowSelectionInterval(posOr, posOr);
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bCrearDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearDivisionActionPerformed
//        new Fdivision().setVisible(true);
    }//GEN-LAST:event_bCrearDivisionActionPerformed

    private void bCrearDivision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearDivision1ActionPerformed
  //     new Fdivision().setVisible(true);
    }//GEN-LAST:event_bCrearDivision1ActionPerformed

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
            java.util.logging.Logger.getLogger(Fdepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fdepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fdepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fdepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fdepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bCrearDivision;
    private javax.swing.JButton bCrearDivision1;
    private javax.swing.JButton bDelet_dep;
    private javax.swing.JButton bModificar;
    private javax.swing.JComboBox cb_divisionCrear;
    private javax.swing.JComboBox cb_divisionModificar;
    private javax.swing.JLabel idDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXTable listadoDepartamentos;
    private javax.swing.JTextField modfNombre;
    private javax.swing.JTextField nuevDep;
    private javax.swing.JTabbedPane panelScrudDep;
    private org.jdesktop.swingx.JXTable tablaDeletDep;
    private org.jdesktop.swingx.JXTable tablaModfDep;
    // End of variables declaration//GEN-END:variables
}
