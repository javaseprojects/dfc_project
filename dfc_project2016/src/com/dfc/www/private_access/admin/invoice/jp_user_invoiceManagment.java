/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.backend.jf_onScreenInvoiceKeyBoard;
import com.dfc.www.public_access.user_frontend.User_Home;
import com.fsc.www.db.MC_DB;
import java.awt.FlowLayout;
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

    KeyEvent mykeys;

    public jp_user_invoiceManagment() {
        initComponents();
        sp_itemname.setVisible(false);

        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                itemLOAD.setVisible(true);
                jp_submainPanel.add(itemLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_F1) {
                    jp_user_invoiceManagment.tf_item_code.grabFocus();
                    //JOptionPane.showMessageDialog(null, "F1 is pressed!");
                }
                if (ke.getKeyCode() == KeyEvent.VK_F3) {
                    jp_user_invoiceManagment.tf_payment.grabFocus();
                    //JOptionPane.showMessageDialog(null, "F1 is pressed!");
                }
            }
        });

    }
    String invoice_no = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jp_submainPanel = new javax.swing.JPanel();
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

        jp_submainPanel.setBackground(new java.awt.Color(239, 108, 0));
        jp_submainPanel.setMaximumSize(new java.awt.Dimension(310, 562));
        jp_submainPanel.setMinimumSize(new java.awt.Dimension(310, 562));

        javax.swing.GroupLayout jp_submainPanelLayout = new javax.swing.GroupLayout(jp_submainPanel);
        jp_submainPanel.setLayout(jp_submainPanelLayout);
        jp_submainPanelLayout.setHorizontalGroup(
            jp_submainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jp_submainPanelLayout.setVerticalGroup(
            jp_submainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel3.add(jp_submainPanel, "card2");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 580));

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setMaximumSize(new java.awt.Dimension(1020, 650));
        jPanel2.setMinimumSize(new java.awt.Dimension(1020, 650));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 650));
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/invoice4040.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/keyboard.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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


    }//GEN-LAST:event_jButton3MouseClicked
    jp_invoice_view_invoice invoiceLOAD = new jp_invoice_view_invoice();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Thread(() -> {
            try {

                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                invoiceLOAD.setVisible(true);
                jp_submainPanel.add(invoiceLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton2ActionPerformed
    jp_invoice_view_item itemLOAD = new jp_invoice_view_item();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                itemLOAD.setVisible(true);
                jp_submainPanel.add(itemLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed
    jp_invoice_view_keyboard keyboardLOAD = new jp_invoice_view_keyboard();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());
                keyboardLOAD.setVisible(true);
                jp_submainPanel.add(keyboardLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel jp_submainPanel;
    private javax.swing.JLabel lb_available_qty;
    private javax.swing.JLabel lb_bil_total;
    private javax.swing.JLabel lb_tot_item;
    private javax.swing.JList li_itemname;
    private javax.swing.JScrollPane sp_itemname;
    private javax.swing.JTable tbl_item;
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
