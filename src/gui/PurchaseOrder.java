
package gui;
import static gui.Login.log1;
import model.orderModel;
import gui.output.SelectError;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.SupplierModel;


public class PurchaseOrder extends javax.swing.JFrame {

   public static final orderModel o_model=new orderModel();
    
    public PurchaseOrder() {
        initComponents();
        DefaultTableModel model =(DefaultTableModel) purchaseOrder_table.getModel();
        o_model.loadOrderTable(model);
        setDate();
    }
    public void setDate(){
        String textDate=new SimpleDateFormat("MM / dd / yyyy",Locale.ENGLISH).format(new Date());
        purchaseOrder_date.setText(textDate);
    }
    public void reset(){
        purchaseOrder_id.setText("");
        //purchaseOrder_date.setText("");
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        purchaseOrder_id = new javax.swing.JTextField();
        purchaseOrder_date = new javax.swing.JTextField();
        purchaseOrder_insert = new javax.swing.JButton();
        purchaseOrder_addItems = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        purchaseOrder_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(226, 185, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(102, 51, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 495));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("ORDER ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("DATE ");

        purchaseOrder_id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_id.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_id.setOpaque(false);
        purchaseOrder_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrder_idActionPerformed(evt);
            }
        });

        purchaseOrder_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_date.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_date.setOpaque(false);

        purchaseOrder_insert.setBackground(new java.awt.Color(255, 246, 207));
        purchaseOrder_insert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        purchaseOrder_insert.setText("INSERT");
        purchaseOrder_insert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        purchaseOrder_insert.setContentAreaFilled(false);
        purchaseOrder_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseOrder_insert.setFocusPainted(false);
        purchaseOrder_insert.setOpaque(true);
        purchaseOrder_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseOrder_insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseOrder_insertMouseExited(evt);
            }
        });
        purchaseOrder_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrder_insertActionPerformed(evt);
            }
        });

        purchaseOrder_addItems.setBackground(new java.awt.Color(255, 246, 207));
        purchaseOrder_addItems.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        purchaseOrder_addItems.setText("INSERT  ITEMS TO THE ORDER");
        purchaseOrder_addItems.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        purchaseOrder_addItems.setContentAreaFilled(false);
        purchaseOrder_addItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseOrder_addItems.setFocusPainted(false);
        purchaseOrder_addItems.setOpaque(true);
        purchaseOrder_addItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseOrder_addItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseOrder_addItemsMouseExited(evt);
            }
        });
        purchaseOrder_addItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrder_addItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(purchaseOrder_id)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(209, 209, 209))
                    .addComponent(purchaseOrder_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseOrder_date)
                    .addComponent(purchaseOrder_addItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(purchaseOrder_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purchaseOrder_addItems, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

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

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        purchaseOrder_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        purchaseOrder_table.setForeground(new java.awt.Color(69, 69, 69));
        purchaseOrder_table.setModel(new javax.swing.table.DefaultTableModel(
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
        purchaseOrder_table.setFocusable(false);
        purchaseOrder_table.setGridColor(new java.awt.Color(255, 255, 255));
        purchaseOrder_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        purchaseOrder_table.setRowHeight(28);
        purchaseOrder_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        purchaseOrder_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        purchaseOrder_table.setShowVerticalLines(false);
        purchaseOrder_table.getTableHeader().setReorderingAllowed(false);
        purchaseOrder_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseOrder_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(purchaseOrder_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
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

    private void purchaseOrder_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrder_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseOrder_idActionPerformed

    private void purchaseOrder_insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_insertMouseEntered
        purchaseOrder_insert.setBackground(new Color(193, 153, 111));
        purchaseOrder_insert.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_purchaseOrder_insertMouseEntered

    private void purchaseOrder_insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_insertMouseExited
        purchaseOrder_insert.setBackground(new Color(255, 246, 207));
        purchaseOrder_insert.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_purchaseOrder_insertMouseExited

    private void purchaseOrder_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrder_insertActionPerformed
        String orderId=purchaseOrder_id.getText();
        String orderDate=purchaseOrder_date.getText();
        
        if(orderDate.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Order date cannot be empty!");
            categoryExists.setVisible(true);
        }else{
            if(orderId.isEmpty()){
                try {
                    MySQL.execute("INSERT INTO `invoice`(`orderDate`,`status_id`) VALUES('"+orderDate+"','1')");
                   
                    
                } catch (Exception e) {
//                    e.printStackTrace();
                      log1.warning(e.toString());
  
                }
            }else{
                try{
                int oid=Integer.parseInt(orderId);
                    ResultSet rs=MySQL.execute("SELECT * FROM `invoice` WHERE `ordSup_id`='"+oid+"'");
                    if(rs.next()){
                        SelectError categoryExists=new SelectError();
                        categoryExists.setText("Order ID already exists!");
                        categoryExists.setVisible(true);
                    }else{
                    MySQL.execute("INSERT INTO `invoice`(`ordSup_id`,`orderDate`,`status_id`) VALUES('"+oid+"','"+orderDate+"','1')");
                    }
                }catch(Exception e){
//                    e.printStackTrace();
                      log1.warning(e.toString());
                }
                
            }
            DefaultTableModel model =(DefaultTableModel) purchaseOrder_table.getModel();
            o_model.loadOrderTable(model);
            setDate();
            
        }
        
    }//GEN-LAST:event_purchaseOrder_insertActionPerformed

    private void purchaseOrder_addItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_addItemsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseOrder_addItemsMouseEntered

    private void purchaseOrder_addItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_addItemsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseOrder_addItemsMouseExited

    private void purchaseOrder_addItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrder_addItemsActionPerformed
        new PurchaseOrder_insertItems().setVisible(true);
    }//GEN-LAST:event_purchaseOrder_addItemsActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       
    }//GEN-LAST:event_jPanel3MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void purchaseOrder_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_tableMouseClicked
        
    }//GEN-LAST:event_purchaseOrder_tableMouseClicked

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
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton purchaseOrder_addItems;
    private javax.swing.JTextField purchaseOrder_date;
    private javax.swing.JTextField purchaseOrder_id;
    private javax.swing.JButton purchaseOrder_insert;
    private javax.swing.JTable purchaseOrder_table;
    // End of variables declaration//GEN-END:variables
}
