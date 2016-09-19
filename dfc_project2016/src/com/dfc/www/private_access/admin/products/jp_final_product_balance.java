package com.dfc.www.private_access.admin.products;

import com.fsc.www.db.MC_DB;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;

public class jp_final_product_balance extends javax.swing.JPanel {

    String date;
    DefaultTableModel dtm;

    public jp_final_product_balance() {
        initComponents();
        CheckDate();
        JTextFieldDateEditor dt = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        dt.setEditable(false);
//        loadStockData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnupdate_pice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txt_itemcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_buyingprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_selling_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_new_buying_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_new_selling_price = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 618));

        jPanel1.setBackground(new java.awt.Color(230, 74, 25));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 60, 17);

        btnupdate_pice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnupdate_pice.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate_pice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        btnupdate_pice.setText("Update Price");
        btnupdate_pice.setEnabled(false);
        btnupdate_pice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnupdate_pice.setPreferredSize(new java.awt.Dimension(73, 50));
        btnupdate_pice.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        btnupdate_pice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate_piceActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate_pice);
        btnupdate_pice.setBounds(1000, 550, 300, 40);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Product name", "Unit Price", "Quantity Added", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 930, 500);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(30, 50, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Code :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(990, 110, 100, 17);

        txt_itemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_itemcodeKeyReleased(evt);
            }
        });
        jPanel1.add(txt_itemcode);
        txt_itemcode.setBounds(990, 140, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buying Price :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(990, 190, 100, 17);

        txt_buyingprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_buyingprice.setEnabled(false);
        jPanel1.add(txt_buyingprice);
        txt_buyingprice.setBounds(990, 220, 300, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selling Price :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(990, 270, 100, 17);

        txt_selling_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_selling_price.setEnabled(false);
        jPanel1.add(txt_selling_price);
        txt_selling_price.setBounds(990, 300, 300, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Buying Price :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(990, 360, 130, 17);

        txt_new_buying_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_new_buying_price.setEnabled(false);
        txt_new_buying_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_new_buying_priceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_new_buying_priceKeyTyped(evt);
            }
        });
        jPanel1.add(txt_new_buying_price);
        txt_new_buying_price.setBounds(990, 390, 300, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Selling Price :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(990, 440, 120, 17);

        txt_new_selling_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_new_selling_price.setEnabled(false);
        txt_new_selling_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_new_selling_priceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_new_selling_priceKeyTyped(evt);
            }
        });
        jPanel1.add(txt_new_selling_price);
        txt_new_selling_price.setBounds(990, 470, 300, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(73, 50));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 50, 300, 40);

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

    private void btnupdate_piceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate_piceActionPerformed

        if (!(txt_itemcode.getText().isEmpty() && txt_new_buying_price.getText().isEmpty() && txt_new_selling_price.getText().isEmpty())) {

            try {
                MC_DB.myConnection().createStatement().executeUpdate("UPDATE item SET buying_price='" + txt_new_buying_price.getText() + "',selling_price='" + txt_new_selling_price.getText() + "' WHERE item_code='" + txt_itemcode.getText() + "'");
                JOptionPane.showMessageDialog(this, "Product Prices updated successfully");
                txt_itemcode.setText("");
                txt_buyingprice.setText("");
                txt_new_buying_price.setText("");
                txt_new_selling_price.setText("");
                txt_selling_price.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid data to update", "Invalid Data Found", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnupdate_piceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String today = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        DefaultTableModel dtm_qty = (DefaultTableModel) tbl_product.getModel();
        dtm_qty.setRowCount(0);
        try {
            String dataQuery = "SELECT * FROM stock_log sl LEFT JOIN invoice_reg ir ON sl.`item_id`=ir.`item_id` LEFT JOIN item i ON i.`item_id`=ir.`item_id` WHERE sl.`stock_date`='" + today + "'";
            ResultSet rs = MC_DB.search_dataQuery(dataQuery);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("i.item_code"));
                v.add(rs.getString("i.item_name"));
                v.add(rs.getString("i.selling_price"));
                v.add(getSoldQty(rs.getString("i.item_code")) + getStockLogQty(rs.getString("i.item_code")));
                v.add(getStockLogQty(rs.getString("i.item_code")));
                dtm_qty.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_itemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemcodeKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_itemcode.getText().isEmpty()) {
                if (checkItemCode(txt_itemcode.getText())) {
                    loadItemPrices(txt_itemcode.getText());
                }

            }

        }


    }//GEN-LAST:event_txt_itemcodeKeyReleased

    private void txt_new_buying_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_new_buying_priceKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_new_selling_price.grabFocus();
        }

    }//GEN-LAST:event_txt_new_buying_priceKeyReleased

    private void txt_new_buying_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_new_buying_priceKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } else {
            btnupdate_pice.setEnabled(true);
        }


    }//GEN-LAST:event_txt_new_buying_priceKeyTyped

    private void txt_new_selling_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_new_selling_priceKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        } else {
            btnupdate_pice.setEnabled(true);
        }

    }//GEN-LAST:event_txt_new_selling_priceKeyTyped

    private void txt_new_selling_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_new_selling_priceKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!(txt_itemcode.getText().isEmpty() && txt_new_buying_price.getText().isEmpty() && txt_new_selling_price.getText().isEmpty())) {

                try {
                    MC_DB.myConnection().createStatement().executeUpdate("UPDATE item SET buying_price='" + txt_new_buying_price.getText() + "',selling_price='" + txt_new_selling_price.getText() + "' WHERE item_code='" + txt_itemcode.getText() + "'");
                    JOptionPane.showMessageDialog(this, "Product Prices updated successfully");
                    txt_itemcode.setText("");
                    txt_buyingprice.setText("");
                    txt_new_buying_price.setText("");
                    txt_new_selling_price.setText("");
                    txt_selling_price.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid data to update", "Invalid Data Found", JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_txt_new_selling_priceKeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange

        String today = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        DefaultTableModel dtm_qty = (DefaultTableModel) tbl_product.getModel();
        dtm_qty.setRowCount(0);
        try {
            String dataQuery = "SELECT * FROM stock_log sl LEFT JOIN invoice_reg ir ON sl.`item_id`=ir.`item_id` LEFT JOIN item i ON i.`item_id`=ir.`item_id` WHERE sl.`stock_date`='" + today + "'";
            ResultSet rs = MC_DB.search_dataQuery(dataQuery);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("i.item_code"));
                v.add(rs.getString("i.item_name"));
                v.add(rs.getString("i.selling_price"));
                v.add(getSoldQty(rs.getString("i.item_code")) + getStockLogQty(rs.getString("i.item_code")));
                v.add(getStockLogQty(rs.getString("i.item_code")));
                dtm_qty.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate_pice;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txt_buyingprice;
    private javax.swing.JTextField txt_itemcode;
    private javax.swing.JTextField txt_new_buying_price;
    private javax.swing.JTextField txt_new_selling_price;
    private javax.swing.JTextField txt_selling_price;
    // End of variables declaration//GEN-END:variables

    //load stock data
    private void loadStockData() {
        try {
            String dataQuery = "SELECT * FROM invoice_reg ir LEFT JOIN stock_log sl ON ir.`item_id`=sl.`item_id` WHERE sl.`stock_date`='';";
            ResultSet rs_load_stock = MC_DB.search_dataQuery(dataQuery);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //load stock data

    public void CheckDate() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        jDateChooser1.setDate(new Date());
    }

    private boolean checkItemCode(String ItemCode) {
        try {
            ResultSet rs = MC_DB.search_dataQuery("SELECT item_code FROM item WHERE item_code='" + ItemCode + "'");
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    private void loadItemPrices(String ItemCode) {
        try {
            ResultSet rs = MC_DB.search_dataQuery("SELECT buying_price,selling_price FROM item WHERE item_code='" + ItemCode + "'");
            if (rs.first()) {
                txt_buyingprice.setText(rs.getDouble("buying_price") + "0");
                txt_selling_price.setText(rs.getDouble("selling_price") + "0");
                txt_new_buying_price.setEnabled(true);
                txt_new_selling_price.setEnabled(true);
                txt_new_buying_price.grabFocus();
            } else {
                JOptionPane.showMessageDialog(this, "No Prices Found for this Item Code", "No data Found", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getSoldQty(String itemCode) {
        String today = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        try {
            String dataQuery = "SELECT SUM(ir.qty) AS sumSOLD FROM invoice i LEFT JOIN `invoice_reg` ir ON i.`invoice_id`=ir.`invoice_id` LEFT JOIN item it ON it.`item_id`=ir.`item_id` WHERE i.`invoice_date`='" + today + "' AND it.`item_code`='" + itemCode + "'";
            ResultSet rs = MC_DB.myConnection().createStatement().executeQuery(dataQuery);
            if (rs.next()) {
                return rs.getInt("sumSOLD");
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    private int getStockLogQty(String ItemCode) {
        String today = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        try {
            String dataQuery = "SELECT sl.qty FROM stock_log sl LEFT JOIN item i ON sl.`item_id`=i.`item_id` WHERE sl.`stock_date`='" + today + "' AND i.`item_code`='" + ItemCode + "'";
            ResultSet rs = MC_DB.search_dataQuery(dataQuery);
            if (rs.next()) {
                return rs.getInt("sl.qty");
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
