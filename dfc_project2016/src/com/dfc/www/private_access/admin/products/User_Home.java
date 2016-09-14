package com.dfc.www.private_access.admin.products;

import com.dfc.www.private_access.admin.backend.jf_backend_index;
import static com.dfc.www.private_access.admin.backend.jf_backend_index.lb_main_administratorNameLOAD;
import com.dfc.www.private_access.admin.cash_account.add_investment;
import com.dfc.www.private_access.admin.cash_account.jp_admin_cashManagement;
import com.dfc.www.private_access.admin.cash_account.jp_admin_withdrawManagement;
import com.dfc.www.private_access.admin.invoice.jp_user_invoiceManagment;
import java.awt.FlowLayout;

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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jp_userMainPanel = new javax.swing.JPanel();
        lb_main_userNameLOAD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jp_userMainPanel.setBackground(new java.awt.Color(204, 204, 204));
        jp_userMainPanel.setLayout(null);
        jPanel1.add(jp_userMainPanel);
        jp_userMainPanel.setBounds(0, 70, 1366, 670);

        lb_main_userNameLOAD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_main_userNameLOAD.setText("jLabel1");
        jPanel1.add(lb_main_userNameLOAD);
        lb_main_userNameLOAD.setBounds(1140, 20, 190, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1340, 10, 20, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_userMainPanel;
    public static javax.swing.JLabel lb_main_userNameLOAD;
    // End of variables declaration//GEN-END:variables
}
