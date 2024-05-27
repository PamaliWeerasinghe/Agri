package gui;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import model.addItemsModel;

public class PurchaseOrder_insertItems extends javax.swing.JFrame {
    public static final addItemsModel addItems =new addItemsModel();
    public static String category,title,orderID;
    public PurchaseOrder_insertItems() {
        initComponents();
        DefaultTableModel dfm=(DefaultTableModel) purchaseOrder_orderTable.getModel();
        DefaultTableModel dtm=(DefaultTableModel) purchaseOrder_productTable.getModel();
        DefaultTableModel dtm2=(DefaultTableModel) purchaseOrder_invoiceTable.getModel();
        addItems.loadOrderTable(dfm);
        addItems.loadProductTable(dtm);
        addItems.loadItemsInInvoiceTable(dtm2);
    }
    public void reset(){
        purchaseOrder_orderID.setText("");
        purchaseOrder_supplier.setText("");
        purchaseOrder_productID.setText("");
        purchaseOrder_qty.setText("");
        purchaseOrder_unitPrice.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        purchaseOrder_orderID = new javax.swing.JTextField();
        purchaseOrder_productID = new javax.swing.JTextField();
        purchaseOrder_supplier = new javax.swing.JTextField();
        purchaseOrder_unitPrice = new javax.swing.JTextField();
        purchaseOrder_addToInvoice = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        purchaseOrder_qty = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        purchaseOrder_TabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchaseOrder_invoiceTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        purchaseOrder_productTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        purchaseOrder_orderTable = new javax.swing.JTable();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel3.setText("UNIT PRICE");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel7.setText("ORDER ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel5.setText("PRODUCT ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel6.setText("SUPPLIER ");

        purchaseOrder_orderID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_orderID.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_orderID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_orderID.setOpaque(false);
        purchaseOrder_orderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrder_orderIDActionPerformed(evt);
            }
        });

        purchaseOrder_productID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_productID.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_productID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_productID.setOpaque(false);

        purchaseOrder_supplier.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_supplier.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_supplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_supplier.setOpaque(false);

        purchaseOrder_unitPrice.setBackground(new java.awt.Color(213, 168, 127));
        purchaseOrder_unitPrice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_unitPrice.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_unitPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_unitPrice.setOpaque(false);

        purchaseOrder_addToInvoice.setBackground(new java.awt.Color(255, 246, 207));
        purchaseOrder_addToInvoice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        purchaseOrder_addToInvoice.setText("INSERT");
        purchaseOrder_addToInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        purchaseOrder_addToInvoice.setContentAreaFilled(false);
        purchaseOrder_addToInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseOrder_addToInvoice.setFocusPainted(false);
        purchaseOrder_addToInvoice.setOpaque(true);
        purchaseOrder_addToInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseOrder_addToInvoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseOrder_addToInvoiceMouseExited(evt);
            }
        });
        purchaseOrder_addToInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrder_addToInvoiceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel10.setText("QTY");

        purchaseOrder_qty.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        purchaseOrder_qty.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrder_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        purchaseOrder_qty.setOpaque(false);

        jButton6.setBackground(new java.awt.Color(255, 246, 207));
        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jButton6.setText("GET ID");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 110, 80)));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 246, 207));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jButton7.setText("GET ID");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 110, 80)));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(purchaseOrder_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(purchaseOrder_unitPrice)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(purchaseOrder_orderID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(purchaseOrder_productID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(purchaseOrder_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(purchaseOrder_addToInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseOrder_orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseOrder_productID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseOrder_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(purchaseOrder_addToInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 655, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Please Enter The Product Name");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField1);
        jTextField1.setBounds(150, 20, 490, 40);

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
        jPanel4.add(jButton1);
        jButton1.setBounds(640, 20, 110, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        purchaseOrder_TabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        purchaseOrder_invoiceTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        purchaseOrder_invoiceTable.setForeground(new java.awt.Color(69, 69, 69));
        purchaseOrder_invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "CATEGORY", "TITLE", "QUANTITY", "UNIT PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseOrder_invoiceTable.setFocusable(false);
        purchaseOrder_invoiceTable.setGridColor(new java.awt.Color(255, 255, 255));
        purchaseOrder_invoiceTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        purchaseOrder_invoiceTable.setRowHeight(28);
        purchaseOrder_invoiceTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        purchaseOrder_invoiceTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        purchaseOrder_invoiceTable.setShowVerticalLines(false);
        purchaseOrder_invoiceTable.getTableHeader().setReorderingAllowed(false);
        purchaseOrder_invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseOrder_invoiceTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(purchaseOrder_invoiceTable);
        if (purchaseOrder_invoiceTable.getColumnModel().getColumnCount() > 0) {
            purchaseOrder_invoiceTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseOrder_invoiceTable.getColumnModel().getColumn(1).setResizable(false);
            purchaseOrder_invoiceTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseOrder_invoiceTable.getColumnModel().getColumn(3).setResizable(false);
            purchaseOrder_invoiceTable.getColumnModel().getColumn(4).setResizable(false);
            purchaseOrder_invoiceTable.getColumnModel().getColumn(5).setResizable(false);
        }
        purchaseOrder_invoiceTable.getAccessibleContext().setAccessibleName("tab1");

        purchaseOrder_TabbedPane.addTab("INVOICE", jScrollPane2);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        purchaseOrder_productTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        purchaseOrder_productTable.setForeground(new java.awt.Color(69, 69, 69));
        purchaseOrder_productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID (shs_id)", "SUPPLIER", "CATEGORY", "TITLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseOrder_productTable.setFocusable(false);
        purchaseOrder_productTable.setGridColor(new java.awt.Color(255, 255, 255));
        purchaseOrder_productTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        purchaseOrder_productTable.setRowHeight(28);
        purchaseOrder_productTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        purchaseOrder_productTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        purchaseOrder_productTable.setShowVerticalLines(false);
        purchaseOrder_productTable.getTableHeader().setReorderingAllowed(false);
        purchaseOrder_productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseOrder_productTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(purchaseOrder_productTable);
        if (purchaseOrder_productTable.getColumnModel().getColumnCount() > 0) {
            purchaseOrder_productTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseOrder_productTable.getColumnModel().getColumn(1).setResizable(false);
            purchaseOrder_productTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseOrder_productTable.getColumnModel().getColumn(3).setResizable(false);
        }

        purchaseOrder_TabbedPane.addTab("PRODUCT", jScrollPane4);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        purchaseOrder_orderTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        purchaseOrder_orderTable.setForeground(new java.awt.Color(69, 69, 69));
        purchaseOrder_orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseOrder_orderTable.setFocusable(false);
        purchaseOrder_orderTable.setGridColor(new java.awt.Color(255, 255, 255));
        purchaseOrder_orderTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        purchaseOrder_orderTable.setRowHeight(28);
        purchaseOrder_orderTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        purchaseOrder_orderTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        purchaseOrder_orderTable.setShowVerticalLines(false);
        purchaseOrder_orderTable.getTableHeader().setReorderingAllowed(false);
        purchaseOrder_orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseOrder_orderTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(purchaseOrder_orderTable);

        purchaseOrder_TabbedPane.addTab("ORDER", jScrollPane3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseOrder_TabbedPane)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaseOrder_TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        purchaseOrder_TabbedPane.getAccessibleContext().setAccessibleName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 133, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void purchaseOrder_orderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrder_orderIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_purchaseOrder_orderIDActionPerformed

    private void purchaseOrder_addToInvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_addToInvoiceMouseEntered
        purchaseOrder_addToInvoice.setBackground(new Color(193, 153, 111));
        purchaseOrder_addToInvoice.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_purchaseOrder_addToInvoiceMouseEntered

    private void purchaseOrder_addToInvoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_addToInvoiceMouseExited
        purchaseOrder_addToInvoice.setBackground(new Color(255, 246, 207));
        purchaseOrder_addToInvoice.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_purchaseOrder_addToInvoiceMouseExited

    private void purchaseOrder_addToInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrder_addToInvoiceActionPerformed
        orderID=purchaseOrder_orderID.getText();
        String productID=purchaseOrder_productID.getText();
        String qty=purchaseOrder_qty.getText();
        String unit_price=purchaseOrder_unitPrice.getText();
        
        
        
        addItems.addItemToInvoice(orderID,productID,qty,unit_price);
        DefaultTableModel dtm2=(DefaultTableModel) purchaseOrder_invoiceTable.getModel();
        addItems.reloadInvoiceTable(orderID, dtm2);
        reset();
     
    }//GEN-LAST:event_purchaseOrder_addToInvoiceActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        purchaseOrder_TabbedPane.setSelectedIndex(1);
        int selectedRow_product=purchaseOrder_productTable.getSelectedRow();
        if(selectedRow_product!=-1){
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        purchaseOrder_TabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
//        purchaseOrder_orderID.setText("");
//        poField.setText("");
//        purchaseOrder_productID.setText("");
//        purchaseOrder_supplier.setText("");
//        jTextField1.setText("Please Enter The Product Name");
//        jTextField1.setForeground(new Color(153,153,153));
//        jTextField1.setCaretColor(new Color(255,255,255));
//        purchaseOrder_qty.setText("");
//        upriceField.setText("");
//        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        //new PurchaseOrder().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText(null);
        jTextField1.setCaretColor(new Color(0, 0, 0));
        jTextField1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered

    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited

    }//GEN-LAST:event_jTextField1MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String keyword = jTextField1.getText();
//        adm.loadOrderTableOnPname(keyword, dtm);
      jTextField1.setText("Please Enter The Product Name");
      //jTextField1.setForeground(new Color(153,153,153));
      //jTextField1.setCaretColor(new Color(255,255,255));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void purchaseOrder_invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_invoiceTableMouseClicked
        
    }//GEN-LAST:event_purchaseOrder_invoiceTableMouseClicked

    private void purchaseOrder_productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_productTableMouseClicked
        int selectedRow_product= purchaseOrder_productTable.getSelectedRow();
        if(selectedRow_product!=-1){
            String productID=purchaseOrder_productTable.getValueAt(selectedRow_product,0).toString();
            purchaseOrder_productID.setText(productID);
            String supplier=purchaseOrder_productTable.getValueAt(selectedRow_product,1).toString();
            purchaseOrder_supplier.setText(supplier);
            category=purchaseOrder_productTable.getValueAt(selectedRow_product,2).toString();
            title=purchaseOrder_productTable.getValueAt(selectedRow_product,3).toString();
           
            purchaseOrder_TabbedPane.setSelectedIndex(0);
            
            
        }
       
    }//GEN-LAST:event_purchaseOrder_productTableMouseClicked

    private void purchaseOrder_orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseOrder_orderTableMouseClicked
        int selectedRow_order=purchaseOrder_orderTable.getSelectedRow();
        if(selectedRow_order!=-1){
            orderID=purchaseOrder_orderTable.getValueAt(selectedRow_order,0).toString();
            
            purchaseOrder_orderID.setText(orderID);
            DefaultTableModel dtm2=(DefaultTableModel) purchaseOrder_invoiceTable.getModel();
            addItems.reloadInvoiceTable(orderID, dtm2);
            purchaseOrder_TabbedPane.setSelectedIndex(0);
            
            
        }
    }//GEN-LAST:event_purchaseOrder_orderTableMouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String text=jTextField1.getText();
        purchaseOrder_TabbedPane.setSelectedIndex(1);
        DefaultTableModel dtm=(DefaultTableModel) purchaseOrder_productTable.getModel();
        addItems.loadProductDetails(dtm,text);
        
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder_insertItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTabbedPane purchaseOrder_TabbedPane;
    private javax.swing.JButton purchaseOrder_addToInvoice;
    private javax.swing.JTable purchaseOrder_invoiceTable;
    private javax.swing.JTextField purchaseOrder_orderID;
    private javax.swing.JTable purchaseOrder_orderTable;
    private javax.swing.JTextField purchaseOrder_productID;
    private javax.swing.JTable purchaseOrder_productTable;
    private javax.swing.JTextField purchaseOrder_qty;
    private javax.swing.JTextField purchaseOrder_supplier;
    private javax.swing.JTextField purchaseOrder_unitPrice;
    // End of variables declaration//GEN-END:variables
}
