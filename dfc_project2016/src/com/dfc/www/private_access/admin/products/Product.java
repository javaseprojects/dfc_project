/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dfc.www.private_access.admin.products;


import java.sql.ResultSet;

/**
 *
 * @author Buwaneka
 */
public class Product extends javax.swing.JPanel {

    /**
     * Creates new form Test_Pannel
     */
    public Product() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuyingPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtItemcode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSellingPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        txtBuyingPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyingPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuyingPrice);
        txtBuyingPrice.setBounds(170, 340, 200, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Item Code :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 190, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Buying Price :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 340, 130, 40);

        txtPname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPname.setEnabled(false);
        txtPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPname);
        txtPname.setBounds(170, 240, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 40, 100, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sub Category" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 90, 200, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Product Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 240, 130, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Category" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(170, 40, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sub Category :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 90, 130, 40);

        txtItemcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtItemcode.setEnabled(false);
        txtItemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemcodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtItemcode);
        txtItemcode.setBounds(170, 190, 200, 40);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Sub Category", "Size", "Item Code", "Product name", "Unit Price", "Buying Price", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 20, 960, 460);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Size :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 140, 120, 40);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Size" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(170, 140, 200, 40);

        txtUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtUnitPrice);
        txtUnitPrice.setBounds(170, 290, 200, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Unit Price :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 290, 130, 40);

        txtSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellingPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtSellingPrice);
        txtSellingPrice.setBounds(170, 390, 200, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Selling Price :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 390, 130, 40);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(760, 200, 73, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Add");
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 440, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuyingPriceActionPerformed

    private void txtPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnameActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtItemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemcodeActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellingPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txtBuyingPrice;
    private javax.swing.JTextField txtItemcode;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
