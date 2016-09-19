package com.dfc.www.public_access.user_frontend;

import com.dfc.www.private_access.admin.backend.jf_backend_index;
import com.dfc.www.private_access.admin.backup.AccessDenied_backupAndRestore;
import com.dfc.www.private_access.admin.invoice.jp_user_invoiceManagment;
import com.dfc.www.private_access.admin.products.jp_add_daily_qty;
import com.fsc.www.db.SendAttachmentInEmail;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class User_Home extends javax.swing.JFrame {

    jp_user_invoiceManagment invoiceMng = new jp_user_invoiceManagment();
    jp_add_daily_qty add_daily = new jp_add_daily_qty();
    jp_invoice_return_add returns = new jp_invoice_return_add();

    public User_Home() {
        initComponents();
        showDate();
        showTime();

        new Thread(() -> {
            try {

                Thread.sleep(3000);
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                invoiceMng.setVisible(true);
                jp_userMainPanel.add(invoiceMng);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void showDate() {
        Date ds = new Date();
        SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdfs.format(ds);
        lb_v_date.setText(s);
        System.out.println(s);

    }

    public User_Home(String email) {
        initComponents();
        showDate();
        showTime();
        new Thread(() -> {
            try {
                Thread.sleep(3000);
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                invoiceMng.setVisible(true);
                jp_userMainPanel.add(invoiceMng);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        jf_backend_index.us_fullname = email;
        try {
            bt_main_userNameLOAD.setText("");
            bt_main_userNameLOAD.setText(email);

        } catch (Exception e) {
            e.printStackTrace();
        }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_v_date = new javax.swing.JLabel();
        bt_main_userNameLOAD = new javax.swing.JButton();
        jp_userMainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lb_v_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 20, 24));

        lb_v_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_v_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_v_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_v_date.setText("Show Date");

        bt_main_userNameLOAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_main_userNameLOAD.setForeground(new java.awt.Color(255, 255, 255));
        bt_main_userNameLOAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user_frontend/userLOG_btnBACK.png"))); // NOI18N
        bt_main_userNameLOAD.setText("MY ACCOUNT");
        bt_main_userNameLOAD.setBorderPainted(false);
        bt_main_userNameLOAD.setContentAreaFilled(false);
        bt_main_userNameLOAD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_main_userNameLOAD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_main_userNameLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_main_userNameLOADActionPerformed(evt);
            }
        });

        jp_userMainPanel.setBackground(new java.awt.Color(51, 51, 51));
        jp_userMainPanel.setMaximumSize(new java.awt.Dimension(1366, 670));
        jp_userMainPanel.setMinimumSize(new java.awt.Dimension(1366, 670));
        jp_userMainPanel.setPreferredSize(new java.awt.Dimension(1366, 670));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("DELIGHT FOOD CORNER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("POS SYSTEM");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Develop By :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INDUWARA COMPANY");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Authorized By :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DELIGHT FOOD CORNER");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index/Web Logo.png"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index/INDUWARA backremove.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/images/vt90.png"))); // NOI18N

        javax.swing.GroupLayout jp_userMainPanelLayout = new javax.swing.GroupLayout(jp_userMainPanel);
        jp_userMainPanel.setLayout(jp_userMainPanelLayout);
        jp_userMainPanelLayout.setHorizontalGroup(
            jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                        .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                            .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(402, 402, 402))
                    .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_userMainPanelLayout.setVerticalGroup(
            jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_userMainPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_userMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(239, 108, 0));

        lb_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_close.setForeground(new java.awt.Color(255, 255, 255));
        lb_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_close.setText("X");
        lb_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_closeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("System Login User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1090, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_close)
                    .addComponent(jLabel3)))
        );

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("DELIGHT FOOD CORNER-POS SYSTEM");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user_frontend/userLOG_btnBACK.png"))); // NOI18N
        jButton1.setText("INVOICE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user_frontend/userLOG_btnBACK.png"))); // NOI18N
        jButton2.setText("ADD DAILY PRODUCTS");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(183, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(183, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(183, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user_frontend/userLOG_btnBACK.png"))); // NOI18N
        jButton3.setText("RETURN INVOICE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lb_v_time.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_v_time.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addComponent(bt_main_userNameLOAD, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_v_time, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(984, 984, 984)
                .addComponent(lb_v_date, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jp_userMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_main_userNameLOAD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(669, 669, 669)
                        .addComponent(lb_v_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jp_userMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_v_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
AccessDenied_backupAndRestore andBackup;
    private void lb_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_closeMouseClicked

        try {
            this.dispose();
            String[] split = bt_main_userNameLOAD.getText().split("@");
            andBackup = new AccessDenied_backupAndRestore();

            String subSequence = andBackup.md_createBackup(split[0]);

            if (User_Home.md_isReachableByPing("mail.google.com")) {
                new Thread(() -> {
                    SendAttachmentInEmail.sendSSLAttMail(subSequence, "systemdfc@gmail.com", "systemdfc@gmail.com");

                }).start();
            } else {
                JOptionPane.showMessageDialog(this, "Internet Connection Not Reachable! \n Backup can't send system host \n Only localbackup Only!");
                System.exit(0);
            }

        } catch (Exception ex) {
            Logger.getLogger(User_Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lb_closeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(() -> {
            try {

                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                jp_user_invoiceManagment invoiceMngs = new jp_user_invoiceManagment();
                invoiceMngs.setVisible(true);
                jp_userMainPanel.add(invoiceMngs);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                add_daily.setVisible(true);
                jp_userMainPanel.add(add_daily);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        new Thread(() -> {
            try {
                Thread.sleep(3000);
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                returns.setVisible(true);
                jp_userMainPanel.add(returns);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_main_userNameLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_main_userNameLOADActionPerformed
       
        
        
    }//GEN-LAST:event_bt_main_userNameLOADActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User_Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bt_main_userNameLOAD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jp_userMainPanel;
    private javax.swing.JLabel lb_close;
    public static javax.swing.JLabel lb_v_date;
    public static javax.swing.JLabel lb_v_time;
    // End of variables declaration//GEN-END:variables

    public static boolean md_isReachableByPing(String host) {
        try {
            String cmd = "";
            if (System.getProperty("os.name").startsWith("Windows")) {
                // For Windows
                cmd = "ping -n 1 " + host;
                System.out.println("OK!");
            } else {
                // For Linux and OSX
                cmd = "ping -c 1 " + host;
            }

            Process myProcess = Runtime.getRuntime().exec(cmd);
            myProcess.waitFor();

            if (myProcess.exitValue() == 0) {

                return true;
            } else {

                return false;
            }

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }

    final void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                Date d = new Date();
                SimpleDateFormat stim = new SimpleDateFormat("hh:mm:ss a");
                String st = stim.format(d);
                lb_v_time.setText(st);

            }
        }).start();
    }




}
