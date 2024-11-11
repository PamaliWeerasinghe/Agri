package gui;

import static gui.Login.log1;
import static gui.PurchaseOrder_deleteItems.totalCost;
import static gui.PurchaseOrder_deleteItems.totalqty;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.BuyerDeleteItems;
import model.MySQL;
import static model.buyerOrderModel.orderID;
import model.buyerOrderModel;

public class Buyer_placeOrder_deleteItems extends javax.swing.JFrame {
    public static final buyerOrderModel deleteItems=new buyerOrderModel();
    public static int totalqty=0;
    public static double totalCost=0;
   
    public Buyer_placeOrder_deleteItems() {
        initComponents();
        DefaultTableModel dtm=(DefaultTableModel) BuyerdeleteItems_table.getModel();
        loadTable(dtm);
    }
    public void deleteItem(int selectedRowId, String qty, String cost ,String crop) {
        double cost1=Double.parseDouble(cost);
        //System.out.println(cost1);
        
        try {
            MySQL.execute("UPDATE `crop_invoice` SET `total`=`total`-'"+cost1+"' WHERE `order_id`='"+orderID+"'");
            ResultSet rs=MySQL.execute("SELECT * FROM `crop` WHERE `type`='"+crop+"'");
            if(rs.next()){
                MySQL.execute("UPDATE `crop` SET `qty`=`qty`+'"+qty+"' WHERE `c_id`='"+rs.getInt("c_id")+"'");
            }
            MySQL.execute("DELETE FROM `buyer_purchase_yield` WHERE `buyer_qty_id`='"+selectedRowId+"'");
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        totalCost=totalCost-Double.parseDouble(cost);
        //System.out.println(totalCost);
        totalqty=totalqty-Integer.parseInt(qty);
        String stringTotalCost=String.valueOf(totalCost);
        BuyerdeleteItems_totalAmount.setText(stringTotalCost);
        String stringTotalQty=String.valueOf(totalqty);
        BuyerdeleteItems_totalProducts.setText(stringTotalQty);
        
    }
    public void loadTable(DefaultTableModel dtm) {
        dtm.setRowCount(0);
        totalCost=0;
        totalqty=0;
        int qty;
        double unit_price,cost = 0;
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
                v.add(rs.getInt("buyer_qty_id"));
                v.add(rs.getString("type"));
                //v.add(rs.getString("name"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
            String costString=String.valueOf(totalCost);
            String qtyString=String.valueOf(totalqty);
            BuyerdeleteItems_totalAmount.setText(costString);
            BuyerdeleteItems_totalProducts.setText(qtyString);
            
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
        BuyerdeleteItems_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BuyerdeleteItems_totalProducts = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BuyerdeleteItems_totalAmount = new javax.swing.JLabel();
        BuyerjButton5 = new javax.swing.JButton();
        BuyerdeleteItems_done = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerdeleteItems_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerdeleteItems_table.setForeground(new java.awt.Color(69, 69, 69));
        BuyerdeleteItems_table.setModel(new javax.swing.table.DefaultTableModel(
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
        BuyerdeleteItems_table.setFocusable(false);
        BuyerdeleteItems_table.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerdeleteItems_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerdeleteItems_table.setRowHeight(28);
        BuyerdeleteItems_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerdeleteItems_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerdeleteItems_table.setShowVerticalLines(false);
        BuyerdeleteItems_table.getTableHeader().setReorderingAllowed(false);
        BuyerdeleteItems_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerdeleteItems_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerdeleteItems_tableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(BuyerdeleteItems_table);
        if (BuyerdeleteItems_table.getColumnModel().getColumnCount() > 0) {
            BuyerdeleteItems_table.getColumnModel().getColumn(0).setResizable(false);
            BuyerdeleteItems_table.getColumnModel().getColumn(1).setResizable(false);
            BuyerdeleteItems_table.getColumnModel().getColumn(2).setResizable(false);
            BuyerdeleteItems_table.getColumnModel().getColumn(3).setResizable(false);
            BuyerdeleteItems_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(245, 230, 210));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/full-box.png"))); // NOI18N
        jLabel6.setText("TOTAL PRODUCTS :");

        BuyerdeleteItems_totalProducts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BuyerdeleteItems_totalProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyerdeleteItems_totalProducts.setText("qty");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/purchase-order.png"))); // NOI18N
        jLabel10.setText("TOTAL AMOUNT :");

        BuyerdeleteItems_totalAmount.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BuyerdeleteItems_totalAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyerdeleteItems_totalAmount.setText("qty");

        BuyerjButton5.setBackground(new java.awt.Color(240, 209, 167));
        BuyerjButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        BuyerjButton5.setForeground(new java.awt.Color(51, 51, 51));
        BuyerjButton5.setText("DELETE ROW");
        BuyerjButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(184, 156, 118)));
        BuyerjButton5.setContentAreaFilled(false);
        BuyerjButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerjButton5.setFocusPainted(false);
        BuyerjButton5.setOpaque(true);
        BuyerjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerjButton5ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerdeleteItems_totalProducts)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(BuyerdeleteItems_totalAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(BuyerjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BuyerdeleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuyerdeleteItems_totalProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuyerdeleteItems_totalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuyerjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuyerdeleteItems_done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void BuyerdeleteItems_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerdeleteItems_tableMouseClicked

    }//GEN-LAST:event_BuyerdeleteItems_tableMouseClicked

    private void BuyerdeleteItems_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerdeleteItems_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerdeleteItems_tableMouseEntered

    private void BuyerjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerjButton5ActionPerformed
        int selectedRow=BuyerdeleteItems_table.getSelectedRow();
        if(selectedRow!=-1){
            int selectedRowId=(int)BuyerdeleteItems_table.getValueAt(selectedRow,0);
            String qty= BuyerdeleteItems_table.getValueAt(selectedRow, 2).toString();
            String cost=BuyerdeleteItems_table.getValueAt(selectedRow, 4).toString();
            String crop=BuyerdeleteItems_table.getValueAt(selectedRow, 1).toString();

            deleteItem(selectedRowId,qty,cost,crop);
            DefaultTableModel dtm=(DefaultTableModel) BuyerdeleteItems_table.getModel();
            loadTable(dtm);
        }else{
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Select a row to delete");
            categoryExists.setVisible(true);
        }
    }//GEN-LAST:event_BuyerjButton5ActionPerformed

    private void BuyerdeleteItems_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerdeleteItems_doneActionPerformed
        this.dispose();
    }//GEN-LAST:event_BuyerdeleteItems_doneActionPerformed

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
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder_deleteItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyerdeleteItems_done;
    public javax.swing.JTable BuyerdeleteItems_table;
    public javax.swing.JLabel BuyerdeleteItems_totalAmount;
    public javax.swing.JLabel BuyerdeleteItems_totalProducts;
    private javax.swing.JButton BuyerjButton5;
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
