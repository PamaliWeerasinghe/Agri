
package gui;

import static gui.Login.log1;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.SupplierModel;
import model.validationModel;


public class Admin_addSupplier extends javax.swing.JFrame {
    public static final SupplierModel s_model=new SupplierModel();
    
    public Admin_addSupplier() {
        initComponents();
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
        
        loadCategories("SELECT * FROM `category`");
    }
    public void reset(){
        supplierAdd_name.setText("");
        supplierAdd_mobile.setText("");
        supplierAdd_combo.setSelectedItem("SELECT");
        supplierAdd_address.setText("");
        supplierAdd_title.setText("");
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
           supplierAdd_combo.setModel(dropdown);
        } catch (Exception e) {
            log1.warning(e.toString());
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
        jLabel11 = new javax.swing.JLabel();
        addYield_InsertBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        supplierAdd_name = new javax.swing.JTextField();
        supplierAdd_combo = new javax.swing.JComboBox<>();
        supplierAdd_mobile = new javax.swing.JTextField();
        supplierAdd_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        supplierAdd_title = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        supplierAdd_textField = new javax.swing.JTextField();
        supplierAdd_searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        addYield_panel1.setBackground(new java.awt.Color(226, 185, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("SUPPLIER NAME");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("SELECT CATEGORY");

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

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("MOBILE");

        supplierAdd_name.setBackground(new java.awt.Color(226, 185, 130));
        supplierAdd_name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierAdd_name.setForeground(new java.awt.Color(255, 255, 255));
        supplierAdd_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierAdd_name.setOpaque(false);
        supplierAdd_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_nameActionPerformed(evt);
            }
        });

        supplierAdd_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierAdd_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_comboActionPerformed(evt);
            }
        });

        supplierAdd_mobile.setBackground(new java.awt.Color(226, 185, 130));
        supplierAdd_mobile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierAdd_mobile.setForeground(new java.awt.Color(255, 255, 255));
        supplierAdd_mobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierAdd_mobile.setOpaque(false);
        supplierAdd_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_mobileActionPerformed(evt);
            }
        });

        supplierAdd_address.setBackground(new java.awt.Color(226, 185, 130));
        supplierAdd_address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierAdd_address.setForeground(new java.awt.Color(255, 255, 255));
        supplierAdd_address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierAdd_address.setOpaque(false);
        supplierAdd_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_addressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("ADDRESS");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel15.setText("TITLE");

        supplierAdd_title.setBackground(new java.awt.Color(226, 185, 130));
        supplierAdd_title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        supplierAdd_title.setForeground(new java.awt.Color(255, 255, 255));
        supplierAdd_title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierAdd_title.setOpaque(false);
        supplierAdd_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierAdd_titleActionPerformed(evt);
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
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addYield_panel1Layout.createSequentialGroup()
                        .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addYield_panel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(132, 132, 132))
                            .addComponent(supplierAdd_title)
                            .addGroup(addYield_panel1Layout.createSequentialGroup()
                                .addGroup(addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(supplierAdd_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplierAdd_address)
                            .addComponent(supplierAdd_mobile)
                            .addComponent(supplierAdd_name, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        addYield_panel1Layout.setVerticalGroup(
            addYield_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addYield_panel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(supplierAdd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(supplierAdd_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierAdd_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(supplierAdd_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierAdd_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addYield_InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(190, 190, 190)
                .addComponent(supplierAdd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierAdd_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierAdd_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierAdd_searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(69, 69, 69));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(0);
        jTable1.setSelectionBackground(new java.awt.Color(222, 191, 142));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(addYield_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addYield_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
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

    private void addYield_InsertBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseEntered

    }//GEN-LAST:event_addYield_InsertBtnMouseEntered

    private void addYield_InsertBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_InsertBtnMouseExited

    }//GEN-LAST:event_addYield_InsertBtnMouseExited

    private void addYield_InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addYield_InsertBtnActionPerformed
        String name=supplierAdd_name.getText();
        String mobile=supplierAdd_mobile.getText();
        String address=supplierAdd_address.getText();
        String category=supplierAdd_combo.getSelectedItem().toString();
        String title=supplierAdd_title.getText();
        
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
                s_model.insertSupplier(name,mobile,address,category,title);
                DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
                s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                            + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                            + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                            + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                        + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
                reset();
            }
        }
    }//GEN-LAST:event_addYield_InsertBtnActionPerformed

    private void supplierAdd_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_nameActionPerformed

    private void supplierAdd_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_comboActionPerformed

    private void supplierAdd_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_mobileActionPerformed

    private void supplierAdd_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_addressActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       
    }//GEN-LAST:event_jLabel7MouseClicked

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

    private void supplierAdd_textFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldPropertyChange

    }//GEN-LAST:event_supplierAdd_textFieldPropertyChange

    private void supplierAdd_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldKeyReleased
        String text=supplierAdd_textField.getText();
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
                + " WHERE `cate_name` LIKE '"+text+"%' AND `status`='Active'");
        
        
    }//GEN-LAST:event_supplierAdd_textFieldKeyReleased

    private void supplierAdd_searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnActionPerformed
       
    }//GEN-LAST:event_supplierAdd_searchBtnActionPerformed

    private void supplierAdd_searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_searchBtnMouseExited

    private void supplierAdd_searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_searchBtnMouseEntered

    private void supplierAdd_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_titleActionPerformed

    private void supplierAdd_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierAdd_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierAdd_textFieldActionPerformed

    private void supplierAdd_searchBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierAdd_searchBtnMouseReleased
        String text=supplierAdd_textField.getText();
        DefaultTableModel dtm =(DefaultTableModel) jTable1.getModel();
        s_model.loadTable(dtm,"SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id`INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id`"
                + " WHERE `cate_name` = '"+text+"' AND `status`='Active'");
        
    }//GEN-LAST:event_supplierAdd_searchBtnMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_addSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_addSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_addSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_addSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_addSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addYield_InsertBtn;
    private javax.swing.JPanel addYield_panel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField supplierAdd_address;
    private javax.swing.JComboBox<String> supplierAdd_combo;
    private javax.swing.JTextField supplierAdd_mobile;
    private javax.swing.JTextField supplierAdd_name;
    private javax.swing.JButton supplierAdd_searchBtn;
    private javax.swing.JTextField supplierAdd_textField;
    private javax.swing.JTextField supplierAdd_title;
    // End of variables declaration//GEN-END:variables
}
