package com.dfc.www.private_access.admin.products;

import com.fsc.www.db.MC_DB;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buwaneka
 */
public class jp_add_daily_qty extends javax.swing.JPanel {

    String date;

    int ItemId;

    public jp_add_daily_qty() {
        initComponents();
        CheckDate();
        load_Stock_Log();
        loadAllItems();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPname = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        setDate_Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_allproducts = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(null);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Product name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 20, 590, 580);

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Code :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 30, 100, 20);

        txtItemCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCodeActionPerformed(evt);
            }
        });
        txtItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyTyped(evt);
            }
        });
        jPanel2.add(txtItemCode);
        txtItemCode.setBounds(20, 60, 300, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 110, 130, 20);

        txtPname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPname.setEnabled(false);
        txtPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnameActionPerformed(evt);
            }
        });
        txtPname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPnameKeyReleased(evt);
            }
        });
        jPanel2.add(txtPname);
        txtPname.setBounds(20, 140, 300, 40);

        txtQty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyKeyTyped(evt);
            }
        });
        jPanel2.add(txtQty);
        txtQty.setBounds(20, 220, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 190, 130, 20);

        setDate_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setDate_Label.setForeground(new java.awt.Color(255, 255, 255));
        setDate_Label.setText("2016-07-02");
        jPanel2.add(setDate_Label);
        setDate_Label.setBounds(20, 300, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 270, 120, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton2.setText("Add Quantity");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(73, 50));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 350, 300, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 620);

        tbl_allproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_allproducts);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(962, 20, 390, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    void CheckDate() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        setDate_Label.setText(date);
    }


    private void txtPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnameActionPerformed

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!(txtItemCode.getText().isEmpty() && txtPname.getText().isEmpty() && txtQty.getText().isEmpty())) {
            if (this.ItemId != 0) {
                if (checkDailyQtyAdded() == 0 && Integer.parseInt(txtQty.getText())!=0) {
                    try {
                        int itemid = this.ItemId;
                        String dataQuery = "INSERT INTO `safenets_dfcdata`.`stock_log`(`item_id`,`qty`,`stock_date`)VALUES ('" + itemid + "','" + Integer.parseInt(txtQty.getText()) + "','" + setDate_Label.getText() + "')";
                        MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                        JOptionPane.showMessageDialog(this, "Quantity Successfully Added to Stock");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (checkDailyQtyAdded() != 0) {
                    if (getCurrentStock(checkDailyQtyAdded()) != 0) {
                        try {
                            int currentQty = getCurrentStock(checkDailyQtyAdded());
                            int new_qty = currentQty + Integer.parseInt(txtQty.getText());
                            String dataQuery = "UPDATE `stock_log` SET `qty` = '" + new_qty + "' WHERE `stock_log_id` = '" + checkDailyQtyAdded() + "' AND stock_date='" + setDate_Label.getText() + "'";
                            MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                            JOptionPane.showMessageDialog(this, "Quantity Successfully Updated in Stock");
                            ClearAndLoadData();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtItemCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyTyped


    }//GEN-LAST:event_txtItemCodeKeyTyped

    private void txtItemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtItemCode.getText().isEmpty()) {
                try {
                    new Thread(() -> {
                        try {
                            ResultSet rs = MC_DB.search_dataQuery("SELECT item_name,item_id FROM item WHERE item_code='" + txtItemCode.getText() + "'");
                            if (rs.next()) {
                                txtPname.setText(rs.getString(1));
                                this.ItemId = rs.getInt(2);
                                txtQty.grabFocus();
                            } else {
                                JOptionPane.showMessageDialog(this, "No item Found for this Number,Please check again", "Invalid Data", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }).start();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

//        try {
//
//            //Button Validation
//            if (txtItemCode.getText().length() == 0) {
//                jButton2.setEnabled(false);
//            } else {
//                if (txtItemCode.getText().length() != 0
//                        && txtPname.getText().length() != 0
//                        && txtQty.getText().length() != 0) {
//
//                    jButton2.setEnabled(true);
//                }
//
//            }
//
//            new Thread(() -> {
//
//                try {
//
//                    String Item_Name = "";
//                    int i = 0;
//
//                    if (evt.getKeyCode() == 10) {
//                        String catid;
//
///// Load Item Name to item Name Text Filed
//                        ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT item_name FROM item WHERE item_code = '" + txtItemCode.getText() + "' ");
//                        while (rs.next()) {
//                            i = 1;
//                            Item_Name = rs.getString("item_name");
//                        }
//
//                        if (i == 1) {
//                            txtPname.setText(Item_Name);
//
//                            ResultSet rs2 = MC_DB.myConnection().createStatement().executeQuery("SELECT item_id FROM item WHERE item_code = '" + txtItemCode.getText() + "' ");
//
//                            while (rs2.next()) {
//
//                                ItemId_set = Integer.parseInt(rs2.getString("item_id"));
//                            }
//
//                            ResultSet cheack_date_Id = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM stock_log WHERE stock_date = '" + setDate_Label.getText() + "' && item_id =  '" + ItemId_set + "'  ");
//                            DefaultTableModel dtm = (DefaultTableModel) tbl_product.getModel();
//                            dtm.setRowCount(0);
//                            while (cheack_date_Id.next()) {
//                                Vector v = new Vector();
//                                String IID = cheack_date_Id.getString("Item_id");
//                                System.out.println(IID);
//
//                                String catid3 = "";
//                                //////
//                                ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_id = '" + IID + "' ");
//                                while (rs1.next()) {
//
//                                    v.add(rs1.getString("item_code"));
//                                    v.add(rs1.getString("item_name"));
//                                    catid3 = rs1.getString("category_id");
////
//                                }
//
//                                ResultSet rs12 = MC_DB.myConnection().createStatement().executeQuery("SELECT category_name FROM category WHERE category_id = '" + catid3 + "' ");
//                                while (rs12.next()) {
//                                    v.add(rs12.getString("category_name"));
//                                }
//
//                                ResultSet rs13 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_cat_id FROM item_has_sub_category WHERE item_id = '" + IID + "' ");
//                                while (rs13.next()) {
//                                    ///Get Sub cat name By Using Loaded Sub cat id   
//                                    ResultSet rs14 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_category FROM sub_category WHERE sub_cat_id= '" + rs13.getString("sub_cat_id") + "' ");
//                                    while (rs14.next()) {
//                                        v.add(rs14.getString("sub_category"));
//                                    }
//
//                                }
//
//                                v.add(cheack_date_Id.getString("qty"));
//                                dtm.addRow(v);
//
//                            }
//
//                        } else {
//
//                            jButton2.setEnabled(false);
//                            txtPname.setText("");
//                            txtQty.setText("");
//                            txtItemCode.setText("");
//                            JOptionPane.showMessageDialog(this, "Sorry Item Code Is Invalide");
//                        }
//                        txtQty.grabFocus();
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }).start();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_txtItemCodeKeyReleased

    private void txtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyTyped

        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtQtyKeyTyped

    private void txtPnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnameKeyReleased


    }//GEN-LAST:event_txtPnameKeyReleased

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }

//       

    }//GEN-LAST:event_txtQtyKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel setDate_Label;
    private javax.swing.JTable tbl_allproducts;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    ResultSet load_Stock_Log;

    private void load_Stock_Log() {

        DefaultTableModel dtm = (DefaultTableModel) tbl_product.getModel();
        dtm.setRowCount(0);

        try {
            new Thread(() -> {
                try {
                    load_Stock_Log = MC_DB.search_dataQuery("SELECT i.`item_code`,i.`item_name`,s.`qty` FROM item i LEFT JOIN `stock_log` s ON i.`item_id`=s.`item_id` WHERE stock_date='" + setDate_Label.getText() + "'");
                    while (load_Stock_Log.next()) {
                        Vector v = new Vector();
                        v.add(load_Stock_Log.getString(1));
                        v.add(load_Stock_Log.getString(2));
                        v.add(load_Stock_Log.getString(3));
                        dtm.addRow(v);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    void Data_Load_Table() {
//        try {
//            new Thread(() -> {
//
//                try {
//
//                    ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM stock_log WHERE stock_date = '" + setDate_Label.getText() + "'  order by stock_log_id desc ");
//                    DefaultTableModel dtm = (DefaultTableModel) tbl_product.getModel();
//                    dtm.setRowCount(0);
//                    String catid = "";
//                    while (rs.next()) {
//
//                        Vector v = new Vector();
//
///////////////////Load Item Code,Item Name
//                        ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_id = '" + rs.getString("item_id") + "' ");
//                        while (rs1.next()) {
//
//                            v.add(rs1.getString("item_code"));
//                            v.add(rs1.getString("item_name"));
//                            catid = rs1.getString("category_id");
//
//                        }
///////////////////Load Category
//                        ResultSet rs12 = MC_DB.myConnection().createStatement().executeQuery("SELECT category_name FROM category WHERE category_id = '" + catid + "' ");
//                        while (rs12.next()) {
//                            v.add(rs12.getString("category_name"));
//                        }
/////////////////////Load Sub Category                        
//
//                        ResultSet rs13 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_cat_id FROM item_has_sub_category WHERE item_id = '" + rs.getString("item_id") + "' ");
//                        System.out.println(rs.getString("item_id"));
//                        while (rs13.next()) {
//                            ///Get Sub cat name By Using Loaded Sub cat id   
//                            ResultSet rs14 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_category FROM sub_category WHERE sub_cat_id= '" + rs13.getString("sub_cat_id") + "' ");
//                            while (rs14.next()) {
//                                v.add(rs14.getString("sub_category"));
//                            }
//
//                        }
//
//                        v.add(rs.getString("qty"));
//                        dtm.addRow(v);
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }).start();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    ResultSet rs_load_item = null;

    private void loadAllItems() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_allproducts.getModel();
        dtm.setRowCount(0);

        try {
            new Thread(() -> {
                rs_load_item = MC_DB.search_dataQuery("SELECT * FROM item");

                try {
                    while (rs_load_item.next()) {
                        Vector v = new Vector();
                        v.add(rs_load_item.getInt("item_code"));
                        v.add(rs_load_item.getString("item_name"));
                        System.out.println(rs_load_item.getInt("item_code"));
                        dtm.addRow(v);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(jp_add_daily_qty.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int checkDailyQtyAdded() {
        System.out.println("checkDailyQtyAdded()");
        try {
            int itemid = this.ItemId;
            ResultSet rs = MC_DB.search_dataQuery("SELECT * FROM stock_log WHERE stock_date='" + setDate_Label.getText() + "' AND item_id='" + itemid + "'");
            if (rs.next()) {
                return rs.getInt("stock_log_id");
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    private void ClearAndLoadData() {
        txtItemCode.setText("");
        txtPname.setText("");
        txtQty.setText("");
        txtItemCode.grabFocus();
        load_Stock_Log();
        this.ItemId = 0;
    }

    private int getCurrentStock(int stock_id) {
        try {
            ResultSet rs = MC_DB.search_dataQuery("SELECT qty FROM stock_log WHERE stock_log_id='" + stock_id + "'");
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
