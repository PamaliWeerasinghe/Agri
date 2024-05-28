
package gui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.addItemsModel;

public class PurchaseOrder_deleteOrder extends javax.swing.JFrame {
    public static final addItemsModel addItems=new addItemsModel();
    public static int orderID;
    public PurchaseOrder_deleteOrder() {
        initComponents();
        DefaultTableModel model =(DefaultTableModel) orderDelete_table.getModel();
        addItems.loadOrderTable(model);
    }
   
    public void reset(){
        orderDelete_ID.setText("");
        orderDelete_date.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        orderDelete_ID = new javax.swing.JTextField();
        orderDelete_date = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        orderDeletejTextField2 = new javax.swing.JTextField();
        orderDeletejButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderDelete_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 51, 0)));

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

        orderDelete_ID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        orderDelete_ID.setForeground(new java.awt.Color(255, 255, 255));
        orderDelete_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        orderDelete_ID.setOpaque(false);
        orderDelete_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDelete_IDActionPerformed(evt);
            }
        });

        orderDelete_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        orderDelete_date.setForeground(new java.awt.Color(255, 255, 255));
        orderDelete_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        orderDelete_date.setOpaque(false);

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton5.setText("DELETE  PRODUCTS");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(orderDelete_date, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(orderDelete_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addGap(209, 209, 209))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDelete_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDelete_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 51, 0)));
        jTabbedPane1.setFocusable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        orderDeletejTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        orderDeletejTextField2.setForeground(new java.awt.Color(153, 153, 153));
        orderDeletejTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orderDeletejTextField2.setText("Please Enter The Order ID");
        orderDeletejTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        orderDeletejTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orderDeletejTextField2FocusLost(evt);
            }
        });
        orderDeletejTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDeletejTextField2MouseClicked(evt);
            }
        });
        orderDeletejTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderDeletejTextField2KeyReleased(evt);
            }
        });
        jPanel7.add(orderDeletejTextField2);
        orderDeletejTextField2.setBounds(110, 10, 370, 40);

        orderDeletejButton2.setBackground(new java.awt.Color(222, 191, 142));
        orderDeletejButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        orderDeletejButton2.setForeground(new java.awt.Color(51, 51, 51));
        orderDeletejButton2.setText("SEARCH");
        orderDeletejButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(184, 156, 118)));
        orderDeletejButton2.setContentAreaFilled(false);
        orderDeletejButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderDeletejButton2.setFocusPainted(false);
        orderDeletejButton2.setOpaque(true);
        orderDeletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDeletejButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(orderDeletejButton2);
        orderDeletejButton2.setBounds(480, 10, 130, 40);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        orderDelete_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        orderDelete_table.setForeground(new java.awt.Color(69, 69, 69));
        orderDelete_table.setModel(new javax.swing.table.DefaultTableModel(
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
        orderDelete_table.setFocusable(false);
        orderDelete_table.setGridColor(new java.awt.Color(255, 255, 255));
        orderDelete_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        orderDelete_table.setRowHeight(28);
        orderDelete_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        orderDelete_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        orderDelete_table.setShowVerticalLines(false);
        orderDelete_table.getTableHeader().setReorderingAllowed(false);
        orderDelete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDelete_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(orderDelete_table);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("ORDER DETAILS", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderDelete_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDelete_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDelete_IDActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(243,88,88));
        jButton4.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(255,102,102));
        jButton4.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ordID=orderDelete_ID.getText();
        String date=orderDelete_date.getText();
        
        addItems.deleteOrder(ordID,date);
        DefaultTableModel model =(DefaultTableModel) orderDelete_table.getModel();
        addItems.loadOrderTable(model);
        reset();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String ordID=orderDelete_ID.getText();
        String date=orderDelete_date.getText();
        
        addItems.deleteOrder(ordID,date);
        DefaultTableModel model =(DefaultTableModel) orderDelete_table.getModel();
        addItems.loadOrderTable(model);
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void orderDeletejTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDeletejTextField2MouseClicked
        orderDeletejTextField2.setText("");
        orderDeletejTextField2.setForeground(new Color(0,0,0));
        orderDeletejTextField2.setCaretColor(new Color(0,0,0));
    }//GEN-LAST:event_orderDeletejTextField2MouseClicked

    private void orderDeletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDeletejButton2ActionPerformed
        String text=orderDeletejTextField2.getText();
        DefaultTableModel dtm =(DefaultTableModel) orderDelete_table.getModel();
        //addItems.reloadOrderTableSearch(dtm,text);
    }//GEN-LAST:event_orderDeletejButton2ActionPerformed

    private void orderDelete_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDelete_tableMouseClicked
        int row = orderDelete_table.getSelectedRow();
        orderID=(int) orderDelete_table.getValueAt(row,0);
        Object o1 = orderDelete_table.getValueAt(row, 0);
        String s1 = String.valueOf(o1);
        orderDelete_ID.setText(s1);

        Object o2 = orderDelete_table.getValueAt(row, 1);
        String s2 = String.valueOf(o2);
        orderDelete_date.setText(s2);

        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_orderDelete_tableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void orderDeletejTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderDeletejTextField2KeyReleased
        String text=orderDeletejTextField2.getText();
        DefaultTableModel dtm =(DefaultTableModel) orderDelete_table.getModel();
        addItems.reloadOrderTable(dtm,text);
        
    }//GEN-LAST:event_orderDeletejTextField2KeyReleased

    private void orderDeletejTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orderDeletejTextField2FocusLost
        // TODO add your handling code here:
        orderDeletejTextField2.setText("Enter the Order ID");
        DefaultTableModel dtm =(DefaultTableModel) orderDelete_table.getModel();
        addItems.loadOrderTable(dtm);
    }//GEN-LAST:event_orderDeletejTextField2FocusLost

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
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_deleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder_deleteOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField orderDelete_ID;
    private javax.swing.JTextField orderDelete_date;
    private javax.swing.JTable orderDelete_table;
    private javax.swing.JButton orderDeletejButton2;
    private javax.swing.JTextField orderDeletejTextField2;
    // End of variables declaration//GEN-END:variables
}
