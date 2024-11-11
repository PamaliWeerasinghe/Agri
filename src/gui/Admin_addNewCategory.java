package gui;

import com.google.gson.Gson;
import com.sun.javafx.iio.ImageStorage.ImageType;
import static gui.Login.log1;
import gui.output.SelectError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.MySQL;
import model.SupplierModel;
import model.validationModel;
import net.glxn.qrgen.javase.QRCode;
import net.sf.jasperreports.components.barcode4j.QRCodeBean;
import utility.BDUtility;

public class Admin_addNewCategory extends javax.swing.JFrame {
 


    
    
    SupplierModel sup_model=new SupplierModel();
    public Admin_addNewCategory() {
        initComponents();
        loadCategories("SELECT * FROM `category`");
        
    }
    public void reset(){
        categoryAdd_combo.setSelectedItem(" VIEW ");
        categoryAdd_name.setText("");
    }
    public void loadCategories(String query){
        
        try {
           ResultSet rs=MySQL.execute(query); 
           Vector v=new Vector();
           v.add(" VIEW ");
           while(rs.next()){
               v.add(rs.getString("cate_name"));
           }
           DefaultComboBoxModel dropdown=new DefaultComboBoxModel (v);
           categoryAdd_combo.setModel(dropdown);
        } catch (Exception e) {
            //e.printStackTrace();
            log1.warning(e.toString());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addYield_panel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        addYield_InsertBtn = new javax.swing.JButton();
        categoryAdd_combo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categoryAdd_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        addCategory_generateQR = new javax.swing.JButton();
        QROutput = new javax.swing.JLabel();
        addYield_InsertBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        addYield_panel1.setBackground(new java.awt.Color(226, 185, 130));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("EXISTING CATEGORIES");

        addYield_InsertBtn.setBackground(new java.awt.Color(255, 246, 207));
        addYield_InsertBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        addYield_InsertBtn.setText("INSERT");
        addYield_InsertBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        addYield_InsertBtn.setContentAreaFilled(false);
        addYield_InsertBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_InsertBtn.setFocusPainted(false);
        addYield_InsertBtn.setOpaque(true);
        addYield_InsertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addYield_InsertBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addYield_InsertBtnMouseExited(evt);
            }
        });
        addYield_InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_InsertBtnActionPerformed(evt);
            }
        });

        categoryAdd_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryAdd_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAdd_comboActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel2.setText(" A G R I ");

        categoryAdd_name.setBackground(new java.awt.Color(226, 185, 130));
        categoryAdd_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        categoryAdd_name.setForeground(new java.awt.Color(255, 255, 255));
        categoryAdd_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        categoryAdd_name.setOpaque(false);
        categoryAdd_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAdd_nameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("NEW CATEGORY NAME");

        addCategory_generateQR.setBackground(new java.awt.Color(255, 246, 207));
        addCategory_generateQR.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        addCategory_generateQR.setText("GENERATE QR");
        addCategory_generateQR.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        addCategory_generateQR.setContentAreaFilled(false);
        addCategory_generateQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCategory_generateQR.setFocusPainted(false);
        addCategory_generateQR.setOpaque(true);
        addCategory_generateQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategory_generateQRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCategory_generateQRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCategory_generateQRMouseExited(evt);
            }
        });
        addCategory_generateQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategory_generateQRActionPerformed(evt);
            }
        });

        QROutput.setBackground(new java.awt.Color(255, 255, 255));
        QROutput.setText(" ");
        QROutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        QROutput.setOpaque(true);

        addYield_InsertBtn1.setBackground(new java.awt.Color(255, 246, 207));
        addYield_InsertBtn1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        addYield_InsertBtn1.setText("SAVE QR");
        addYield_InsertBtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        addYield_InsertBtn1.setContentAreaFilled(false);
        addYield_InsertBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_InsertBtn1.setFocusPainted(false);
        addYield_InsertBtn1.setOpaque(true);
        addYield_InsertBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_InsertBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addYield_InsertBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addYield_InsertBtn1MouseExited(evt);
            }
        });
        addYield_InsertBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_InsertBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addYield_panel1Layout = new javax.swing.GroupLayout(addYield_panel1);
        addYield_panel1.setLayout(addYield_panel1Layout);
        addYield_panel1Layout.setHorizontalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryAdd_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addYield_panel1Layout.createSequentialGroup()
                                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(191, 191, 191))
                            .addComponent(categoryAdd_name))
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCategory_generateQR, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(QROutput, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addYield_InsertBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        addYield_panel1Layout.setVerticalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoryAdd_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryAdd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(addCategory_generateQR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QROutput, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addYield_InsertBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addYield_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addYield_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addYield_InsertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseEntered

    }//GEN-LAST:event_addYield_InsertBtnMouseEntered

    private void addYield_InsertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseExited

    }//GEN-LAST:event_addYield_InsertBtnMouseExited

    private void addYield_InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_InsertBtnActionPerformed
        String category=categoryAdd_name.getText();
        boolean result=validationModel.textValidation(category);
        if(result==true){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Contains special characters");
            categoryExists.setVisible(true);
        }else{
        sup_model.addCategory(category);
        reset();
        }
    }//GEN-LAST:event_addYield_InsertBtnActionPerformed

    private void categoryAdd_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAdd_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryAdd_comboActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void categoryAdd_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAdd_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryAdd_nameActionPerformed

    private void addCategory_generateQRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRMouseEntered

    private void addCategory_generateQRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRMouseExited

    private void addCategory_generateQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategory_generateQRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRActionPerformed

    private void addYield_InsertBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_InsertBtn1MouseEntered

    private void addYield_InsertBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_InsertBtn1MouseExited

    private void addYield_InsertBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_InsertBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_InsertBtn1ActionPerformed
    ByteArrayOutputStream out=null;
    String newCategory_name=null;
    private void addCategory_generateQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseClicked
        String category=categoryAdd_combo.getSelectedItem().toString();
        newCategory_name=categoryAdd_name.getText();
        
        Map<String,String>data=new HashMap<>();
        data.put("category",category);
        data.put("newCategory_name", newCategory_name);
        
        Gson gson=new Gson();
        String jsonData=gson.toJson(data);
        
        out =QRCode.from(jsonData).withSize(353, 310).to(net.glxn.qrgen.core.image.ImageType.PNG).stream();
        try {
            byte [] imageData=out.toByteArray();
            ImageIcon icon =new ImageIcon(imageData);
            QROutput.setIcon(icon);
        } catch (Exception e) {
            //e.printStackTrace();
            log1.warning(e.toString());
        }
    }//GEN-LAST:event_addCategory_generateQRMouseClicked

    private void addYield_InsertBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtn1MouseClicked
        try {
            if(out==null){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("No QR Code generated");
                categoryExists.setVisible(true);
            }
            String defaultDir=BDUtility.getPath("qrCodes");
//            System.out.println(defaultDir);
            File directory=new File(defaultDir);
            if(!directory.exists()){
                directory.mkdirs();
            }
            
            File defaultFile=new File(directory,newCategory_name+".jpg");
            try {
                java.nio.file.Files.write(defaultFile.toPath(),out.toByteArray());
                JOptionPane.showMessageDialog(null, "QR Code Saved Successfully!");
            } catch (Exception e) {
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Error Saving QR Code");
                categoryExists.setVisible(true);
            }
        } catch (Exception e) {
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Something Went Wrong");
            categoryExists.setVisible(true);
        }
    }//GEN-LAST:event_addYield_InsertBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(Admin_addNewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_addNewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_addNewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_addNewCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_addNewCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QROutput;
    private javax.swing.JButton addCategory_generateQR;
    private javax.swing.JButton addYield_InsertBtn;
    private javax.swing.JButton addYield_InsertBtn1;
    private javax.swing.JPanel addYield_panel1;
    private javax.swing.JComboBox<String> categoryAdd_combo;
    private javax.swing.JTextField categoryAdd_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
