/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.public_access.user_frontend;

import com.fsc.www.db.MC_DB;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class jp_invoice_return_add extends javax.swing.JPanel {

    public jp_invoice_return_add() {
        initComponents();
        tbl_invoice.getSelectionModel().setSelectionInterval(0, 0);
//        tbl_invoice.requestFocusInWindow();

        tbl_invoice.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        tbl_invoice.getActionMap().put("Enter", null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_invoice_no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_return = new javax.swing.JTable();
        tf_item_code = new javax.swing.JTextField();
        tf_qty = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        });
        jScrollPane1.setViewportView(tbl_invoice);

        tbl_return.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Return Date", "Item Code", "Qty", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_return);

        tf_item_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Invoice No :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Code :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_invoice_no, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_item_code, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tf_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_invoice_no, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_item_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
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

        int col_item_code = 0;
        int col_item_qty = 2;

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tf_item_code.setText("");
            tf_qty.setText("");
            int column = 0;
            int row = tbl_invoice.getSelectedRow();
            System.out.println(tbl_invoice.getRowCount());

            System.out.println("Row = " + row);
            String code = tbl_invoice.getModel().getValueAt(row, col_item_code).toString();
            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
            tf_item_code.setText(code);
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            int row = tbl_invoice.getSelectedRow();
            System.out.println("Arrow up = " + tbl_invoice.getValueAt(row, col_item_code).toString());
            tf_item_code.setText(tbl_invoice.getValueAt(row, col_item_code).toString());
            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            int row = tbl_invoice.getSelectedRow();
            System.out.println("Arrow up = " + tbl_invoice.getValueAt(row, col_item_code).toString());
            tf_item_code.setText(tbl_invoice.getValueAt(row, col_item_code).toString());
            tf_qty.setText(tbl_invoice.getValueAt(row, col_item_qty).toString());
        }


    }//GEN-LAST:event_tbl_invoiceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_invoice;
    private javax.swing.JTable tbl_return;
    private javax.swing.JTextField tf_invoice_no;
    private javax.swing.JTextField tf_item_code;
    private javax.swing.JTextField tf_qty;
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
}
