package gui;

import gui.output.SelectError;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.buyerOrderModel;

public class Buyer_placeOrder extends javax.swing.JFrame {
    public static final buyerOrderModel o_model=new buyerOrderModel();
    public Buyer_placeOrder() {
        initComponents();
        setDate();
        DefaultTableModel model =(DefaultTableModel) BuyerpurchaseOrder_table.getModel();
        o_model.loadOrderTable(model);
    }
    public void setDate(){
        String textDate=new SimpleDateFormat("MM / dd / yyyy",Locale.ENGLISH).format(new Date());
        BuyerpurchaseOrder_date.setText(textDate);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BuyerpurchaseOrder_id = new javax.swing.JTextField();
        BuyerpurchaseOrder_date = new javax.swing.JTextField();
        BuyerpurchaseOrder_insert = new javax.swing.JButton();
        BuyerpurchaseOrder_addItems = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BuyerjTextField2 = new javax.swing.JTextField();
        BuyerpurchaseOrder_Search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        BuyerpurchaseOrder_id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_id.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_id.setOpaque(false);
        BuyerpurchaseOrder_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_idActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_date.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_date.setOpaque(false);

        BuyerpurchaseOrder_insert.setBackground(new java.awt.Color(255, 246, 207));
        BuyerpurchaseOrder_insert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_insert.setText("INSERT");
        BuyerpurchaseOrder_insert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_insert.setContentAreaFilled(false);
        BuyerpurchaseOrder_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_insert.setFocusPainted(false);
        BuyerpurchaseOrder_insert.setOpaque(true);
        BuyerpurchaseOrder_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insertMouseExited(evt);
            }
        });
        BuyerpurchaseOrder_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_insertActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_addItems.setBackground(new java.awt.Color(255, 246, 207));
        BuyerpurchaseOrder_addItems.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_addItems.setText("INSERT  ITEMS TO THE ORDER");
        BuyerpurchaseOrder_addItems.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_addItems.setContentAreaFilled(false);
        BuyerpurchaseOrder_addItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_addItems.setFocusPainted(false);
        BuyerpurchaseOrder_addItems.setOpaque(true);
        BuyerpurchaseOrder_addItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addItemsMouseExited(evt);
            }
        });
        BuyerpurchaseOrder_addItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_addItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BuyerpurchaseOrder_id)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(209, 209, 209))
                    .addComponent(BuyerpurchaseOrder_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuyerpurchaseOrder_date)
                    .addComponent(BuyerpurchaseOrder_addItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(BuyerpurchaseOrder_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuyerpurchaseOrder_addItems, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        addYield_CloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addYield_CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        BuyerjTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerjTextField2.setForeground(new java.awt.Color(153, 153, 153));
        BuyerjTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BuyerjTextField2.setText("Please Enter The Order Date");
        BuyerjTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        BuyerjTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerjTextField2MouseClicked(evt);
            }
        });
        jPanel9.add(BuyerjTextField2);
        BuyerjTextField2.setBounds(90, 20, 390, 40);

        BuyerpurchaseOrder_Search.setBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_Search.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        BuyerpurchaseOrder_Search.setForeground(new java.awt.Color(51, 51, 51));
        BuyerpurchaseOrder_Search.setText("SEARCH");
        BuyerpurchaseOrder_Search.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(184, 156, 118)));
        BuyerpurchaseOrder_Search.setContentAreaFilled(false);
        BuyerpurchaseOrder_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_Search.setFocusPainted(false);
        BuyerpurchaseOrder_Search.setOpaque(true);
        BuyerpurchaseOrder_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_SearchActionPerformed(evt);
            }
        });
        jPanel9.add(BuyerpurchaseOrder_Search);
        BuyerpurchaseOrder_Search.setBounds(480, 20, 110, 40);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerpurchaseOrder_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerpurchaseOrder_table.setForeground(new java.awt.Color(69, 69, 69));
        BuyerpurchaseOrder_table.setModel(new javax.swing.table.DefaultTableModel(
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
        BuyerpurchaseOrder_table.setFocusable(false);
        BuyerpurchaseOrder_table.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerpurchaseOrder_table.setRowHeight(28);
        BuyerpurchaseOrder_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerpurchaseOrder_table.setShowVerticalLines(false);
        BuyerpurchaseOrder_table.getTableHeader().setReorderingAllowed(false);
        BuyerpurchaseOrder_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BuyerpurchaseOrder_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BuyerpurchaseOrder_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_idActionPerformed

    private void BuyerpurchaseOrder_insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertMouseEntered
        BuyerpurchaseOrder_insert.setBackground(new Color(193, 153, 111));
        BuyerpurchaseOrder_insert.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BuyerpurchaseOrder_insertMouseEntered

    private void BuyerpurchaseOrder_insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertMouseExited
        BuyerpurchaseOrder_insert.setBackground(new Color(255, 246, 207));
        BuyerpurchaseOrder_insert.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerpurchaseOrder_insertMouseExited

    private void BuyerpurchaseOrder_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertActionPerformed
        String orderId=BuyerpurchaseOrder_id.getText();
        String orderDate=BuyerpurchaseOrder_date.getText();

        if(orderDate.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Order date cannot be empty!");
            categoryExists.setVisible(true);
        }else{
            if(orderId.isEmpty()){
                try {
                    MySQL.execute("INSERT INTO `crop_invoice`(`date`,`status_id`) VALUES('"+orderDate+"','1')");

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }else{
                try {
                    
                    int oid=Integer.parseInt(orderId);
                    ResultSet rs=MySQL.execute("SELECT * FROM `crop_invoice` WHERE `order_id`='"+oid+"'");
                    if(rs.next()){
                        SelectError categoryExists=new SelectError();
                        categoryExists.setText("Order ID already exists!");
                        categoryExists.setVisible(true);
                    }else{
                    MySQL.execute("INSERT INTO `crop_invoice`(`order_id`,`date`,`status_id`) VALUES('"+oid+"','"+orderDate+"','1')");
                    }
                
                    } catch (Exception e) {
                    e.printStackTrace();

                }
            }
            DefaultTableModel model =(DefaultTableModel) BuyerpurchaseOrder_table.getModel();
            o_model.loadOrderTable(model);
            setDate();

        }

    }//GEN-LAST:event_BuyerpurchaseOrder_insertActionPerformed

    private void BuyerpurchaseOrder_addItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsMouseEntered

    private void BuyerpurchaseOrder_addItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsMouseExited

    private void BuyerpurchaseOrder_addItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsActionPerformed

    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked

    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void BuyerjTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjTextField2MouseClicked
        BuyerjTextField2.setText(null);
        BuyerjTextField2.setCaretColor(new Color(0, 0, 0));
        BuyerjTextField2.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerjTextField2MouseClicked

    private void BuyerpurchaseOrder_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_SearchActionPerformed

        BuyerjTextField2.setText("Please Enter The Order Date");
        BuyerjTextField2.setForeground(new Color(153,153,153));
        BuyerjTextField2.setCaretColor(new Color(255,255,255));
    }//GEN-LAST:event_BuyerpurchaseOrder_SearchActionPerformed

    private void BuyerpurchaseOrder_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_tableMouseClicked

    }//GEN-LAST:event_BuyerpurchaseOrder_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuyerjTextField2;
    private javax.swing.JButton BuyerpurchaseOrder_Search;
    private javax.swing.JButton BuyerpurchaseOrder_addItems;
    private javax.swing.JTextField BuyerpurchaseOrder_date;
    private javax.swing.JTextField BuyerpurchaseOrder_id;
    private javax.swing.JButton BuyerpurchaseOrder_insert;
    private javax.swing.JTable BuyerpurchaseOrder_table;
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
