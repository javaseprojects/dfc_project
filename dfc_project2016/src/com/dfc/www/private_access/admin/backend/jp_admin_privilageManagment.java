/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.backend;

import com.fsc.www.db.MC_DB;
import com.javav.fsc.zone.PasswordValidator;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepalsuranga
 */
public class jp_admin_privilageManagment extends javax.swing.JPanel {

    /**
     * Creates new form jp_admin_privilageManagment
     */
    public jp_admin_privilageManagment() {
        initComponents();
        new Thread(() -> {
            md_tbLoadAdmin();
        }).start();
        new Thread(() -> {
            md_tbLoadUser();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_contact = new javax.swing.JTextField();
        bt_saveSystemUser = new javax.swing.JButton();
        pf_conpassword = new javax.swing.JPasswordField();
        pf_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tf_useremail = new javax.swing.JTextField();
        cb_selectType = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_loadAdmin = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_loadUser = new javax.swing.JTable();
        bt_saveSystemUser1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(245, 123, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Type:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name:");

        tf_fullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_fullnameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Number:");

        tf_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_contactKeyReleased(evt);
            }
        });

        bt_saveSystemUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_saveSystemUser.setForeground(new java.awt.Color(255, 255, 255));
        bt_saveSystemUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        bt_saveSystemUser.setText("Add Administrator");
        bt_saveSystemUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_saveSystemUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        bt_saveSystemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveSystemUserActionPerformed(evt);
            }
        });

        pf_conpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_conpasswordKeyReleased(evt);
            }
        });

        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_passwordKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Email:");

        tf_useremail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_useremailKeyReleased(evt);
            }
        });

        cb_selectType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_selectType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "User" }));
        cb_selectType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selectTypeItemStateChanged(evt);
            }
        });
        cb_selectType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_selectTypeKeyReleased(evt);
            }
        });

        jLabel8.setText("A-Z a-z 1-9 #@$% Only ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("S");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S");

        jLabel10.setText("A-Z a-z 1-9 #@$% Only ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_selectType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_useremail)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_fullname)
                            .addComponent(pf_password)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_conpassword)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_contact)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_saveSystemUser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_useremail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_selectType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_conpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_saveSystemUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(145, 145, 145));

        tb_loadAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Email", "Contact", "Password"
            }
        ));
        jScrollPane1.setViewportView(tb_loadAdmin);

        tb_loadUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Email", "Contact", "Password"
            }
        ));
        jScrollPane2.setViewportView(tb_loadUser);

        bt_saveSystemUser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_saveSystemUser1.setForeground(new java.awt.Color(255, 255, 255));
        bt_saveSystemUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        bt_saveSystemUser1.setText("Status Change");
        bt_saveSystemUser1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_saveSystemUser1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        bt_saveSystemUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveSystemUser1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Deactive" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_saveSystemUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(bt_saveSystemUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
     int staus = 9;
    private void cb_selectTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selectTypeItemStateChanged

       
        if (cb_selectType.getSelectedIndex() == 0) {
            staus = 9;
        } else if (cb_selectType.getSelectedIndex() == 1) {
            staus = 1;
        }
         bt_saveSystemUser.setText("Add " + cb_selectType.getSelectedItem().toString()+" "+staus);

    }//GEN-LAST:event_cb_selectTypeItemStateChanged

    PasswordValidator pv = new PasswordValidator();
    private void bt_saveSystemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveSystemUserActionPerformed
        md_savesystemUser();
    }//GEN-LAST:event_bt_saveSystemUserActionPerformed

    private void bt_saveSystemUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveSystemUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_saveSystemUser1ActionPerformed

    private void tf_useremailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_useremailKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cb_selectType.grabFocus();
            //cb_selectType.setFocusable(true);
        }

    }//GEN-LAST:event_tf_useremailKeyReleased

    private void cb_selectTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_selectTypeKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tf_fullname.grabFocus();
            //cb_selectType.setFocusable(true);
        }

    }//GEN-LAST:event_cb_selectTypeKeyReleased

    private void tf_fullnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_fullnameKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pf_password.grabFocus();
            //cb_selectType.setFocusable(true);
        }

    }//GEN-LAST:event_tf_fullnameKeyReleased

    private void pf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pf_conpassword.grabFocus();
            //cb_selectType.setFocusable(true);
        }

    }//GEN-LAST:event_pf_passwordKeyReleased

    private void pf_conpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_conpasswordKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tf_contact.grabFocus();
            //cb_selectType.setFocusable(true);
        }

    }//GEN-LAST:event_pf_conpasswordKeyReleased

    private void tf_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_contactKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            int conform = JOptionPane.showConfirmDialog(this, "Are you sure ?", "Conform Message", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (conform == JOptionPane.YES_OPTION) {
                bt_saveSystemUser.doClick();
                md_clearAll();
            }

        }


    }//GEN-LAST:event_tf_contactKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_saveSystemUser;
    private javax.swing.JButton bt_saveSystemUser1;
    private javax.swing.JComboBox cb_selectType;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pf_conpassword;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTable tb_loadAdmin;
    private javax.swing.JTable tb_loadUser;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_fullname;
    private javax.swing.JTextField tf_useremail;
    // End of variables declaration//GEN-END:variables

    private void md_tbLoadAdmin() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_loadAdmin.getModel();
            ResultSet rs_loadAdmin = MC_DB.search_dataOne("user_account", "user_type", "Administrator");
            dtm.setRowCount(0);
            while (rs_loadAdmin.next()) {
                Vector v = new Vector();
                v.add(rs_loadAdmin.getString("full_name"));
                v.add(rs_loadAdmin.getString("username"));
                v.add(rs_loadAdmin.getString("contact"));
                v.add("**********");
                dtm.addRow(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(jp_admin_privilageManagment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void md_tbLoadUser() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_loadUser.getModel();
            ResultSet rs_loadAdmin = MC_DB.search_dataOne("user_account", "user_type", "User");
            dtm.setRowCount(0);
            while (rs_loadAdmin.next()) {
                Vector v = new Vector();
                v.add(rs_loadAdmin.getString("full_name"));
                v.add(rs_loadAdmin.getString("username"));
                v.add(rs_loadAdmin.getString("contact"));
                v.add("**********");
                dtm.addRow(v);

            }
        } catch (SQLException ex) {
            Logger.getLogger(jp_admin_privilageManagment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void md_clearAll() {

        tf_useremail.setText("");
        cb_selectType.setSelectedIndex(0);
        tf_fullname.setText("");
        pf_password.setText("");
        pf_conpassword.setText("");
        tf_contact.setText("");

    }

    private void md_savesystemUser() {

        String pass_1 = new String(pf_password.getPassword());
        String pass_2 = new String(pf_conpassword.getPassword());

        if (!(tf_useremail.getText().isEmpty() && tf_fullname.getText().isEmpty() && tf_contact.getText().isEmpty() && pass_2.isEmpty())) {

            try {
                ResultSet rs_haveAccount = MC_DB.search_dataAll("user_account", "username", tf_useremail.getText());
                if (rs_haveAccount.first() != true) {

//                    if (pass_1 == null ? pass_2 == null : pass_2.equals(pass_1)) {
//
//                    }
                    MC_DB.insert_data("INSERT INTO `user_account` (`user_type`,`full_name`,`username`,`password`,`contact`,`status`) VALUES ('" + cb_selectType.getSelectedItem().toString() + "','" + tf_fullname.getText().trim() + "','" + tf_useremail.getText().trim().toLowerCase() + "','" + pass_2.trim() + "','" + tf_contact.getText().trim() + "','" + staus + "');");
                } else {

                    JOptionPane.showMessageDialog(this, "This user id already exists!");

                }
                JOptionPane.showMessageDialog(this, tf_fullname.getText() + " Successfully Add the system");
                md_tbLoadAdmin();
                md_tbLoadUser();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, cb_selectType.getSelectedItem() + " Not Add the system");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Request Field is Empty!");
        }

    }
}
