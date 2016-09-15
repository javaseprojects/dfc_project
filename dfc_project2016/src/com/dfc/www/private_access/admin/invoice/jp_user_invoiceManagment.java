/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.backend.jf_onScreenInvoiceKeyBoard;
import com.dfc.www.private_access.admin.products.User_Home;
import com.fsc.www.db.MC_DB;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class jp_user_invoiceManagment extends javax.swing.JPanel {

    String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    KeyEvent mykeys;

    public jp_user_invoiceManagment() {
        initComponents();
        sp_itemname.setVisible(false);
        tf_invoice_no.grabFocus();
        viewDailyInvoices();
        viewDailyInvoiceDetails();

    }
    String invoice_no = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        lbl_tot_invoice = new javax.swing.JLabel();
        lbl_tot_invoice_qty = new javax.swing.JLabel();
        tf_invoice_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_tot_invoices_amount = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sp_itemname = new javax.swing.JScrollPane();
        li_itemname = new javax.swing.JList();
        lb_available_qty = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_item_code = new javax.swing.JTextField();
        tf_qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lb_tot_item = new javax.swing.JLabel();
        lb_bil_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_payment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 670));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(32, 32, 32));
        jPanel3.setMaximumSize(new java.awt.Dimension(310, 580));
        jPanel3.setMinimumSize(new java.awt.Dimension(310, 580));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 580));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(239, 108, 0));

        tbl_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Cost", "Date", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_invoice);
        if (tbl_invoice.getColumnModel().getColumnCount() > 0) {
            tbl_invoice.getColumnModel().getColumn(0).setMinWidth(80);
            tbl_invoice.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbl_invoice.getColumnModel().getColumn(0).setMaxWidth(80);
            tbl_invoice.getColumnModel().getColumn(3).setMinWidth(35);
            tbl_invoice.getColumnModel().getColumn(3).setPreferredWidth(35);
            tbl_invoice.getColumnModel().getColumn(3).setMaxWidth(35);
        }

        lbl_tot_invoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tot_invoice.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tot_invoice.setText("0");
        lbl_tot_invoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tot_invoice.setMaximumSize(new java.awt.Dimension(150, 40));
        lbl_tot_invoice.setMinimumSize(new java.awt.Dimension(150, 40));

        lbl_tot_invoice_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tot_invoice_qty.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoice_qty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tot_invoice_qty.setText("0");
        lbl_tot_invoice_qty.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tot_invoice_qty.setMaximumSize(new java.awt.Dimension(150, 40));
        lbl_tot_invoice_qty.setMinimumSize(new java.awt.Dimension(150, 40));

        tf_invoice_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_invoice_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_invoice_noActionPerformed(evt);
            }
        });
        tf_invoice_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_invoice_noKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Invoice No:");

        lbl_tot_invoices_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tot_invoices_amount.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoices_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_tot_invoices_amount.setText("0.00");
        lbl_tot_invoices_amount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tot_invoices_amount.setMaximumSize(new java.awt.Dimension(150, 40));
        lbl_tot_invoices_amount.setMinimumSize(new java.awt.Dimension(150, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amount:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Invoice:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Qty:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tot_invoice_qty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_tot_invoices_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tf_invoice_no)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_tot_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(tf_invoice_no, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tot_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_tot_invoice_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tot_invoices_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jPanel3.add(jPanel6, "card2");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 580));

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        li_itemname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        li_itemname.setToolTipText("");
        li_itemname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                li_itemnameMouseClicked(evt);
            }
        });
        li_itemname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                li_itemnameKeyReleased(evt);
            }
        });
        sp_itemname.setViewportView(li_itemname);

        jPanel2.add(sp_itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 100));

        lb_available_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_available_qty.setForeground(new java.awt.Color(255, 255, 255));
        lb_available_qty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_available_qty.setText("00");
        lb_available_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lb_available_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 25, 200, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Qty:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 5, 250, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Available Qty:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 5, 138, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Code:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 260, 20));

        tf_item_code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_item_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_item_codeActionPerformed(evt);
            }
        });
        tf_item_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_item_codeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_item_codeKeyReleased(evt);
            }
        });
        jPanel2.add(tf_item_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 250, 40));

        tf_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_qtyKeyReleased(evt);
            }
        });
        jPanel2.add(tf_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 25, 250, 40));

        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Item Code", "Item Name", "Unit Price", "Qty", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(tbl_item);
        if (tbl_item.getColumnModel().getColumnCount() > 0) {
            tbl_item.getColumnModel().getColumn(0).setPreferredWidth(6);
            tbl_item.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 1000, 460));

        jPanel4.setBackground(new java.awt.Color(66, 66, 66));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lb_tot_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_tot_item.setForeground(new java.awt.Color(255, 255, 255));
        lb_tot_item.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tot_item.setText("0");
        lb_tot_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        lb_bil_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_bil_total.setForeground(new java.awt.Color(255, 255, 255));
        lb_bil_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_bil_total.setText("0.00");
        lb_bil_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Balance:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Item Qty:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Total:");

        tf_payment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0.00");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_tot_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_bil_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_payment)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_tot_item, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_bil_total, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(tf_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 1020, 650));

        jPanel5.setBackground(new java.awt.Color(255, 153, 51));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/itemlist4040.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/invoice4040.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/keyboard.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/redo-5124040.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_invoice_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_invoice_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_invoice_noActionPerformed

    private void tf_item_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_item_codeActionPerformed


    }//GEN-LAST:event_tf_item_codeActionPerformed

    private void tf_item_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyPressed


    }//GEN-LAST:event_tf_item_codeKeyPressed

    private void tf_item_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            li_itemname.grabFocus();
        }

        try {
            sp_itemname.setVisible(true);
            md_loadItemName();
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                new Thread(() -> {
                    md_setAvailableQty();
                }).start();

                tf_qty.grabFocus();
                sp_itemname.setVisible(false);
                tf_qty.selectAll();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tf_item_codeKeyReleased

    private void tf_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_qtyKeyReleased

        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                md_setItemTable();
                setInvoiceDetails();
                tf_item_code.grabFocus();
                tf_item_code.selectAll();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tf_qtyKeyReleased

    private void li_itemnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_li_itemnameMouseClicked

        try {

            if (!tf_item_code.getText().isEmpty()) {
                tf_item_code.selectAll();
                md_loadTF_Item();
                sp_itemname.setVisible(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_li_itemnameMouseClicked

    private void tf_invoice_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_invoice_noKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tf_invoice_no.getText().isEmpty()) {
                searchCustomInvoice(tf_invoice_no.getText());
            } else {
                viewDailyInvoices();
            }
        }

    }//GEN-LAST:event_tf_invoice_noKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased


    }//GEN-LAST:event_jPanel1KeyReleased

    private void li_itemnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_li_itemnameKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new Thread(() -> {
                md_setItemCodeToTextF();
            }).start();

        }

    }//GEN-LAST:event_li_itemnameKeyReleased
    jf_onScreenInvoiceKeyBoard invoiceKeyBoard = new jf_onScreenInvoiceKeyBoard();
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        invoiceKeyBoard.setVisible(true);

    }//GEN-LAST:event_jButton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_available_qty;
    private javax.swing.JLabel lb_bil_total;
    private javax.swing.JLabel lb_tot_item;
    private javax.swing.JLabel lbl_tot_invoice;
    private javax.swing.JLabel lbl_tot_invoice_qty;
    private javax.swing.JLabel lbl_tot_invoices_amount;
    private javax.swing.JList li_itemname;
    private javax.swing.JScrollPane sp_itemname;
    private javax.swing.JTable tbl_invoice;
    private javax.swing.JTable tbl_item;
    private javax.swing.JTextField tf_invoice_no;
    public static javax.swing.JTextField tf_item_code;
    public static javax.swing.JTextField tf_payment;
    private javax.swing.JTextField tf_qty;
    // End of variables declaration//GEN-END:variables

    //................create invoice no - start.....................................................
    //....IN-0001-160830-001
    ResultSet rs_getuserid;
    ResultSet rs_last_invoiceno;

    public void md_createInvoiceNo() {
        try {
            int u_id1 = 0;
            int invoiceno3 = 0;
            String last_invoiceno_ar[] = {};
            Date date = new Date();
            DateFormat dft = new SimpleDateFormat("yyMMdd");
            String df_2 = dft.format(date);

            new Thread(() -> {
                rs_getuserid = MC_DB.search_dataOne("user_account", "username", User_Home.lb_main_userNameLOAD.getText());
            }).start();

            while (rs_getuserid.next()) {
                u_id1 = rs_getuserid.getInt("user_account_id");
            }

            new Thread(() -> {
                try {
                    rs_last_invoiceno = MC_DB.myConnection().createStatement().executeQuery("SELECT LAST(invoice_no) FROM invoice");
                } catch (SQLException ex) {
                    Logger.getLogger(jp_user_invoiceManagment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();

            if (rs_last_invoiceno.next()) {
                String last_invoiceno = rs_last_invoiceno.getNString("invoice_no");
                last_invoiceno_ar = last_invoiceno.split("-");
            }

            if (last_invoiceno_ar[1].equals(df_2)) {
                invoiceno3 = Integer.parseInt(last_invoiceno_ar[0]) + 1;
            } else {
                invoiceno3 = 001;
            }

            invoice_no = "IN-" + u_id1 + "-" + df_2 + "-" + invoiceno3;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................create invoice no - end.......................................................

    //................set item table - start........................................................
    ResultSet rs_itemtable = null;

    public void md_setItemTable() {

        try {

            new Thread(() -> {
                try {
                    try {
                        rs_itemtable = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_code='" + Integer.parseInt(tf_item_code.getText()) + "'");

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    DefaultTableModel dt = (DefaultTableModel) tbl_item.getModel();
                    if (rs_itemtable.next()) {
                        try {
                            Vector v = new Vector();
                            v.add(dt.getRowCount() + 1);
                            v.add(tf_item_code.getText());
                            v.add(rs_itemtable.getString("item_name"));
                            v.add(rs_itemtable.getDouble("selling_price") + "0");
                            v.add(tf_qty.getText());
                            v.add(Double.parseDouble(rs_itemtable.getString("selling_price")) * Double.parseDouble(tf_qty.getText()) + "0");
                            dt.addRow(v);
                            tf_item_code.setText("");
                            tf_qty.setText("");
                            sp_itemname.setVisible(false);

                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }

                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................set item table  end..........................................................

    //..................set table item qty - start.................................................
    public void md_setTableItemQty() {
        DefaultTableModel dt = (DefaultTableModel) tbl_item.getModel();

    }
    //..................set table item qty - end.................................................

    //......................item name loade from jlist - start...............................................
    ResultSet rs_load_item_name;

    public void md_loadItemName() {
        try {
            new Thread(() -> {
                try {
                    try {
                        rs_load_item_name = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_code LIKE '%" + tf_item_code.getText() + "%'");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    DefaultListModel dlm = new DefaultListModel();

                    while (rs_load_item_name.next()) {
                        dlm.addElement(rs_load_item_name.getString("item_name"));
                    }
                    li_itemname.setModel(dlm);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //......................item name loade from jlist - end.................................................

    //......................item code loade from tf_item - start...............................................
    ResultSet rs_load_tf_item;

    public void md_loadTF_Item() {
        if (!tf_item_code.getText().isEmpty()) {
            try {
                new Thread(() -> {
                    rs_load_tf_item = MC_DB.search_dataOne("item", "item_name", li_itemname.getSelectedValue().toString());
                }).start();

                while (rs_load_tf_item.first()) {

                    tf_item_code.setText(rs_load_tf_item.getInt("item_code") + "");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    //......................item code loade from tf_item - end.................................................

    //..............................Key pad - start............................................................
    public void md_keyPad(java.awt.event.KeyEvent evt) {

    }
    //..............................Key pad - end................................................................

    //................................set available qty from label - start................................................
    ResultSet rs_setavailableqty;

    public void md_setAvailableQty() {
        try {
            new Thread(() -> {

                try {
                    rs_setavailableqty = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item i INNER JOIN stock_log sg ON i.item_id = sg.item_id WHERE i.item_code='" + tf_item_code.getText() + "'");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                try {
                    while (rs_setavailableqty.next()) {
                        lb_available_qty.setText(rs_setavailableqty.getInt("qty") + "");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................................set available qty from label - end..................................................

    //................................save invoice table - start.........................................................
    ResultSet rs_save_invoice;

    public void md_saveInvoice() {
    }
    //................................save invoice table - end...........................................................

    //search Custom Invoice
    private void searchCustomInvoice(String invoiceNo) {

        DefaultTableModel dtm = (DefaultTableModel) tbl_invoice.getModel();
        dtm.setRowCount(0);

        new Thread(() -> {
            try {
                ResultSet rs = MC_DB.search_dataOne("invoice", "invoice_no", invoiceNo);
                if (rs.next()) {
                    Vector v = new Vector();
                    int totQty = getTotalQtyByInvoiceNo(rs.getString("invoice_no"));
                    if (totQty != 0) {
                        v.add(rs.getString("invoice_no"));
                        v.add(rs.getString("total_amount"));
                        v.add(rs.getString("invoice_date"));
                        v.add(totQty);
                        dtm.addRow(v);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    //search Custom Invoice

    //getTotalQtyByInvoiceNo
    public int getTotalQtyByInvoiceNo(String invoiceNo) {

        try {
            ResultSet rs = MC_DB.search_dataQuery("SELECT COUNT(qty) AS totQty FROM invoice_reg WHERE invoice_no='" + invoiceNo + "'");
            if (rs.next()) {
                return rs.getInt("totQty");
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }
    //getTotalQtyByInvoiceNo

    //view all daily invoices
    private void viewDailyInvoices() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_invoice.getModel();
        dtm.setRowCount(0);
        new Thread(() -> {
            try {
                ResultSet rs = MC_DB.search_dataQuery("SELECT * FROM invoice WHERE invoice_date='" + currentDate + "'");
                while (rs.next()) {
                    Vector v = new Vector();
                    int totQty = getTotalQtyByInvoiceNo(rs.getString("invoice_no"));
                    if (totQty != 0) {
                        v.add(rs.getString("invoice_no"));
                        v.add(rs.getString("total_amount"));
                        v.add(rs.getString("invoice_date"));
                        v.add(totQty);
                        dtm.addRow(v);

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    //view all daily invoices

    //view invoice details
    private void viewDailyInvoiceDetails() {
        if (tbl_invoice.getRowCount() != 0) {
            int totQty = 0;
            double totCost = 0;
            for (int x = 0; x < tbl_invoice.getRowCount(); x++) {
                totQty += Integer.parseInt((String) tbl_invoice.getValueAt(x, 3));
                totCost += Double.parseDouble((String) tbl_invoice.getValueAt(x, 1));
            }
            lbl_tot_invoice.setText(tbl_invoice.getRowCount() + "");
            lbl_tot_invoice_qty.setText(totQty + "");
            lbl_tot_invoices_amount.setText(totCost + "0");
        } else {
            lbl_tot_invoice.setText("0");
            lbl_tot_invoice_qty.setText("0");
            lbl_tot_invoices_amount.setText("00.00");
        }

    }
    //view invoice details

    //set invoice details bill total and total qty
    public void setInvoiceDetails() {
        int bill_tot_qty = 0;
        double bill_tot_cost = 0;
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
//        if (tbl_item.getRowCount() != 0) {
        for (int x = 0; x < dtm.getRowCount(); x++) {
            bill_tot_qty = Integer.parseInt(dtm.getValueAt(x, 4) + "");
            System.out.println("hkxz  zjsskkjk" + bill_tot_qty);
            //bill_tot_cost += Double.parseDouble(dtm.getValueAt(x, 5)+"");
        }
//        } else {
//            lbl_tot_invoice_qty.setText("0");
//            lb_bil_total.setText("00.00");
//        }
//        System.out.println(bill_tot_cost);
//        System.out.println(bill_tot_qty);

//        if (bill_tot_qty != 0) {
//            lbl_tot_invoice_qty.setText(bill_tot_qty + "");
//        } else {
//            lbl_tot_invoice_qty.setText("0");
//        }
//        if (bill_tot_cost != 0) {
//            lb_bil_total.setText(bill_tot_cost + "");
//        } else {
//            lb_bil_total.setText("00.00");
//        }
    }
    //set invoice details bill total and total qty

    private void md_setItemCodeToTextF() {

        new Thread(() -> {
            try {
                ResultSet rs_load_tf_itemID = MC_DB.search_dataOne("item", "item_name", li_itemname.getSelectedValue().toString().trim());

                while (rs_load_tf_itemID.next()) {
                    if (tf_item_code.getText().isEmpty()) {
                        System.out.println("HEllo!");
                        tf_item_code.setText(rs_load_tf_itemID.getInt("item_code") + "");
                        tf_qty.grabFocus();
                    } else {
                        tf_item_code.setText("");
                        tf_item_code.setText(rs_load_tf_itemID.getInt("item_code") + "");
                        tf_qty.grabFocus();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(jp_user_invoiceManagment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
        //li_itemname.setVisible(false);
        sp_itemname.setVisible(false);
    }
}
