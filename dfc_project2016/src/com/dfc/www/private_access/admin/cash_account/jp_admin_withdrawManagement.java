package com.dfc.www.private_access.admin.cash_account;

import com.fsc.www.db.MC_DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class jp_admin_withdrawManagement extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ResultSet rs;
    Vector v;
    int userID = 0;

    public jp_admin_withdrawManagement() {
        initComponents();
        //loadAdministrators();
    }

    //load administrators to combo box--------------------------
    public void loadAdministrators() {
            v = new Vector();
            try {
                rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM user_account WHERE user_type='admin'");
                if (rs.next()) {
                    v.add(rs.getString("full_name"));
                    lbl_admin.setText(rs.getString("full_name"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    //load administrators to combo box----------------------------

    //get Admin Id
    public void setUserId(String fullname) {
        try {
            rs = null;
            rs = MC_DB.myConnection().createStatement().executeQuery("SELECT user_account_id FROM user_account WHERE full_name='" + fullname + "'");
            if (rs.next()) {
                userID = rs.getInt("user_account_id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //get Admin Id------------------------------------------------

    //view withdrawal by Administrator----------------------------
    public void viewWithdrawalByAdministrator() {
        try {
            this.rs = null;
            dtm = (DefaultTableModel) tbl_withdraw.getModel();
            dtm.setRowCount(0);
            this.rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM expense WHERE user_account_id='" + userID + "'");
            while (this.rs.next()) {
                Vector v = new Vector();
                v.add(this.rs.getDouble("expense_cost"));
                v.add(this.rs.getString("expense_date"));
                v.add(this.rs.getString("description"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //view withdrawal by Administrator------------------------------

//get withdrawal amount count--------------------------------------
    public void getWithdrawTotal() {
        if (userID != 0) {
            try {
                rs = MC_DB.myConnection().createStatement().executeQuery("SELECT COUNT(expense_cost) AS expenseCount FROM expense WHERE user_account_id='" + userID + "'");
                if (rs.next()) {
                    lbl_tot_withdraw.setText(rs.getDouble("expenseCount") + "0");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//get withdrawal amount count----------------------------------------

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_withdraw = new javax.swing.JTable();
        txt_amount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_withdrawal = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_admin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_tot_withdraw = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Description :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 160, 140, 22);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 20, 860, 640);

        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        jPanel1.add(txt_amount);
        txt_amount.setBounds(200, 90, 270, 40);

        txt_withdrawal.setColumns(20);
        txt_withdrawal.setRows(5);
        jScrollPane2.setViewportView(txt_withdrawal);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 150, 270, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter Amount :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 100, 140, 22);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Administrator :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 130, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Print");
        jPanel2.add(jButton1);
        jButton1.setBounds(195, 280, 120, 41);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Withdraw");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(329, 281, 132, 41);

        lbl_admin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_admin.setText("Malinda Senanayake");
        jPanel2.add(lbl_admin);
        lbl_admin.setBounds(190, 20, 170, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 470, 530);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total Withdrawal Amount :");

        lbl_tot_withdraw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tot_withdraw.setText("00.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_tot_withdraw)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_tot_withdraw)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 560, 470, 100);

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

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_tot_withdraw;
    private javax.swing.JTable tbl_withdraw;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextArea txt_withdrawal;
    // End of variables declaration//GEN-END:variables
}
