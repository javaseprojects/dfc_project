/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.products;

import com.fsc.www.db.MC_DB;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buwaneka
 */
public class Product extends javax.swing.JPanel {

    int catid;
    int Subcatid;
    int Sizeid;

    String Id1;
    String Id2;
    String Id3;

    int CatidForsave;
    String NewItemCode;
    int Subid;

    /**
     * Creates new form Test_Pannel
     */
    public Product() {
        initComponents();
        load_Cat_to_Combobox();
        load_All_data_to_table();
        jButton2.setEnabled(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSellingPrice = new javax.swing.JTextField();
        txtBuyingPrice = new javax.swing.JTextField();
        txtPname = new javax.swing.JTextField();
        txtItemcode = new javax.swing.JTextField();
        jComboBox3_Size = new javax.swing.JComboBox();
        jComboBox1_SubCat = new javax.swing.JComboBox();
        jComboBox2_Cat = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 618));

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(null);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Sub Category", "Size", "Item Code", "Item name", "Buying Price", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 20, 1000, 580);

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));
        jPanel2.setPreferredSize(new java.awt.Dimension(744, 618));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sub Category :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 90, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Size :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 170, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Code :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 240, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 320, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buying Price :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 400, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selling Price :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 470, 130, 30);

        txtSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellingPriceActionPerformed(evt);
            }
        });
        txtSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSellingPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellingPriceKeyTyped(evt);
            }
        });
        jPanel2.add(txtSellingPrice);
        txtSellingPrice.setBounds(20, 500, 300, 40);

        txtBuyingPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyingPriceActionPerformed(evt);
            }
        });
        txtBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuyingPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuyingPriceKeyTyped(evt);
            }
        });
        jPanel2.add(txtBuyingPrice);
        txtBuyingPrice.setBounds(20, 430, 300, 40);

        txtPname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPname.setEnabled(false);
        txtPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtPname);
        txtPname.setBounds(20, 360, 300, 40);

        txtItemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemcode.setEnabled(false);
        txtItemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemcodeActionPerformed(evt);
            }
        });
        txtItemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemcodeKeyReleased(evt);
            }
        });
        jPanel2.add(txtItemcode);
        txtItemcode.setBounds(20, 280, 300, 40);

        jComboBox3_Size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox3_Size.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~Select Size~" }));
        jComboBox3_Size.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox3_Size.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox3_SizeMousePressed(evt);
            }
        });
        jComboBox3_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3_SizeActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3_Size);
        jComboBox3_Size.setBounds(20, 200, 300, 40);

        jComboBox1_SubCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1_SubCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~Select Sub Category~" }));
        jComboBox1_SubCat.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox1_SubCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_SubCatActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1_SubCat);
        jComboBox1_SubCat.setBounds(20, 130, 300, 40);

        jComboBox2_Cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2_Cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~Select Category~" }));
        jComboBox2_Cat.setPreferredSize(new java.awt.Dimension(56, 50));
        jComboBox2_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2_CatActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2_Cat);
        jComboBox2_Cat.setBounds(20, 50, 300, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 560, 300, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 620);

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

    private void txtBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuyingPriceActionPerformed

    private void txtPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnameActionPerformed

    private void jComboBox1_SubCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_SubCatActionPerformed

        try {
            jComboBox3_Size.setSelectedIndex(0);
            txtItemcode.setText("");
            txtPname.setText("");
            txtBuyingPrice.setText("");
            txtSellingPrice.setText("");

            if (!jComboBox2_Cat.getSelectedItem().equals("~Select Category~")) {

                new Thread(() -> {

                    try {

                        ResultSet rs2 = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM sub_category WHERE sub_category ='" + jComboBox1_SubCat.getSelectedItem() + "' ");
                        while (rs2.next()) {
                            Subcatid = Integer.parseInt(rs2.getString("sub_cat_id"));
                            Id2 = "" + Subcatid;
                        }
                        if (Subcatid < 10) {
                            Id2 = "0" + Subcatid;

                        }

                        if (!jComboBox3_Size.isEnabled()) {
                            Id3 = "00";
                            txtItemcode.setText(Id1 + "" + Id2 + "" + Id3);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }).start();

            }

///////////////////////////////////////////////////////////
            if (!jComboBox2_Cat.getSelectedItem().equals("~Select category~")
                    && !jComboBox1_SubCat.getSelectedItem().equals("~Select Sub category~")) {
                txtPname.setText("");
                String scat = jComboBox1_SubCat.getSelectedItem().toString();
                String cat = jComboBox2_Cat.getSelectedItem().toString();

                txtPname.setText(scat + " " + cat);

            }

            ///////////////////////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (jComboBox1_SubCat.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (jComboBox1_SubCat.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }

        } catch (NullPointerException n) {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jComboBox1_SubCatActionPerformed

    private void jComboBox2_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2_CatActionPerformed
        try {
            String a = "";
            txtItemcode.setText("");
            txtPname.setText("");
            txtBuyingPrice.setText("");
            txtSellingPrice.setText("");

            if (!jComboBox2_Cat.getSelectedItem().equals("~Select category~")) {

                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT category_id FROM category WHERE category_name= '" + jComboBox2_Cat.getSelectedItem() + "' ");
                while (rs.next()) {
                    a = rs.getString("category_id");
                }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_category FROM sub_category WHERE category_id = '" + a + "' ");
                DefaultComboBoxModel dcm = (DefaultComboBoxModel) jComboBox1_SubCat.getModel();
                dcm.removeAllElements();
                dcm.addElement("~Select Sub category~");
                while (rs1.next()) {

                    dcm.addElement(rs1.getString("sub_category"));
                }

                if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                    jComboBox3_Size.setSelectedIndex(0);
                    jComboBox3_Size.setEnabled(false);
                } else {
                    jComboBox3_Size.setEnabled(true);
                    load_Size_to_combobox();

                }

            } else {
                jComboBox1_SubCat.setSelectedIndex(0);
                jComboBox3_Size.setSelectedIndex(0);
                txtItemcode.setText("");
            }
////////////////////////////////////////////////////////////////////////////////////////
            if (!jComboBox2_Cat.getSelectedItem().equals("~Select Category~")) {

                new Thread(() -> {

                    try {

                        ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM category WHERE category_name ='" + jComboBox2_Cat.getSelectedItem() + "'  ");
                        while (rs1.next()) {
                            catid = Integer.parseInt(rs1.getString("category_id"));
                            Id1 = "" + catid;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }).start();

            }

            ///////////////////////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (jComboBox2_Cat.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (jComboBox2_Cat.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2_CatActionPerformed

    private void txtItemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemcodeActionPerformed

    private void jComboBox3_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3_SizeActionPerformed
        try {
            txtItemcode.setText("");
            txtPname.setText("");
            txtBuyingPrice.setText("");
            txtSellingPrice.setText("");

            if (!jComboBox2_Cat.getSelectedItem().equals("~Select category~")
                    && !jComboBox1_SubCat.getSelectedItem().equals("~Select Sub category~")
                    && !jComboBox3_Size.getSelectedItem().equals("~Select Size~")) {
                txtPname.setText("");
                String Size = jComboBox3_Size.getSelectedItem().toString();
                String scat = jComboBox1_SubCat.getSelectedItem().toString();
                String cat = jComboBox2_Cat.getSelectedItem().toString();

                txtPname.setText(Size + " " + scat + " " + cat);

            }
/////////////////////////////////////////////////////////////////////////////////////////////

            new Thread(() -> {
                try {

                    if (!jComboBox3_Size.getSelectedItem().equals("~Select Size~")) {

                        ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT idsize FROM size WHERE size = '" + jComboBox3_Size.getSelectedItem() + "' ");

                        while (rs.next()) {
                            Sizeid = Integer.parseInt(rs.getString("idsize"));
                            Id3 = "" + Sizeid;
                        }

                        if (Sizeid < 10) {
                            Id3 = "0" + Id3;

                        }

                        txtItemcode.setText(Id1 + "" + Id2 + "" + Id3);

                    } else {

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();
            ///////////////////////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (jComboBox1_SubCat.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (jComboBox3_Size.getSelectedIndex() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }

        } catch (NullPointerException n) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox3_SizeActionPerformed

    private void txtSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellingPriceActionPerformed

    private void txtBuyingPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuyingPriceKeyReleased

        try {

///////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (txtBuyingPrice.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (txtBuyingPrice.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }

            if (evt.getKeyCode() == 10) {
                txtSellingPrice.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtBuyingPriceKeyReleased

    private void txtSellingPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceKeyReleased

        try {
            ///////////////////////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (txtSellingPrice.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (txtSellingPrice.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }
            if (evt.getKeyCode() == 10) {
                jButton2.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSellingPriceKeyReleased

    private void txtItemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemcodeKeyReleased
        try {
            ///////////////////////////////Button Validation/////////////////////////////////////////////////////
            if (jComboBox2_Cat.getSelectedItem().equals("Pastry")) {

                if (txtItemcode.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            } else {

                if (txtItemcode.getText().length() == 0) {
                    jButton2.setEnabled(false);
                } else {

                    if (jComboBox2_Cat.getSelectedIndex() != 0
                            && jComboBox1_SubCat.getSelectedIndex() != 0
                            && jComboBox3_Size.getSelectedIndex() != 0
                            && txtItemcode.getText().length() != 0
                            && txtBuyingPrice.getText().length() != 0
                            && txtSellingPrice.getText().length() != 0) {
                        jButton2.setEnabled(true);

                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtItemcodeKeyReleased

    private void txtBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuyingPriceKeyTyped

        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {

                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtBuyingPriceKeyTyped

    private void txtSellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceKeyTyped

        try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {

                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSellingPriceKeyTyped

    private void jComboBox3_SizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3_SizeMousePressed

    }//GEN-LAST:event_jComboBox3_SizeMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            int i = 0;
            ////cheack Already available or Not
            ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT item_name FROM item WHERE item_name = '" + txtPname.getText() + "' ");
            while (rs1.next()) {
                i = 1;

            }

            if (i == 0) {

                new Thread(() -> {

                    try {

                        ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM category WHERE category_name = '" + jComboBox2_Cat.getSelectedItem() + "' ");
                        while (rs.next()) {
                            CatidForsave = Integer.parseInt(rs.getString("category_id"));
                        }
                        /////////////////////////////////////////////////////////////////////////////////////
                        MC_DB.myConnection().createStatement().executeUpdate("INSERT INTO item(category_id,item_code,item_name,buying_price,selling_price,status)VALUES('" + CatidForsave + "' "
                            + ", '" + txtItemcode.getText() + "' "
                            + ", '" + txtPname.getText() + "' "
                            + ", '" + Double.parseDouble(txtBuyingPrice.getText()) + "' "
                            + ", '" + Double.parseDouble(txtSellingPrice.getText()) + "' ,'" + "0001" + "')");

                        /////////////////////////data Save to item_has_size table ////////
                        // if (!jComboBox3_Size.getSelectedItem().equals("~Select Size~")) {
                            int itemid = 0;
                            int Sizeid = 0;

                            //Get Item Id
                            ResultSet rss = MC_DB.myConnection().createStatement().executeQuery("SELECT item_id FROM item WHERE item_code= '" + txtItemcode.getText() + "' ");

                            while (rss.next()) {
                                itemid = Integer.parseInt(rss.getString("item_id"));
                            }

                            //Get Size Id
                            if (!jComboBox3_Size.getSelectedItem().equals("~Select Size~")) {
                                ResultSet rss1 = MC_DB.myConnection().createStatement().executeQuery("SELECT idsize FROM size WHERE size= '" + jComboBox3_Size.getSelectedItem() + "' ");

                                while (rss1.next()) {
                                    Sizeid = Integer.parseInt(rss1.getString("idsize"));
                                }

                                //Save item_has_size table
                                MC_DB.myConnection().createStatement().executeUpdate("INSERT INTO item_has_size(item_id,idsize)VALUES('" + itemid + "', '" + Sizeid + "')");
                            }

                            ResultSet rss2 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_cat_id FROM sub_category WHERE sub_category= '" + jComboBox1_SubCat.getSelectedItem() + "' ");

                            while (rss2.next()) {
                                Subid = Integer.parseInt(rss2.getString("sub_cat_id"));

                                MC_DB.myConnection().createStatement().executeUpdate("INSERT INTO item_has_sub_category(item_id,sub_cat_id)VALUES('" + itemid + "','" + Subcatid + "')");
                            }

                            // }
                        jComboBox2_Cat.setSelectedItem("~Select Category~");
                        jComboBox1_SubCat.setSelectedItem("~Select Sub Category~");
                        jComboBox3_Size.setSelectedItem("~Select Size~");
                        txtItemcode.setText("");
                        txtPname.setText("");
                        txtBuyingPrice.setText("");
                        txtSellingPrice.setText("");
                        jButton2.setEnabled(false);

                        JOptionPane.showMessageDialog(this, "Saved");
                        load_All_data_to_table();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }).start();

            } else if (i == 1) {
                JOptionPane.showMessageDialog(this, "Sorry This Item is Already Available.!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1_SubCat;
    private javax.swing.JComboBox jComboBox2_Cat;
    private javax.swing.JComboBox jComboBox3_Size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txtBuyingPrice;
    private javax.swing.JTextField txtItemcode;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtSellingPrice;
    // End of variables declaration//GEN-END:variables

    void load_Cat_to_Combobox() {

        new Thread(() -> {

            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT category_name FROM category");
                DefaultComboBoxModel dcm = (DefaultComboBoxModel) jComboBox2_Cat.getModel();

                while (rs.next()) {
                    dcm.addElement((rs.getString("category_name")));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }
    //////////////////////////////////////////////////////////////////////////////////////

    void load_subcat_to_combobox() {

        new Thread(() -> {

            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_category FROM sub_category");
                DefaultComboBoxModel dcm = (DefaultComboBoxModel) jComboBox1_SubCat.getModel();

                while (rs.next()) {
                    dcm.addElement((rs.getString("sub_category")));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }

    void load_Size_to_combobox() {

        new Thread(() -> {

            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT size FROM size");
                DefaultComboBoxModel dcm = (DefaultComboBoxModel) jComboBox3_Size.getModel();
                dcm.removeAllElements();
                dcm.addElement("~Select Size~");
                while (rs.next()) {
                    dcm.addElement((rs.getString("size")));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }
/////////////////////////////////////////////////////

    void load_All_data_to_table() {

        new Thread(() -> {
            try {

                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item");
                DefaultTableModel dtm = (DefaultTableModel) tbl_product.getModel();
//Load Category Name
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    ResultSet rs_For_cat = MC_DB.myConnection().createStatement().executeQuery("SELECT category_name FROM category WHERE category_id = '" + Integer.parseInt(rs.getString("category_id")) + "' ");
                    while (rs_For_cat.next()) {
                        String category = rs_For_cat.getString("category_name");
                        v.add(rs_For_cat.getString("category_name"));

                    }

///////////////////Load Category                
                    ResultSet rs123 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_cat_id FROM item_has_sub_category WHERE item_id = '" + rs.getString("Item_id") + "' ");
                    while (rs123.next()) {

                        ResultSet rs1234 = MC_DB.myConnection().createStatement().executeQuery("SELECT sub_category FROM sub_category WHERE sub_cat_id =  '" + rs123.getString("sub_cat_id") + "' ");
                        while (rs1234.next()) {
                            v.add(rs1234.getString("sub_category"));
                        }

                    }

//////////////////////////////////////////Load Size
                    ResultSet rs_For_Size = MC_DB.myConnection().createStatement().executeQuery("SELECT idsize FROM item_has_size WHERE item_id = '" + Integer.parseInt(rs.getString("item_id")) + "' ");

                    if (rs_For_Size.next()) {

                        ResultSet s = MC_DB.myConnection().createStatement().executeQuery("SELECT size FROM size WHERE idsize = '" + Integer.parseInt(rs_For_Size.getString("idsize")) + "' ");

                        while (s.next()) {
                            v.add(s.getString("size"));
                        }

                    } else {

                        if (!rs_For_Size.next()) {
                            v.add("No Size");
                        }

                    }
// Load Other Deatils
                    v.add(rs.getString("item_code"));
                    v.add(rs.getString("item_name"));
                    v.add(rs.getString("buying_price"));
                    v.add(rs.getString("selling_price"));

                    dtm.addRow(v);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }

}
