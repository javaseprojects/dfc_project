/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.products.User_Home;
import com.fsc.www.db.MC_DB;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
        tf_invoice_no = new javax.swing.JTextField();
        tf_item_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sp_itemname = new javax.swing.JScrollPane();
        li_itemname = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        tf_qty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lb_available_qty = new javax.swing.JLabel();
        lbl_tot_invoice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_tot_invoice_qty = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_tot_invoices_amount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_number_7 = new javax.swing.JButton();
        bt_number_8 = new javax.swing.JButton();
        bt_number_9 = new javax.swing.JButton();
        bt_divide = new javax.swing.JButton();
        bt_multi = new javax.swing.JButton();
        bt_number_6 = new javax.swing.JButton();
        bt_number_5 = new javax.swing.JButton();
        bt_number_4 = new javax.swing.JButton();
        bt_number_1 = new javax.swing.JButton();
        bt_number_2 = new javax.swing.JButton();
        bt_number_3 = new javax.swing.JButton();
        bt_substract = new javax.swing.JButton();
        bt_plus = new javax.swing.JButton();
        bt_enter = new javax.swing.JButton();
        bt_number_0 = new javax.swing.JButton();
        bt_space = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lb_tot_item = new javax.swing.JLabel();
        lb_bil_total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_payment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(null);

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
        jPanel1.add(tf_invoice_no);
        tf_invoice_no.setBounds(10, 50, 280, 40);

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
        jPanel1.add(tf_item_code);
        tf_item_code.setBounds(310, 50, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Invoice No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 270, 40);

        li_itemname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        li_itemname.setToolTipText("");
        li_itemname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                li_itemnameMouseClicked(evt);
            }
        });
        sp_itemname.setViewportView(li_itemname);

        jPanel1.add(sp_itemname);
        sp_itemname.setBounds(310, 90, 260, 90);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 100, 670, 560);

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

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 280, 390);

        tf_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_qtyKeyReleased(evt);
            }
        });
        jPanel1.add(tf_qty);
        tf_qty.setBounds(750, 50, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Code:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 10, 260, 40);

        lb_available_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_available_qty.setForeground(new java.awt.Color(255, 255, 255));
        lb_available_qty.setText("00");
        jPanel1.add(lb_available_qty);
        lb_available_qty.setBounds(580, 50, 160, 40);

        lbl_tot_invoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tot_invoice.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoice.setText("0");
        jPanel1.add(lbl_tot_invoice);
        lbl_tot_invoice.setBounds(140, 500, 150, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Qty:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 550, 130, 40);

        lbl_tot_invoice_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tot_invoice_qty.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoice_qty.setText("0");
        jPanel1.add(lbl_tot_invoice_qty);
        lbl_tot_invoice_qty.setBounds(140, 550, 150, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amount:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 600, 130, 40);

        lbl_tot_invoices_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tot_invoices_amount.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_invoices_amount.setText("0.00");
        jPanel1.add(lbl_tot_invoices_amount);
        lbl_tot_invoices_amount.setBounds(140, 600, 150, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Total Invoice:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 500, 130, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Qty:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(750, 10, 230, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Available Qty:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(580, 10, 160, 40);

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));

        bt_number_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_7.setText("7");
        bt_number_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_7ActionPerformed(evt);
            }
        });

        bt_number_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_8.setText("8");
        bt_number_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_8ActionPerformed(evt);
            }
        });

        bt_number_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_9.setText("9");
        bt_number_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_9ActionPerformed(evt);
            }
        });

        bt_divide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_divide.setText("/");
        bt_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_divideActionPerformed(evt);
            }
        });

        bt_multi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_multi.setText("*");
        bt_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiActionPerformed(evt);
            }
        });

        bt_number_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_6.setText("6");
        bt_number_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_6ActionPerformed(evt);
            }
        });

        bt_number_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_5.setText("5");
        bt_number_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_5ActionPerformed(evt);
            }
        });

        bt_number_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_4.setText("4");
        bt_number_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_4ActionPerformed(evt);
            }
        });

        bt_number_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_1.setText("1");
        bt_number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_1ActionPerformed(evt);
            }
        });

        bt_number_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_2.setText("2");
        bt_number_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_2ActionPerformed(evt);
            }
        });

        bt_number_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_3.setText("3");
        bt_number_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_3ActionPerformed(evt);
            }
        });

        bt_substract.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_substract.setText("-");
        bt_substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_substractActionPerformed(evt);
            }
        });

        bt_plus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_plus.setText("+");
        bt_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plusActionPerformed(evt);
            }
        });

        bt_enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_enter.setText("Enter");
        bt_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enterActionPerformed(evt);
            }
        });

        bt_number_0.setBackground(new java.awt.Color(51, 51, 51));
        bt_number_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_0.setText("0");
        bt_number_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_0ActionPerformed(evt);
            }
        });

        bt_space.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_space.setText("Space");
        bt_space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_spaceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Item Qty:");

        lb_tot_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_tot_item.setForeground(new java.awt.Color(255, 255, 255));
        lb_tot_item.setText("0");

        lb_bil_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_bil_total.setForeground(new java.awt.Color(255, 255, 255));
        lb_bil_total.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Total:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment:");

        tf_payment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Balance:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_number_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_number_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_number_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_number_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_substract, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_number_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bt_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_space, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_tot_item, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lb_bil_total, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tf_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_number_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_substract, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(bt_space, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tot_item, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_bil_total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(980, 0, 390, 670);

        jPanel3.setBackground(new java.awt.Color(255, 87, 34));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 300, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_invoice_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_invoice_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_invoice_noActionPerformed

    private void tf_item_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_item_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_item_codeActionPerformed

    private void bt_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_divideActionPerformed

        try {
            bt_divide.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_DIVIDE);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_divideActionPerformed

    private void tf_item_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyPressed


    }//GEN-LAST:event_tf_item_codeKeyPressed

    private void tf_item_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyReleased

        try {
            sp_itemname.setVisible(true);
            md_loadItemName();
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                md_setAvailableQty();
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
            tf_item_code.selectAll();
            md_loadTF_Item();
            sp_itemname.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_li_itemnameMouseClicked

    private void bt_number_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_1ActionPerformed

//        tf_invoice_no.addFocusListener((FocusListener) this);
//        tf_item_code.addFocusListener((FocusListener) this);
//        focusGained(this);
//        if (tf_invoice_no.hasFocus()) {
//            tf_invoice_no.setText("1");
//        } else if (tf_item_code.hasFocus()) {
//            tf_item_code.setText("1");
//        } else if (tf_qty.hasFocus()) {
//            tf_qty.setText("1");
//        } else if (tf_payment.hasFocus()) {
//            tf_payment.setText("1");
//        }
//        Ext.get(document.activeElement).parent().parent().id;
//        EX
//        findFocus(this);
//        Component.get
//        
//        if (true) {
//            Component c = (Component).getSource();
//            Cursor cur = c.getCursor();
//            c.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//            
//            c.setCursor(cur);
//
//        }
//        System.out.println( KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner());
//        KeyboardFocusManager=new Robot().mousePress(KeyEvent.VK_1);
        try {
            bt_number_1.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_1);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_1ActionPerformed

    private void bt_number_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_0ActionPerformed

//        if (tf_invoice_no.hasFocus()) {
//            tf_invoice_no.setText("0");
//        } else if (tf_item_code.hasFocus()) {
//            tf_item_code.setText("0");
//        } else if (tf_qty.hasFocus()) {
//            tf_qty.setText("0");
//        } else if (tf_payment.hasFocus()) {
//            tf_payment.setText("0");
//        }
        try {
            bt_number_0.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_0);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_0ActionPerformed

    private void bt_number_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_2ActionPerformed

        try {
            bt_number_2.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_2);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_number_2ActionPerformed

    private void bt_number_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_3ActionPerformed

        try {
            bt_number_3.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_3);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_3ActionPerformed

    private void bt_number_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_4ActionPerformed

        try {
            bt_number_4.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_4);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_bt_number_4ActionPerformed

    private void bt_number_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_5ActionPerformed

        try {
            bt_number_5.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_5);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_5ActionPerformed

    private void bt_number_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_6ActionPerformed

        try {
            bt_number_6.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_6);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_6ActionPerformed

    private void bt_number_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_7ActionPerformed

        try {
            bt_number_7.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_7);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_7ActionPerformed

    private void bt_number_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_8ActionPerformed

        try {
            bt_number_8.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_8);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_8ActionPerformed

    private void bt_number_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_9ActionPerformed

        try {
            bt_number_9.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_9);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_number_9ActionPerformed

    private void bt_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enterActionPerformed

        try {
            bt_enter.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_ENTER);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_enterActionPerformed

    private void bt_spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_spaceActionPerformed

        try {
            bt_space.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_SPACE);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_spaceActionPerformed

    private void bt_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiActionPerformed

        try {
            bt_multi.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_MULTIPLY);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_multiActionPerformed

    private void bt_substractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_substractActionPerformed

        try {
            bt_substract.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_SUBTRACT);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_substractActionPerformed

    private void bt_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_plusActionPerformed

        try {
            bt_plus.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_ADD);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bt_plusActionPerformed

    private void tf_invoice_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_invoice_noKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tf_invoice_no.getText().isEmpty()) {
                searchCustomInvoice(tf_invoice_no.getText());
            } else {
                viewDailyInvoices();
            }
        }

    }//GEN-LAST:event_tf_invoice_noKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_divide;
    private javax.swing.JButton bt_enter;
    private javax.swing.JButton bt_multi;
    private javax.swing.JButton bt_number_0;
    private javax.swing.JButton bt_number_1;
    private javax.swing.JButton bt_number_2;
    private javax.swing.JButton bt_number_3;
    private javax.swing.JButton bt_number_4;
    private javax.swing.JButton bt_number_5;
    private javax.swing.JButton bt_number_6;
    private javax.swing.JButton bt_number_7;
    private javax.swing.JButton bt_number_8;
    private javax.swing.JButton bt_number_9;
    private javax.swing.JButton bt_plus;
    private javax.swing.JButton bt_space;
    private javax.swing.JButton bt_substract;
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
    private javax.swing.JTextField tf_item_code;
    private javax.swing.JTextField tf_payment;
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
        try {
            new Thread(() -> {
                rs_load_tf_item = MC_DB.search_dataOne("item", "item_name", li_itemname.getSelectedValue().toString());
            }).start();

            while (rs_load_tf_item.next()) {
                tf_item_code.setText(rs_load_tf_item.getInt("item_code") + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //......................item code loade from tf_item - end.................................................

    //..............................Key pad - start............................................................
    public void md_keyPad(java.awt.event.KeyEvent evt) {
        try {
            if (evt.getKeyCode() == KeyEvent.VK_1) {
                addKeyListener((KeyListener) bt_number_1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //..............................Key pad - end................................................................

    //................................set available qty from label - start................................................
    ResultSet rs_setavailableqty;

    public void md_setAvailableQty() {
        try {
            new Thread(() -> {

                try {
                    rs_setavailableqty = MC_DB.myConnection().createStatement().executeQuery("SELECT stock_log.qty FROM item INNER JOIN item.item_id = stock_log.item_id WHERE item.item_code='" + tf_item_code.getText() + "'");
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
        DefaultTableModel dtm =(DefaultTableModel)tbl_item.getModel();
//        if (tbl_item.getRowCount() != 0) {
            for (int x = 0; x < dtm.getRowCount(); x++) {
               bill_tot_qty = Integer.parseInt(dtm.getValueAt(x, 4)+"");
                        System.out.println("hkxz  zjsskkjk"+bill_tot_qty);
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
}
