package com.dfc.www.private_access.admin.cash_account;

import com.dfc.www.public_access.user_frontend.User_Home;
import com.fsc.www.db.MC_DB;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jp_admin_withdrawManagement extends javax.swing.JPanel {

    DefaultTableModel dtm;
    Vector v;
    int userID = 0;
    int ADMIN_USER_ID, MAX_WITHDRAW_ID, MAX_CASH_ID;
    boolean ADMIN_LOGGED_STATUS;
    String C_Date;

    public jp_admin_withdrawManagement() {
        initComponents();
        C_Date = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
        resetRequiredData();
        viewAllExpenses();

    }

    ResultSet rs_viewWithdrawalByAdministrator;

    //view withdrawal by Administrator----------------------------
    public void viewAllExpenses() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_withdraw.getModel();
        dtm.setRowCount(0);
        new Thread(() -> {
            try {

                ResultSet rs_withdrawals = MC_DB.search_dataQuery("SELECT * FROM expense");
                while (rs_withdrawals.next()) {
                    Vector v = new Vector();
                    v.add(rs_withdrawals.getDouble("expense_cost"));
                    v.add(rs_withdrawals.getString("expense_date"));
                    v.add(rs_withdrawals.getString("description"));
                    dtm.addRow(v);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    //view withdrawal by Administrator------------------------------

//get withdrawal amount count--------------------------------------
    ResultSet rs_withdraw_Total;

    public void getWithdrawTotal() {
        if (userID != 0) {
            new Thread(() -> {
                try {
                    rs_withdraw_Total = MC_DB.myConnection().createStatement().executeQuery("SELECT COUNT(expense_cost) AS expenseCount FROM expense WHERE user_account_id='" + userID + "'");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
            try {

                if (rs_withdraw_Total.next()) {
                    lbl_tot_withdraw.setText(rs_withdraw_Total.getDouble("expenseCount") + "0");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//get withdrawal amount count----------------------------------------

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
                    txt_amount.setEnabled(true);
                    txt_description.setEnabled(true);
                    btn_withdraw.setEnabled(true);
                    txt_amount.grabFocus();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_withdraw = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txt_amount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_tot_withdraw = new javax.swing.JLabel();
        btn_withdraw = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        user_caption = new javax.swing.JLabel();
        lbl_logged_user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        tbl_withdraw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_withdraw);
        if (tbl_withdraw.getColumnModel().getColumnCount() > 0) {
            tbl_withdraw.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_withdraw.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(340, 0, 1030, 670);

        jPanel4.setBackground(new java.awt.Color(255, 87, 34));

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_amount.setEnabled(false);
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        txt_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_amountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_amountKeyTyped(evt);
            }
        });

        txt_description.setColumns(20);
        txt_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_description.setRows(5);
        txt_description.setEnabled(false);
        jScrollPane2.setViewportView(txt_description);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Amount :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Withdrawal :");

        lbl_tot_withdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_tot_withdraw.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tot_withdraw.setText("00.00");

        btn_withdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_withdraw.setForeground(new java.awt.Color(255, 255, 255));
        btn_withdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        btn_withdraw.setText("Withdraw Cash");
        btn_withdraw.setEnabled(false);
        btn_withdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_withdraw.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        btn_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_tot_withdraw)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tot_withdraw)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 320, 340, 350);

        jPanel2.setBackground(new java.awt.Color(255, 127, 0));
        jPanel2.setLayout(null);

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
        });
        jPanel2.add(txt_username);
        txt_username.setBounds(10, 120, 300, 40);

        user_caption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_caption.setText("Logged User :");
        jPanel2.add(user_caption);
        user_caption.setBounds(10, 20, 86, 17);

        lbl_logged_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_logged_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logged_user.setText("malindasepcjt@gmail.com");
        jPanel2.add(lbl_logged_user);
        lbl_logged_user.setBounds(10, 50, 170, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 170, 67, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 90, 70, 17);

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });
        jPanel2.add(txt_password);
        txt_password.setBounds(10, 200, 300, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton4.setText("Login");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 250, 300, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawActionPerformed

        if (this.ADMIN_LOGGED_STATUS && this.ADMIN_USER_ID != 0) {
            int confirm_response = JOptionPane.showConfirmDialog(this, "Do you want to withdraw this " + txt_amount.getText() + " payment?", "Payment Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm_response == JOptionPane.YES_OPTION) {
                addwithdrawalAmount();
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Login as Administrator", "Warining Message", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btn_withdrawActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        getUsPw();
        getAdminWithdrawals();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }


    }//GEN-LAST:event_txt_amountKeyTyped

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_password.grabFocus();
        }

    }//GEN-LAST:event_txt_usernameKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getUsPw();
            getAdminWithdrawals();
        }

    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_description.grabFocus();
        }

    }//GEN-LAST:event_txt_amountKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_withdraw;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_logged_user;
    private javax.swing.JLabel lbl_tot_withdraw;
    private javax.swing.JTable tbl_withdraw;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel user_caption;
    // End of variables declaration//GEN-END:variables

    private void resetRequiredData() {
        txt_username.setText("");
        txt_password.setText("");
        txt_amount.setText("");
        txt_description.setText("");
//        this.ADMIN_USER_ID = 0;
        this.ADMIN_LOGGED_STATUS = false;
        txt_amount.setEnabled(false);
        txt_description.setEnabled(false);
        btn_withdraw.setEnabled(false);
    }

    private void addwithdrawalAmount() {
        if (!(txt_amount.getText().isEmpty() && txt_description.getText().isEmpty())) {
            double withdraw_amount = Double.parseDouble(txt_amount.getText());
            String withdraw_des = txt_description.getText();

            new Thread(() -> {

                MC_DB.insert_data("INSERT INTO expense (user_account_id,expense_cost,description,expense_date,status) VALUES ('" + this.ADMIN_USER_ID + "','" + withdraw_amount + "','" + withdraw_des + "','" + C_Date + "','1')");
                System.out.println("Withdraw Query Excuted");

                try {
                    ResultSet rs_withdraw_max_id = MC_DB.search_dataQuery("SELECT MAX(expense_id) AS maxExpenseId FROM expense");

                    if (rs_withdraw_max_id.next()) {
                        this.MAX_WITHDRAW_ID = rs_withdraw_max_id.getInt("maxExpenseId");
                        System.out.println("max withdraw Query Executed");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                MC_DB.insert_data("INSERT INTO cash_account (cash_amount,cash_type,status,cash_date,description) VALUES ('" + withdraw_amount + "','Expense','1','" + C_Date + "','" + withdraw_des + "')");
                System.out.println("Cash Account Query Executed");

                try {
                    ResultSet rs_max_cash_id = MC_DB.myConnection().createStatement().executeQuery("SELECT MAX(cash_id) AS maxCashID FROM cash_account");
                    if (rs_max_cash_id.next()) {
                        this.MAX_CASH_ID = rs_max_cash_id.getInt("maxCashID");
                        System.out.println("Max Cash id Query Executed");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                MC_DB.insert_data("INSERT INTO cash_account_has_expense (cash_id,expense_id,amount) VALUES ('" + this.MAX_CASH_ID + "','" + this.MAX_WITHDRAW_ID + "','" + withdraw_amount + "')");
                System.out.println("cash-withdraw Query Executed");
                JOptionPane.showMessageDialog(this, txt_amount.getText() + " amount has been successfully withdrawed", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                resetRequiredData();
                viewAllExpenses();
            }).start();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid amount or Description found", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void getAdminWithdrawals() {

        if (this.ADMIN_USER_ID != 0) {
            DefaultTableModel dtm =(DefaultTableModel)tbl_withdraw.getModel();
            dtm.setRowCount(0);
            new Thread(() -> {
                try {
                    ResultSet rs_admin_withdrawals = MC_DB.search_dataQuery("SELECT * FROM expense WHERE user_account_id='" + this.ADMIN_USER_ID + "'");
                    while (rs_admin_withdrawals.next()) {
                        Vector v = new Vector();
                        v.add(rs_admin_withdrawals.getDouble("expense_cost")+"0");
                        v.add(rs_admin_withdrawals.getString("expense_date"));
                        v.add(rs_admin_withdrawals.getString("description"));
                        dtm.addRow(v);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
            
            new Thread(() ->{
                try {
                    ResultSet rs_withdraw_count = MC_DB.search_dataQuery("SELECT COUNT(expense_cost) AS totExpense FROM expense WHERE user_account_id='" + this.ADMIN_USER_ID + "'");
                    if(rs_withdraw_count.next()){
                        lbl_tot_withdraw.setText(rs_withdraw_count.getDouble("totExpense")+"0");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }

}
