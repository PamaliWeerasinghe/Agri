package gui;

import static gui.Login.log1;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class loadAllCropsInTheBlocks extends javax.swing.JFrame {

    public loadAllCropsInTheBlocks() {
        initComponents();
        loadDetails();
        setDate();
    }
    public void setDate(){
        String textDate=new SimpleDateFormat("MM / dd / yyyy",Locale.ENGLISH).format(new Date());
        jLabel1.setText(textDate);
    }
    public void loadDetails(){
        DefaultTableModel model=(DefaultTableModel)blockcrops.getModel();
        model.setRowCount(0);
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `block_has_crop` INNER JOIN `block`"
                    + "ON `block_has_crop`.`block_b_id`=`block`.`b_id` INNER JOIN `crop`"
                    + "ON `block_has_crop`.`crop_c_id`=`crop`.`c_id` INNER JOIN `supervisor`"
                    + "ON `block`.`supervisor_s_id`=`supervisor`.`s_id` WHERE `block_has_crop`.`status_id`='1'");
            
            while(rs.next()){
                String fname=rs.getString("fname");
                String lname=rs.getString("lname");
                String fullName=" "+fname+ " "+lname;
                Vector v=new Vector();
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("expected_yield"));
                v.add(fullName);
               
                model.addRow(v);
                
            }
                    
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        blockcrops = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadAllReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        blockcrops.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        blockcrops.setForeground(new java.awt.Color(69, 69, 69));
        blockcrops.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BLOCK", "CROP", "EXPECTED YIELD ( kg )", "SUPERVISOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        blockcrops.setGridColor(new java.awt.Color(255, 255, 255));
        blockcrops.setSelectionBackground(new java.awt.Color(222, 191, 142));
        blockcrops.setSelectionForeground(new java.awt.Color(0, 0, 0));
        blockcrops.setShowVerticalLines(false);
        jScrollPane1.setViewportView(blockcrops);
        if (blockcrops.getColumnModel().getColumnCount() > 0) {
            blockcrops.getColumnModel().getColumn(0).setResizable(false);
            blockcrops.getColumnModel().getColumn(1).setResizable(false);
            blockcrops.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow.png"))); // NOI18N
        jLabel2.setText("Crops currently in the blocks");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loadAllReport.setBackground(new java.awt.Color(255, 246, 207));
        loadAllReport.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        loadAllReport.setText("GENERATE REPORT");
        loadAllReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        loadAllReport.setContentAreaFilled(false);
        loadAllReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadAllReport.setFocusPainted(false);
        loadAllReport.setOpaque(true);
        loadAllReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadAllReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadAllReportMouseExited(evt);
            }
        });
        loadAllReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllReportActionPerformed(evt);
            }
        });

        jLabel1.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadAllReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadAllReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void loadAllReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadAllReportMouseEntered
        loadAllReport.setBackground(new Color(193, 153, 111));
        loadAllReport.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_loadAllReportMouseEntered

    private void loadAllReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadAllReportMouseExited
        loadAllReport.setBackground(new Color(255, 246, 207));
        loadAllReport.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_loadAllReportMouseExited

    private void loadAllReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllReportActionPerformed
        String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\blockCrop.jasper";
        HashMap<String,Object> parameters=new HashMap<>();
        parameters.put("Parameter1",jLabel1.getText());
        //parameters.put("Parameter2",BuyerViewItems_totalProducts.getText());
        //parameters.put("Parameter3",BuyerviewItems_totalAmount.getText());

        JRTableModelDataSource dataSource=new JRTableModelDataSource(blockcrops.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }//GEN-LAST:event_loadAllReportActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loadAllCropsInTheBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadAllCropsInTheBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadAllCropsInTheBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadAllCropsInTheBlocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loadAllCropsInTheBlocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable blockcrops;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadAllReport;
    // End of variables declaration//GEN-END:variables
}
