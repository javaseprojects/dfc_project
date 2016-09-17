package com.dfc.www.private_access.admin.cash_account;

import com.dfc.www.private_access.admin.invoice.jp_user_invoiceManagment;
import com.dfc.www.public_access.user_frontend.User_Home;
import com.fsc.www.db.MC_DB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class jf_add_investment extends javax.swing.JFrame {

    public static String us_fullname;
    String C_Time, C_Date;
    int ADMIN_USER_ID, MAX_INVSET_ID, MAX_CASH_ID;
    boolean ADMIN_LOGGED_STATUS;

    public jf_add_investment() {
        initComponents();

    }

    public jf_add_investment(String email) {
        initComponents();
        showTime();
        getCurrentDate();
        txt_username.grabFocus();
        jf_add_investment.us_fullname = email;
        try {

            lbl_looged_user.setText("");
            lbl_looged_user.setText(email);

        } catch (Exception e) {
        }

    }

    final void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                Date d = new Date();
                SimpleDateFormat stim = new SimpleDateFormat("hh:mm:ss a");
                String st = stim.format(d);
                C_Time = st;

            }
        }).start();
    }

    //get Current Date and Time
    public void getCurrentDate() {
        C_Date = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
    }
    //get Current Date and Time

    //administrator login checking
    public void getUsPw() {
        try {
            String userName = txt_username.getText();
            String userPassword = txt_password.getText();

            ResultSet rs_username = MC_DB.search_dataOne("user_account", "username", userName);
            ResultSet rs_password = MC_DB.search_dataOne("user_account", "password", userPassword);

            if (rs_username.next() && rs_password.next()) {
                String user_type = rs_username.getString("user_type");
                if (user_type.equals("Administrator")) {

                    ADMIN_USER_ID = rs_username.getInt("user_account_id");

                    JOptionPane.showMessageDialog(this, userName + " Administrator login successfully Confirmed", "Information Message", JOptionPane.INFORMATION_MESSAGE);

                    ADMIN_LOGGED_STATUS = true;
                    txt_invest_amount.setEnabled(true);
                    btn_payment.setEnabled(true);
                    txt_invest_amount.grabFocus();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //administrator login checking
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lbl_user_mail = new javax.swing.JLabel();
        lbl_looged_user = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_payment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_invest_amount = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username :");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton2.setText("Login");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(91, 91, 91));

        lbl_user_mail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_user_mail.setText("Logged User :");

        lbl_looged_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_looged_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_looged_user.setText("Logged User");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_looged_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_user_mail))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_user_mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_looged_user)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));

        btn_payment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_payment.setForeground(new java.awt.Color(255, 255, 255));
        btn_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        btn_payment.setText("Add Payment");
        btn_payment.setEnabled(false);
        btn_payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_payment.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Daily Cash :");

        txt_invest_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_invest_amount.setEnabled(false);
        txt_invest_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_invest_amountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_invest_amountKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_invest_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_invest_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(41, 41, 41));

        jLabel4.setBackground(new java.awt.Color(255, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add Daily Cash");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(320, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed

        if (this.ADMIN_LOGGED_STATUS) {
            int confirm_response = JOptionPane.showConfirmDialog(this, "Do you want to add this " + txt_invest_amount.getText() + " payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm_response == JOptionPane.YES_OPTION) {
                addInvestmentPayment();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Login as Administrator", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_paymentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        getUsPw();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        if (checkDailyInvestment()) {
            this.dispose();
            new User_Home(lbl_looged_user.getText()).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Please add Cash to Cash Account", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jLabel4MouseClicked

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getUsPw();
        }

    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_password.grabFocus();
        }

    }//GEN-LAST:event_txt_usernameKeyReleased

    private void txt_invest_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_invest_amountKeyReleased
        if (!txt_invest_amount.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                if (this.ADMIN_LOGGED_STATUS) {
                    int confirm_response = JOptionPane.showConfirmDialog(this, "Do you want to add this " + txt_invest_amount.getText() + " payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (confirm_response == JOptionPane.YES_OPTION) {
                        addInvestmentPayment();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Login as Administrator", "Warining Message", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_txt_invest_amountKeyReleased

    private void txt_invest_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_invest_amountKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_invest_amountKeyTyped

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
            java.util.logging.Logger.getLogger(jf_add_investment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_add_investment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_add_investment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_add_investment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_add_investment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_looged_user;
    private javax.swing.JLabel lbl_user_mail;
    private javax.swing.JTextField txt_invest_amount;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void addInvestmentPayment() {
        if (!txt_invest_amount.getText().isEmpty()) {
            double investment_payment = Double.parseDouble(txt_invest_amount.getText());
            String description = txt_username.getText() + " INVESTED";
            try {
                //saving investment payment to the investment table
                new Thread(() -> {
                    try {
                        MC_DB.myConnection().createStatement().executeUpdate("INSERT INTO investment (invest_amount,credited_amount,invest_date,invest_time,status,user_account_id) VALUES ('" + investment_payment + "','" + investment_payment + "','" + C_Date + "','" + C_Time + "','1','" + ADMIN_USER_ID + "')");
                        System.out.println("Investment Save Query Excuted");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
//                }).start();
                    //saving investment payment to the investment table
                    //get max investment id from the investment table
//                new Thread(() -> {
                    try {
                        ResultSet rs_max_invest = MC_DB.myConnection().createStatement().executeQuery("SELECT MAX(investment_id) AS maxInvestID FROM investment");
                        if (rs_max_invest.next()) {
                            this.MAX_INVSET_ID = rs_max_invest.getInt("maxInvestID");
                            System.out.println("Investment Max Id Query Executed");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
//                }).start();
                    //get max investment id from the investment table

                    //saving the investment payment to the cash account
//                new Thread(() -> {
                    MC_DB.insert_data("INSERT INTO cash_account (cash_amount,cash_type,status,cash_date,description) VALUES ('" + investment_payment + "','Investment','1','" + C_Date + "','" + description + "')");
                    System.out.println("Cash Account Query Executed");
//                }).start();
                    //saving the investment payment to the cash account

                    //get max cash id from the cash table
//                new Thread(() -> {
                    try {
                        ResultSet rs_max_cash_id = MC_DB.myConnection().createStatement().executeQuery("SELECT MAX(cash_id) AS maxCashID FROM cash_account");
                        if (rs_max_cash_id.next()) {
                            this.MAX_CASH_ID = rs_max_cash_id.getInt("maxCashID");
                            System.out.println("Max Cash id Query Executed");
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
//                }).start();
                    //get max cash id from the cash table

                    //save data cash and investment associate table
//                new Thread(() -> {
                    MC_DB.insert_data("INSERT INTO cash_account_has_investment (cash_id,investment_id,amount) VALUES ('" + this.MAX_CASH_ID + "','" + this.MAX_INVSET_ID + "','" + investment_payment + "')");
                    System.out.println("Cash-Investment Associate Query Executed");
//                }).start();
                    //save data cash and investment associate table
                    this.dispose();
                    User_Home uh = new User_Home(lbl_looged_user.getText());
                    uh.setVisible(true);
                }).start();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Amount found,Please enter valid amount", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean checkDailyInvestment() {
        try {
            String thisDate = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
            String query = "SELECT investment.`invest_amount` FROM investment WHERE investment.`invest_date`='" + thisDate + "'";
            ResultSet rs = MC_DB.search_dataQuery(query);
            if (rs.next()) {
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
