
package gui;

import static gui.Login.log1;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.addItemsModel;
import static model.addItemsModel.orderID;


public class PurchaseOrder_deleteItems extends javax.swing.JFrame {
    public static final addItemsModel deleteItems=new addItemsModel();
    public static int totalqty=0;
    public static double totalCost=0;
   
    public PurchaseOrder_deleteItems() {
        initComponents();
        
      
        DefaultTableModel dtm=(DefaultTableModel) deleteItems_table.getModel();
        loadTable(dtm);
        
    }
    public void deleteItem(int selectedRowId, String qty, String cost) {
        double cost1=Double.parseDouble(cost);
        //System.out.println(cost1);
        try {
            MySQL.execute("UPDATE `invoice` SET `total`=`total`-'"+cost1+"' WHERE `ordSup_id`='"+orderID+"'");
            MySQL.execute("DELETE FROM `invoice_has_items` WHERE `invoice_id`='"+selectedRowId+"'");
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        totalCost=totalCost-Double.parseDouble(cost);
        //System.out.println(totalCost);
        totalqty=totalqty-Integer.parseInt(qty);
        String stringTotalCost=String.valueOf(totalCost);
        deleteItems_totalAmount.setText(stringTotalCost);
        String stringTotalQty=String.valueOf(totalqty);
        deleteItems_totalProducts.setText(stringTotalQty);
        
    }
    public void loadTable(DefaultTableModel dtm) {
        dtm.setRowCount(0);
        totalCost=0;
        totalqty=0;
        //deleteItems_totalAmount.setText("");
        //deleteItems_totalProducts.setText("");
        int qty;
        double unit_price,cost = 0;
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `supplies_has_supplier` INNER JOIN `invoice_has_items`"
                    + "ON `invoice_has_items`.`productSupplier_id`=`supplies_has_supplier`.`shs_id` INNER JOIN `supplier`"
                    + "ON `supplies_has_supplier`.`supplier_sup_id`=`supplier`.`sup_id` INNER JOIN `supplies`"
                    + "ON `supplies_has_supplier`.`supplies_supplies_id`=`supplies`.`supplies_id`"
                    + "WHERE `order_ordSup_id`='"+orderID+"' ");
            while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                totalqty=totalqty+qty;
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                totalCost=totalCost+cost;
                v.add(rs.getInt("invoice_id"));
                v.add(rs.getString("title"));
                v.add(rs.getString("name"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
            String costString=String.valueOf(totalCost);
            String qtyString=String.valueOf(totalqty);
            deleteItems_totalAmount.setText(costString);
            deleteItems_totalProducts.setText(qtyString);
            
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
        jScrollPane2 = new javax.swing.JScrollPane();
        deleteItems_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deleteItems_totalProducts = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        deleteItems_totalAmount = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        deleteItems_done = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 930, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        if (deleteItems_table.getColumnModel().getColumnCount() > 0) {
            deleteItems_table.getColumnModel().getColumn(0).setResizable(false);
            deleteItems_table.getColumnModel().getColumn(0).setPreferredWidth(5);
            deleteItems_table.getColumnModel().getColumn(1).setResizable(false);
            deleteItems_table.getColumnModel().getColumn(2).setResizable(false);
            deleteItems_table.getColumnModel().getColumn(3).setResizable(false);
            deleteItems_table.getColumnModel().getColumn(4).setResizable(false);
            deleteItems_table.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(245, 230, 210));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/full-box.png"))); // NOI18N
        jLabel6.setText("TOTAL PRODUCTS :");

        deleteItems_totalProducts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        deleteItems_totalProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteItems_totalProducts.setText("qty");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/purchase-order.png"))); // NOI18N
        jLabel10.setText("TOTAL AMOUNT :");

        deleteItems_totalAmount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        deleteItems_totalAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteItems_totalAmount.setText("qty");

        jButton5.setBackground(new java.awt.Color(240, 209, 167));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("DELETE ROW");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteItems_totalProducts)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(deleteItems_totalAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(deleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteItems_totalProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteItems_totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void deleteItems_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItems_tableMouseClicked
       
    }//GEN-LAST:event_deleteItems_tableMouseClicked

    private void deleteItems_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItems_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItems_tableMouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int selectedRow=deleteItems_table.getSelectedRow();
        if(selectedRow!=-1){
            int selectedRowId=(int)deleteItems_table.getValueAt(selectedRow,0);
            String qty= deleteItems_table.getValueAt(selectedRow, 3).toString();
            String cost=deleteItems_table.getValueAt(selectedRow, 5).toString();
            
            deleteItem(selectedRowId,qty,cost);
            DefaultTableModel dtm=(DefaultTableModel) deleteItems_table.getModel();
            loadTable(dtm);
        }else{
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Select a row to delete");
            categoryExists.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void deleteItems_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItems_doneActionPerformed
        this.dispose();
    }//GEN-LAST:event_deleteItems_doneActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder_deleteItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JButton deleteItems_done;
    public javax.swing.JTable deleteItems_table;
    public javax.swing.JLabel deleteItems_totalAmount;
    public javax.swing.JLabel deleteItems_totalProducts;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
