package gui;

import static gui.Admin_addSupplier.s_model;
import static gui.Login.log1;
import static gui.PurchaseOrder_ViewInvoices.invoice_id;
import static gui.SupervisorViewCrops.selectedRowId;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.validationModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Admin_updateSupplier extends javax.swing.JFrame {
    public static int selectedRowId,sup_id;
    public Admin_updateSupplier() {
        initComponents();
        DefaultTableModel dtm =(DefaultTableModel) updateSupplier_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
        
        loadCategories("SELECT * FROM `category`");
    }
      public void reset(){
        supplierUpdate_name.setText("");
        supplierUpdate_mobile.setText("");
        supplierUpdate_combo.setSelectedItem("SELECT");
        supplierUpdate_address.setText("");
        supplierUpdate_title.setText("");
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
           supplierUpdate_combo.setModel(dropdown);
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
        supplierUpdate_updtBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        supplierUpdate_name = new javax.swing.JTextField();
        supplierUpdate_combo = new javax.swing.JComboBox<>();
        supplierUpdate_mobile = new javax.swing.JTextField();
        supplierUpdate_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        supplierUpdate_title = new javax.swing.JTextField();
        supplierUpdate_viewReport = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        supplierAdd_textField = new javax.swing.JTextField();
        supplierUpdate_searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        updateSupplier_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        addYield_panel1.setBackground(new java.awt.Color(226, 185, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("SUPPLIER NAME");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("SELECT CATEGORY");

        supplierUpdate_updtBtn.setBackground(new java.awt.Color(255, 246, 207));
        supplierUpdate_updtBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        supplierUpdate_updtBtn.setText("UPDATE");
        supplierUpdate_updtBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        supplierUpdate_updtBtn.setContentAreaFilled(false);
        supplierUpdate_updtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierUpdate_updtBtn.setFocusPainted(false);
        supplierUpdate_updtBtn.setOpaque(true);
        supplierUpdate_updtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierUpdate_updtBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierUpdate_updtBtnMouseExited(evt);
            }
        });
        supplierUpdate_updtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_updtBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("MOBILE");

        supplierUpdate_name.setBackground(new java.awt.Color(226, 185, 130));
        supplierUpdate_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierUpdate_name.setForeground(new java.awt.Color(255, 255, 255));
        supplierUpdate_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierUpdate_name.setOpaque(false);
        supplierUpdate_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_nameActionPerformed(evt);
            }
        });

        supplierUpdate_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierUpdate_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_comboActionPerformed(evt);
            }
        });

        supplierUpdate_mobile.setBackground(new java.awt.Color(226, 185, 130));
        supplierUpdate_mobile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierUpdate_mobile.setForeground(new java.awt.Color(255, 255, 255));
        supplierUpdate_mobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierUpdate_mobile.setOpaque(false);
        supplierUpdate_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_mobileActionPerformed(evt);
            }
        });

        supplierUpdate_address.setBackground(new java.awt.Color(226, 185, 130));
        supplierUpdate_address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierUpdate_address.setForeground(new java.awt.Color(255, 255, 255));
        supplierUpdate_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierUpdate_address.setOpaque(false);
        supplierUpdate_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_addressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("ADDRESS");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel15.setText("TITLE");

        supplierUpdate_title.setBackground(new java.awt.Color(226, 185, 130));
        supplierUpdate_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierUpdate_title.setForeground(new java.awt.Color(255, 255, 255));
        supplierUpdate_title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierUpdate_title.setOpaque(false);
        supplierUpdate_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_titleActionPerformed(evt);
            }
        });

        supplierUpdate_viewReport.setBackground(new java.awt.Color(255, 246, 207));
        supplierUpdate_viewReport.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        supplierUpdate_viewReport.setText("VIEW SUPPLIER REPORT");
        supplierUpdate_viewReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        supplierUpdate_viewReport.setContentAreaFilled(false);
        supplierUpdate_viewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierUpdate_viewReport.setFocusPainted(false);
        supplierUpdate_viewReport.setOpaque(true);
        supplierUpdate_viewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierUpdate_viewReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierUpdate_viewReportMouseExited(evt);
            }
        });
        supplierUpdate_viewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_viewReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addYield_panel1Layout = new javax.swing.GroupLayout(addYield_panel1);
        addYield_panel1.setLayout(addYield_panel1Layout);
        addYield_panel1Layout.setHorizontalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierUpdate_viewReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierUpdate_updtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(96, 96, 96))
                    .addComponent(supplierUpdate_title)
                    .addGroup(addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(supplierUpdate_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierUpdate_address)
                    .addComponent(supplierUpdate_mobile)
                    .addComponent(supplierUpdate_name, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        addYield_panel1Layout.setVerticalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierUpdate_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierUpdate_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierUpdate_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplierUpdate_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierUpdate_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(supplierUpdate_viewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierUpdate_updtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

        supplierUpdate_searchBtn.setBackground(new java.awt.Color(255, 246, 207));
        supplierUpdate_searchBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        supplierUpdate_searchBtn.setText("SEARCH");
        supplierUpdate_searchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        supplierUpdate_searchBtn.setContentAreaFilled(false);
        supplierUpdate_searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplierUpdate_searchBtn.setFocusPainted(false);
        supplierUpdate_searchBtn.setOpaque(true);
        supplierUpdate_searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supplierUpdate_searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supplierUpdate_searchBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                supplierUpdate_searchBtnMouseReleased(evt);
            }
        });
        supplierUpdate_searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierUpdate_searchBtnActionPerformed(evt);
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
                .addComponent(supplierUpdate_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierAdd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierUpdate_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        updateSupplier_table.setForeground(new java.awt.Color(69, 69, 69));
        updateSupplier_table.setModel(new javax.swing.table.DefaultTableModel(
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
        updateSupplier_table.setGridColor(new java.awt.Color(255, 255, 255));
        updateSupplier_table.setRowHeight(28);
        updateSupplier_table.setSelectionBackground(new java.awt.Color(222, 191, 142));
        updateSupplier_table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        updateSupplier_table.setShowVerticalLines(false);
        updateSupplier_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSupplier_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(updateSupplier_table);

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
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
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

    private void supplierUpdate_updtBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_updtBtnMouseEntered

    }//GEN-LAST:event_supplierUpdate_updtBtnMouseEntered

    private void supplierUpdate_updtBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_updtBtnMouseExited

    }//GEN-LAST:event_supplierUpdate_updtBtnMouseExited

    private void supplierUpdate_updtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_updtBtnActionPerformed
        String name=supplierUpdate_name.getText();
        String mobile=supplierUpdate_mobile.getText();
        String address=supplierUpdate_address.getText();
        String category=supplierUpdate_combo.getSelectedItem().toString();
        String title=supplierUpdate_title.getText();
        if(name.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Supplier Name is Empty");
            categoryExists.setVisible(true);
        }else if(mobile.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Mobile is empty");
            categoryExists.setVisible(true);
        }else if(address.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Address is empty");
            categoryExists.setVisible(true);
        }else if(category=="SELECT"){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Select a category");
            categoryExists.setVisible(true);
        }else if(title.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Title is empty");
            categoryExists.setVisible(true);
        }else{
            boolean result=validationModel.mobileValidation(mobile);
            if(result==false){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Mobile contains special characters");
                categoryExists.setVisible(true);
            }else{
                
                s_model.updateSupplier(name,mobile,address,category,title,selectedRowId,sup_id);

                DefaultTableModel dtm =(DefaultTableModel) updateSupplier_table.getModel();
                s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                            + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                        + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");

                reset();
            }
        }
    }//GEN-LAST:event_supplierUpdate_updtBtnActionPerformed

    private void supplierUpdate_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_nameActionPerformed

    private void supplierUpdate_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_comboActionPerformed

    private void supplierUpdate_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_mobileActionPerformed

    private void supplierUpdate_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_addressActionPerformed

    private void supplierUpdate_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_titleActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        //SupplierDashboard supplierDash=new SupplierDashboard();
        //supplierDash.setVisible(true);
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
        DefaultTableModel dtm =(DefaultTableModel) updateSupplier_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
            + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
            + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
            + " WHERE `cate_name` LIKE '"+text+"%' AND `status`='Active'");

    }//GEN-LAST:event_supplierAdd_textFieldKeyReleased

    private void supplierUpdate_searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_searchBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_searchBtnMouseEntered

    private void supplierUpdate_searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_searchBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_searchBtnMouseExited

    private void supplierUpdate_searchBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_searchBtnMouseReleased
        String text=supplierAdd_textField.getText();
        DefaultTableModel dtm =(DefaultTableModel) updateSupplier_table.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
            + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
            + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
            + " WHERE `cate_name` = '"+text+"' AND `status`='Active'");

    }//GEN-LAST:event_supplierUpdate_searchBtnMouseReleased

    private void supplierUpdate_searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_searchBtnActionPerformed

    }//GEN-LAST:event_supplierUpdate_searchBtnActionPerformed

    private void updateSupplier_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSupplier_tableMouseClicked
        
        int selectedRow =updateSupplier_table.getSelectedRow();
        if(selectedRow!=-1){
            selectedRowId=(int)updateSupplier_table.getValueAt(selectedRow,0);
            
            String sup_name=updateSupplier_table.getValueAt(selectedRow,1).toString();
            supplierUpdate_name.setText(sup_name);
            
            String mobile=updateSupplier_table.getValueAt(selectedRow,2).toString();
            supplierUpdate_mobile.setText(mobile);
            
            String category=updateSupplier_table.getValueAt(selectedRow,3).toString();
            supplierUpdate_combo.setSelectedItem(category);
            
            String title=updateSupplier_table.getValueAt(selectedRow,4).toString();
            supplierUpdate_title.setText(title);
            
            try {
               ResultSet rs= MySQL.execute("SELECT * FROM `supplier` WHERE `sup_id`='"+selectedRowId+"'");
               if(rs.next()){
                   supplierUpdate_address.setText(rs.getString("address"));
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
    }//GEN-LAST:event_updateSupplier_tableMouseClicked

    private void supplierUpdate_viewReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_viewReportMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_viewReportMouseEntered

    private void supplierUpdate_viewReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierUpdate_viewReportMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierUpdate_viewReportMouseExited

    private void supplierUpdate_viewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierUpdate_viewReportActionPerformed
       String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\supplier.jasper";
        HashMap<String,Object> parameters=new HashMap<>();
        //String supID=String.valueOf(sup_id);
        //parameters.put("Parameter1",supID);
        //parameters.put("Parameter2",ViewItems_totalProducts.getText());
        //parameters.put("Parameter3",viewItems_totalAmount.getText());
        
        JRTableModelDataSource dataSource=new JRTableModelDataSource(updateSupplier_table.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_supplierUpdate_viewReportActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_updateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_updateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_updateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_updateSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_updateSupplier().setVisible(true);
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
    private javax.swing.JTextField supplierAdd_textField;
    private javax.swing.JTextField supplierUpdate_address;
    private javax.swing.JComboBox<String> supplierUpdate_combo;
    private javax.swing.JTextField supplierUpdate_mobile;
    private javax.swing.JTextField supplierUpdate_name;
    private javax.swing.JButton supplierUpdate_searchBtn;
    private javax.swing.JTextField supplierUpdate_title;
    private javax.swing.JButton supplierUpdate_updtBtn;
    private javax.swing.JButton supplierUpdate_viewReport;
    private javax.swing.JTable updateSupplier_table;
    // End of variables declaration//GEN-END:variables
}
