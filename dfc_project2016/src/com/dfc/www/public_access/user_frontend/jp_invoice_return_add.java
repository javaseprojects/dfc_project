package com.dfc.www.public_access.user_frontend;

import com.dfc.www.private_access.admin.invoice.jp_user_invoiceManagment;
import com.fsc.www.db.MC_DB;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class jp_invoice_return_add extends javax.swing.JPanel {

    public jp_invoice_return_add() {
        initComponents();
        tf_invoice_no.grabFocus();
//        tbl_invoice.getSelectionModel().setSelectionInterval(0, 0);
//        tbl_invoice.requestFocusInWindow();

//        tbl_invoice.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
//        tbl_invoice.getActionMap().put("Enter", null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_invoice_no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(251, 140, 0));

        tf_invoice_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_invoice_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_invoice_noKeyReleased(evt);
            }
        });

        tbl_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Qty", "Unit Price", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_invoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_invoiceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_invoiceKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_invoice);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Invoice No :");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user_frontend/userLOG_btnBACK.png"))); // NOI18N
        jButton1.setText("Return Invoice");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_invoice_no, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_invoice_no)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_invoice_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_invoice_noKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!tf_invoice_no.getText().isEmpty()) {
                viewInvoiceData(tf_invoice_no.getText());
            }
        }

    }//GEN-LAST:event_tf_invoice_noKeyReleased

    private void tbl_invoiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_invoiceKeyReleased

//        int col_item_code = 0;
//        int col_item_qty = 2;
//
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            tf_item_code.setText("");
//            tf_qty.setText("");
//            int column = 0;
//            int row = tbl_invoice.getSelectedRow();
//            System.out.println(tbl_invoice.getRowCount());
//
//            System.out.println("Row = " + row);
//            String code = tbl_invoice.getModel().getValueAt(row, col_item_code).toString();
//            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
//            tf_item_code.setText(code);
//        }
//        if (evt.getKeyCode() == KeyEvent.VK_UP) {
//            int row = tbl_invoice.getSelectedRow();
//            System.out.println("Arrow up = " + tbl_invoice.getValueAt(row, col_item_code).toString());
//            tf_item_code.setText(tbl_invoice.getValueAt(row, col_item_code).toString());
//            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
//        }
//        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
//            int row = tbl_invoice.getSelectedRow();
//            System.out.println("Arrow up = " + tbl_invoice.getValueAt(row, col_item_code).toString());
//            tf_item_code.setText(tbl_invoice.getValueAt(row, col_item_code).toString());
//            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
//        }


    }//GEN-LAST:event_tbl_invoiceKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       if (checkInvoiceNo(tf_invoice_no.getText())) {
            returnInvoice(tf_invoice_no.getText());
        }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_invoiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_invoiceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_invoiceKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_invoice;
    private javax.swing.JTextField tf_invoice_no;
    // End of variables declaration//GEN-END:variables

    //view Invoice Data
    ResultSet rs_viewInvoices;

    private void viewInvoiceData(String invoiceNo) {
        DefaultTableModel dtm = (DefaultTableModel) tbl_invoice.getModel();
        dtm.setRowCount(0);
        try {
            String dataQuery = "SELECT * FROM invoice_reg ir LEFT JOIN invoice i ON ir.invoice_id=i.`invoice_id` LEFT JOIN item it ON it.`item_id`=ir.`item_id` WHERE i.`invoice_no`='"+invoiceNo+"'";
            rs_viewInvoices = MC_DB.search_dataQuery(dataQuery);
            while (rs_viewInvoices.next()) {
                Vector v = new Vector();
                v.add(rs_viewInvoices.getString("it.item_code"));
                v.add(rs_viewInvoices.getString("it.item_name"));
                v.add(rs_viewInvoices.getInt("ir.qty"));
                v.add(rs_viewInvoices.getDouble("ir.selling_price") + "0");
                v.add(rs_viewInvoices.getDouble("ir.total_price") + "0");
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //view Invoice Data
    private boolean checkInvoiceNo(String invoiceNo) {

        try {
            ResultSet rs = MC_DB.search_dataQuery("SELECT invoice_no FROM invoice WHERE invoice_no='" + invoiceNo + "'");
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

    private void returnInvoice(String invoiceNo) {
        if (checkInvoiceNo(invoiceNo)) {
            try {
                String dataQuery = "UPDATE invoice SET status='Deactive' WHERE invoice_no='" + invoiceNo + "'";
                MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                System.out.println("invoice status changed");
                InvoicecashBack(invoiceNo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void InvoicecashBack(String invoiceNo) {
        String cashDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String des = invoiceNo + "  Invoice cash refund by-" + User_Home.bt_main_userNameLOAD.getText();
        DefaultTableModel dtm =(DefaultTableModel)tbl_invoice.getModel();
        double bill_tot=0;
        
        
        for(int i=0;i<dtm.getRowCount();i++){
            bill_tot+=Double.parseDouble(dtm.getValueAt(i, 4).toString());
        }
        System.out.println(bill_tot);
        bill_tot = bill_tot * (-1);
        try {
            String dataQuery = "INSERT INTO cash_account(`cash_amount`,`cash_type`,`status`,`cash_date`,`description`) VALUES ('" + bill_tot + "','Invoice','1','" + cashDate + "','" + des + "')";
            MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
            JOptionPane.showMessageDialog(null, "Invoice Cash Refunded Successfully");
            dtm.setRowCount(0);
            tf_invoice_no.setText("");
            jp_user_invoiceManagment.lb_bil_total.setText("00.00");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
