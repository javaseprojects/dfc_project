package com.dfc.www.public_access.user_frontend;

import com.dfc.www.private_access.admin.backend.jf_backend_index;
import com.dfc.www.private_access.admin.backup.AccessDenied_backupAndRestore;
import com.dfc.www.private_access.admin.invoice.jp_user_invoiceManagment;
import com.fsc.www.db.SendAttachmentInEmail;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User_Home extends javax.swing.JFrame {

    public User_Home() {
        initComponents();
        new Thread(() -> {
            try {
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                jp_user_invoiceManagment ai = new jp_user_invoiceManagment();
                ai.setVisible(true);
                jp_userMainPanel.add(ai);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public User_Home(String email) {
        initComponents();
        new Thread(() -> {
            try {
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                jp_user_invoiceManagment ai = new jp_user_invoiceManagment();
                ai.setVisible(true);
                jp_userMainPanel.add(ai);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        jf_backend_index.us_fullname = email;
        try {
            lb_main_userNameLOAD.setText("");
            lb_main_userNameLOAD.setText(email);

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
        jp_userMainPanel = new javax.swing.JPanel();
        lb_main_userNameLOAD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 20, 24));
        jPanel1.setLayout(null);

        jp_userMainPanel.setBackground(new java.awt.Color(51, 51, 51));
        jp_userMainPanel.setLayout(null);
        jPanel1.add(jp_userMainPanel);
        jp_userMainPanel.setBounds(0, 70, 1366, 670);

        lb_main_userNameLOAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_main_userNameLOAD.setForeground(new java.awt.Color(255, 255, 255));
        lb_main_userNameLOAD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_main_userNameLOAD.setText("Load User Email");
        jPanel1.add(lb_main_userNameLOAD);
        lb_main_userNameLOAD.setBounds(1040, 40, 320, 30);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1340, Short.MAX_VALUE)
                .addComponent(lb_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_close))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("System Login User:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1114, 30, 250, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
AccessDenied_backupAndRestore andBackup;
    private void lb_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_closeMouseClicked

        try {
            this.dispose();
            String[] split = lb_main_userNameLOAD.getText().split("@");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jp_userMainPanel;
    private javax.swing.JLabel lb_close;
    public static javax.swing.JLabel lb_main_userNameLOAD;
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

}
