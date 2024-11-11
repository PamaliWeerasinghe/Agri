package gui;
import static gui.Login.log1;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.addItemsModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class PurchaseOrder_ViewInvoices extends javax.swing.JFrame {
    public static final addItemsModel viewItems=new addItemsModel();
    public static String invoice_id=" 1 ";
    public PurchaseOrder_ViewInvoices() {
        initComponents();
        DefaultTableModel dtm =(DefaultTableModel) orderView_table.getModel();
        viewItems.loadOrderTable(dtm);
        DefaultTableModel dfm=(DefaultTableModel) itemView_table.getModel();
        loadItemsInInvoiceTable(dfm);
        
        
    }
    public void loadItemsInInvoiceTable(DefaultTableModel dtm){
       int qty,totalqty=0;
       double unit_price,cost,totalCost=0;
        dtm.setRowCount(0);
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` INNER JOIN `supplies_has_supplier`\n" +
                                        "ON `supplies_has_supplier`.`shs_id`=`invoice_has_items`.`productSupplier_id` INNER JOIN `supplier`\n" +
                                        "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`\n" +
                                        "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`\n" +
                                        "ON `category`.`cat_id`=`supplies`.`category_cat_id`\n" +
                                        "WHERE `order_ordSup_id`='1'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                totalqty=totalqty+qty;
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                totalCost=totalCost+cost;
                v.add(rs.getInt("order_ordSup_id"));
                v.add(rs.getString("title"));
                v.add(rs.getString("name"));
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
            viewItems_totalAmount.setText(String.valueOf(totalCost));
            ViewItems_totalProducts.setText(String.valueOf(totalqty));
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
            ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` INNER JOIN `supplies_has_supplier`\n" +
                                        "ON `supplies_has_supplier`.`shs_id`=`invoice_has_items`.`productSupplier_id` INNER JOIN `supplier`\n" +
                                        "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`\n" +
                                        "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`\n" +
                                        "ON `category`.`cat_id`=`supplies`.`category_cat_id`\n" +
                                        "WHERE `order_ordSup_id`='"+orderID+"'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                totalqty=totalqty+qty;
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                totalCost=totalCost+cost;
                v.add(rs.getInt("order_ordSup_id"));
                v.add(rs.getString("title"));
                v.add(rs.getString("name"));
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
            viewItems_totalAmount.setText(String.valueOf(totalCost));
            ViewItems_totalProducts.setText(String.valueOf(totalqty));
           
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        deleteItems_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderView_table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        itemView_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ViewItems_totalProducts = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        viewItems_totalAmount = new javax.swing.JLabel();
        deleteItems_done = new javax.swing.JButton();
        viewItems_printInvoice = new javax.swing.JButton();

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        deleteItems_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        deleteItems_table.setForeground(new java.awt.Color(69, 69, 69));
        deleteItems_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "PRODUCT", "SUPPLIER", "QUANTITY", "UNIT PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deleteItems_table.setFocusable(false);
        deleteItems_table.setGridColor(new java.awt.Color(255, 255, 255));
        deleteItems_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        deleteItems_table.setRowHeight(28);
        deleteItems_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        deleteItems_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        deleteItems_table.setShowVerticalLines(false);
        deleteItems_table.getTableHeader().setReorderingAllowed(false);
        deleteItems_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteItems_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteItems_tableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(deleteItems_table);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1031, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        orderView_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        orderView_table.setForeground(new java.awt.Color(69, 69, 69));
        orderView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderView_table.setFocusable(false);
        orderView_table.setGridColor(new java.awt.Color(255, 255, 255));
        orderView_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        orderView_table.setRowHeight(28);
        orderView_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        orderView_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        orderView_table.setShowVerticalLines(false);
        orderView_table.getTableHeader().setReorderingAllowed(false);
        orderView_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderView_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderView_table);

        jTabbedPane1.addTab("INVOICE", jScrollPane3);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        itemView_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        itemView_table.setForeground(new java.awt.Color(69, 69, 69));
        itemView_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "PRODUCT", "SUPPLIER", "QUANTITY", "UNIT PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemView_table.setFocusable(false);
        itemView_table.setGridColor(new java.awt.Color(255, 255, 255));
        itemView_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        itemView_table.setRowHeight(28);
        itemView_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        itemView_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        itemView_table.setShowVerticalLines(false);
        itemView_table.getTableHeader().setReorderingAllowed(false);
        itemView_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemView_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                itemView_tableMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(itemView_table);

        jTabbedPane1.addTab("ITEMS", jScrollPane4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(245, 230, 210));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/full-box.png"))); // NOI18N
        jLabel6.setText("TOTAL PRODUCTS :");

        ViewItems_totalProducts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ViewItems_totalProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewItems_totalProducts.setText("qty");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/purchase-order.png"))); // NOI18N
        jLabel10.setText("TOTAL AMOUNT :");

        viewItems_totalAmount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        viewItems_totalAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewItems_totalAmount.setText("qty");

        deleteItems_done.setBackground(new java.awt.Color(240, 209, 167));
        deleteItems_done.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        deleteItems_done.setForeground(new java.awt.Color(51, 51, 51));
        deleteItems_done.setText(" DONE");
        deleteItems_done.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        deleteItems_done.setContentAreaFilled(false);
        deleteItems_done.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteItems_done.setFocusPainted(false);
        deleteItems_done.setOpaque(true);
        deleteItems_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItems_doneActionPerformed(evt);
            }
        });

        viewItems_printInvoice.setBackground(new java.awt.Color(240, 209, 167));
        viewItems_printInvoice.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        viewItems_printInvoice.setForeground(new java.awt.Color(51, 51, 51));
        viewItems_printInvoice.setText("PRINT INVOICE");
        viewItems_printInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        viewItems_printInvoice.setContentAreaFilled(false);
        viewItems_printInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewItems_printInvoice.setFocusPainted(false);
        viewItems_printInvoice.setOpaque(true);
        viewItems_printInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItems_printInvoiceActionPerformed(evt);
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
                .addComponent(ViewItems_totalProducts)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(viewItems_totalAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewItems_printInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(deleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewItems_totalProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewItems_totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewItems_printInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void deleteItems_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItems_doneActionPerformed
        this.dispose();
    }//GEN-LAST:event_deleteItems_doneActionPerformed

    private void orderView_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderView_tableMouseClicked
        int row = orderView_table.getSelectedRow();
        invoice_id=orderView_table.getValueAt(row,0).toString();
        String orderID=orderView_table.getValueAt(row,0).toString();
        //Object o1 = orderView_table.getValueAt(row, 0);
        //String s1 = String.valueOf(o1);
        //orderDelete_ID.setText(s1);

        //Object o2 = orderView_table.getValueAt(row, 1);
        //String s2 = String.valueOf(o2);
        //orderDelete_date.setText(s2);
        DefaultTableModel dfm=(DefaultTableModel) itemView_table.getModel();
        reloadInvoiceTable(orderID, dfm);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_orderView_tableMouseClicked

    private void deleteItems_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItems_tableMouseClicked

    }//GEN-LAST:event_deleteItems_tableMouseClicked

    private void deleteItems_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItems_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItems_tableMouseEntered

    private void itemView_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemView_tableMouseClicked

    }//GEN-LAST:event_itemView_tableMouseClicked

    private void itemView_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemView_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_itemView_tableMouseEntered

    private void viewItems_printInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItems_printInvoiceActionPerformed
        //print report
        String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\invoice.jasper";
        HashMap<String,Object> parameters=new HashMap<>();
        parameters.put("Parameter1",invoice_id);
        parameters.put("Parameter2",ViewItems_totalProducts.getText());
        parameters.put("Parameter3",viewItems_totalAmount.getText());
        
        JRTableModelDataSource dataSource=new JRTableModelDataSource(itemView_table.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
        
        
    }//GEN-LAST:event_viewItems_printInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseOrder_ViewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_ViewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_ViewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_ViewInvoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder_ViewInvoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ViewItems_totalProducts;
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JButton deleteItems_done;
    public javax.swing.JTable deleteItems_table;
    public javax.swing.JTable itemView_table;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable orderView_table;
    private javax.swing.JButton viewItems_printInvoice;
    public javax.swing.JLabel viewItems_totalAmount;
    // End of variables declaration//GEN-END:variables
}
