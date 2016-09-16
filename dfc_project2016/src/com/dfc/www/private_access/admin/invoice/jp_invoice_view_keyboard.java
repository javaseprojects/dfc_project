/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.backend.jf_onScreenInvoiceKeyBoard;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepalsuranga
 */
public class jp_invoice_view_keyboard extends javax.swing.JPanel {

    /**
     * Creates new form jp_invoice_view_keyboard
     */
    public jp_invoice_view_keyboard() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(251, 140, 0));

        bt_number_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_7.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_7.setText("7");
        bt_number_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_7.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_7.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_7.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_7ActionPerformed(evt);
            }
        });

        bt_number_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_8.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_8.setText("8");
        bt_number_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_8.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_8.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_8.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_8ActionPerformed(evt);
            }
        });

        bt_number_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_9.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_9.setText("9");
        bt_number_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_9.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_9.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_9.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_9ActionPerformed(evt);
            }
        });

        bt_divide.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_divide.setForeground(new java.awt.Color(255, 87, 34));
        bt_divide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_divide.setText("/");
        bt_divide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_divide.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_divide.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_divide.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_divideActionPerformed(evt);
            }
        });

        bt_multi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_multi.setForeground(new java.awt.Color(255, 87, 34));
        bt_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_multi.setText("*");
        bt_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_multi.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_multi.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_multi.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiActionPerformed(evt);
            }
        });

        bt_number_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_6.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_6.setText("6");
        bt_number_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_6.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_6.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_6.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_6ActionPerformed(evt);
            }
        });

        bt_number_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_5.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_5.setText("5");
        bt_number_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_5ActionPerformed(evt);
            }
        });

        bt_number_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_4.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_4.setText("4");
        bt_number_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_4.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_4.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_4.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_4ActionPerformed(evt);
            }
        });

        bt_number_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_1.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_1.setText("1");
        bt_number_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_1.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_1.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_1.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_1ActionPerformed(evt);
            }
        });

        bt_number_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_2.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_2.setText("2");
        bt_number_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_2.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_2.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_2.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_2ActionPerformed(evt);
            }
        });

        bt_number_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_3.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_3.setText("3");
        bt_number_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_3.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_3.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_3.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_3ActionPerformed(evt);
            }
        });

        bt_substract.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_substract.setForeground(new java.awt.Color(255, 87, 34));
        bt_substract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_substract.setText("-");
        bt_substract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_substract.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_substract.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_substract.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_substract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_substractActionPerformed(evt);
            }
        });

        bt_plus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_plus.setForeground(new java.awt.Color(255, 87, 34));
        bt_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard_space.png"))); // NOI18N
        bt_plus.setText("+");
        bt_plus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plusActionPerformed(evt);
            }
        });

        bt_enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard_enter.png"))); // NOI18N
        bt_enter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_enter.setMinimumSize(new java.awt.Dimension(70, 150));
        bt_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enterActionPerformed(evt);
            }
        });

        bt_number_0.setBackground(new java.awt.Color(51, 51, 51));
        bt_number_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_number_0.setForeground(new java.awt.Color(255, 87, 34));
        bt_number_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard.png"))); // NOI18N
        bt_number_0.setText("0");
        bt_number_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_number_0.setMaximumSize(new java.awt.Dimension(70, 70));
        bt_number_0.setMinimumSize(new java.awt.Dimension(70, 70));
        bt_number_0.setPreferredSize(new java.awt.Dimension(70, 70));
        bt_number_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_number_0ActionPerformed(evt);
            }
        });

        bt_space.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_space.setForeground(new java.awt.Color(255, 87, 34));
        bt_space.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/versualKeyboard_space.png"))); // NOI18N
        bt_space.setText("Space");
        bt_space.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_spaceActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/vt90.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/keyboard.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_number_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_number_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_number_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_number_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_number_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_number_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_number_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_number_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_number_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_space, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_substract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(9, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_number_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_number_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_number_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_number_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_number_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_number_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_substract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_number_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_space, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(bt_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void bt_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_divideActionPerformed

        try {
            bt_divide.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_DIVIDE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_divideActionPerformed

    private void bt_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiActionPerformed

        try {
            bt_multi.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_MULTIPLY);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_multiActionPerformed

    private void bt_number_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_6ActionPerformed

        try {
            bt_number_6.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_6);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_number_6ActionPerformed

    private void bt_number_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_5ActionPerformed

        try {
            bt_number_5.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_5);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_number_5ActionPerformed

    private void bt_number_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_number_4ActionPerformed

        try {
            bt_number_4.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_4);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_number_4ActionPerformed

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

    private void bt_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enterActionPerformed

        try {
            bt_enter.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_ENTER);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_enterActionPerformed

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

    private void bt_spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_spaceActionPerformed

        try {
            bt_space.setFocusable(false);
            new Robot().keyPress(KeyEvent.VK_SPACE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bt_spaceActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        try {
            Runtime.getRuntime().exec("c:\\windows\\system32\\osk.exe");
        } catch (IOException ex) {
            Logger.getLogger(jf_onScreenInvoiceKeyBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered

        jLabel2.setToolTipText("On Screen Keyboard!");

    }//GEN-LAST:event_jLabel2MouseEntered


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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
