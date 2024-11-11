package gui;

import static gui.Admin_addSupplier.s_model;
import static gui.Admin_updateSupplier.selectedRowId;
import static gui.Admin_updateSupplier.sup_id;
import static gui.Login.log1;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.SupplierModel;

public class Admin_deleteSupplier extends javax.swing.JFrame {

    public static int selectedRowId,sup_id;
    public Admin_deleteSupplier() {
        initComponents();
        DefaultTableModel dtm =(DefaultTableModel) supplierDelete_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
        
        loadCategories("SELECT * FROM `category`");
    }
    public void reset(){
        supplierDelete_name.setText("");
        supplierDelete_mobile.setText("");
        supplierDelete_combo.setSelectedItem("SELECT");
        supplierDelete_address.setText("");
        supplierDelete_title.setText("");
    }
    public void loadCategories(String query){
        
        try {
           ResultSet rs=MySQL.execute(query); 
           Vector v=new Vector();
           v.add("SELECT");
           while(rs.next()){
               v.add(rs.getString("cate_name"));
           }
           DefaultComboBoxModel dropdown=new DefaultComboBoxModel (v);
           supplierDelete_combo.setModel(dropdown);
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addYield_panel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        supplierDelete_name = new javax.swing.JTextField();
        supplierDelete_combo = new javax.swing.JComboBox<>();
        supplierDelete_mobile = new javax.swing.JTextField();
        supplierDelete_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        supplierDelete_title = new javax.swing.JTextField();
        supplierDelete_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        supplierAdd_textField = new javax.swing.JTextField();
        supplierAdd_searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierDelete_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        addYield_panel1.setBackground(new java.awt.Color(226, 185, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("SUPPLIER NAME");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("SELECT CATEGORY");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("MOBILE");

        supplierDelete_name.setBackground(new java.awt.Color(226, 185, 130));
        supplierDelete_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierDelete_name.setForeground(new java.awt.Color(255, 255, 255));
        supplierDelete_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierDelete_name.setOpaque(false);
        supplierDelete_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_nameActionPerformed(evt);
            }
        });

        supplierDelete_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierDelete_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_comboActionPerformed(evt);
            }
        });

        supplierDelete_mobile.setBackground(new java.awt.Color(226, 185, 130));
        supplierDelete_mobile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierDelete_mobile.setForeground(new java.awt.Color(255, 255, 255));
        supplierDelete_mobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierDelete_mobile.setOpaque(false);
        supplierDelete_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_mobileActionPerformed(evt);
            }
        });

        supplierDelete_address.setBackground(new java.awt.Color(226, 185, 130));
        supplierDelete_address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierDelete_address.setForeground(new java.awt.Color(255, 255, 255));
        supplierDelete_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierDelete_address.setOpaque(false);
        supplierDelete_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_addressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("ADDRESS");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel15.setText("TITLE");

        supplierDelete_title.setBackground(new java.awt.Color(226, 185, 130));
        supplierDelete_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierDelete_title.setForeground(new java.awt.Color(255, 255, 255));
        supplierDelete_title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierDelete_title.setOpaque(false);
        supplierDelete_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_titleActionPerformed(evt);
            }
        });

        supplierDelete_btn.setBackground(new java.awt.Color(255, 102, 102));
        supplierDelete_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        supplierDelete_btn.setText("DELETE");
        supplierDelete_btn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        supplierDelete_btn.setContentAreaFilled(false);
        supplierDelete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierDelete_btn.setFocusPainted(false);
        supplierDelete_btn.setOpaque(true);
        supplierDelete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierDelete_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierDelete_btnMouseExited(evt);
            }
        });
        supplierDelete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierDelete_btnActionPerformed(evt);
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
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(supplierDelete_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplierDelete_title, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addYield_panel1Layout.createSequentialGroup()
                                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(supplierDelete_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplierDelete_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supplierDelete_mobile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supplierDelete_name))
                        .addContainerGap())))
        );
        addYield_panel1Layout.setVerticalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierDelete_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(supplierDelete_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierDelete_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(supplierDelete_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierDelete_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplierDelete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/leaf.png"))); // NOI18N
        jLabel2.setText(" A G R I ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        supplierAdd_textField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        supplierAdd_textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        supplierAdd_textField.setText(" Enter the name of the category");
        supplierAdd_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierAdd_textFieldFocusLost(evt);
            }
        });
        supplierAdd_textField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierAdd_textFieldMouseClicked(evt);
            }
        });
        supplierAdd_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_textFieldActionPerformed(evt);
            }
        });
        supplierAdd_textField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supplierAdd_textFieldPropertyChange(evt);
            }
        });
        supplierAdd_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supplierAdd_textFieldKeyReleased(evt);
            }
        });

        supplierAdd_searchBtn.setBackground(new java.awt.Color(255, 246, 207));
        supplierAdd_searchBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        supplierAdd_searchBtn.setText("SEARCH");
        supplierAdd_searchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        supplierAdd_searchBtn.setContentAreaFilled(false);
        supplierAdd_searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierAdd_searchBtn.setFocusPainted(false);
        supplierAdd_searchBtn.setOpaque(true);
        supplierAdd_searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierAdd_searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierAdd_searchBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                supplierAdd_searchBtnMouseReleased(evt);
            }
        });
        supplierAdd_searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(supplierAdd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierAdd_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierAdd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierAdd_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        supplierDelete_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOBILE", "CATEGORY", "TITLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierDelete_table.setGridColor(new java.awt.Color(255, 255, 255));
        supplierDelete_table.setRowHeight(28);
        supplierDelete_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        supplierDelete_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        supplierDelete_table.setShowVerticalLines(false);
        supplierDelete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierDelete_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supplierDelete_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addYield_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addYield_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
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

    private void supplierDelete_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierDelete_nameActionPerformed

    private void supplierDelete_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierDelete_comboActionPerformed

    private void supplierDelete_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierDelete_mobileActionPerformed

    private void supplierDelete_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierDelete_addressActionPerformed

    private void supplierDelete_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierDelete_titleActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void supplierAdd_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldFocusLost
        // TODO add your handling code here:
        supplierAdd_textField.setText("Enter the name of the category");

    }//GEN-LAST:event_supplierAdd_textFieldFocusLost

    private void supplierAdd_textFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldMouseClicked
        supplierAdd_textField.setText("");
    }//GEN-LAST:event_supplierAdd_textFieldMouseClicked

    private void supplierAdd_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_textFieldActionPerformed

    private void supplierAdd_textFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldPropertyChange

    }//GEN-LAST:event_supplierAdd_textFieldPropertyChange

    private void supplierAdd_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldKeyReleased
        String text=supplierAdd_textField.getText();
        DefaultTableModel dtm =(DefaultTableModel) supplierDelete_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
            + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
            + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
            + " WHERE `cate_name` LIKE '"+text+"%' AND `status`='Active'");



    }//GEN-LAST:event_supplierAdd_textFieldKeyReleased

    private void supplierAdd_searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_searchBtnMouseEntered

    private void supplierAdd_searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_searchBtnMouseExited

    private void supplierAdd_searchBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseReleased
        String text=supplierAdd_textField.getText();
        DefaultTableModel dtm =(DefaultTableModel) supplierDelete_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
            + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
            + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
            + " WHERE `cate_name` = '"+text+"' AND `status`='Active'");


    }//GEN-LAST:event_supplierAdd_searchBtnMouseReleased

    private void supplierAdd_searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnActionPerformed

    }//GEN-LAST:event_supplierAdd_searchBtnActionPerformed

    private void supplierDelete_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDelete_btnMouseEntered
        supplierDelete_btn.setBackground(new Color(244, 93, 93));
        supplierDelete_btn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_supplierDelete_btnMouseEntered

    private void supplierDelete_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDelete_btnMouseExited
        supplierDelete_btn.setBackground(new Color(255, 102, 102));
        supplierDelete_btn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_supplierDelete_btnMouseExited

    private void supplierDelete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierDelete_btnActionPerformed
       
        s_model.deleteSupplier(selectedRowId,sup_id);
        DefaultTableModel dtm =(DefaultTableModel) supplierDelete_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
        
        reset();
        
    }//GEN-LAST:event_supplierDelete_btnActionPerformed

    private void supplierDelete_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierDelete_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow =supplierDelete_table.getSelectedRow();
        if(selectedRow!=-1){
            selectedRowId=(int)supplierDelete_table.getValueAt(selectedRow,0);
            
            String sup_name=supplierDelete_table.getValueAt(selectedRow,1).toString();
            supplierDelete_name.setText(sup_name);
            
            String mobile=supplierDelete_table.getValueAt(selectedRow,2).toString();
            supplierDelete_mobile.setText(mobile);
            
            String category=supplierDelete_table.getValueAt(selectedRow,3).toString();
            supplierDelete_combo.setSelectedItem(category);
            
            String title=supplierDelete_table.getValueAt(selectedRow,4).toString();
            supplierDelete_title.setText(title);
            
            try {
               ResultSet rs= MySQL.execute("SELECT * FROM `supplier` WHERE `sup_id`='"+selectedRowId+"'");
               if(rs.next()){
                   supplierDelete_address.setText(rs.getString("address"));
               }
               ResultSet supply_id=MySQL.execute("SELECT * FROM `supplies` INNER JOIN `category`"
                       + "ON `supplies`.`category_cat_id`=`category`.`cat_id` "
                       + "WHERE `title`='"+title+"' AND `cate_name`='"+category+"'");
               if(supply_id.next()){
                   sup_id=supply_id.getInt("supplies_id");
               }
            } catch (Exception ex) {
//                ex.printStackTrace();
                  log1.warning(ex.toString());
            }
            
            
           
        }
    }//GEN-LAST:event_supplierDelete_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_deleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_deleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_deleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_deleteSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_deleteSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addYield_panel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton supplierAdd_searchBtn;
    private javax.swing.JTextField supplierAdd_textField;
    private javax.swing.JTextField supplierDelete_address;
    private javax.swing.JButton supplierDelete_btn;
    private javax.swing.JComboBox<String> supplierDelete_combo;
    private javax.swing.JTextField supplierDelete_mobile;
    private javax.swing.JTextField supplierDelete_name;
    private javax.swing.JTable supplierDelete_table;
    private javax.swing.JTextField supplierDelete_title;
    // End of variables declaration//GEN-END:variables
}
