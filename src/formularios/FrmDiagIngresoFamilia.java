/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Vaca;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.VacaDB;

/**
 *
 * @author PERSONAL
 */
public class FrmDiagIngresoFamilia extends javax.swing.JDialog {

    static Vaca vacaMadre = new Vaca();
    static ArrayList<Vaca> vacasHijas = new ArrayList<>();
    DefaultTableModel tableModel;
    
    private boolean bienMadre;
    private boolean bienCrias;

    public FrmDiagIngresoFamilia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        configuracionTabla();
        
        //Estos son para ver si habilitar el boton de guardar
        this.bienMadre = false;
        this.bienCrias = false;
        
        this.btnAgregarCria.setEnabled(false); //En un inicio no se permitira agregar crias hasta que no se agrege una madre
        this.btnGuardar.setEnabled(false);
    }
    
    private void activarBotonGuardar(){
        
        if (this.bienMadre && this.bienCrias) {
            this.btnGuardar.setEnabled(true);
        }else{
            this.btnGuardar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNumMadre = new javax.swing.JLabel();
        btnAgregarMadre = new javax.swing.JButton();
        btnEliminarMadre = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCrias = new javax.swing.JTable();
        btnAgregarCria = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiarCrias = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(59, 16, 36));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Vaca madre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Número:");

        lblNumMadre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumMadre.setText("jLabel3");

        btnAgregarMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_norm.png"))); // NOI18N
        btnAgregarMadre.setBorder(null);
        btnAgregarMadre.setBorderPainted(false);
        btnAgregarMadre.setContentAreaFilled(false);
        btnAgregarMadre.setFocusPainted(false);
        btnAgregarMadre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_press.png"))); // NOI18N
        btnAgregarMadre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_roll.png"))); // NOI18N
        btnAgregarMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMadreActionPerformed(evt);
            }
        });

        btnEliminarMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/eliminar_norm.png"))); // NOI18N
        btnEliminarMadre.setBorder(null);
        btnEliminarMadre.setBorderPainted(false);
        btnEliminarMadre.setContentAreaFilled(false);
        btnEliminarMadre.setFocusPainted(false);
        btnEliminarMadre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/eliminar_press.png"))); // NOI18N
        btnEliminarMadre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/eliminar_roll.png"))); // NOI18N
        btnEliminarMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMadreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(lblNumMadre)
                        .addGap(185, 185, 185)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarMadre)
                            .addComponent(btnAgregarMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNumMadre)
                    .addComponent(btnAgregarMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarMadre)
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(59, 16, 36));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        tblCrias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCrias);

        btnAgregarCria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_norm.png"))); // NOI18N
        btnAgregarCria.setBorder(null);
        btnAgregarCria.setBorderPainted(false);
        btnAgregarCria.setContentAreaFilled(false);
        btnAgregarCria.setFocusPainted(false);
        btnAgregarCria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_press.png"))); // NOI18N
        btnAgregarCria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/nuevo_roll.png"))); // NOI18N
        btnAgregarCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCriaActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/save_norm.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/save_press.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/save_roll.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiarCrias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/limpiar_norm.png"))); // NOI18N
        btnLimpiarCrias.setBorder(null);
        btnLimpiarCrias.setBorderPainted(false);
        btnLimpiarCrias.setContentAreaFilled(false);
        btnLimpiarCrias.setFocusPainted(false);
        btnLimpiarCrias.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/limpiar_press.png"))); // NOI18N
        btnLimpiarCrias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotones/limpiar_roll.png"))); // NOI18N
        btnLimpiarCrias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregarCria, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarCrias)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(54, 54, 54)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiarCrias))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnGuardar)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMadreActionPerformed
//        FrmDiagIngresoVaca frmDiagIngresoVaca = new FrmDiagIngresoVaca(null, true, true, true);
//        frmDiagIngresoVaca.setVisible(true);
        
//----------------------------------------
        FrmDiagIngresoOActualizacionVaca frmDiagIngresoOActualizacionVaca = new FrmDiagIngresoOActualizacionVaca(null, true, true, true);
        frmDiagIngresoOActualizacionVaca.setVisible(true);
//----------------------------------------        
        
        cargarInfoMadre();
        
        this.bienMadre = true;
        activarBotonGuardar();
    }//GEN-LAST:event_btnAgregarMadreActionPerformed

    private void btnAgregarCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCriaActionPerformed
//        FrmDiagIngresoVaca frmDiagIngresoVaca = new FrmDiagIngresoVaca(null, true, true, false);
//        frmDiagIngresoVaca.setVisible(true);

//----------------------------------------
        FrmDiagIngresoOActualizacionVaca frmDiagIngresoOActualizacionVaca = new FrmDiagIngresoOActualizacionVaca(null, true, true, false);
        frmDiagIngresoOActualizacionVaca.setVisible(true);
//----------------------------------------

        cargarInfoCrias();
        
        this.bienCrias = true;
        activarBotonGuardar();
    }//GEN-LAST:event_btnAgregarCriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int option = JOptionPane.showConfirmDialog(this, "¿Desea almacenar todas las vacas?");

        if (option == JOptionPane.YES_OPTION) {
            //Se va a almacenar todas las vacas ingresadas en la base de datos
            VacaDB objVacaDB = new VacaDB();

            //Insertar la vaca Madre
            objVacaDB.insertar(vacaMadre);

            //Luego se generara un id para la madre
            //Este id es el que se necesita para agregarselo a las crias y así poder relacionarlas
            int idVacaMadre = objVacaDB.traerIdVacaMadre();
            System.out.println("El id de la vaca madre es: " + idVacaMadre);
            //Luego todas las crías van a ser almacenadas con el id de la vaca madre para relacionarlas

            for (Vaca cria : vacasHijas) {

                cria.setIdVacaMadre(idVacaMadre);
                objVacaDB.insertar(cria);

            }
            
            this.dispose();
            
        }else{
            System.out.println("No actualizar");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarCriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCriasActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "¿Desea limpiar la tabla de crías?(Eliminar todas las crías)");
        
        if (option == JOptionPane.YES_OPTION) {
            vacasHijas.clear();
            this.btnGuardar.setEnabled(false);
            this.cargarInfoCrias();
            
            this.bienCrias = false;
            activarBotonGuardar();
            
        }else{
            System.out.println("No limpiar la tabla");
        }
        
    }//GEN-LAST:event_btnLimpiarCriasActionPerformed

    private void btnEliminarMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMadreActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "¿Desea borrar la vaca madre?");
        
        if (option == JOptionPane.YES_OPTION) {
            
            vacaMadre = new Vaca();
            
            this.bienMadre = false;
            
            activarBotonGuardar();
        }else{
            System.out.println("No eliminar madre");
        }
    }//GEN-LAST:event_btnEliminarMadreActionPerformed

    private void cargarInfoMadre() {
        if (vacaMadre.getNumero() != 0) {
            System.out.println("La vaca madre es: " + vacaMadre.toString());
            //Se agrega al label el número de la vaca madre
            this.lblNumMadre.setText(Integer.toString(vacaMadre.getNumero()));
            //Si se agrego la vaca madre se habilita para poder agregar crias.
            this.btnAgregarCria.setEnabled(true);
        } else {
            System.out.println("No cargo información de la vaca porque no almaceno ninguna"
                    + "\n la vaca es: " + vacaMadre.toString());
        }
    }

    private void configuracionTabla() {
        String encabezado[] = {"Número", "Fecha nacimiento", "Genero", "Kilos", "Tipo de vaca", "Potrero", "Opción"};
        String datos[][] = {};

        this.tableModel = new DefaultTableModel(datos, encabezado);
        this.tblCrias.setModel(tableModel);
    }

    private void cargarInfoCrias() {

        this.tableModel.setNumRows(0); //Para que se reinicie la tabla
        String fila[] = new String[7];

        for (Vaca objVacaCria : vacasHijas) {

            fila[0] = Integer.toString(objVacaCria.getNumero());
            //modificación
            if (objVacaCria.getFechaNacimiento() == null) {
                fila[1] = "";
            } else {
                fila[1] = objVacaCria.getFechaNacimiento().toString();
            }

            fila[2] = objVacaCria.getGenero();
            fila[3] = Float.toString(objVacaCria.getKilos());
            fila[4] = objVacaCria.getTipoVaca();
            fila[5] = objVacaCria.getPotrero();
            fila[6] = "Ver";
            this.tableModel.addRow(fila);
        }

        if (vacasHijas.size() > 0) {
            this.btnGuardar.setEnabled(true);
        }

    }

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
            java.util.logging.Logger.getLogger(FrmDiagIngresoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiagIngresoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiagIngresoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiagIngresoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDiagIngresoFamilia dialog = new FrmDiagIngresoFamilia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCria;
    private javax.swing.JButton btnAgregarMadre;
    private javax.swing.JButton btnEliminarMadre;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarCrias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumMadre;
    private javax.swing.JTable tblCrias;
    // End of variables declaration//GEN-END:variables
}
