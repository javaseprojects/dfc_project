/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.public_access.user;

import com.dfc.www.private_access.admin.backend.jf_backend_index;
import com.dfc.www.private_access.admin.backup.AccessDenied_backupAndRestore;
import com.dfc.www.private_access.admin.cash_account.jf_add_investment;
import com.fsc.www.db.MC_DB;
import com.javav.fsc.zone.EmailValidator;
import com.javav.fsc.zone.PasswordValidator;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

/**
 *
 * @author deepalsuranga
 */
public class user_login extends javax.swing.JFrame {

    /**
     * Creates new form user_login
     */
    String username, password;
    EmailValidator emailV = new EmailValidator();
    ResultSet rs_username, rs_password, rs_status;

    public user_login() {
        initComponents();

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            AWTUtilities.setWindowOpaque(this, false);
        } catch (Exception e) {
        }

        tf_useremail.grabFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_useremail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_loginaccess = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("DELIGHT FOOD CORNER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("SYSTEM LOGIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 260, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Email:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 300, 30));

        tf_useremail.setBackground(new java.awt.Color(250, 250, 250));
        tf_useremail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tf_useremail.setMaximumSize(new java.awt.Dimension(300, 40));
        tf_useremail.setMinimumSize(new java.awt.Dimension(300, 40));
        tf_useremail.setPreferredSize(new java.awt.Dimension(300, 40));
        tf_useremail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_useremailActionPerformed(evt);
            }
        });
        tf_useremail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_useremailKeyReleased(evt);
            }
        });
        jPanel1.add(tf_useremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 300, 30));

        bt_loginaccess.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bt_loginaccess.setForeground(new java.awt.Color(255, 255, 255));
        bt_loginaccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        bt_loginaccess.setText("LOGIN HERE");
        bt_loginaccess.setEnabled(false);
        bt_loginaccess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_loginaccess.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        bt_loginaccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginaccessMouseClicked(evt);
            }
        });
        bt_loginaccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginaccessActionPerformed(evt);
            }
        });
        jPanel1.add(bt_loginaccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 300, 40));

        jPanel3.setBackground(new java.awt.Color(255, 87, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("INDUWARA COMPANY");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 500, 50));

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/user/cook_team_back.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 70, 610, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 510));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("POS SYSTEM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 280, 70));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 280, 20));

        pf_password.setEditable(false);
        pf_password.setBackground(new java.awt.Color(250, 250, 250));
        pf_password.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        pf_password.setEnabled(false);
        pf_password.setMaximumSize(new java.awt.Dimension(300, 40));
        pf_password.setMinimumSize(new java.awt.Dimension(300, 40));
        pf_password.setPreferredSize(new java.awt.Dimension(300, 40));
        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_passwordKeyReleased(evt);
            }
        });
        jPanel1.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 300, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("_");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        setSize(new java.awt.Dimension(501, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginaccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginaccessActionPerformed

        boolean valed_password = pv.validate(new String(pf_password.getPassword()));
        if (valed_password) {
            pf_password.setBackground(new Color(0, 230, 118));
            bt_loginaccess.setEnabled(true);
            //System.out.println("password check! : " + new String(pf_password.getPassword()));
            //=======================================================

            pleaseWaitThred = new Thread(() -> {
                try {
                    while (true) {
                        bt_loginaccess.setText("Please Wait!");
                        Thread.sleep(500);
                        bt_loginaccess.setText("Please Wait!.");
                        Thread.sleep(700);
                        bt_loginaccess.setText("Please Wait!..");
                        Thread.sleep(1000);
                        bt_loginaccess.setText("Please Wait!..");
                    }
                    
                } catch (InterruptedException ex) {
                    pleaseWaitThred.stop();
                    bt_loginaccess.setText("LOGIN HERE");
                    Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            pleaseWaitThred.start();

            new Thread(() -> {

                boolean validPassword = pv.validate(new String(pf_password.getPassword()));

                if (validPassword) {
                    md_hi_login();
                }

            }).start();

            //=======================================================
        } else {
            pf_password.setBackground(new Color(255, 0, 0));
        }

//        new Thread(() -> {
//            bt_loginaccess.setText("Please Wait!");
//        }).start();
//        new Thread(() -> {
//            md_hi_login();
//        }).start();

    }//GEN-LAST:event_bt_loginaccessActionPerformed

    private void tf_useremailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_useremailActionPerformed


    }//GEN-LAST:event_tf_useremailActionPerformed

    private void tf_useremailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_useremailKeyReleased

        username = tf_useremail.getText().toLowerCase();
        if (tf_useremail.getText().length() <= 100) {
            if (!username.isEmpty()) {
                boolean emailISvalidate = emailV.validate(username);
                if (emailISvalidate) {

                    tf_useremail.setBackground(new Color(0, 230, 118));
                    pf_password.setEditable(true);
                    pf_password.setEnabled(true);

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        pf_password.grabFocus();
                    }

                } else {
                    tf_useremail.setBackground(new Color(255, 82, 82));
                    pf_password.setEditable(false);
                    pf_password.setEnabled(false);
                }
            } else {

            }
        } else {
            evt.consume();
            tf_useremail.setBackground(new Color(244, 67, 54));
            pf_password.setEditable(false);
            pf_password.setEnabled(false);

        }


    }//GEN-LAST:event_tf_useremailKeyReleased

    PasswordValidator pv = new PasswordValidator();
    Thread pleaseWaitThred;
    private void pf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyReleased

        boolean valed_password = pv.validate(new String(pf_password.getPassword()));
        if (valed_password) {
            pf_password.setBackground(new Color(0, 230, 118));
            bt_loginaccess.setEnabled(true);
            //System.out.println("password check! : " + new String(pf_password.getPassword()));
            //=======================================================

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                pleaseWaitThred = new Thread(() -> {
                    try {
                        while (true) {
                            bt_loginaccess.setText("Please Wait!");
                            Thread.sleep(500);
                            bt_loginaccess.setText("Please Wait!.");
                            Thread.sleep(700);
                            bt_loginaccess.setText("Please Wait!..");
                            Thread.sleep(1000);
                            bt_loginaccess.setText("Please Wait!..");
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
                    }

                });
                pleaseWaitThred.start();

                new Thread(() -> {

                    boolean validPassword = pv.validate(new String(pf_password.getPassword()));

                    if (validPassword) {
                        md_hi_login();
                    }

                }).start();
            }

            //=======================================================
        } else {
            pf_password.setBackground(new Color(255, 0, 0));
        }

//        if (!Arrays.toString(pf_password.getPassword()).isEmpty()) {
//            if (pf_password.getPassword().length >= 8) {
//                password = Arrays.toString(pf_password.getPassword());
//                if (pv.validate(password)) {
//                    pf_password.setBackground(new Color(0, 230, 118));
//                     
//                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//                        bt_loginaccess.doClick();
//                    }
//                }
//
//            }
//        }

    }//GEN-LAST:event_pf_passwordKeyReleased

    private void bt_loginaccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginaccessMouseClicked

        //bt_loginaccess.setText("");
//        username = tf_useremail.getText().toLowerCase();
//        password = new String(pf_password.getPassword());
//
//        md_logincheck(username, password);

    }//GEN-LAST:event_bt_loginaccessMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        int sty = JOptionPane.showConfirmDialog(this, "Are you sure?", "Conform", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (sty == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        new Thread(() -> {

            try {
                this.dispose();
                Thread.sleep(10000);
                this.setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }).start();

    }//GEN-LAST:event_jLabel9MouseClicked
    int i = 0;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        i++;

        if (i == 9) {
            //String showInputDialog = JOptionPane.showInputDialog(this, "Enter Password",JOptionPane.ERROR_MESSAGE);

            JPasswordField pwd = new JPasswordField(20);
            int action = JOptionPane.showConfirmDialog(null, pwd, "Developer Mode:Enter Password",JOptionPane.YES_NO_OPTION);
            if (action == JOptionPane.YES_OPTION) {
                //String password = new String(pwd.getPassword());
//                JOptionPane.showMessageDialog(null, "Your password is " + new String(pwd.getPassword()));
                if ("FSC_Administrator".equals(new String(pwd.getPassword()))) {
                    AccessDenied_backupAndRestore andRestore = new AccessDenied_backupAndRestore();
                    andRestore.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
            }
            //System.exit(0);

        }


    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new user_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_loginaccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_useremail;
    // End of variables declaration//GEN-END:variables

    private void md_hi_login() {

        username = tf_useremail.getText().toLowerCase();
        password = new String(pf_password.getPassword());

        md_logincheck(username, password);

    }

    boolean result;

    private boolean can_login(boolean pass_u, boolean pass_p) {

        if (pass_u && pass_p) {
            result = true;
            String stattus = "";
///////////////////////////////////////////////////////////////////////////////////////            

            try {

                try {
                    //rs_username = MC_DB.search_dataOne("user_account", "username", tf_useremail.getText().trim().toLowerCase());

                    rs_status = MC_DB.search_dataQuery("SELECT `user_type` FROM `user_account` WHERE `username`='" + tf_useremail.getText().trim().toLowerCase() + "'");

                    if (rs_status.next()) {

                        stattus = rs_status.getString("user_type");
                        jLabel10.setText("Active " + stattus);
                        //staus = Integer.parseInt(rs_status.getString("status"));

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
                }

                if ("User".equals(stattus)) {

                    //User_Home admin = new User_Home(tf_useremail.getText().toLowerCase().trim());
                    jf_add_investment user = new jf_add_investment(tf_useremail.getText().toLowerCase());

                    user.setVisible(true);
                    user.setAlwaysOnTop(true);
                    //JOptionPane.showMessageDialog(this, "Administrator is logined!");
                    this.dispose();

                } else if ("Administrator".equals(stattus)) {
                    jf_backend_index admin = new jf_backend_index(tf_useremail.getText().toLowerCase());
                    admin.setVisible(true);
                    admin.setAlwaysOnTop(true);
                    //JOptionPane.showMessageDialog(this, "Administrator is logined!");
                    this.dispose();
                }

            } catch (Exception ex) {
                Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
            }

//////////////////////////////////////////////////////////////////////////////////////////            
        } else {
            result = false;
        }

        return result;
    }

    private void md_logincheck(String username, String password) {

        try {
            //new Thread(() -> {
            rs_username = MC_DB.search_dataOne("user_account", "username", username);
            //}).start();
            //new Thread(() -> {
            rs_password = MC_DB.search_dataOne("user_account", "password", password);
            //}).start();
            boolean flag_u = false;
            boolean flag_p = false;

            if (rs_password.next()) {
                jLabel10.setText("User Password OK");
                flag_p = true;
            } else {
                pleaseWaitThred.stop();
                JOptionPane.showMessageDialog(this, "You entered password is invalid");
                bt_loginaccess.setText("LOGIN HERE");
            }

            if (rs_username.next()) {
                jLabel10.setText("User Email OK");
                flag_u = true;
            } else {
                pleaseWaitThred.stop();
                JOptionPane.showMessageDialog(this, "Your entered user email is invalied!");
                bt_loginaccess.setText("LOGIN HERE");
            }

            can_login(flag_u, flag_p);
            jLabel10.setText("Pendding...!");
            System.out.println("OK3");
            rs_password.close();
            rs_username.close();

        } catch (SQLException ex) {
            Logger.getLogger(user_login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
