
package gui;

import gui.output.SelectError;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.BuyerModel;
import model.validationModel;


public class Buyer_insert extends javax.swing.JFrame {

    public static final BuyerModel buyers=new BuyerModel();
    public Buyer_insert() {
        initComponents();
        DefaultTableModel dtm=(DefaultTableModel) buyer_table.getModel();
        buyers.loadBuyers(dtm,"SELECT * FROM `buyer` WHERE `status_id`='1'");
    }
    public void reset(){
        buyer_name.setText("");
        buyer_mobile.setText("");
        buyer_email.setText("");
        buyer_address.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buyer_name = new javax.swing.JTextField();
        buyer_mobile = new javax.swing.JTextField();
        buyer_address = new javax.swing.JTextField();
        buyer_insert = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buyer_email = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        buyer_text = new javax.swing.JTextField();
        buyer_search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        buyer_table = new javax.swing.JTable();

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel7.setText("BUYER NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel5.setText("MOBILE");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel6.setText("ADDRESS");

        buyer_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyer_name.setForeground(new java.awt.Color(255, 255, 255));
        buyer_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyer_name.setOpaque(false);
        buyer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyer_nameActionPerformed(evt);
            }
        });

        buyer_mobile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyer_mobile.setForeground(new java.awt.Color(255, 255, 255));
        buyer_mobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyer_mobile.setOpaque(false);

        buyer_address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyer_address.setForeground(new java.awt.Color(255, 255, 255));
        buyer_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyer_address.setOpaque(false);

        buyer_insert.setBackground(new java.awt.Color(255, 246, 207));
        buyer_insert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        buyer_insert.setText("INSERT");
        buyer_insert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        buyer_insert.setContentAreaFilled(false);
        buyer_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyer_insert.setFocusPainted(false);
        buyer_insert.setOpaque(true);
        buyer_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buyer_insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buyer_insertMouseExited(evt);
            }
        });
        buyer_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyer_insertActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel10.setText("EMAIL");

        buyer_email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyer_email.setForeground(new java.awt.Color(255, 255, 255));
        buyer_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyer_email.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buyer_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(buyer_email)
                        .addComponent(buyer_name)
                        .addComponent(buyer_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyer_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(buyer_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
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

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel4.setText(" A G R I ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        buyer_text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buyer_text.setForeground(new java.awt.Color(153, 153, 153));
        buyer_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buyer_text.setText("Please Enter The Buyer Name");
        buyer_text.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        buyer_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buyer_textFocusLost(evt);
            }
        });
        buyer_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyer_textMouseClicked(evt);
            }
        });
        buyer_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buyer_textKeyReleased(evt);
            }
        });
        jPanel7.add(buyer_text);
        buyer_text.setBounds(210, 20, 370, 40);

        buyer_search.setBackground(new java.awt.Color(222, 191, 142));
        buyer_search.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        buyer_search.setForeground(new java.awt.Color(51, 51, 51));
        buyer_search.setText("SEARCH");
        buyer_search.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(184, 156, 118)));
        buyer_search.setContentAreaFilled(false);
        buyer_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyer_search.setFocusPainted(false);
        buyer_search.setOpaque(true);
        buyer_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyer_searchActionPerformed(evt);
            }
        });
        jPanel7.add(buyer_search);
        buyer_search.setBounds(580, 20, 130, 40);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        buyer_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        buyer_table.setForeground(new java.awt.Color(69, 69, 69));
        buyer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BUYER ID", "NAME", "MOBILE", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        buyer_table.setFocusable(false);
        buyer_table.setGridColor(new java.awt.Color(255, 255, 255));
        buyer_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        buyer_table.setRowHeight(28);
        buyer_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        buyer_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        buyer_table.setShowVerticalLines(false);
        buyer_table.getTableHeader().setReorderingAllowed(false);
        buyer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyer_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(buyer_table);
        if (buyer_table.getColumnModel().getColumnCount() > 0) {
            buyer_table.getColumnModel().getColumn(0).setResizable(false);
            buyer_table.getColumnModel().getColumn(0).setPreferredWidth(10);
            buyer_table.getColumnModel().getColumn(1).setResizable(false);
            buyer_table.getColumnModel().getColumn(2).setResizable(false);
            buyer_table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buyer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyer_nameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_buyer_nameActionPerformed

    private void buyer_insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyer_insertMouseEntered
        buyer_insert.setBackground(new Color(193, 153, 111));
        buyer_insert.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_buyer_insertMouseEntered

    private void buyer_insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyer_insertMouseExited
        buyer_insert.setBackground(new Color(255, 246, 207));
        buyer_insert.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_buyer_insertMouseExited

    private void buyer_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyer_insertActionPerformed
        String name=buyer_name.getText();
        String mobile=buyer_mobile.getText();
        String address =buyer_address.getText();
        String email=buyer_email.getText();
        if(name.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Name is Empty");
            categoryExists.setVisible(true);
        }else if(mobile.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Mobile is Empty");
            categoryExists.setVisible(true);
        }else if(address.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Address is Empty");
            categoryExists.setVisible(true);
        }else if(email.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Email is Empty");
            categoryExists.setVisible(true);
        }else{
                boolean result1=validationModel.mobileValidation(mobile);
                boolean result2=validationModel.emailValidation(email);
            if(result1==false){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Mobile contains special characters");
                categoryExists.setVisible(true);
            }else if(result2==false){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Email contains special characters");
                categoryExists.setVisible(true);
            
            }else{

                buyers.insertBuyer(name,mobile,email,address);
                DefaultTableModel dtm2=(DefaultTableModel) buyer_table.getModel();
                buyers.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1'");
                reset();
            }
        }
    }//GEN-LAST:event_buyer_insertActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //        purchaseOrder_orderID.setText("");
        //        poField.setText("");
        //        purchaseOrder_productID.setText("");
        //        purchaseOrder_supplier.setText("");
        //        jTextField1.setText("Please Enter The Product Name");
        //        jTextField1.setForeground(new Color(153,153,153));
        //        jTextField1.setCaretColor(new Color(255,255,255));
        //        purchaseOrder_qty.setText("");
        //        upriceField.setText("");
        //        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void buyer_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyer_textMouseClicked
        buyer_text.setText(null);
        buyer_text.setForeground(new Color(0,0,0));
        buyer_text.setCaretColor(new Color(0,0,0));
    }//GEN-LAST:event_buyer_textMouseClicked

    private void buyer_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyer_searchActionPerformed
        String text=buyer_text.getText();
        DefaultTableModel dtm2=(DefaultTableModel) buyer_table.getModel();
        buyers.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1' AND `name`='"+text+"'");
    }//GEN-LAST:event_buyer_searchActionPerformed

    private void buyer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyer_tableMouseClicked

    }//GEN-LAST:event_buyer_tableMouseClicked

    private void buyer_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyer_textKeyReleased
        String text=buyer_text.getText();
        DefaultTableModel dtm2=(DefaultTableModel) buyer_table.getModel();
        buyers.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1' AND `name` LIKE '"+text+"%'");
    }//GEN-LAST:event_buyer_textKeyReleased

    private void buyer_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buyer_textFocusLost
        // TODO add your handling code here:
        buyer_text.setText("Please Enter The Buyer Name");
    }//GEN-LAST:event_buyer_textFocusLost

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
            java.util.logging.Logger.getLogger(Buyer_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JTextField buyer_address;
    private javax.swing.JTextField buyer_email;
    private javax.swing.JButton buyer_insert;
    private javax.swing.JTextField buyer_mobile;
    private javax.swing.JTextField buyer_name;
    private javax.swing.JButton buyer_search;
    private javax.swing.JTable buyer_table;
    private javax.swing.JTextField buyer_text;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
