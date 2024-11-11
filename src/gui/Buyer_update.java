package gui;

import static gui.Buyer_insert.buyers;
import static gui.Login.log1;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.BuyerModel;
import model.MySQL;



public class Buyer_update extends javax.swing.JFrame {
    public static final BuyerModel buyerUpdate=new BuyerModel();
    public static String id;
    public Buyer_update() {
        initComponents();
        DefaultTableModel dtm=(DefaultTableModel) buyerUpdate_table.getModel();
        buyerUpdate.loadBuyers(dtm,"SELECT * FROM `buyer` WHERE `status_id`='1'");
    }
    public void reset(){
        buyerUpdate_name.setText("");
        buyerUpdate_mobile.setText("");
        buyerUpdate_email.setText("");
        buyerUpdate_address.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buyerUpdate_name = new javax.swing.JTextField();
        buyerUpdate_mobile = new javax.swing.JTextField();
        buyerUpdate_address = new javax.swing.JTextField();
        buyerUpdate_insert = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        buyerUpdate_email = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        buyerUpdate_text = new javax.swing.JTextField();
        buyerUpdate_search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        buyerUpdate_table = new javax.swing.JTable();

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

        buyerUpdate_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyerUpdate_name.setForeground(new java.awt.Color(255, 255, 255));
        buyerUpdate_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyerUpdate_name.setOpaque(false);
        buyerUpdate_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerUpdate_nameActionPerformed(evt);
            }
        });

        buyerUpdate_mobile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyerUpdate_mobile.setForeground(new java.awt.Color(255, 255, 255));
        buyerUpdate_mobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyerUpdate_mobile.setOpaque(false);

        buyerUpdate_address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyerUpdate_address.setForeground(new java.awt.Color(255, 255, 255));
        buyerUpdate_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyerUpdate_address.setOpaque(false);

        buyerUpdate_insert.setBackground(new java.awt.Color(0, 255, 153));
        buyerUpdate_insert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        buyerUpdate_insert.setText("UPDATE");
        buyerUpdate_insert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        buyerUpdate_insert.setContentAreaFilled(false);
        buyerUpdate_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyerUpdate_insert.setFocusPainted(false);
        buyerUpdate_insert.setOpaque(true);
        buyerUpdate_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buyerUpdate_insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buyerUpdate_insertMouseExited(evt);
            }
        });
        buyerUpdate_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerUpdate_insertActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel10.setText("EMAIL");

        buyerUpdate_email.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        buyerUpdate_email.setForeground(new java.awt.Color(255, 255, 255));
        buyerUpdate_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buyerUpdate_email.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buyerUpdate_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyerUpdate_address, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(buyerUpdate_email)
                        .addComponent(buyerUpdate_name)
                        .addComponent(buyerUpdate_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyerUpdate_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyerUpdate_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyerUpdate_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyerUpdate_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(buyerUpdate_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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

        buyerUpdate_text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buyerUpdate_text.setForeground(new java.awt.Color(153, 153, 153));
        buyerUpdate_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buyerUpdate_text.setText("Please Enter The Buyer Name");
        buyerUpdate_text.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        buyerUpdate_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buyerUpdate_textFocusLost(evt);
            }
        });
        buyerUpdate_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyerUpdate_textMouseClicked(evt);
            }
        });
        buyerUpdate_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buyerUpdate_textKeyReleased(evt);
            }
        });
        jPanel7.add(buyerUpdate_text);
        buyerUpdate_text.setBounds(150, 30, 370, 40);

        buyerUpdate_search.setBackground(new java.awt.Color(222, 191, 142));
        buyerUpdate_search.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        buyerUpdate_search.setForeground(new java.awt.Color(51, 51, 51));
        buyerUpdate_search.setText("SEARCH");
        buyerUpdate_search.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(184, 156, 118)));
        buyerUpdate_search.setContentAreaFilled(false);
        buyerUpdate_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyerUpdate_search.setFocusPainted(false);
        buyerUpdate_search.setOpaque(true);
        buyerUpdate_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerUpdate_searchActionPerformed(evt);
            }
        });
        jPanel7.add(buyerUpdate_search);
        buyerUpdate_search.setBounds(520, 30, 130, 40);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        buyerUpdate_table.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        buyerUpdate_table.setForeground(new java.awt.Color(69, 69, 69));
        buyerUpdate_table.setModel(new javax.swing.table.DefaultTableModel(
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
        buyerUpdate_table.setFocusable(false);
        buyerUpdate_table.setGridColor(new java.awt.Color(255, 255, 255));
        buyerUpdate_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        buyerUpdate_table.setRowHeight(28);
        buyerUpdate_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        buyerUpdate_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        buyerUpdate_table.setShowVerticalLines(false);
        buyerUpdate_table.getTableHeader().setReorderingAllowed(false);
        buyerUpdate_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyerUpdate_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(buyerUpdate_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buyerUpdate_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerUpdate_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyerUpdate_nameActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void buyerUpdate_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyerUpdate_textMouseClicked
        buyerUpdate_text.setText(null);
        buyerUpdate_text.setForeground(new Color(0,0,0));
        buyerUpdate_text.setCaretColor(new Color(0,0,0));
    }//GEN-LAST:event_buyerUpdate_textMouseClicked

    private void buyerUpdate_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyerUpdate_textKeyReleased
        String text=buyerUpdate_text.getText();
        DefaultTableModel dtm2=(DefaultTableModel) buyerUpdate_table.getModel();
        buyerUpdate.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1' AND `name` LIKE '"+text+"%'");
    }//GEN-LAST:event_buyerUpdate_textKeyReleased

    private void buyerUpdate_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerUpdate_searchActionPerformed
        String text=buyerUpdate_text.getText();
        DefaultTableModel dtm2=(DefaultTableModel) buyerUpdate_table.getModel();
        buyerUpdate.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1' AND `name`='"+text+"'");
    }//GEN-LAST:event_buyerUpdate_searchActionPerformed

    private void buyerUpdate_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyerUpdate_tableMouseClicked
         int selectedRow=(int) buyerUpdate_table.getSelectedRow();
         String address = null;
         id=buyerUpdate_table.getValueAt(selectedRow, 0).toString();
         try {
             ResultSet rs= MySQL.execute("SELECT * FROM `buyer` WHERE `buyer_id`='"+id+"' AND `status_id`='1'");
             if(rs.next()){
                 address=rs.getString("address");
             }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
         String name=buyerUpdate_table.getValueAt(selectedRow, 1).toString();
         String mobile=buyerUpdate_table.getValueAt(selectedRow, 2).toString();
         String email=buyerUpdate_table.getValueAt(selectedRow, 3).toString();
         buyerUpdate_name.setText(name);
         buyerUpdate_mobile.setText(mobile);
         buyerUpdate_email.setText(email);
         buyerUpdate_address.setText(address);
         
    }//GEN-LAST:event_buyerUpdate_tableMouseClicked

    private void buyerUpdate_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerUpdate_insertActionPerformed
        String name=buyerUpdate_name.getText();
        String mobile=buyerUpdate_mobile.getText();
        String address =buyerUpdate_address.getText();
        String email=buyerUpdate_email.getText();
        buyerUpdate.updateBuyer(id,name,mobile,email,address);
        
        
        DefaultTableModel dtm2=(DefaultTableModel) buyerUpdate_table.getModel();
        buyers.loadBuyers(dtm2,"SELECT * FROM `buyer` WHERE `status_id`='1'");
        reset();
    }//GEN-LAST:event_buyerUpdate_insertActionPerformed

    private void buyerUpdate_insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyerUpdate_insertMouseExited
        buyerUpdate_insert.setBackground(new Color(42, 245, 164));
        buyerUpdate_insert.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_buyerUpdate_insertMouseExited

    private void buyerUpdate_insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyerUpdate_insertMouseEntered
        buyerUpdate_insert.setBackground(new Color(0, 255, 153));
        buyerUpdate_insert.setForeground(new Color(0,0, 0));
    }//GEN-LAST:event_buyerUpdate_insertMouseEntered

    private void buyerUpdate_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buyerUpdate_textFocusLost
        buyerUpdate_text.setText("Please Enter The Buyer Name");
    }//GEN-LAST:event_buyerUpdate_textFocusLost

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
            java.util.logging.Logger.getLogger(Buyer_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JTextField buyerUpdate_address;
    private javax.swing.JTextField buyerUpdate_email;
    private javax.swing.JButton buyerUpdate_insert;
    private javax.swing.JTextField buyerUpdate_mobile;
    private javax.swing.JTextField buyerUpdate_name;
    private javax.swing.JButton buyerUpdate_search;
    private javax.swing.JTable buyerUpdate_table;
    private javax.swing.JTextField buyerUpdate_text;
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
