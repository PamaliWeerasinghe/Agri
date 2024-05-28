
package gui;

import java.awt.Toolkit;


public class LoadingPage extends javax.swing.JFrame {

    public LoadingPage() {
        icon();
        initComponents();
        
    }
    private void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/leaf.png")));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        positiontext = new javax.swing.JLabel();
        value = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(226, 182, 143));

        jPanel3.setBackground(new java.awt.Color(213, 168, 127));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/splash.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 270, 270));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 29, 4));
        jLabel1.setText("Where Agriculture Meets Technology");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 405, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("A G R I ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, -1));

        jPanel4.setBackground(new java.awt.Color(213, 168, 127));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setBackground(new java.awt.Color(213, 168, 127));
        ProgressBar.setForeground(new java.awt.Color(255, 255, 177));
        ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 168, 127)));
        ProgressBar.setOpaque(true);
        ProgressBar.setString("");
        ProgressBar.setStringPainted(true);
        jPanel4.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 27, 600, 10));

        positiontext.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        positiontext.setText("Loading . . .");
        jPanel4.add(positiontext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        value.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        value.setText("0 %");
        jPanel4.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoadingPage().setVisible(true);
//            }
//        });

LoadingPage lp=new LoadingPage();
lp.setVisible(true);
    try {
            for(int i =0;i<=100;i++){
                lp.ProgressBar.setValue(i);
                lp.value.setText(i+"%");
            Thread.sleep(100);
                if(i==10){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Loading Modules . . .");
                lp.value.setText(10+"%");
                }
                if(i==20){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Done Loading Modules . . .");
                lp.value.setText(20+"%");
                }
                if(i==30){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Starting Modules . . .");
                lp.value.setText(30+"%");
                }
                if(i==50){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Connecting To Database . . .");
                lp.value.setText(50+"%");
                }
                if(i==70){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Connection Success . . .");
                lp.value.setText(70+"%");
                }
                if(i==80){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Checking Validity . . .");
                lp.value.setText(80+"%");
                }
                if(i==90){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Validation Completed . . .");
                }
                if(i==100){
                lp.ProgressBar.setValue(i);
                lp.positiontext.setText("Loading Completed . . .");
                Thread.sleep(1000);
                Login login=new Login();
                login.setVisible(true);
                lp.dispose();
                }
            }
        } catch (Exception e) {
        e.printStackTrace();
        
        }





    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel positiontext;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
