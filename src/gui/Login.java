
package gui;

import com.formdev.flatlaf.FlatLightLaf;
import gui.output.error;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.MySQL;

import model.UserBean;


public class Login extends javax.swing.JFrame {
    public static Dashboard dashboard=new Dashboard();
    public static UserBean userBean=new UserBean();
   
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
        jLabel4 = new javax.swing.JLabel();
        SupervisorPassword = new javax.swing.JPasswordField();
        SupervisorSignInBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 54, 64));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 62, 64));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel5.setText(" A G R I ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 70));

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));

        jLabel3.setText("USERNAME");

        SupervisorUsername.setText(" ");

        jLabel4.setText("PASSWORD");

        SupervisorSignInBtn.setText("SIGN IN");
        SupervisorSignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorSignInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(SupervisorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addComponent(SupervisorPassword))
                    .addComponent(SupervisorSignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(SupervisorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(SupervisorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(SupervisorSignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void SupervisorSignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorSignInBtnActionPerformed
        String username=SupervisorUsername.getText();
        String password=String.valueOf(SupervisorPassword.getPassword());
        
        if(username.isEmpty()){
              JOptionPane.showMessageDialog(this, "Please enter your username", "Warning",JOptionPane.WARNING_MESSAGE);
            
        }else if(password.isEmpty()){
             JOptionPane.showMessageDialog(this, "Please enter your password", "Warning",JOptionPane.WARNING_MESSAGE);
            
        }else{
            try {
                ResultSet rs=MySQL.execute("SELECT * FROM `softwareproject`.`supervisor` WHERE `username`='"+username+"' AND `password`='"+password+"'");
                if(rs.next()){
                    if(rs.getInt("user_status_us_id")==1){
                        //System.out.println("success");
                        String fname=rs.getString("fname");
                        String lname=rs.getString("lname");
                        String mobile=rs.getString("mobile");
                        int id=rs.getInt("s_id");
                        
                        
                        
                        userBean.setS_id(id);
                        userBean.setFname(fname);
                        userBean.setLname(lname);
                        userBean.setMobile(mobile);
                        
                        
                        //dashboard.getUserBean(userBean);
                        
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
                e.printStackTrace();
                //JOptionPane.showMessageDialog(this,"Check your login details","Sign in Error",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
            
        }
        
    }//GEN-LAST:event_SupervisorSignInBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FlatLightLaf.setup();
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
