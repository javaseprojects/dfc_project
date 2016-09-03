/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.products.User_Home;
import com.fsc.www.db.MC_DB;
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

/**
 *
 * @author Sajeewa
 */
public class jp_invoice extends javax.swing.JPanel {

    /**
     * Creates new form invoice
     */
    public jp_invoice() {
        initComponents();
        sp_itemname.setVisible(false);
        tf_item_code.grabFocus();
    }

    String invoice_no = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_invoice_no = new javax.swing.JTextField();
        tf_item_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_space = new javax.swing.JButton();
        bt_number_7 = new javax.swing.JButton();
        bt_number_2 = new javax.swing.JButton();
        bt_number_3 = new javax.swing.JButton();
        bt_number_8 = new javax.swing.JButton();
        bt_number_6 = new javax.swing.JButton();
        bt_number_5 = new javax.swing.JButton();
        bt_number_4 = new javax.swing.JButton();
        bt_number_1 = new javax.swing.JButton();
        bt_enter = new javax.swing.JButton();
        bt_number_0 = new javax.swing.JButton();
        sp_itemname = new javax.swing.JScrollPane();
        li_itemname = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        bt_number_9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        tf_qty = new javax.swing.JTextField();
        tf_payment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lb_available_qty = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_item = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setLayout(null);

        tf_invoice_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_invoice_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_invoice_noActionPerformed(evt);
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
        tf_item_code.setBounds(300, 50, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Invoice No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 270, 40);

        bt_space.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_space.setText("Space");
        jPanel1.add(bt_space);
        bt_space.setBounds(990, 380, 350, 70);

        bt_number_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_7.setText("7");
        jPanel1.add(bt_number_7);
        bt_number_7.setBounds(990, 20, 80, 80);

        bt_number_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_2.setText("2");
        jPanel1.add(bt_number_2);
        bt_number_2.setBounds(1080, 200, 80, 80);

        bt_number_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_3.setText("3");
        jPanel1.add(bt_number_3);
        bt_number_3.setBounds(1170, 200, 80, 80);

        bt_number_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_8.setText("8");
        jPanel1.add(bt_number_8);
        bt_number_8.setBounds(1080, 20, 80, 80);

        bt_number_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_6.setText("6");
        jPanel1.add(bt_number_6);
        bt_number_6.setBounds(1170, 110, 80, 80);

        bt_number_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_5.setText("5");
        jPanel1.add(bt_number_5);
        bt_number_5.setBounds(1080, 110, 80, 80);

        bt_number_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_4.setText("4");
        jPanel1.add(bt_number_4);
        bt_number_4.setBounds(990, 110, 80, 80);

        bt_number_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_1.setText("1");
        jPanel1.add(bt_number_1);
        bt_number_1.setBounds(990, 200, 80, 80);

        bt_enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_enter.setText("Enter");
        jPanel1.add(bt_enter);
        bt_enter.setBounds(1080, 290, 170, 80);

        bt_number_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_0.setText("0");
        jPanel1.add(bt_number_0);
        bt_number_0.setBounds(990, 290, 80, 80);

        li_itemname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        li_itemname.setToolTipText("");
        li_itemname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                li_itemnameMouseClicked(evt);
            }
        });
        sp_itemname.setViewportView(li_itemname);

        jPanel1.add(sp_itemname);
        sp_itemname.setBounds(300, 90, 260, 90);

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
        jScrollPane1.setBounds(300, 100, 680, 540);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("-");
        jPanel1.add(jButton12);
        jButton12.setBounds(1260, 200, 80, 80);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setText("*");
        jPanel1.add(jButton13);
        jButton13.setBounds(1260, 110, 80, 80);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("/");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(1260, 20, 80, 80);

        bt_number_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_9.setText("9");
        jPanel1.add(bt_number_9);
        bt_number_9.setBounds(1170, 20, 80, 80);

        tbl_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Total Payment"
            }
        ));
        jScrollPane2.setViewportView(tbl_invoice);
        if (tbl_invoice.getColumnModel().getColumnCount() > 0) {
            tbl_invoice.getColumnModel().getColumn(0).setMinWidth(100);
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
        tf_qty.setBounds(750, 50, 230, 40);

        tf_payment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(tf_payment);
        tf_payment.setBounds(1110, 560, 230, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Item Code:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 10, 260, 40);

        lb_available_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_available_qty.setText("Available");
        jPanel1.add(lb_available_qty);
        lb_available_qty.setBounds(580, 50, 160, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("0.00");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1110, 510, 230, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("0.00");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1110, 610, 230, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Bill Total:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(990, 510, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Payment:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(990, 560, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("0");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(140, 500, 150, 40);

        lb_item.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_item.setText("0");
        jPanel1.add(lb_item);
        lb_item.setBounds(1110, 460, 230, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("+");
        jPanel1.add(jButton2);
        jButton2.setBounds(1260, 290, 80, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Balance:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(990, 610, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Item Qty:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(990, 460, 120, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Tital Qty:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 550, 130, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("0");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(140, 550, 150, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Amount:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 600, 130, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("0.00");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(140, 600, 150, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Total Invoice:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 500, 130, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Qty:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(750, 10, 230, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Available Qty:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(580, 10, 160, 40);

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

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void tf_item_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyPressed


    }//GEN-LAST:event_tf_item_codeKeyPressed

    private void tf_item_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyReleased

        try {
            sp_itemname.setVisible(true);
            md_loadItemName();
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
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
                tf_item_code.grabFocus();
                tf_item_code.selectAll();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tf_qtyKeyReleased

    private void li_itemnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_li_itemnameMouseClicked

        try {
            md_loadTF_Item();
            sp_itemname.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_li_itemnameMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enter;
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
    private javax.swing.JButton bt_space;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_available_qty;
    private javax.swing.JLabel lb_item;
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
                    Logger.getLogger(jp_invoice.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(jp_invoice.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    DefaultTableModel dt = (DefaultTableModel) tbl_item.getModel();
                    while (rs_itemtable.next()) {
                        try {
                            Vector v = new Vector();
                            v.add(dt.getRowCount() + 1);
                            v.add(tf_item_code.getText());
                            v.add(rs_itemtable.getString("item_name"));
                            v.add(rs_itemtable.getDouble("selling_price"));
                            v.add(tf_qty.getText());
                            v.add(Double.parseDouble(rs_itemtable.getString("selling_price")) * Double.parseDouble(tf_qty.getText()));
                            dt.addRow(v);
                        } catch (SQLException ex) {
                            Logger.getLogger(jp_invoice.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jp_invoice.class.getName()).log(Level.SEVERE, null, ex);
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
                        rs_load_item_name = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_code LIKE '%" + tf_item_code.getText()+ "%'");
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
    public void md_keyPad(java.awt.event.KeyEvent evt){
        try {
            if(evt.getKeyCode() == KeyEvent.VK_1){
                addKeyListener((KeyListener) bt_number_1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //..............................Key pad - end................................................................

    //................................set available qty from label - start................................................
    public void md_setAvailableQty(){
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................................set available qty from label - end..................................................
}

