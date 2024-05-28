package gui;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.buyerOrderModel;


public class Buyer_placeOrder_deleteOrder extends javax.swing.JFrame {
    public static final buyerOrderModel deleteItems=new buyerOrderModel();
    public static int orderID;
    public Buyer_placeOrder_deleteOrder() {
        initComponents();
        DefaultTableModel model =(DefaultTableModel) BuyerorderDelete_table.getModel();
        deleteItems.loadOrderTable(model);
    }
    public void reset(){
        BuyerorderDelete_ID.setText("");
        BuyerorderDelete_date.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BuyerorderDelete_ID = new javax.swing.JTextField();
        BuyerorderDelete_date = new javax.swing.JTextField();
        BuyerjButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BuyerorderDelete_table = new javax.swing.JTable();

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

        BuyerorderDelete_ID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerorderDelete_ID.setForeground(new java.awt.Color(255, 255, 255));
        BuyerorderDelete_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerorderDelete_ID.setOpaque(false);
        BuyerorderDelete_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerorderDelete_IDActionPerformed(evt);
            }
        });

        BuyerorderDelete_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerorderDelete_date.setForeground(new java.awt.Color(255, 255, 255));
        BuyerorderDelete_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerorderDelete_date.setOpaque(false);

        BuyerjButton4.setBackground(new java.awt.Color(255, 102, 102));
        BuyerjButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerjButton4.setText("DELETE");
        BuyerjButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerjButton4.setContentAreaFilled(false);
        BuyerjButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerjButton4.setFocusPainted(false);
        BuyerjButton4.setOpaque(true);
        BuyerjButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerjButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerjButton4MouseExited(evt);
            }
        });
        BuyerjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuyerjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BuyerorderDelete_date, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuyerorderDelete_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(209, 209, 209)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerorderDelete_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerorderDelete_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(BuyerjButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 51, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel3.setText(" A G R I ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerorderDelete_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerorderDelete_table.setForeground(new java.awt.Color(69, 69, 69));
        BuyerorderDelete_table.setModel(new javax.swing.table.DefaultTableModel(
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
        BuyerorderDelete_table.setFocusable(false);
        BuyerorderDelete_table.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerorderDelete_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerorderDelete_table.setRowHeight(28);
        BuyerorderDelete_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerorderDelete_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerorderDelete_table.setShowVerticalLines(false);
        BuyerorderDelete_table.getTableHeader().setReorderingAllowed(false);
        BuyerorderDelete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerorderDelete_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BuyerorderDelete_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void BuyerorderDelete_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerorderDelete_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerorderDelete_IDActionPerformed

    private void BuyerjButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjButton4MouseEntered
        BuyerjButton4.setBackground(new Color(243,88,88));
        BuyerjButton4.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerjButton4MouseEntered

    private void BuyerjButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjButton4MouseExited
        BuyerjButton4.setBackground(new Color(255,102,102));
        BuyerjButton4.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerjButton4MouseExited

    private void BuyerjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerjButton4ActionPerformed
        String ordID=BuyerorderDelete_ID.getText();
        String date=BuyerorderDelete_date.getText();

        deleteItems.deleteOrder(ordID,date);
        DefaultTableModel model =(DefaultTableModel) BuyerorderDelete_table.getModel();
        deleteItems.loadOrderTable(model);
        reset();

    }//GEN-LAST:event_BuyerjButton4ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BuyerorderDelete_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerorderDelete_tableMouseClicked
        int row = BuyerorderDelete_table.getSelectedRow();
        orderID=(int) BuyerorderDelete_table.getValueAt(row,0);
        Object o1 = BuyerorderDelete_table.getValueAt(row, 0);
        String s1 = String.valueOf(o1);
        BuyerorderDelete_ID.setText(s1);

        Object o2 = BuyerorderDelete_table.getValueAt(row, 1);
        String s2 = String.valueOf(o2);
        BuyerorderDelete_date.setText(s2);

        //BuyerjTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_BuyerorderDelete_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder_deleteOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyerjButton4;
    private javax.swing.JTextField BuyerorderDelete_ID;
    private javax.swing.JTextField BuyerorderDelete_date;
    private javax.swing.JTable BuyerorderDelete_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
