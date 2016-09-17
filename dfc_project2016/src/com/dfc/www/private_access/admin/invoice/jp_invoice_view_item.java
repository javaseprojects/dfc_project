/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.fsc.www.db.MC_DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepalsuranga
 */
public class jp_invoice_view_item extends javax.swing.JPanel {

    /**
     * Creates new form jp_invoice_view_item
     */
    public jp_invoice_view_item() {
        initComponents();
        new Thread(() -> {
            md_loadITEM();
        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tf_itemcode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        li_search = new javax.swing.JList<>();

        setBackground(new java.awt.Color(251, 140, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Code/Name:");

        tf_itemcode.setBackground(new java.awt.Color(250, 250, 250));
        tf_itemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_itemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_itemcodeActionPerformed(evt);
            }
        });
        tf_itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_itemcodeKeyReleased(evt);
            }
        });

        li_search.setBackground(new java.awt.Color(250, 250, 250));
        li_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        li_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(li_search);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_itemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_itemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_itemcodeActionPerformed
    ResultSet rs_itemCode;
    Vector v;
    DefaultTableModel dtm_itemLoad;
    private void tf_itemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_itemcodeKeyReleased

        if (!tf_itemcode.getText().isEmpty()) {
            if (jp_invoice_view_item.isDNumeric(tf_itemcode.getText().trim())) {
                try {
                    v = new Vector();
                    rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_code` LIKE '%"+tf_itemcode.getText().trim().toLowerCase()+"%';");
                    while (rs_itemCode.next()) {
                        String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");
                        v.add(sug);
                        li_search.setListData(v);
                    }
                    rs_itemCode.close();

                } catch (SQLException ex) {
                    Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    v = new Vector();
                    rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_name` LIKE '%"+tf_itemcode.getText().trim().toLowerCase()+"%';");
                    while (rs_itemCode.next()) {
                        String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");

                        v.add(sug);
                        li_search.setListData(v);
                    }
                    rs_itemCode.close();

                } catch (SQLException ex) {
                    Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            md_loadITEM();
        }


    }//GEN-LAST:event_tf_itemcodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> li_search;
    private javax.swing.JTextField tf_itemcode;
    // End of variables declaration//GEN-END:variables

    public static boolean isDNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private void md_loadITEM() {

        try {
            Vector v = new Vector();
            ResultSet rs_item = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM `item`");

            while (rs_item.next()) {
                String result = rs_item.getInt("item_code") + "-" + rs_item.getString("item_name");
                v.add(result);
            }
            li_search.setListData(v);
            rs_item.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
