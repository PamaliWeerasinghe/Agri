
package gui;

import com.formdev.flatlaf.FlatLightLaf;
import gui.output.SelectError;
import gui.output.Success;
import gui.output.error;
import java.sql.ResultSet;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import model.MySQL;

import model.UserBean;


public class Login extends javax.swing.JFrame {
    
    public static Logger log1;
    public static FileHandler handler1;
    
    static{
        try {
            log1=Logger.getLogger("log1");
            handler1=new FileHandler("log.txt",true);
            handler1.setFormatter(new SimpleFormatter());
            log1.addHandler(handler1);
            
        } catch (Exception e) {
            //e.printStackTrace();
            log1.warning(e.toString());
        }
    
    }
    
    //public static Dashboard dashboard=new Dashboard();
    public static UserBean userBean=new UserBean();
    public static int user_type_id;
    //public static String uid;
   
    public Login() {
        
        initComponents();
        emptyTextFields();
    }
    
    private void emptyTextFields(){
        SupervisorUsername.setText("");
        SupervisorPassword.setText("");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SupervisorUsername = new javax.swing.JTextField();
        SupervisorPassword = new javax.swing.JPasswordField();
        SupervisorSignInBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 54, 64));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 62, 64));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel5.setText(" A G R I ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 70));

        jPanel3.setBackground(new java.awt.Color(213, 168, 127));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 15, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("USERNAME");

        SupervisorUsername.setBackground(new java.awt.Color(213, 168, 127));
        SupervisorUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SupervisorUsername.setForeground(new java.awt.Color(51, 0, 0));
        SupervisorUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 0, 0)));
        SupervisorUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        SupervisorUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        SupervisorPassword.setBackground(new java.awt.Color(213, 168, 127));
        SupervisorPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SupervisorPassword.setForeground(new java.awt.Color(51, 0, 0));
        SupervisorPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 0, 0)));
        SupervisorPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        SupervisorSignInBtn.setBackground(new java.awt.Color(244, 236, 222));
        SupervisorSignInBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SupervisorSignInBtn.setForeground(new java.awt.Color(51, 51, 51));
        SupervisorSignInBtn.setText("SIGN IN");
        SupervisorSignInBtn.setBorder(null);
        SupervisorSignInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupervisorSignInBtn.setFocusPainted(false);
        SupervisorSignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorSignInBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 15, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("PASSWORD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SupervisorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(SupervisorPassword))
                    .addComponent(SupervisorSignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(SupervisorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupervisorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(SupervisorSignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1 (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void SupervisorSignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorSignInBtnActionPerformed
        String username=SupervisorUsername.getText();
        String password=String.valueOf(SupervisorPassword.getPassword());
        
        if(username.isEmpty()){
              //JOptionPane.showMessageDialog(this, "Please enter your username", "Warning",JOptionPane.WARNING_MESSAGE);
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Please Enter Your Username");
            categoryExists.setVisible(true);
        
        }else if(password.isEmpty()){
             //JOptionPane.showMessageDialog(this, "Please enter your password", "Warning",JOptionPane.WARNING_MESSAGE);
             SelectError categoryExists=new SelectError();
            categoryExists.setText("Password field is empty");
            categoryExists.setVisible(true);
        }else{
            try {
                ResultSet rs=MySQL.execute("SELECT * FROM `agri`.`supervisor` WHERE `username`='"+username+"' AND `password`='"+password+"'");
                if(rs.next()){
                    if(rs.getInt("user_status_us_id")==1){
                        //System.out.println("success");
                        String fname=rs.getString("fname");
                        String lname=rs.getString("lname");
                        String mobile=rs.getString("mobile");
                        int id=rs.getInt("s_id");
                        user_type_id=rs.getInt("user_type_u_id");
                        //uid=rs.getString("user_type_u_id");
                        //System.out.println(user_type_id);
                        
                        
                        userBean.setS_id(id);
                        userBean.setFname(fname);
                        userBean.setLname(lname);
                        userBean.setMobile(mobile);
                        userBean.setUser_type_id(user_type_id);
                        
                        //dashboard.getUserBean(userBean);
                        //Success suceed = new Success(this, true);
                        //suceed.setVisible(true);
                        Dashboard dashboard =new Dashboard();
                        dashboard.setVisible(true);
                        
                        
                        this.dispose();
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(this,"Invalid Supervisor Login","Sign in Error",JOptionPane.ERROR_MESSAGE);
            
                    }
                                  
                    
                }else{
                    error signin=new error();
                    signin.setVisible(true);
                    
                    //JOptionPane.showMessageDialog(this,"Invalid Credentials","Sign in Error",JOptionPane.ERROR_MESSAGE);
            
                }
            
            } catch (Exception e) {
                //e.printStackTrace();
                //JOptionPane.showMessageDialog(this,"Check your login details","Sign in Error",JOptionPane.ERROR_MESSAGE);
                //System.out.println(e);
                log1.warning(e.toString());
            }
            
        }
        
    }//GEN-LAST:event_SupervisorSignInBtnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FlatLightLaf.setup();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField SupervisorPassword;
    private javax.swing.JButton SupervisorSignInBtn;
    private javax.swing.JTextField SupervisorUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
