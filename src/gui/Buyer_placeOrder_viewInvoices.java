package gui;

import static gui.Login.log1;
import static gui.PurchaseOrder_ViewInvoices.viewItems;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.buyerOrderModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Buyer_placeOrder_viewInvoices extends javax.swing.JFrame {
    public static final buyerOrderModel viewItems=new buyerOrderModel();
    public static String invoice_id=" 1 ";
    public Buyer_placeOrder_viewInvoices() {
        initComponents();
        DefaultTableModel dtm =(DefaultTableModel) BuyerorderView_table.getModel();
        viewItems.loadOrderTable_includingBuyer(dtm);
        DefaultTableModel dfm=(DefaultTableModel) BuyeritemView_table.getModel();
        loadBuyerItemsInInvoiceTable(dfm);
    }
    public void loadBuyerItemsInInvoiceTable(DefaultTableModel dtm){
       int qty,totalqty=0;
       double unit_price,cost,totalCost=0;
        dtm.setRowCount(0);
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `buyer_purchase_yield` INNER JOIN `crop`"
                    + "ON `buyer_purchase_yield`.`crop_c_id`=`crop`.`c_id` INNER JOIN `crop_invoice`"
                    + "ON `buyer_purchase_yield`.`invoice_id`=`crop_invoice`.`order_id` "
                    + "WHERE `crop_invoice`.`status_id`='1' AND `invoice_id`='1'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                totalqty=totalqty+qty;
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                totalCost=totalCost+cost;
                v.add(rs.getInt("invoice_id"));
                v.add(rs.getString("type"));
                
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                //v.add(rs.getString("name"));
                dtm.addRow(v);
            }
            BuyerviewItems_totalAmount.setText(String.valueOf(totalCost));
            BuyerViewItems_totalProducts.setText(String.valueOf(totalqty));
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void reloadInvoiceTable(String orderID,DefaultTableModel dtm){
         dtm.setRowCount(0);
         int qty,totalqty=0;
         double unit_price,cost,totalCost=0;
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `buyer_purchase_yield` INNER JOIN `crop`"
                    + "ON `buyer_purchase_yield`.`crop_c_id`=`crop`.`c_id` INNER JOIN `crop_invoice`"
                    + "ON `buyer_purchase_yield`.`invoice_id`=`crop_invoice`.`order_id`"
                    + "WHERE `crop_invoice`.`status_id`='1' AND `invoice_id`='"+orderID+"'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                totalqty=totalqty+qty;
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                totalCost=totalCost+cost;
                v.add(rs.getInt("invoice_id"));
                v.add(rs.getString("type"));
                //v.add(rs.getString("name"));
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
            BuyerviewItems_totalAmount.setText(String.valueOf(totalCost));
            BuyerViewItems_totalProducts.setText(String.valueOf(totalqty));
           
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BuyerViewItems_totalProducts = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BuyerviewItems_totalAmount = new javax.swing.JLabel();
        BuyerdeleteItems_done = new javax.swing.JButton();
        BuyerviewItems_printInvoice = new javax.swing.JButton();
        BuyerjTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        BuyeritemView_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BuyerorderView_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        addYield_CloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addYield_CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        addYield_CloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_CloseBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel3.setText(" A G R I ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 950, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(245, 230, 210));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/full-box.png"))); // NOI18N
        jLabel6.setText("TOTAL PRODUCTS :");

        BuyerViewItems_totalProducts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BuyerViewItems_totalProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyerViewItems_totalProducts.setText("qty");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/purchase-order.png"))); // NOI18N
        jLabel10.setText("TOTAL AMOUNT :");

        BuyerviewItems_totalAmount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BuyerviewItems_totalAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyerviewItems_totalAmount.setText("qty");

        BuyerdeleteItems_done.setBackground(new java.awt.Color(240, 209, 167));
        BuyerdeleteItems_done.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        BuyerdeleteItems_done.setForeground(new java.awt.Color(51, 51, 51));
        BuyerdeleteItems_done.setText(" DONE");
        BuyerdeleteItems_done.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        BuyerdeleteItems_done.setContentAreaFilled(false);
        BuyerdeleteItems_done.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerdeleteItems_done.setFocusPainted(false);
        BuyerdeleteItems_done.setOpaque(true);
        BuyerdeleteItems_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerdeleteItems_doneActionPerformed(evt);
            }
        });

        BuyerviewItems_printInvoice.setBackground(new java.awt.Color(240, 209, 167));
        BuyerviewItems_printInvoice.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        BuyerviewItems_printInvoice.setForeground(new java.awt.Color(51, 51, 51));
        BuyerviewItems_printInvoice.setText("PRINT INVOICE");
        BuyerviewItems_printInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        BuyerviewItems_printInvoice.setContentAreaFilled(false);
        BuyerviewItems_printInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerviewItems_printInvoice.setFocusPainted(false);
        BuyerviewItems_printInvoice.setOpaque(true);
        BuyerviewItems_printInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerviewItems_printInvoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerViewItems_totalProducts)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(BuyerviewItems_totalAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuyerviewItems_printInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BuyerdeleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuyerViewItems_totalProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuyerviewItems_totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuyerdeleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuyerviewItems_printInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyeritemView_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyeritemView_table.setForeground(new java.awt.Color(69, 69, 69));
        BuyeritemView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CROP", "QUANTITY", "UNIT PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyeritemView_table.setFocusable(false);
        BuyeritemView_table.setGridColor(new java.awt.Color(255, 255, 255));
        BuyeritemView_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyeritemView_table.setRowHeight(28);
        BuyeritemView_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyeritemView_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyeritemView_table.setShowVerticalLines(false);
        BuyeritemView_table.getTableHeader().setReorderingAllowed(false);
        BuyeritemView_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyeritemView_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyeritemView_tableMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(BuyeritemView_table);
        if (BuyeritemView_table.getColumnModel().getColumnCount() > 0) {
            BuyeritemView_table.getColumnModel().getColumn(0).setResizable(false);
            BuyeritemView_table.getColumnModel().getColumn(1).setResizable(false);
            BuyeritemView_table.getColumnModel().getColumn(2).setResizable(false);
            BuyeritemView_table.getColumnModel().getColumn(3).setResizable(false);
            BuyeritemView_table.getColumnModel().getColumn(4).setResizable(false);
        }

        BuyerjTabbedPane1.addTab("ITEMS", jScrollPane4);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerorderView_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerorderView_table.setForeground(new java.awt.Color(69, 69, 69));
        BuyerorderView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "DATE", "BUYER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyerorderView_table.setFocusable(false);
        BuyerorderView_table.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerorderView_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerorderView_table.setRowHeight(28);
        BuyerorderView_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerorderView_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerorderView_table.setShowVerticalLines(false);
        BuyerorderView_table.getTableHeader().setReorderingAllowed(false);
        BuyerorderView_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerorderView_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BuyerorderView_table);
        if (BuyerorderView_table.getColumnModel().getColumnCount() > 0) {
            BuyerorderView_table.getColumnModel().getColumn(2).setResizable(false);
        }

        BuyerjTabbedPane1.addTab("INVOICE", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BuyerjTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BuyerjTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void BuyerdeleteItems_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerdeleteItems_doneActionPerformed
        this.dispose();
    }//GEN-LAST:event_BuyerdeleteItems_doneActionPerformed

    private void BuyerviewItems_printInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerviewItems_printInvoiceActionPerformed
        //print report
        String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\buyerInvoice.jasper";
        HashMap<String,Object> parameters=new HashMap<>();
        parameters.put("Parameter1",invoice_id);
        parameters.put("Parameter2",BuyerViewItems_totalProducts.getText());
        parameters.put("Parameter3",BuyerviewItems_totalAmount.getText());

        JRTableModelDataSource dataSource=new JRTableModelDataSource(BuyeritemView_table.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }

    }//GEN-LAST:event_BuyerviewItems_printInvoiceActionPerformed

    private void BuyerorderView_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerorderView_tableMouseClicked
        int row = BuyerorderView_table.getSelectedRow();
        invoice_id=BuyerorderView_table.getValueAt(row,0).toString();
        String orderID=BuyerorderView_table.getValueAt(row,0).toString();
        
        DefaultTableModel dfm=(DefaultTableModel) BuyeritemView_table.getModel();
        reloadInvoiceTable(orderID, dfm);
        BuyerjTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_BuyerorderView_tableMouseClicked

    private void BuyeritemView_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyeritemView_tableMouseClicked

    }//GEN-LAST:event_BuyeritemView_tableMouseClicked

    private void BuyeritemView_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyeritemView_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyeritemView_tableMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_viewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder_viewInvoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BuyerViewItems_totalProducts;
    private javax.swing.JButton BuyerdeleteItems_done;
    public javax.swing.JTable BuyeritemView_table;
    private javax.swing.JTabbedPane BuyerjTabbedPane1;
    private javax.swing.JTable BuyerorderView_table;
    private javax.swing.JButton BuyerviewItems_printInvoice;
    public javax.swing.JLabel BuyerviewItems_totalAmount;
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
