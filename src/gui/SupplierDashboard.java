
package gui;

public class SupplierDashboard extends javax.swing.JFrame {

    public SupplierDashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SupplierDashboard_AddSupplier = new javax.swing.JButton();
        SupplierDashboard_AddSupplier1 = new javax.swing.JButton();
        SupplierDashboard_AddSupplier2 = new javax.swing.JButton();
        SupplierDashboard_AddSupplier3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SupplierDashboard_AddSupplier.setBackground(new java.awt.Color(255, 255, 255));
        SupplierDashboard_AddSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add-supplier.png"))); // NOI18N
        SupplierDashboard_AddSupplier.setText("Add Supplier");
        SupplierDashboard_AddSupplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        SupplierDashboard_AddSupplier.setContentAreaFilled(false);
        SupplierDashboard_AddSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupplierDashboard_AddSupplier.setFocusPainted(false);
        SupplierDashboard_AddSupplier.setFocusable(false);
        SupplierDashboard_AddSupplier.setMaximumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier.setMinimumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier.setOpaque(true);
        SupplierDashboard_AddSupplier.setPreferredSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SupplierDashboard_AddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDashboard_AddSupplierActionPerformed(evt);
            }
        });

        SupplierDashboard_AddSupplier1.setBackground(new java.awt.Color(255, 255, 255));
        SupplierDashboard_AddSupplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/update-supplier.png"))); // NOI18N
        SupplierDashboard_AddSupplier1.setText("Update Supplier");
        SupplierDashboard_AddSupplier1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        SupplierDashboard_AddSupplier1.setContentAreaFilled(false);
        SupplierDashboard_AddSupplier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupplierDashboard_AddSupplier1.setFocusPainted(false);
        SupplierDashboard_AddSupplier1.setFocusable(false);
        SupplierDashboard_AddSupplier1.setMaximumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier1.setMinimumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier1.setOpaque(true);
        SupplierDashboard_AddSupplier1.setPreferredSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SupplierDashboard_AddSupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDashboard_AddSupplier1ActionPerformed(evt);
            }
        });

        SupplierDashboard_AddSupplier2.setBackground(new java.awt.Color(255, 255, 255));
        SupplierDashboard_AddSupplier2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete-supllier.png"))); // NOI18N
        SupplierDashboard_AddSupplier2.setText("Remove Supplier");
        SupplierDashboard_AddSupplier2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        SupplierDashboard_AddSupplier2.setContentAreaFilled(false);
        SupplierDashboard_AddSupplier2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupplierDashboard_AddSupplier2.setFocusPainted(false);
        SupplierDashboard_AddSupplier2.setFocusable(false);
        SupplierDashboard_AddSupplier2.setMaximumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier2.setMinimumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier2.setOpaque(true);
        SupplierDashboard_AddSupplier2.setPreferredSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SupplierDashboard_AddSupplier2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDashboard_AddSupplier2ActionPerformed(evt);
            }
        });

        SupplierDashboard_AddSupplier3.setBackground(new java.awt.Color(255, 255, 255));
        SupplierDashboard_AddSupplier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add-supplier.png"))); // NOI18N
        SupplierDashboard_AddSupplier3.setText("Add New Category");
        SupplierDashboard_AddSupplier3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)));
        SupplierDashboard_AddSupplier3.setContentAreaFilled(false);
        SupplierDashboard_AddSupplier3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupplierDashboard_AddSupplier3.setFocusPainted(false);
        SupplierDashboard_AddSupplier3.setFocusable(false);
        SupplierDashboard_AddSupplier3.setMaximumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier3.setMinimumSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier3.setOpaque(true);
        SupplierDashboard_AddSupplier3.setPreferredSize(new java.awt.Dimension(50, 60));
        SupplierDashboard_AddSupplier3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SupplierDashboard_AddSupplier3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDashboard_AddSupplier3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(SupplierDashboard_AddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SupplierDashboard_AddSupplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(SupplierDashboard_AddSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(SupplierDashboard_AddSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupplierDashboard_AddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierDashboard_AddSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierDashboard_AddSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierDashboard_AddSupplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 93, Short.MAX_VALUE))
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

    private void SupplierDashboard_AddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDashboard_AddSupplierActionPerformed
        Admin_addSupplier addSupplier=new Admin_addSupplier();
        addSupplier.setVisible(true);
        this.dispose();
        

    }//GEN-LAST:event_SupplierDashboard_AddSupplierActionPerformed

    private void SupplierDashboard_AddSupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDashboard_AddSupplier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierDashboard_AddSupplier1ActionPerformed

    private void SupplierDashboard_AddSupplier2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDashboard_AddSupplier2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierDashboard_AddSupplier2ActionPerformed

    private void SupplierDashboard_AddSupplier3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDashboard_AddSupplier3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierDashboard_AddSupplier3ActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupplierDashboard_AddSupplier;
    private javax.swing.JButton SupplierDashboard_AddSupplier1;
    private javax.swing.JButton SupplierDashboard_AddSupplier2;
    private javax.swing.JButton SupplierDashboard_AddSupplier3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
