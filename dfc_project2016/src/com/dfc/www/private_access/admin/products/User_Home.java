package com.dfc.www.private_access.admin.products;

import com.dfc.www.private_access.admin.backend.jf_backend_index;
import static com.dfc.www.private_access.admin.backend.jf_backend_index.lb_main_administratorNameLOAD;
import com.dfc.www.private_access.admin.cash_account.add_investment;
import com.dfc.www.private_access.admin.cash_account.jp_admin_cashManagement;
import com.dfc.www.private_access.admin.cash_account.jp_admin_withdrawManagement;
import com.dfc.www.private_access.admin.invoice.jp_invoice;
import java.awt.FlowLayout;

public class User_Home extends javax.swing.JFrame {

    public User_Home() {
        initComponents();
       // loadInvestment();
    }

    public User_Home(String email) {
        initComponents();
       // loadInvestment();

        jf_backend_index.us_fullname = email;
        try {

            lb_main_userNameLOAD.setText("");
            lb_main_userNameLOAD.setText(email);

        } catch (Exception e) {
        }

    }

//    public void loadInvestment() {
//        add_investment ai = new add_investment();
//        ai.setVisible(true);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Cash = new javax.swing.JButton();
        jp_userMainPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        bt_invoice = new javax.swing.JButton();
        lb_main_userNameLOAD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 20, 230, 40);

        jButton3.setText("Final Product Blance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(550, 20, 130, 30);

        jButton2.setText("Daily Qty Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 20, 130, 30);

        jButton5.setText("Cate & Sub Category");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(863, 20, 150, 30);

        Cash.setText("Cash");
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });
        jPanel1.add(Cash);
        Cash.setBounds(690, 20, 120, 30);

        jp_userMainPanel.setBackground(new java.awt.Color(204, 204, 204));
        jp_userMainPanel.setLayout(null);
        jPanel1.add(jp_userMainPanel);
        jp_userMainPanel.setBounds(0, 70, 1366, 670);

        jButton4.setText("Withdrawal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1020, 20, 170, 30);

        bt_invoice.setText("Invoice");
        bt_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_invoiceActionPerformed(evt);
            }
        });
        jPanel1.add(bt_invoice);
        bt_invoice.setBounds(10, 23, 110, 40);

        lb_main_userNameLOAD.setText("jLabel1");
        jPanel1.add(lb_main_userNameLOAD);
        lb_main_userNameLOAD.setBounds(1210, 20, 120, 30);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            Product st = new Product();
            st.setVisible(true);
            jp_userMainPanel.add(st);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            Daily_Qty_add Dq = new Daily_Qty_add();
            Dq.setVisible(true);
            jp_userMainPanel.add(Dq);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            final_product_balance Bal = new final_product_balance();
            Bal.setVisible(true);
            jp_userMainPanel.add(Bal);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed

        try {
            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            jp_admin_cashManagement ca = new jp_admin_cashManagement();
            ca.setVisible(true);
            jp_userMainPanel.add(ca);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_CashActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {

            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            Add_Cat_And_SubCat Adc = new Add_Cat_And_SubCat();
            Adc.setVisible(true);
            jp_userMainPanel.add(Adc);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            jp_userMainPanel.removeAll();
            jp_userMainPanel.setLayout(new FlowLayout());
            jp_admin_withdrawManagement cw = new jp_admin_withdrawManagement();
            cw.setVisible(true);
            jp_userMainPanel.add(cw);
            jp_userMainPanel.updateUI();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_invoiceActionPerformed

        new Thread(() -> {
            try {
                jp_userMainPanel.removeAll();
                jp_userMainPanel.setLayout(new FlowLayout());
                jp_invoice ai = new jp_invoice();
                ai.setVisible(true);
                jp_userMainPanel.add(ai);
                jp_userMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_invoiceActionPerformed

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
    private javax.swing.JButton Cash;
    private javax.swing.JButton bt_invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_userMainPanel;
    public static javax.swing.JLabel lb_main_userNameLOAD;
    // End of variables declaration//GEN-END:variables
}
