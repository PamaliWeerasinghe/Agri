
package gui;

import gui.output.SelectError;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import model.buyerOrderModel;


public class Buyer_placeOrder_insertItems extends javax.swing.JFrame {

    public static final buyerOrderModel addItems =new buyerOrderModel();
    public static String orderID;
    public Buyer_placeOrder_insertItems() {
        initComponents();
        DefaultTableModel dfm=(DefaultTableModel) BuyerpurchaseOrder_cropTable.getModel();
        DefaultTableModel dtm=(DefaultTableModel) BuyerpurchaseOrder_orderTable.getModel();
        DefaultTableModel dtm2=(DefaultTableModel) BuyerpurchaseOrder_invoiceTable.getModel();
        addItems.loadOrderTable(dtm);
        addItems.loadCropTable(dfm);
        addItems.loadInvoiceTable(dtm2);
    }
    public void reset(){
        BuyerpurchaseOrder_orderID.setText("");
        BuyerpurchaseOrder_buyer.setText("");
        BuyerpurchaseOrder_cropID.setText("");
        BuyerpurchaseOrder_qty.setText("");
        BuyerpurchaseOrder_unitPrice.setText("");
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
        BuyerpurchaseOrder_orderID = new javax.swing.JTextField();
        BuyerpurchaseOrder_cropID = new javax.swing.JTextField();
        BuyerpurchaseOrder_buyer = new javax.swing.JTextField();
        BuyerpurchaseOrder_unitPrice = new javax.swing.JTextField();
        BuyerpurchaseOrder_addToInvoice = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BuyerpurchaseOrder_qty = new javax.swing.JTextField();
        BuyerjButton6 = new javax.swing.JButton();
        BuyerjButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BuyerjTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        purchaseOrder_TabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_invoiceTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_orderTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BuyerpurchaseOrder_cropTable = new javax.swing.JTable();

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
        jLabel5.setText("CROP ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel6.setText("CROP TYPE");

        BuyerpurchaseOrder_orderID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_orderID.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_orderID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_orderID.setOpaque(false);
        BuyerpurchaseOrder_orderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_orderIDActionPerformed(evt);
            }
        });

        BuyerpurchaseOrder_cropID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_cropID.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_cropID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_cropID.setOpaque(false);

        BuyerpurchaseOrder_buyer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_buyer.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_buyer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_buyer.setOpaque(false);

        BuyerpurchaseOrder_unitPrice.setBackground(new java.awt.Color(213, 168, 127));
        BuyerpurchaseOrder_unitPrice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_unitPrice.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_unitPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_unitPrice.setOpaque(false);

        BuyerpurchaseOrder_addToInvoice.setBackground(new java.awt.Color(255, 246, 207));
        BuyerpurchaseOrder_addToInvoice.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BuyerpurchaseOrder_addToInvoice.setText("INSERT");
        BuyerpurchaseOrder_addToInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));
        BuyerpurchaseOrder_addToInvoice.setContentAreaFilled(false);
        BuyerpurchaseOrder_addToInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerpurchaseOrder_addToInvoice.setFocusPainted(false);
        BuyerpurchaseOrder_addToInvoice.setOpaque(true);
        BuyerpurchaseOrder_addToInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addToInvoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_addToInvoiceMouseExited(evt);
            }
        });
        BuyerpurchaseOrder_addToInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerpurchaseOrder_addToInvoiceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLabel10.setText("QTY ( kg )");

        BuyerpurchaseOrder_qty.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        BuyerpurchaseOrder_qty.setForeground(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BuyerpurchaseOrder_qty.setOpaque(false);

        BuyerjButton6.setBackground(new java.awt.Color(255, 246, 207));
        BuyerjButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerjButton6.setText("GET ID");
        BuyerjButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 110, 80)));
        BuyerjButton6.setContentAreaFilled(false);
        BuyerjButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyerjButton6.setFocusPainted(false);
        BuyerjButton6.setOpaque(true);
        BuyerjButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerjButton6ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuyerpurchaseOrder_buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(BuyerpurchaseOrder_addToInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BuyerpurchaseOrder_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BuyerpurchaseOrder_orderID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BuyerpurchaseOrder_cropID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BuyerjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BuyerjButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(BuyerpurchaseOrder_qty))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuyerpurchaseOrder_orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuyerjButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuyerpurchaseOrder_cropID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuyerjButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerpurchaseOrder_unitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(BuyerpurchaseOrder_addToInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 560, Short.MAX_VALUE)
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

        BuyerjTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerjTextField1.setForeground(new java.awt.Color(153, 153, 153));
        BuyerjTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BuyerjTextField1.setText("Please Enter The Crop Name");
        BuyerjTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(164, 142, 109)));
        BuyerjTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuyerjTextField1FocusLost(evt);
            }
        });
        BuyerjTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerjTextField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyerjTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuyerjTextField1MouseExited(evt);
            }
        });
        BuyerjTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuyerjTextField1KeyReleased(evt);
            }
        });
        jPanel4.add(BuyerjTextField1);
        BuyerjTextField1.setBounds(80, 20, 490, 40);

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
        jButton1.setBounds(570, 20, 110, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        purchaseOrder_TabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerpurchaseOrder_invoiceTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerpurchaseOrder_invoiceTable.setForeground(new java.awt.Color(69, 69, 69));
        BuyerpurchaseOrder_invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ORDER ID", "CROP NAME", "PURCHASE DATE", "QTY", "UNIT PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyerpurchaseOrder_invoiceTable.setFocusable(false);
        BuyerpurchaseOrder_invoiceTable.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_invoiceTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerpurchaseOrder_invoiceTable.setRowHeight(28);
        BuyerpurchaseOrder_invoiceTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_invoiceTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerpurchaseOrder_invoiceTable.setShowVerticalLines(false);
        BuyerpurchaseOrder_invoiceTable.getTableHeader().setReorderingAllowed(false);
        BuyerpurchaseOrder_invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_invoiceTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BuyerpurchaseOrder_invoiceTable);
        if (BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumnCount() > 0) {
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(0).setResizable(false);
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(1).setResizable(false);
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(2).setResizable(false);
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(3).setResizable(false);
            BuyerpurchaseOrder_invoiceTable.getColumnModel().getColumn(4).setResizable(false);
        }

        purchaseOrder_TabbedPane.addTab("INVOICE", jScrollPane2);

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
        if (BuyerpurchaseOrder_orderTable.getColumnModel().getColumnCount() > 0) {
            BuyerpurchaseOrder_orderTable.getColumnModel().getColumn(0).setResizable(false);
            BuyerpurchaseOrder_orderTable.getColumnModel().getColumn(1).setResizable(false);
        }

        purchaseOrder_TabbedPane.addTab("ORDER", jScrollPane4);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        BuyerpurchaseOrder_cropTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BuyerpurchaseOrder_cropTable.setForeground(new java.awt.Color(69, 69, 69));
        BuyerpurchaseOrder_cropTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CROP ID", "CROP NAME", "QTY AVAILABLE (kg)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BuyerpurchaseOrder_cropTable.setFocusable(false);
        BuyerpurchaseOrder_cropTable.setGridColor(new java.awt.Color(255, 255, 255));
        BuyerpurchaseOrder_cropTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BuyerpurchaseOrder_cropTable.setRowHeight(28);
        BuyerpurchaseOrder_cropTable.setSelectionBackground(new java.awt.Color(222, 191, 142));
        BuyerpurchaseOrder_cropTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        BuyerpurchaseOrder_cropTable.setShowVerticalLines(false);
        BuyerpurchaseOrder_cropTable.getTableHeader().setReorderingAllowed(false);
        BuyerpurchaseOrder_cropTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyerpurchaseOrder_cropTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BuyerpurchaseOrder_cropTable);
        if (BuyerpurchaseOrder_cropTable.getColumnModel().getColumnCount() > 0) {
            BuyerpurchaseOrder_cropTable.getColumnModel().getColumn(0).setResizable(false);
            BuyerpurchaseOrder_cropTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            BuyerpurchaseOrder_cropTable.getColumnModel().getColumn(1).setResizable(false);
            BuyerpurchaseOrder_cropTable.getColumnModel().getColumn(2).setResizable(false);
        }

        purchaseOrder_TabbedPane.addTab("CROP AVAILABILITY", jScrollPane3);

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
                .addComponent(purchaseOrder_TabbedPane)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BuyerpurchaseOrder_orderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_orderIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BuyerpurchaseOrder_orderIDActionPerformed

    private void BuyerpurchaseOrder_addToInvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addToInvoiceMouseEntered
        BuyerpurchaseOrder_addToInvoice.setBackground(new Color(193, 153, 111));
        BuyerpurchaseOrder_addToInvoice.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BuyerpurchaseOrder_addToInvoiceMouseEntered

    private void BuyerpurchaseOrder_addToInvoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addToInvoiceMouseExited
        BuyerpurchaseOrder_addToInvoice.setBackground(new Color(255, 246, 207));
        BuyerpurchaseOrder_addToInvoice.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerpurchaseOrder_addToInvoiceMouseExited

    private void BuyerpurchaseOrder_addToInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_addToInvoiceActionPerformed
        orderID=BuyerpurchaseOrder_orderID.getText();
        String cropID=BuyerpurchaseOrder_cropID.getText();
        String qty=BuyerpurchaseOrder_qty.getText();
        String unit_price=BuyerpurchaseOrder_unitPrice.getText();
        
        if(orderID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Select an Order ID");
            categoryExists.setVisible(true);
        }else if(cropID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Select a Crop ID");
            categoryExists.setVisible(true);
        }else if(qty.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Enter the Quantity");
            categoryExists.setVisible(true);
        }else if(unit_price.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Enter the unit price");
            categoryExists.setVisible(true);
        }else{
            
        
        
        addItems.addItemToBuyerInvoice(orderID,cropID,qty,unit_price);
        DefaultTableModel dtm2=(DefaultTableModel) BuyerpurchaseOrder_invoiceTable.getModel();
        addItems.ReloadInvoiceTable(dtm2,orderID);
        reset();
        }
    }//GEN-LAST:event_BuyerpurchaseOrder_addToInvoiceActionPerformed

    private void BuyerjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerjButton6ActionPerformed
        purchaseOrder_TabbedPane.setSelectedIndex(2);
        int selectedRow_product=BuyerpurchaseOrder_orderTable.getSelectedRow();
        if(selectedRow_product!=-1){

        }
    }//GEN-LAST:event_BuyerjButton6ActionPerformed

    private void BuyerjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerjButton7ActionPerformed
        purchaseOrder_TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_BuyerjButton7ActionPerformed

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

    private void BuyerjTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjTextField1MouseClicked
        BuyerjTextField1.setText(null);
        BuyerjTextField1.setCaretColor(new Color(0, 0, 0));
        BuyerjTextField1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BuyerjTextField1MouseClicked

    private void BuyerjTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjTextField1MouseEntered

    }//GEN-LAST:event_BuyerjTextField1MouseEntered

    private void BuyerjTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerjTextField1MouseExited

    }//GEN-LAST:event_BuyerjTextField1MouseExited

    private void BuyerjTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuyerjTextField1KeyReleased
        String text=BuyerjTextField1.getText();
        purchaseOrder_TabbedPane.setSelectedIndex(2);
        DefaultTableModel dtm=(DefaultTableModel) BuyerpurchaseOrder_cropTable.getModel();
        addItems.loadCropDetails(dtm,text);

    }//GEN-LAST:event_BuyerjTextField1KeyReleased

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //        String keyword = jTextField1.getText();
        //        adm.loadOrderTableOnPname(keyword, dtm);
        BuyerjTextField1.setText("Please Enter The Product Name");
        //jTextField1.setForeground(new Color(153,153,153));
        //jTextField1.setCaretColor(new Color(255,255,255));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuyerpurchaseOrder_invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_invoiceTableMouseClicked

    }//GEN-LAST:event_BuyerpurchaseOrder_invoiceTableMouseClicked

    private void BuyerpurchaseOrder_orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_orderTableMouseClicked
        int selectedRow_product= BuyerpurchaseOrder_orderTable.getSelectedRow();
        if(selectedRow_product!=-1){
            String productID=BuyerpurchaseOrder_orderTable.getValueAt(selectedRow_product,0).toString();
            BuyerpurchaseOrder_orderID.setText(productID);
            String supplier=BuyerpurchaseOrder_orderTable.getValueAt(selectedRow_product,1).toString();
            //BuyerpurchaseOrder_buyer.setText(supplier);
            
            //category=BuyerpurchaseOrder_productTable.getValueAt(selectedRow_product,2).toString();
            //title=BuyerpurchaseOrder_productTable.getValueAt(selectedRow_product,3).toString();
            DefaultTableModel dtm2=(DefaultTableModel) BuyerpurchaseOrder_invoiceTable.getModel();
            addItems.ReloadInvoiceTable(dtm2, productID);
            purchaseOrder_TabbedPane.setSelectedIndex(0);

        }

    }//GEN-LAST:event_BuyerpurchaseOrder_orderTableMouseClicked

    private void BuyerpurchaseOrder_cropTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyerpurchaseOrder_cropTableMouseClicked
        int selectedRow_order=BuyerpurchaseOrder_cropTable.getSelectedRow();
        if(selectedRow_order!=-1){
            String productID=BuyerpurchaseOrder_cropTable.getValueAt(selectedRow_order,0).toString();
            String cropType=BuyerpurchaseOrder_cropTable.getValueAt(selectedRow_order, 1).toString();
            String qty=BuyerpurchaseOrder_cropTable.getValueAt(selectedRow_order,2).toString();
            BuyerpurchaseOrder_cropID.setText(productID);
            BuyerpurchaseOrder_buyer.setText(cropType);
            BuyerpurchaseOrder_qty.setText(qty);
                        
            purchaseOrder_TabbedPane.setSelectedIndex(0);

        }
    }//GEN-LAST:event_BuyerpurchaseOrder_cropTableMouseClicked

    private void BuyerjTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuyerjTextField1FocusLost
        BuyerjTextField1.setText("Enter The Crop Name");
    }//GEN-LAST:event_BuyerjTextField1FocusLost

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
            java.util.logging.Logger.getLogger(Buyer_placeOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buyer_placeOrder_insertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buyer_placeOrder_insertItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyerjButton6;
    private javax.swing.JButton BuyerjButton7;
    private javax.swing.JTextField BuyerjTextField1;
    private javax.swing.JButton BuyerpurchaseOrder_addToInvoice;
    private javax.swing.JTextField BuyerpurchaseOrder_buyer;
    private javax.swing.JTextField BuyerpurchaseOrder_cropID;
    private javax.swing.JTable BuyerpurchaseOrder_cropTable;
    private javax.swing.JTable BuyerpurchaseOrder_invoiceTable;
    private javax.swing.JTextField BuyerpurchaseOrder_orderID;
    private javax.swing.JTable BuyerpurchaseOrder_orderTable;
    private javax.swing.JTextField BuyerpurchaseOrder_qty;
    private javax.swing.JTextField BuyerpurchaseOrder_unitPrice;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTabbedPane purchaseOrder_TabbedPane;
    // End of variables declaration//GEN-END:variables
}
