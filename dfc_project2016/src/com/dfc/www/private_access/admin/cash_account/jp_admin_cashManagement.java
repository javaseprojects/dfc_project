package com.dfc.www.private_access.admin.cash_account;

import com.fsc.www.db.MC_DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class jp_admin_cashManagement extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ResultSet rs;

    public jp_admin_cashManagement() {
        initComponents();
        setCurrentDate();
        loadAllCashData();
        loadInvestments();
        loadExpenses();
    }

    //set current date---------------------------------------
    public void setCurrentDate() {
        dt_start.setDate(new Date());
        dt_end.setDate(new Date());
    }
    //set current date---------------------------------------

    public void loadAllCashData() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_cash_account.getModel();
        dtm.setRowCount(0);
        new Thread(() -> {
            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM cash_account");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getDouble("cash_amount"));
                    v.add(rs.getString("cash_date"));
                    v.add(rs.getString("cash_type"));
                    v.add(rs.getString("description"));
                    dtm.addRow(v);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }).start();
    }

    //load cash details by date selected---------------------
    public void loadCashData(String startDate, String endDate) {
        System.out.println(startDate);
        System.out.println(endDate);
        DefaultTableModel dtm = (DefaultTableModel) tbl_cash_account.getModel();
        dtm.setRowCount(0);
        new Thread(() -> {
            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM cash_account WHERE cash_date BETWEEN '" + startDate + "' AND '" + endDate + "'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getDouble("cash_amount"));
                    v.add(rs.getString("cash_date"));
                    v.add(rs.getString("cash_type"));
                    v.add(rs.getString("description"));
                    dtm.addRow(v);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }).start();
    }
    //load cash details by date selected---------------------

    //load investments---------------------------------------
    public void loadInvestments() {
        new Thread(() -> {
            try {
                double investment = 0;
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT cash_amount FROM cash_account WHERE cash_type='Investment'");
                while (rs.next()) {
                    investment += Double.parseDouble(rs.getString("cash_amount"));
                }
                lbl_investments.setText(investment + "0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
    //load investments--------------------------------------

    //load incomes------------------------------------------
    public void loadIncomes() {
        new Thread(() -> {
            try {
                double income = 0;
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT cash_amount FROM cash_account WHERE cash_type='Income'");
                while (rs.next()) {
                    income += Double.parseDouble(rs.getString("cash_amount"));
                }
                lbl_income.setText(income + "0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
    //load incomes------------------------------------------

    //load expenses
    public void loadExpenses() {
        new Thread(() -> {
            double expense = 0;
            try {
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT cash_amount FROM cash_account WHERE cash_type='Expense'");
                if (rs.next()) {
                    expense += Double.parseDouble(rs.getString("cash_amount"));
                }
                lbl_expenses.setText(expense + "0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
   //load expenses-----------------------------------------

    //profit calculation-----------------------------------
    public void profitCalculator() {
        new Thread(() -> {
            double invest = Double.parseDouble(lbl_investments.getText());
            double income = Double.parseDouble(lbl_income.getText());
            double expense = Double.parseDouble(lbl_expenses.getText());
            lbl_profit.setText((income - (expense + invest)) + "0");
        }).start();
    }

    //profit calculation-----------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cash_account = new javax.swing.JTable();
        dt_end = new com.toedter.calendar.JDateChooser();
        dt_start = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_investments = new javax.swing.JLabel();
        lbl_income = new javax.swing.JLabel();
        lbl_expenses = new javax.swing.JLabel();
        lbl_profit = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setBackground(new java.awt.Color(255, 127, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start Date :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 72, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("End Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 20, 66, 50);

        tbl_cash_account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Date", "Cash Type", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_cash_account);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 1330, 420);

        dt_end.setDateFormatString("yyyy-MM-dd");
        dt_end.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(dt_end);
        dt_end.setBounds(540, 30, 300, 40);

        dt_start.setDateFormatString("yyyy-MM-dd");
        dt_start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(dt_start);
        dt_start.setBounds(120, 30, 300, 40);

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Profit :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Expenses :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Income :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Investments :");

        lbl_investments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_investments.setForeground(new java.awt.Color(255, 255, 255));
        lbl_investments.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_investments.setText("00.00");

        lbl_income.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_income.setForeground(new java.awt.Color(255, 255, 255));
        lbl_income.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_income.setText("00.00");

        lbl_expenses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_expenses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_expenses.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_expenses.setText("00.00");

        lbl_profit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_profit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_profit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_profit.setText("00.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_investments, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_income, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_profit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_investments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_income, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_profit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(980, 510, 370, 150);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(870, 30, 230, 40);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String sDate = new SimpleDateFormat("YYYY-MM-dd").format(dt_start.getDate());
        String eDate = new SimpleDateFormat("YYYY-MM-dd").format(dt_end.getDate());
        System.out.println(sDate);
        System.out.println(eDate);
        loadCashData(sDate, eDate);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dt_end;
    private com.toedter.calendar.JDateChooser dt_start;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_expenses;
    private javax.swing.JLabel lbl_income;
    private javax.swing.JLabel lbl_investments;
    private javax.swing.JLabel lbl_profit;
    private javax.swing.JTable tbl_cash_account;
    // End of variables declaration//GEN-END:variables
}
