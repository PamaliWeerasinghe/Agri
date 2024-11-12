
package gui;

import com.google.gson.Gson;
import com.toedter.calendar.JDateChooser;
import static gui.Login.log1;
import gui.output.CropExisting;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import gui.output.error;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.UserBean;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.glxn.qrgen.javase.QRCode;
import utility.BDUtility;

public class SupervisorViewCrops extends javax.swing.JFrame {
    //UserBean userBean;
    public static int selectedRowId;
    public void updateCrop(){
        String defaultDir=BDUtility.getPath("qrCodes");
        if(selectedRowId!=0){
            String blockName=blockCombo.getSelectedItem().toString();
            String cropName=jComboBox1.getSelectedItem().toString();
        
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
            String from_date=sdf.format(jDateChooser1.getDate());
            String to_date=sdf.format(jDateChooser2.getDate());
            String yield=idField3.getText();
            String noOfCrops=amountCrops.getText();
            String QR=QROutput.getIcon().toString();
        
            if(blockName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a block");
             notify.setVisible(true);
            }else if(cropName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a crop");
             notify.setVisible(true);
            }else if(from_date==to_date){
             SelectError notify=new SelectError();
             notify.setText("Please enter the crop duration");
             notify.setVisible(true);
            }else if(yield.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the expected yield");
             notify.setVisible(true);
            }else if(noOfCrops.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the number of crops");
             notify.setVisible(true);
            }else if(QROutput.getIcon()==null){
             SelectError notify=new SelectError();
             notify.setText("Please generate a QR Code");
             notify.setVisible(true);
            }else{
                try {
                    ResultSet bid=MySQL.execute("SELECT `b_id` FROM `block` WHERE `name`='"+blockName+"' ");
                    ResultSet cid=MySQL.execute("SELECT `c_id` FROM `crop` WHERE `type`='"+cropName+"'");
                    
                    if(bid.next()&& cid.next()){
                        try{
                            
                            //update the record
                            MySQL.execute("UPDATE `block_has_crop` SET `block_b_id`='"+bid.getInt("b_id")+"' ,`crop_c_id`='"+cid.getInt("c_id")+"'"
                                    + ",`expected_yield`='"+yield+"',`no_of_crops`='"+noOfCrops+"', `QRCode`='"+QR+"'"
                                    + "WHERE `id`='"+selectedRowId+"'");
                            
                            
                            //refresh the table
                            loadCropDetails("SELECT * FROM `block_has_crop` INNER JOIN `block`\n" +
                                            "ON `block`.`b_id`=`block_has_crop`.`block_b_id` INNER JOIN `crop`\n" +
                                            "ON `crop`.`c_id`=`block_has_crop`.`crop_c_id` "
                                            + "INNER JOIN `status` ON `status`.`id`=`block_has_crop`.`status_id`"
                                            + "WHERE `status`='Active';");
                    
                            reset();
                              jDateChooser1.setEnabled(true);
                              jDateChooser2.setEnabled(true);
                    
                    
        
                
                
                
                        }catch(Exception e){
//                            e.printStackTrace();
                              log1.warning(e.toString());
                        }
                        
                        
                        
                        
                        
                    }else{

                    }
        
                    
                    
            
                } catch (Exception e) {
                    log1.warning(e.toString());
                }
                
            
            
        
        }
        }
    }
    public SupervisorViewCrops() {
        initComponents();
        //Login.dashboard.dispose();
        loadCropDetails("SELECT * FROM `block_has_crop` INNER JOIN `block`\n" +
                "ON `block`.`b_id`=`block_has_crop`.`block_b_id` INNER JOIN `crop`\n" +
                "ON `crop`.`c_id`=`block_has_crop`.`crop_c_id` "
                + "INNER JOIN `status` ON `status`.`id`=`block_has_crop`.`status_id`"
                + "WHERE `status`='Active';");
        
        loadCrops("SELECT * FROM `crop`");
        loadBlocks("SELECT * FROM `block`");
        setTodayDate();
    }
  
    public void reset(){
        jComboBox1.setSelectedItem("SELECT");
        blockCombo.setSelectedItem("SELECT");
        Date todayDate=new Date();
      
        jDateChooser1.setDate(todayDate);
        jDateChooser2.setDate(todayDate);
        idField3.setText("");
        amountCrops.setText("");
        QROutput.setIcon(null);
    }
    public void insertCrop(){
        String defaultDir=BDUtility.getPath("qrCodes");
        String blockName=blockCombo.getSelectedItem().toString();
        String cropName=jComboBox1.getSelectedItem().toString();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        String from_date=sdf.format(jDateChooser1.getDate());
        String to_date=sdf.format(jDateChooser2.getDate());
        String yield=idField3.getText();
        String noOfCrops=amountCrops.getText();
        
        
        
        if(blockName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a block");
             notify.setVisible(true);
        }else if(cropName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a crop");
             notify.setVisible(true);
        }else if(from_date==to_date){
             SelectError notify=new SelectError();
             notify.setText("Please enter the crop duration");
             notify.setVisible(true);
        }else if(noOfCrops.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the number of crops");
             notify.setVisible(true);
        }else if(yield.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the expected yield");
             notify.setVisible(true);
        }else if(QROutput.getIcon()==null){
             SelectError notify=new SelectError();
             notify.setText("Please generate a QR Code");
             notify.setVisible(true);
        }else{
            try {
            ResultSet bid=MySQL.execute("SELECT `b_id` FROM `block` WHERE `name`='"+blockName+"' ");
            ResultSet cid=MySQL.execute("SELECT `c_id` FROM `crop` WHERE `type`='"+cropName+"'");
            
            
            if(bid.next()&& cid.next()){
                
                ResultSet rs=MySQL.execute("SELECT * FROM `block_has_crop` WHERE `block_b_id`='"+bid.getInt("b_id")+"' AND `status_id`='1'"
                        + "AND"
                        + "((`from_date` BETWEEN '"+from_date+"' AND '"+to_date+"') "
                                + "OR (`to_date` BETWEEN '"+from_date+"' AND '"+to_date+"') "
                                + "OR (`from_date`='"+from_date+"' AND `to_date`='"+to_date+"'))"
                        + "");
                if(rs.next()){
                    //panel for already existing crop in a block
                    CropExisting cropExists=new CropExisting();
                    cropExists.setVisible(true);
                }else{
                    //insert the generated QR as well
                    try {
            if(out==null){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("No QR Code generated");
                categoryExists.setVisible(true);
            }
            
//            System.out.println(defaultDir);
            File directory=new File(defaultDir);
            if(!directory.exists()){
                directory.mkdirs();
            }
           
            File defaultFile=new File(directory,blockName+" "+cropName+" "+from_date+" "+to_date+".jpg");
            try {
                java.nio.file.Files.write(defaultFile.toPath(),out.toByteArray());
                JOptionPane.showMessageDialog(null, "QR Code Saved Successfully!");
            } catch (Exception e) {
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Error Saving QR Code");
                categoryExists.setVisible(true);
                log1.warning(e.toString());
            }
        } catch (Exception e) {
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Something Went Wrong");
            categoryExists.setVisible(true);
            log1.warning(e.toString());
        }
                    String QRPath=defaultDir+blockName+cropName+" "+from_date+" "+to_date+".jpg";
                    MySQL.execute("INSERT INTO `block_has_crop`(`block_b_id`,`crop_c_id`,`from_date`,`to_date`,`expected_yield`,`no_of_crops`,`status_id`,`QRCode`)"
                    + "VALUES ('"+bid.getInt("b_id")+"','"+cid.getInt("c_id")+"','"+from_date+"','"+to_date+"','"+yield+"','"+noOfCrops+"','1','"+QRPath+"')");
                    
                    loadCropDetails("SELECT * FROM `block_has_crop` INNER JOIN `block`\n" +
                "ON `block`.`b_id`=`block_has_crop`.`block_b_id` INNER JOIN `crop`\n" +
                "ON `crop`.`c_id`=`block_has_crop`.`crop_c_id` "
                + "INNER JOIN `status` ON `status`.`id`=`block_has_crop`.`status_id`"
                + "WHERE `status`='Active';");
                    
                    reset();
                    
                    
        
                
                }
                
                    
            }else{
                System.out.println("not correct");
            }
        
            } catch (Exception e) {
//                e.printStackTrace();
                  log1.warning(e.toString());
            }
        
        }
        
        
        
        
        
    }
    public void setTodayDate(){
        Date todayDate=new Date();
        jDateChooser1.setDate(todayDate);
        jDateChooser2.setDate(todayDate);
    }
    public void loadBlocks(String query){
        
        try {
            ResultSet rs=MySQL.execute(query);
            Vector v=new Vector();
            v.add("SELECT");
            while(rs.next()){
                
                v.add(rs.getString("name"));
                
            }
            DefaultComboBoxModel dropdown=new DefaultComboBoxModel(v);
            blockCombo.setModel(dropdown);
        
        } catch (Exception ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }
    public void loadCrops(String query){
        
       try {
            ResultSet rs=MySQL.execute(query);
            Vector v=new Vector();
            v.add("SELECT");
            while(rs.next()){
                
                v.add(rs.getString("type"));
                
            }
            DefaultComboBoxModel dropdown=new DefaultComboBoxModel(v);
            jComboBox1.setModel(dropdown);
        
        } catch (Exception ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }
    public void getS_id(UserBean userBean){
        //this.userBean=userBean;
        
    }
    public void loadCropDetails(String query){
        //System.out.println(userBean.getS_id());
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        try {
            ResultSet rs=MySQL.execute(query);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getInt("id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getString("from_date"));
                v.add(rs.getString("to_date"));
                v.add(rs.getString("expected_yield"));
                v.add(rs.getInt("no_of_crops"));
                model.addRow(v);
                
            }
            
                
        } catch (Exception ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idField3 = new javax.swing.JTextField();
        cropInsertBtn = new javax.swing.JButton();
        blockCombo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        amountCrops = new javax.swing.JTextField();
        SupervisorViewCrops_UpdateBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        SupervisorViewCrops_DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        QROutput = new javax.swing.JLabel();
        addCategory_generateQR = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(222, 191, 142));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("SEARCH");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(184, 156, 118)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel1.setText(" A G R I ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(226, 185, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("BLOCK NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setText("CROP NAME");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setText("FROM DATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("TO DATE ( END DATE )");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setText("EXPECTED YIELD");

        idField3.setBackground(new java.awt.Color(226, 185, 130));
        idField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        idField3.setForeground(new java.awt.Color(255, 255, 255));
        idField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        idField3.setOpaque(false);
        idField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idField3ActionPerformed(evt);
            }
        });

        cropInsertBtn.setBackground(new java.awt.Color(255, 246, 207));
        cropInsertBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cropInsertBtn.setText("INSERT");
        cropInsertBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        cropInsertBtn.setContentAreaFilled(false);
        cropInsertBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cropInsertBtn.setFocusPainted(false);
        cropInsertBtn.setOpaque(true);
        cropInsertBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cropInsertBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cropInsertBtnMouseExited(evt);
            }
        });
        cropInsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropInsertBtnActionPerformed(evt);
            }
        });

        blockCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        blockCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockComboActionPerformed(evt);
            }
        });

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser2MouseClicked(evt);
            }
        });
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });

        jLabel2.setText("kg");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("NUMBER OF CROPS");

        amountCrops.setBackground(new java.awt.Color(226, 185, 130));
        amountCrops.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        amountCrops.setForeground(new java.awt.Color(255, 255, 255));
        amountCrops.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        amountCrops.setOpaque(false);
        amountCrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountCropsActionPerformed(evt);
            }
        });

        SupervisorViewCrops_UpdateBtn.setBackground(new java.awt.Color(255, 246, 207));
        SupervisorViewCrops_UpdateBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        SupervisorViewCrops_UpdateBtn.setText("UPDATE");
        SupervisorViewCrops_UpdateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        SupervisorViewCrops_UpdateBtn.setContentAreaFilled(false);
        SupervisorViewCrops_UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupervisorViewCrops_UpdateBtn.setFocusPainted(false);
        SupervisorViewCrops_UpdateBtn.setOpaque(true);
        SupervisorViewCrops_UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupervisorViewCrops_UpdateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SupervisorViewCrops_UpdateBtnMouseExited(evt);
            }
        });
        SupervisorViewCrops_UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorViewCrops_UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amountCrops, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(idField3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(SupervisorViewCrops_UpdateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(blockCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cropInsertBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 132, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blockCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addComponent(amountCrops, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cropInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupervisorViewCrops_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(248, 248, 248));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(" Enter the name of the crop");
        jTextField1.setAlignmentY(0.3F);
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        SupervisorViewCrops_DeleteBtn.setBackground(new java.awt.Color(255, 246, 207));
        SupervisorViewCrops_DeleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        SupervisorViewCrops_DeleteBtn.setText("DELETE THE SELECTED ROW");
        SupervisorViewCrops_DeleteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        SupervisorViewCrops_DeleteBtn.setContentAreaFilled(false);
        SupervisorViewCrops_DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupervisorViewCrops_DeleteBtn.setFocusPainted(false);
        SupervisorViewCrops_DeleteBtn.setOpaque(true);
        SupervisorViewCrops_DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupervisorViewCrops_DeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SupervisorViewCrops_DeleteBtnMouseExited(evt);
            }
        });
        SupervisorViewCrops_DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorViewCrops_DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SupervisorViewCrops_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupervisorViewCrops_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTable1.setForeground(new java.awt.Color(69, 69, 69));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BLOCK", "CROP", "FROM DATE", "TO DATE", "EXPECTED YIELD ( kg )", "NO OF CROPS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(0);
        jTable1.setSelectionBackground(new java.awt.Color(222, 191, 142));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(6);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(6);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        QROutput.setBackground(new java.awt.Color(255, 255, 255));
        QROutput.setText(" ");
        QROutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        QROutput.setOpaque(true);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCategory_generateQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QROutput, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(QROutput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(addCategory_generateQR, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cropInsertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cropInsertBtnMouseEntered
        
    }//GEN-LAST:event_cropInsertBtnMouseEntered

    private void cropInsertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cropInsertBtnMouseExited
       
    }//GEN-LAST:event_cropInsertBtnMouseExited

    private void cropInsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropInsertBtnActionPerformed
        insertCrop();
        
       
        
      
    }//GEN-LAST:event_cropInsertBtnActionPerformed

    private void idField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idField3ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SupervisorViewCrops_DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_DeleteBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorViewCrops_DeleteBtnMouseEntered

    private void SupervisorViewCrops_DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_DeleteBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorViewCrops_DeleteBtnMouseExited

    private void SupervisorViewCrops_DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_DeleteBtnActionPerformed
        try {
            if(selectedRowId!=-1){
            MySQL.execute("DELETE FROM `block_has_crop` WHERE `id`='"+selectedRowId+"'");
            loadCropDetails("SELECT * FROM `block_has_crop` INNER JOIN `block`\n" +
                "ON `block`.`b_id`=`block_has_crop`.`block_b_id` INNER JOIN `crop`\n" +
                "ON `crop`.`c_id`=`block_has_crop`.`crop_c_id` "
                + "INNER JOIN `status` ON `status`.`id`=`block_has_crop`.`status_id`"
                + "WHERE `status`='Active';");
        
            reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SupervisorViewCrops_DeleteBtnActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String text = jTextField1.getText();
        loadCropDetails("SELECT * FROM `block_has_crop` INNER JOIN `block`\n" +
                        "ON `block`.`b_id`=`block_has_crop`.`block_b_id` INNER JOIN `crop`\n" +
                        "ON `crop`.`c_id`=`block_has_crop`.`crop_c_id` "
                        + "INNER JOIN `status` ON `status`.`id`=`block_has_crop`.`status_id`"
                        + "WHERE `type` LIKE '"+text+"%' AND `status`='Active';");
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
        
    }//GEN-LAST:event_jTextField1PropertyChange

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setText("Enter the name of the crop");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void blockComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockComboActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2MouseClicked

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void amountCropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountCropsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountCropsActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow =jTable1.getSelectedRow();
        if(selectedRow!=-1){
            selectedRowId=(int)jTable1.getValueAt(selectedRow,0);
            
            String block=jTable1.getValueAt(selectedRow,1).toString();
            blockCombo.setSelectedItem(block);
            String crop=jTable1.getValueAt(selectedRow,2).toString();
            jComboBox1.setSelectedItem(crop);
            
            String from=String.valueOf(jTable1.getValueAt(selectedRow,3));
            jDateChooser1.setDateFormatString(from);
            jDateChooser1.setEnabled(false);
            
            String to=String.valueOf(jTable1.getValueAt(selectedRow,4));
            jDateChooser2.setDateFormatString(to);
            jDateChooser2.setEnabled(false);

            String yield=jTable1.getValueAt(selectedRow,5).toString();
            idField3.setText(yield);
            
            String amount=jTable1.getValueAt(selectedRow,6).toString();
            amountCrops.setText(amount);
            
            try { 
                String path=block+" "+crop+" "+from+" "+to+".jpg";
                ResultSet rs=MySQL.execute("SELECT `QRCode` from `block_has_crop` WHERE `id`='"+selectedRowId+"'");
                ImageIcon icon=new ImageIcon(BDUtility.getPath("qrCodes"+File.separator+path));
                Image image=icon.getImage().getScaledInstance(287,245,Image.SCALE_SMOOTH);
                ImageIcon resizedIcon=new ImageIcon(image);
                
                QROutput.setIcon(resizedIcon);
//                if(rs.next()){
//                    QROutput.setIcon(rs.getString("QRCode").toString());
//                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void SupervisorViewCrops_UpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_UpdateBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorViewCrops_UpdateBtnMouseEntered

    private void SupervisorViewCrops_UpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_UpdateBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorViewCrops_UpdateBtnMouseExited

    private void SupervisorViewCrops_UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorViewCrops_UpdateBtnActionPerformed
        updateCrop();
    }//GEN-LAST:event_SupervisorViewCrops_UpdateBtnActionPerformed
    ByteArrayOutputStream out=null;
    private void addCategory_generateQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseClicked
//        String category=categoryAdd_combo.getSelectedItem().toString();
//        newCategory_name=categoryAdd_name.getText();
        String block=blockCombo.getSelectedItem().toString();
        String crop=jComboBox1.getSelectedItem().toString();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        String from=sdf.format(jDateChooser1.getDate());
       
        String to=sdf.format(jDateChooser2.getDate());
        String noOfCrops=amountCrops.getText();
        String expectedYield=idField3.getText();
        
//        Map<String,String>data=new HashMap<>();
//        data.put("block",block);
//        data.put("crop", crop);
//        data.put("from",from);
//        data.put("to",to);
//        data.put("noOfCrops",noOfCrops);
//        data.put("expectedYield",expectedYield);
        
        String text=crop+" added to the block "+block+"\n Duration of "+from+" to "+to+"\n Number of Crops added : "+noOfCrops+"\n Expected Yield : "+expectedYield;
//        Gson gson=new Gson();
//        String jsonData=gson.toJson(data);

        out =QRCode.from(text).withSize(287,245).to(net.glxn.qrgen.core.image.ImageType.PNG).stream();
        try {
            byte [] imageData=out.toByteArray();
            ImageIcon icon =new ImageIcon(imageData);
            QROutput.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }                           
    }//GEN-LAST:event_addCategory_generateQRMouseClicked

    private void addCategory_generateQRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRMouseEntered

    private void addCategory_generateQRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategory_generateQRMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRMouseExited

    private void addCategory_generateQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategory_generateQRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategory_generateQRActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupervisorViewCrops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QROutput;
    private javax.swing.JButton SupervisorViewCrops_DeleteBtn;
    private javax.swing.JButton SupervisorViewCrops_UpdateBtn;
    private javax.swing.JButton addCategory_generateQR;
    private javax.swing.JTextField amountCrops;
    private javax.swing.JComboBox<String> blockCombo;
    private javax.swing.JButton cropInsertBtn;
    private javax.swing.JTextField idField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
