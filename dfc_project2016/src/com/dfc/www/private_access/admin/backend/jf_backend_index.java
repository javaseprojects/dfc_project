package com.dfc.www.private_access.admin.backend;

import com.dfc.www.private_access.admin.cash_account.jp_admin_cashManagement;
import com.dfc.www.public_access.user.user_login;
import com.fsc.www.db.MC_DB;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author deepalsuranga
 */
public class jf_backend_index extends javax.swing.JFrame {

    /**
     * Creates new form jf_backend_index
     */
    
    public static String us_fullname;
    public jf_backend_index() {
        initComponents();

    }
    public jf_backend_index(String email) {
        initComponents();
        
        jf_backend_index.us_fullname=email;
        try {
           
                lb_main_administratorNameLOAD.setText("");
                lb_main_administratorNameLOAD.setText(email);
            
        } catch (Exception e) {
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lb_main_administratorNameLOAD = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jp_adminMainPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRATOR | BACKEND");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel6MouseMoved(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 102, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel8MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 35));

        lb_main_administratorNameLOAD.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_administratorNameLOAD.setText("WelCome Administrator");
        jPanel2.add(lb_main_administratorNameLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 210, 30));

        jPanel4.setBackground(new java.awt.Color(145, 145, 145));
        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel2KeyReleased(evt);
            }
        });
        jPanel4.add(jLabel2, "card2");

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 50));

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 740, 1370, 30));

        jp_adminMainPanel.setBackground(new java.awt.Color(158, 158, 158));
        jp_adminMainPanel.setMaximumSize(new java.awt.Dimension(1366, 670));
        jp_adminMainPanel.setMinimumSize(new java.awt.Dimension(1366, 670));
        jp_adminMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel9MouseMoved(evt);
            }
        });
        jPanel9.setLayout(new java.awt.CardLayout());

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton1.setText("Privilage Managment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, "card2");

        jp_adminMainPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 170));

        jPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel10MouseMoved(evt);
            }
        });
        jPanel10.setLayout(new java.awt.CardLayout());

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton2.setText("POS Managment");
        jPanel10.add(jButton2, "card2");

        jp_adminMainPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 240, 170));

        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel11MouseMoved(evt);
            }
        });
        jPanel11.setLayout(new java.awt.CardLayout());

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton3.setText("Invoice Managment");
        jPanel11.add(jButton3, "card2");

        jp_adminMainPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 240, 170));

        jPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel12MouseMoved(evt);
            }
        });
        jPanel12.setLayout(new java.awt.CardLayout());

        jButton4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton4.setText("Cash Managment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton4, "card2");

        jp_adminMainPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 240, 170));

        jPanel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel13MouseMoved(evt);
            }
        });
        jPanel13.setLayout(new java.awt.CardLayout());

        jButton5.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton5.setText("Report Managment");
        jPanel13.add(jButton5, "card2");

        jp_adminMainPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 240, 170));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 760, 400));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 480, 240, 150));

        jPanel1.add(jp_adminMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1366, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseMoved

//        jPanel6.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel6MouseMoved

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved

//        jPanel6.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseMoved

//        jPanel8.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel8MouseMoved

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));

    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited

        jPanel5.setBackground(new Color(250, 250, 250));

        jPanel6.setBackground(new Color(255, 102, 0));
        jPanel7.setBackground(new Color(255, 102, 0));
        jPanel8.setBackground(new Color(255, 102, 0));

    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved

        jPanel9.setBackground(new Color(255, 143, 0));

    }//GEN-LAST:event_jPanel9MouseMoved

    private void jPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseMoved

    private void jPanel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseMoved

    private void jPanel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseMoved

    private void jPanel13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(() -> {
            try {
                jp_adminMainPanel.removeAll();
                jp_adminMainPanel.setLayout(new FlowLayout());
                jp_admin_privilageManagment ai = new jp_admin_privilageManagment();
                ai.setVisible(true);
                jp_adminMainPanel.add(ai);
                jp_adminMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new Thread(() -> {
            try {
                jp_adminMainPanel.removeAll();
                jp_adminMainPanel.setLayout(new FlowLayout());
                jp_admin_cashManagement ai = new jp_admin_cashManagement();
                ai.setVisible(true);
                jp_adminMainPanel.add(ai);
                jp_adminMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased


    }//GEN-LAST:event_jPanel6MouseReleased

    private void jLabel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyReleased


    }//GEN-LAST:event_jLabel2KeyReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

        int out = JOptionPane.showConfirmDialog(this, "You Want to logout here?", "Conform!", JOptionPane.YES_NO_OPTION);

        if (out == JOptionPane.YES_OPTION) {
            user_login ul = new user_login();
            ul.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jLabel2MouseReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jf_backend_index().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JPanel jp_adminMainPanel;
    public static javax.swing.JLabel lb_main_administratorNameLOAD;
    // End of variables declaration//GEN-END:variables
}
