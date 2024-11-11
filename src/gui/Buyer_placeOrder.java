package gui;

import static gui.Login.log1;
import gui.output.SelectError;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import model.MySQL;
import model.buyerOrderModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Buyer_placeOrder extends javax.swing.JFrame {
    public static final buyerOrderModel o_model=new buyerOrderModel();
    public Buyer_placeOrder() {
        initComponents();
        setDate();
        DefaultTableModel model=(DefaultTableModel) BuyerpurchaseOrder_orderTable.getModel();
        o_model.loadOrderTable(model);
        DefaultTableModel model2=(DefaultTableModel) BuyerpurchaseOrder_buyerTable.getModel();
        o_model.loadBuyerTable(model2);
        
    }
    public void setDate(){
        String textDate=new SimpleDateFormat("MM / dd / yyyy",Locale.ENGLISH).format(new Date());
        BuyerpurchaseOrder_date.setText(textDate);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BuyerpurchaseOrder_id = new javax.swing.JTextField();
        BuyerpurchaseOrder_date = new javax.swing.JTextField();
        BuyerpurchaseOrder_insert = new javax.swing.JButton();
        BuyerpurchaseOrder_addItems = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BuyerpurchaseOrder_orderID = new javax.swing.JTextField();
        BuyerjButton7 = new javax.swing.JButton();
        BuyerpurchaseOrder_buyerID = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        addYield_CloseBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BuyerpurchaseOrder_insert1 = new javax.swing.JButton();
        purchaseOrder_TabbedPane = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_orderTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_buyerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(226, 185, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(102, 51, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 495));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("ORDER ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("DATE ");

        BuyerpurchaseOrder_id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_id.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_id.setOpaque(false);
        BuyerpurchaseOrder_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_idActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_date.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_date.setOpaque(false);

        BuyerpurchaseOrder_insert.setBackground(new java.awt.Color(255, 246, 207));
        BuyerpurchaseOrder_insert.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_insert.setText("INSERT");
        BuyerpurchaseOrder_insert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_insert.setContentAreaFilled(false);
        BuyerpurchaseOrder_insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_insert.setFocusPainted(false);
        BuyerpurchaseOrder_insert.setOpaque(true);
        BuyerpurchaseOrder_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insertMouseExited(evt);
            }
        });
        BuyerpurchaseOrder_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_insertActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_addItems.setBackground(new java.awt.Color(255, 246, 207));
        BuyerpurchaseOrder_addItems.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_addItems.setText("INSERT  ITEMS TO THE ORDER");
        BuyerpurchaseOrder_addItems.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_addItems.setContentAreaFilled(false);
        BuyerpurchaseOrder_addItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_addItems.setFocusPainted(false);
        BuyerpurchaseOrder_addItems.setOpaque(true);
        BuyerpurchaseOrder_addItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addItemsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addItemsMouseExited(evt);
            }
        });
        BuyerpurchaseOrder_addItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_addItemsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel8.setText(" BUYER ID");

        BuyerpurchaseOrder_orderID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_orderID.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_orderID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_orderID.setOpaque(false);
        BuyerpurchaseOrder_orderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_orderIDActionPerformed(evt);
            }
        });

        BuyerjButton7.setBackground(new java.awt.Color(255, 246, 207));
        BuyerjButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerjButton7.setText("GET ID");
        BuyerjButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 110, 80)));
        BuyerjButton7.setContentAreaFilled(false);
        BuyerjButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerjButton7.setFocusPainted(false);
        BuyerjButton7.setOpaque(true);
        BuyerjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerjButton7ActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_buyerID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_buyerID.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_buyerID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_buyerID.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BuyerpurchaseOrder_id)
                                .addComponent(BuyerpurchaseOrder_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BuyerpurchaseOrder_addItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(BuyerpurchaseOrder_orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(BuyerpurchaseOrder_buyerID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BuyerjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BuyerpurchaseOrder_date, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(BuyerpurchaseOrder_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BuyerpurchaseOrder_orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuyerjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuyerpurchaseOrder_buyerID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(BuyerpurchaseOrder_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuyerpurchaseOrder_addItems, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
                .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(addYield_CloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        BuyerpurchaseOrder_insert1.setBackground(new java.awt.Color(204, 255, 204));
        BuyerpurchaseOrder_insert1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_insert1.setText("GET A REPORT");
        BuyerpurchaseOrder_insert1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_insert1.setContentAreaFilled(false);
        BuyerpurchaseOrder_insert1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_insert1.setFocusPainted(false);
        BuyerpurchaseOrder_insert1.setOpaque(true);
        BuyerpurchaseOrder_insert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insert1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_insert1MouseExited(evt);
            }
        });
        BuyerpurchaseOrder_insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_insert1ActionPerformed(evt);
            }
        });
        jPanel9.add(BuyerpurchaseOrder_insert1);
        BuyerpurchaseOrder_insert1.setBounds(490, 20, 285, 43);

        purchaseOrder_TabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerpurchaseOrder_orderTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerpurchaseOrder_orderTable.setForeground(new java.awt.Color(69, 69, 69));
        BuyerpurchaseOrder_orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "ORDER DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyerpurchaseOrder_orderTable.setFocusable(false);
        BuyerpurchaseOrder_orderTable.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_orderTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerpurchaseOrder_orderTable.setRowHeight(28);
        BuyerpurchaseOrder_orderTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_orderTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerpurchaseOrder_orderTable.setShowVerticalLines(false);
        BuyerpurchaseOrder_orderTable.getTableHeader().setReorderingAllowed(false);
        BuyerpurchaseOrder_orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_orderTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(BuyerpurchaseOrder_orderTable);

        purchaseOrder_TabbedPane.addTab("ORDER", jScrollPane4);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerpurchaseOrder_buyerTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerpurchaseOrder_buyerTable.setForeground(new java.awt.Color(69, 69, 69));
        BuyerpurchaseOrder_buyerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BUYER ID", "NAME", "MOBILE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyerpurchaseOrder_buyerTable.setFocusable(false);
        BuyerpurchaseOrder_buyerTable.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_buyerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerpurchaseOrder_buyerTable.setRowHeight(28);
        BuyerpurchaseOrder_buyerTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_buyerTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerpurchaseOrder_buyerTable.setShowVerticalLines(false);
        BuyerpurchaseOrder_buyerTable.getTableHeader().setReorderingAllowed(false);
        BuyerpurchaseOrder_buyerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_buyerTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(BuyerpurchaseOrder_buyerTable);
        if (BuyerpurchaseOrder_buyerTable.getColumnModel().getColumnCount() > 0) {
            BuyerpurchaseOrder_buyerTable.getColumnModel().getColumn(0).setResizable(false);
            BuyerpurchaseOrder_buyerTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            BuyerpurchaseOrder_buyerTable.getColumnModel().getColumn(1).setResizable(false);
            BuyerpurchaseOrder_buyerTable.getColumnModel().getColumn(2).setResizable(false);
        }

        purchaseOrder_TabbedPane.addTab("BUYER", jScrollPane5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(purchaseOrder_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
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

    private void BuyerpurchaseOrder_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_idActionPerformed

    private void BuyerpurchaseOrder_insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertMouseEntered
        BuyerpurchaseOrder_insert.setBackground(new Color(193, 153, 111));
        BuyerpurchaseOrder_insert.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BuyerpurchaseOrder_insertMouseEntered

    private void BuyerpurchaseOrder_insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertMouseExited
        BuyerpurchaseOrder_insert.setBackground(new Color(255, 246, 207));
        BuyerpurchaseOrder_insert.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerpurchaseOrder_insertMouseExited

    private void BuyerpurchaseOrder_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insertActionPerformed
        String orderId=BuyerpurchaseOrder_id.getText();
        String orderDate=BuyerpurchaseOrder_date.getText();
        String orderBuyer=BuyerpurchaseOrder_buyerID.getText();
        
        if(orderBuyer.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Please Select a Buyer!");
            categoryExists.setVisible(true);
        }else{
            if(orderDate.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Order date cannot be empty!");
            categoryExists.setVisible(true);
        }else{
            if(orderId.isEmpty()){
                try {
                    MySQL.execute("INSERT INTO `crop_invoice`(`date`,`status_id`,`buyer_buyer_id`) VALUES('"+orderDate+"','1','"+orderBuyer+"')");

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }else{
                try {
                    
                    int oid=Integer.parseInt(orderId);
                    ResultSet rs=MySQL.execute("SELECT * FROM `crop_invoice` WHERE `order_id`='"+oid+"'");
                    if(rs.next()){
                        SelectError categoryExists=new SelectError();
                        categoryExists.setText("Order ID already exists!");
                        categoryExists.setVisible(true);
                    }else{
                    MySQL.execute("INSERT INTO `crop_invoice`(`order_id`,`date`,`status_id`,`buyer_buyer_id`) VALUES('"+oid+"','"+orderDate+"','1','"+orderBuyer+"')");
                    }
                
                    } catch (Exception e) {
                    e.printStackTrace();

                }
            }
            DefaultTableModel model =(DefaultTableModel) BuyerpurchaseOrder_orderTable.getModel();
            o_model.loadOrderTable(model);
            setDate();

        }
            
        }

        

    }//GEN-LAST:event_BuyerpurchaseOrder_insertActionPerformed

    private void BuyerpurchaseOrder_addItemsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsMouseEntered

    private void BuyerpurchaseOrder_addItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsMouseExited

    private void BuyerpurchaseOrder_addItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addItemsActionPerformed
        new Buyer_placeOrder_insertItems().setVisible(true);
    }//GEN-LAST:event_BuyerpurchaseOrder_addItemsActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void addYield_CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYield_CloseBtnMouseClicked
            this.dispose();
    }//GEN-LAST:event_addYield_CloseBtnMouseClicked

    private void BuyerpurchaseOrder_orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_orderTableMouseClicked
        int selectedRow_product= BuyerpurchaseOrder_orderTable.getSelectedRow();
        if(selectedRow_product!=-1){
            String productID=BuyerpurchaseOrder_orderTable.getValueAt(selectedRow_product,0).toString();
            BuyerpurchaseOrder_id.setText(productID);
            
            purchaseOrder_TabbedPane.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BuyerpurchaseOrder_orderTableMouseClicked

    private void BuyerpurchaseOrder_buyerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_buyerTableMouseClicked
        int selectedRow_order=BuyerpurchaseOrder_buyerTable.getSelectedRow();
        if(selectedRow_order!=-1){
            String productID=BuyerpurchaseOrder_buyerTable.getValueAt(selectedRow_order,0).toString();
            String cropType=BuyerpurchaseOrder_buyerTable.getValueAt(selectedRow_order, 1).toString();
            String qty=BuyerpurchaseOrder_buyerTable.getValueAt(selectedRow_order,2).toString();
            BuyerpurchaseOrder_buyerID.setText(productID);
            //BuyerpurchaseOrder_buyer.setText(cropType);
            //BuyerpurchaseOrder_qty.setText(qty);

            purchaseOrder_TabbedPane.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BuyerpurchaseOrder_buyerTableMouseClicked

    private void BuyerpurchaseOrder_orderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_orderIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_orderIDActionPerformed

    private void BuyerjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerjButton7ActionPerformed
        purchaseOrder_TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_BuyerjButton7ActionPerformed

    private void BuyerpurchaseOrder_insert1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insert1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_insert1MouseEntered

    private void BuyerpurchaseOrder_insert1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insert1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerpurchaseOrder_insert1MouseExited

    private void BuyerpurchaseOrder_insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_insert1ActionPerformed
        String path="C:\\Users\\sisuk\\OneDrive\\Documents\\NetBeansProjects\\SoftwareProject\\src\\reports\\OrdersReport.jasper";
        HashMap<String,Object> parameters=new HashMap<>();
        parameters.put("Parameter1",BuyerpurchaseOrder_date.getText());
        //parameters.put("Parameter2",BuyerViewItems_totalProducts.getText());
        //parameters.put("Parameter3",BuyerviewItems_totalAmount.getText());

        JRTableModelDataSource dataSource=new JRTableModelDataSource(BuyerpurchaseOrder_orderTable.getModel());
        try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(path, parameters,dataSource);
            JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
//            ex.printStackTrace();
              log1.warning(ex.toString());
        }
    }//GEN-LAST:event_BuyerpurchaseOrder_insert1ActionPerformed

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
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyerjButton7;
    private javax.swing.JButton BuyerpurchaseOrder_addItems;
    private javax.swing.JTextField BuyerpurchaseOrder_buyerID;
    private javax.swing.JTable BuyerpurchaseOrder_buyerTable;
    private javax.swing.JTextField BuyerpurchaseOrder_date;
    private javax.swing.JTextField BuyerpurchaseOrder_id;
    private javax.swing.JButton BuyerpurchaseOrder_insert;
    private javax.swing.JButton BuyerpurchaseOrder_insert1;
    private javax.swing.JTextField BuyerpurchaseOrder_orderID;
    private javax.swing.JTable BuyerpurchaseOrder_orderTable;
    private javax.swing.JLabel addYield_CloseBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane purchaseOrder_TabbedPane;
    // End of variables declaration//GEN-END:variables
}
