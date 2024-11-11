
package gui;

import static gui.Login.log1;
import static gui.SupervisorViewCrops.selectedRowId;
import gui.output.CropExisting;
import gui.output.SelectError;
import gui.output.error;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.MySQL;

public class SupervisorAddYields extends javax.swing.JFrame {
    public static int selectedRowId;
    public static float updateHarvest;
  
    public SupervisorAddYields() {
        initComponents();
        
        loadBlocks("SELECT * FROM `block`");
        loadCrops("SELECT * FROM `crop`");
        loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1'");
        
        setTodayDate();
        
    }
    public void updateYield(){
              if(selectedRowId!=0){
                  
            
            String blockName=addYield_blockCombo.getSelectedItem().toString();
            String cropName=addYield_cropCombo.getSelectedItem().toString();
        
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
            String from_date=sdf.format(addYield_jDateChooser1.getDate());
            String to_date=sdf.format(addYield_jDateChooser2.getDate());
            String yield=addYield_amountCrops.getText();
            String noOfCrops=addYield_idField3.getText();
         
            if(yield.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the expected yield");
             notify.setVisible(true);
            }else{
                
                try {
                    
                    ResultSet yid=MySQL.execute("SELECT * FROM `yield` WHERE `y_id`='"+selectedRowId+"'");
                    //System.out.println(selectedRowId);
                    if(yid.next()){
                        //System.out.println("fount yid");
                        try{
                            
                            //update the record
                            MySQL.execute("UPDATE `yield` SET "
                                    + "`expected_yield_2`='"+yield+"',`harvest`='"+noOfCrops+"'"
                                    + "WHERE `y_id`='"+selectedRowId+"'");
                            ResultSet rs=MySQL.execute("SELECT * FROM `crop` WHERE `type`='"+cropName+"'");
                            if(rs.next()){
                                 float beforeUpdateStock=yid.getFloat("harvest");
                                 float entireStock=rs.getFloat("qty");
                                 
                                 float updatedStock=entireStock-beforeUpdateStock;
                                //float minusHarvest=(float)noOfCrops-rs.getFloat("qty");
                                MySQL.execute("UPDATE `crop` SET `qty`='"+updatedStock+"' WHERE `c_id`='"+rs.getInt("c_id")+"'");
                                MySQL.execute("UPDATE `crop` SET `qty`=`qty`+'"+noOfCrops+"' WHERE `c_id`='"+rs.getInt("c_id")+"'");
                            }
                            
                            
                            //refresh the table
                            loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1'");

                    
                            reset();
                            
        
                
                
                
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
    public void loadCrops(String query){
        
       try {
            ResultSet rs=MySQL.execute(query);
            Vector v=new Vector();
            v.add("SELECT");
            while(rs.next()){
                
                v.add(rs.getString("type"));
                
            }
            DefaultComboBoxModel dropdown=new DefaultComboBoxModel(v);
            addYield_cropCombo.setModel(dropdown);
        
        } catch (Exception ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }
    public void addNewYield(){
        boolean checkHarvest=false;
        String blockName=addYield_blockCombo.getSelectedItem().toString();
        String cropName=addYield_cropCombo.getSelectedItem().toString();
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        String from_date=sdf.format(addYield_jDateChooser1.getDate());
        String to_date=sdf.format(addYield_jDateChooser2.getDate());
        String yield=addYield_idField3.getText();
        String noOfCrops=addYield_amountCrops.getText();
        if(yield.isEmpty()){
            checkHarvest=true;
        }
        
        if(blockName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a block");
             notify.setVisible(true);
        
        }else if(cropName=="SELECT"){
             SelectError notify=new SelectError();
             notify.setText("Please select a crop");
             notify.setVisible(true);
        }else if(from_date.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the harvesting date");
             notify.setVisible(true);
        }else if(to_date.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the next harvesting date");
             notify.setVisible(true);
        }else if(noOfCrops.isEmpty()){
             SelectError notify=new SelectError();
             notify.setText("Please enter the expected yield");
             notify.setVisible(true);
        }else{
            try {
            ResultSet bid=MySQL.execute("SELECT `b_id` FROM `block` WHERE `name`='"+blockName+"' ");
            ResultSet cid=MySQL.execute("SELECT `c_id` FROM `crop` WHERE `type`='"+cropName+"'");
            if(bid.next()&&cid.next()){
                ResultSet checkAvailability =MySQL.execute("SELECT * FROM `block_has_crop` "
                        + "WHERE `block_b_id`='"+bid.getInt("b_id")+"' AND `crop_c_id`='"+cid.getInt("c_id")+"' AND `status_id`='1'");
                if(checkAvailability.next()){
                    ResultSet exist=MySQL.execute("SELECT * FROM `yield` WHERE `block_has_crop_id`='"+checkAvailability.getInt("id")+"'"
                    + "AND `harvested_date`='"+from_date+"' AND `next_harvest_date`='"+to_date+"'");
                    
                    if(exist.next()){
                        //record already exist
                        error alreadyExist=new error();
                        alreadyExist.setVisible(true);
                
                    }else{
                        //if(checkAvailability.next()){
                        if(checkHarvest){
                        //harvest not added
                                MySQL.execute("INSERT INTO `yield`(`expected_yield_2`,`harvested_date`,`next_harvest_date`,`block_has_crop_id`)"
                                + "VALUES ('"+noOfCrops+"','"+from_date+"','"+to_date+"','"+checkAvailability.getInt("id")+"')");
                                
                               
                                
                                loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1'");
                
                                reset();
                        
                        }else{
                        //harvest added
                                MySQL.execute("INSERT INTO `yield`(`expected_yield_2`,`harvested_date`,`next_harvest_date`,`block_has_crop_id`,`harvest`)"
                                + "VALUES ('"+noOfCrops+"','"+from_date+"','"+to_date+"','"+checkAvailability.getInt("id")+"','"+yield+"')");

                                //update stock
                                 float tofloat=Float.parseFloat(yield);
                                 MySQL.execute("UPDATE `crop` SET `qty`=`qty`+'"+tofloat+"' WHERE `c_id`='"+cid+"'");
                                
                                loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1'");
        
                        
                        reset();
                        
                        }
                
                
                //}else{
                System.out.println("not correct");
                //}
            }
            
                }else{
                    //No such crop
                    System.out.println("No such crop in the block");
                }
                
            
            
            }else{
                //No such crop
                System.out.println("No such crop in the block");
            }
            
            
            
        
        
            } catch (Exception e) {
//                e.printStackTrace();
                  log1.warning(e.toString());
            }
        
        }
        
        
        
        
        
    }
    public void reset(){
        addYield_blockCombo.setSelectedItem("SELECT");
        
        Date todayDate=new Date();
      
        addYield_jDateChooser1.setDate(todayDate);
        addYield_jDateChooser2.setDate(todayDate);
        addYield_jDateChooser1.setEnabled(true);
        addYield_jDateChooser2.setEnabled(true);
        addYield_idField3.setText("");
        addYield_amountCrops.setText("");
        addYield_cropCombo.setSelectedItem("SELECT");
        addYield_blockCombo.setEnabled(true);
        addYield_cropCombo.setEnabled(true);
                    
        
        
        
    }
      public void setTodayDate(){
        Date todayDate=new Date();
        addYield_jDateChooser1.setDate(todayDate);
        addYield_jDateChooser2.setDate(todayDate);
    }
    public void loadTable(String query){
        try {
            DefaultTableModel model=(DefaultTableModel) addYield_table.getModel();
            model.setRowCount(0);
            ResultSet rs=MySQL.execute(query);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getInt("y_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                v.add(rs.getDate("harvested_date"));
                v.add(rs.getDate("next_harvest_date"));
                v.add(rs.getFloat("expected_yield_2"));
                v.add(rs.getFloat("harvest"));
                model.addRow(v);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SupervisorAddYields.class.getName()).log(Level.SEVERE, null, ex);
        }
   
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
            addYield_blockCombo.setModel(dropdown);
        
        } catch (Exception ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addYield_panel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addYield_idField3 = new javax.swing.JTextField();
        addYield_InsertBtn = new javax.swing.JButton();
        addYield_blockCombo = new javax.swing.JComboBox<>();
        addYield_jDateChooser1 = new com.toedter.calendar.JDateChooser();
        addYield_jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addYield_amountCrops = new javax.swing.JTextField();
        addYield_UpdateBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        addYield_cropCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addYield_jTextField1 = new javax.swing.JTextField();
        addYield_DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addYield_table = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        addYield_panel1.setBackground(new java.awt.Color(226, 185, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("BLOCK NAME");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setText(" HARVESTING DATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("NEXT HARVESTING  DATE");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setText("HARVEST");

        addYield_idField3.setBackground(new java.awt.Color(226, 185, 130));
        addYield_idField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        addYield_idField3.setForeground(new java.awt.Color(255, 255, 255));
        addYield_idField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        addYield_idField3.setOpaque(false);
        addYield_idField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_idField3ActionPerformed(evt);
            }
        });

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

        addYield_blockCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addYield_blockCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_blockComboActionPerformed(evt);
            }
        });

        addYield_jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_jDateChooser1MouseClicked(evt);
            }
        });
        addYield_jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                addYield_jDateChooser1PropertyChange(evt);
            }
        });

        addYield_jDateChooser2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_jDateChooser2MouseClicked(evt);
            }
        });
        addYield_jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                addYield_jDateChooser2PropertyChange(evt);
            }
        });

        jLabel2.setText("kg");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("EXPECTED YIELD");

        addYield_amountCrops.setBackground(new java.awt.Color(226, 185, 130));
        addYield_amountCrops.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        addYield_amountCrops.setForeground(new java.awt.Color(255, 255, 255));
        addYield_amountCrops.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        addYield_amountCrops.setOpaque(false);
        addYield_amountCrops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_amountCropsActionPerformed(evt);
            }
        });

        addYield_UpdateBtn.setBackground(new java.awt.Color(255, 246, 207));
        addYield_UpdateBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        addYield_UpdateBtn.setText("UPDATE");
        addYield_UpdateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        addYield_UpdateBtn.setContentAreaFilled(false);
        addYield_UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_UpdateBtn.setFocusPainted(false);
        addYield_UpdateBtn.setOpaque(true);
        addYield_UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_UpdateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addYield_UpdateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addYield_UpdateBtnMouseExited(evt);
            }
        });
        addYield_UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_UpdateBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setText("CROP NAME");

        addYield_cropCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addYield_cropCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_cropComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addYield_panel1Layout = new javax.swing.GroupLayout(addYield_panel1);
        addYield_panel1.setLayout(addYield_panel1Layout);
        addYield_panel1Layout.setHorizontalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(addYield_panel1Layout.createSequentialGroup()
                                .addComponent(addYield_idField3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel9))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(addYield_amountCrops, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addYield_blockCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addYield_cropCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addYield_jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addYield_jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addYield_UpdateBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
        );
        addYield_panel1Layout.setVerticalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addYield_blockCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addYield_cropCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addYield_jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(addYield_jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(addYield_amountCrops, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addYield_idField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addYield_UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        addYield_CloseBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addYield_CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        addYield_CloseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_CloseBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel3.setText(" A G R I ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 671, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        addYield_jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addYield_jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addYield_jTextField1.setText(" Enter the name of the crop");
        addYield_jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addYield_jTextField1FocusLost(evt);
            }
        });
        addYield_jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_jTextField1MouseClicked(evt);
            }
        });
        addYield_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_jTextField1ActionPerformed(evt);
            }
        });
        addYield_jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                addYield_jTextField1PropertyChange(evt);
            }
        });
        addYield_jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addYield_jTextField1KeyReleased(evt);
            }
        });

        addYield_DeleteBtn.setBackground(new java.awt.Color(255, 246, 207));
        addYield_DeleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        addYield_DeleteBtn.setText("DELETE THE SELECTED ROW");
        addYield_DeleteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        addYield_DeleteBtn.setContentAreaFilled(false);
        addYield_DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addYield_DeleteBtn.setFocusPainted(false);
        addYield_DeleteBtn.setOpaque(true);
        addYield_DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addYield_DeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addYield_DeleteBtnMouseExited(evt);
            }
        });
        addYield_DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addYield_DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addYield_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addYield_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addYield_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addYield_DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        addYield_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BLOCK", "CROP", "HARVESTED DATE", "NEXT DATE", "EXPECTED YIELD ( kg )", "HARVEST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addYield_table.setGridColor(new java.awt.Color(255, 255, 255));
        addYield_table.setSelectionBackground(new java.awt.Color(226, 185, 130));
        addYield_table.setSelectionForeground(new java.awt.Color(204, 204, 204));
        addYield_table.getTableHeader().setReorderingAllowed(false);
        addYield_table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addYield_tableFocusLost(evt);
            }
        });
        addYield_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYield_tableMouseClicked(evt);
            }
        });
        addYield_table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                addYield_tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(addYield_table);
        if (addYield_table.getColumnModel().getColumnCount() > 0) {
            addYield_table.getColumnModel().getColumn(0).setResizable(false);
            addYield_table.getColumnModel().getColumn(0).setPreferredWidth(6);
            addYield_table.getColumnModel().getColumn(1).setResizable(false);
            addYield_table.getColumnModel().getColumn(1).setPreferredWidth(12);
            addYield_table.getColumnModel().getColumn(2).setResizable(false);
            addYield_table.getColumnModel().getColumn(2).setPreferredWidth(18);
            addYield_table.getColumnModel().getColumn(3).setResizable(false);
            addYield_table.getColumnModel().getColumn(4).setResizable(false);
            addYield_table.getColumnModel().getColumn(4).setPreferredWidth(40);
            addYield_table.getColumnModel().getColumn(5).setResizable(false);
            addYield_table.getColumnModel().getColumn(6).setResizable(false);
            addYield_table.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addYield_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addYield_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
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

    private void addYield_idField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_idField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_idField3ActionPerformed

    private void addYield_InsertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseEntered

    }//GEN-LAST:event_addYield_InsertBtnMouseEntered

    private void addYield_InsertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseExited

    }//GEN-LAST:event_addYield_InsertBtnMouseExited

    private void addYield_InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_InsertBtnActionPerformed
       addNewYield();

    }//GEN-LAST:event_addYield_InsertBtnActionPerformed

    private void addYield_blockComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_blockComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_blockComboActionPerformed

    private void addYield_jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_jDateChooser1MouseClicked

    }//GEN-LAST:event_addYield_jDateChooser1MouseClicked

    private void addYield_jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_addYield_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_jDateChooser1PropertyChange

    private void addYield_jDateChooser2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_jDateChooser2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_jDateChooser2MouseClicked

    private void addYield_jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_addYield_jDateChooser2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_jDateChooser2PropertyChange

    private void addYield_amountCropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_amountCropsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_amountCropsActionPerformed

    private void addYield_UpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_UpdateBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_UpdateBtnMouseEntered

    private void addYield_UpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_UpdateBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_UpdateBtnMouseExited

    private void addYield_UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_UpdateBtnActionPerformed
        updateYield();
    }//GEN-LAST:event_addYield_UpdateBtnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
        //Login.dashboard.setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
        this.dispose();
        
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void addYield_jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addYield_jTextField1FocusLost
        // TODO add your handling code here:
        addYield_jTextField1.setText("Enter the name of the crop");
    }//GEN-LAST:event_addYield_jTextField1FocusLost

    private void addYield_jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_jTextField1MouseClicked
        addYield_jTextField1.setText("");
        
        
    }//GEN-LAST:event_addYield_jTextField1MouseClicked

    private void addYield_jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_addYield_jTextField1PropertyChange

    }//GEN-LAST:event_addYield_jTextField1PropertyChange

    private void addYield_jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addYield_jTextField1KeyReleased
            String text=addYield_jTextField1.getText();
            loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1' AND `type` LIKE '"+text+"%'");
    }//GEN-LAST:event_addYield_jTextField1KeyReleased

    private void addYield_DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_DeleteBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_DeleteBtnMouseEntered

    private void addYield_DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_DeleteBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_DeleteBtnMouseExited

    private void addYield_DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_DeleteBtnActionPerformed
        try {
            if(selectedRowId!=-1){
            MySQL.execute("DELETE FROM `yield` WHERE `y_id`='"+selectedRowId+"'");
            loadTable("SELECT * FROM `yield` INNER JOIN"
                + "`block_has_crop` ON `yield`.`block_has_crop_id`=`block_has_crop`.`id` "
                + "INNER JOIN `block`"
                + "ON `block`.`b_id`=`block_has_crop`.`block_b_id` "
                + "INNER JOIN `crop` ON `crop`.`c_id`=`block_has_crop`.`crop_c_id`"
                + "WHERE `status_id`='1'");
                
            reset();
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }//GEN-LAST:event_addYield_DeleteBtnActionPerformed

    private void addYield_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_tableMouseClicked
            int selectedRow=addYield_table.getSelectedRow();
            if(selectedRow!=-1){
                selectedRowId=(int)addYield_table.getValueAt(selectedRow,0);
                updateHarvest=(float)addYield_table.getValueAt(selectedRow, 6);

                String block=addYield_table.getValueAt(selectedRow,1).toString();
                addYield_blockCombo.setSelectedItem(block);
                addYield_blockCombo.setEnabled(false);
                
                String crop=addYield_table.getValueAt(selectedRow,2).toString();
                addYield_cropCombo.setSelectedItem(crop);
                addYield_cropCombo.setEnabled(false);


                String from=String.valueOf(addYield_table.getValueAt(selectedRow,3));
                addYield_jDateChooser1.setDateFormatString(from);
                addYield_jDateChooser1.setEnabled(false);
                
                String to=String.valueOf(addYield_table.getValueAt(selectedRow,4));
                addYield_jDateChooser2.setDateFormatString(to);
                addYield_jDateChooser2.setEnabled(false);

                String yield=addYield_table.getValueAt(selectedRow,5).toString();
                addYield_amountCrops.setText(yield);
                

                String amount=addYield_table.getValueAt(selectedRow,6).toString();
                addYield_idField3.setText(amount);
            
            }
      
    }//GEN-LAST:event_addYield_tableMouseClicked

    private void addYield_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_jTextField1ActionPerformed

    private void addYield_tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_addYield_tablePropertyChange
        
    }//GEN-LAST:event_addYield_tablePropertyChange

    private void addYield_tableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addYield_tableFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addYield_tableFocusLost

    private void addYield_cropComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_cropComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addYield_cropComboActionPerformed

    private void addYield_UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_UpdateBtnMouseClicked
        
    }//GEN-LAST:event_addYield_UpdateBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SupervisorAddYields.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupervisorAddYields.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupervisorAddYields.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupervisorAddYields.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupervisorAddYields().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JButton addYield_DeleteBtn;
    private javax.swing.JButton addYield_InsertBtn;
    private javax.swing.JButton addYield_UpdateBtn;
    private javax.swing.JTextField addYield_amountCrops;
    private javax.swing.JComboBox<String> addYield_blockCombo;
    private javax.swing.JComboBox<String> addYield_cropCombo;
    private javax.swing.JTextField addYield_idField3;
    private com.toedter.calendar.JDateChooser addYield_jDateChooser1;
    private com.toedter.calendar.JDateChooser addYield_jDateChooser2;
    private javax.swing.JTextField addYield_jTextField1;
    private javax.swing.JPanel addYield_panel1;
    private javax.swing.JTable addYield_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
