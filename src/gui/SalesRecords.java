package gui;

//import static gui.Buyer_placeOrder_viewInvoices.invoice_id;
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

public class SalesRecords extends javax.swing.JFrame {

    public SalesRecords() {
        initComponents();
        setDate();
        DefaultTableModel dfm=(DefaultTableModel) salesTable.getModel();
        loadTable(dfm);
    }
    public void loadTable(DefaultTableModel dfm){
        dfm.setRowCount(0);
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `crop_invoice` WHERE `status_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("order_id"));
                if(orders.getString("total")==null){
                    v.add("0");
                }else{
                    v.add(orders.getString("total"));
                }
                
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void setDate(){
        String textDate=new SimpleDateFormat("MM / dd / yyyy",Locale.ENGLISH).format(new Date());
        jLabel1.setText(textDate);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        sales_report = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 17)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow.png"))); // NOI18N
        jLabel2.setText("Sales Records");
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
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        salesTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        salesTable.setForeground(new java.awt.Color(69, 69, 69));
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INVOICE ID", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setFocusable(false);
        salesTable.setGridColor(new java.awt.Color(255, 255, 255));
        salesTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        salesTable.setRowHeight(28);
        salesTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        salesTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        salesTable.setShowVerticalLines(false);
        salesTable.getTableHeader().setReorderingAllowed(false);
        salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(0).setResizable(false);
            salesTable.getColumnModel().getColumn(1).setResizable(false);
        }

        sales_report.setBackground(new java.awt.Color(255, 246, 207));
        sales_report.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        sales_report.setText("GENERATE REPORT");
        sales_report.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        sales_report.setContentAreaFilled(false);
        sales_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales_report.setFocusPainted(false);
        sales_report.setOpaque(true);
        sales_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sales_reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sales_reportMouseExited(evt);
            }
        });
        sales_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_reportActionPerformed(evt);
            }
        });

        jLabel1.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sales_report, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sales_report, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked

    }//GEN-LAST:event_salesTableMouseClicked

    private void sales_reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_reportMouseEntered
        sales_report.setBackground(new Color(193, 153, 111));
        sales_report.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_sales_reportMouseEntered

    private void sales_reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_reportMouseExited
        sales_report.setBackground(new Color(255, 246, 207));
        sales_report.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_sales_reportMouseExited

    private void sales_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_reportActionPerformed
        String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\salesReport.jasper";
        
        HashMap<String,Object> parameters=new HashMap<>();
        parameters.put("Parameter1",jLabel1.getText());
        //parameters.put("Parameter2",BuyerViewItems_totalProducts.getText());
        //parameters.put("Parameter3",BuyerviewItems_totalAmount.getText());

        JRTableModelDataSource dataSource=new JRTableModelDataSource(salesTable.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }

    }//GEN-LAST:event_sales_reportActionPerformed

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
            java.util.logging.Logger.getLogger(SalesRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton sales_report;
    // End of variables declaration//GEN-END:variables
}
