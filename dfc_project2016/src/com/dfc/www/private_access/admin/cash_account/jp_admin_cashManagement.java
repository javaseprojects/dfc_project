package com.dfc.www.private_access.admin.cash_account;

import com.fsc.www.db.MC_DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jp_admin_cashManagement extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ResultSet rs;

    public jp_admin_cashManagement() {
        initComponents();
        setCurrentDate();
        String sDate = new SimpleDateFormat("yyyy-MM-dd").format(dt_start.getDate());
        String eDate = new SimpleDateFormat("yyyy-MM-dd").format(dt_end.getDate());
//        loadAllCashData();

        loadCashData(sDate, eDate);
        loadInvestments(sDate, eDate);
        loadExpenses(sDate, eDate);
        loadIncomes(sDate, eDate);
        profitCalculator();
    }

    //set current date---------------------------------------
    public void setCurrentDate() {
        dt_start.setDate(new Date());
        dt_end.setDate(new Date());
    }
    //set current date---------------------------------------

    public void loadAllCashData() {
        String sDate = new SimpleDateFormat("yyyy-MM-dd").format(dt_start.getDate());
        String eDate = new SimpleDateFormat("yyyy-MM-dd").format(dt_end.getDate());
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
            loadInvestments(sDate, eDate);
            loadExpenses(sDate, eDate);
            loadIncomes(sDate, eDate);
            profitCalculator();
        }).start();

    }

    public boolean checkDateCase(String sDate, String eDate) {

        String ssDate[] = sDate.split("-");
        String new_s_Date = ssDate[0] + ssDate[1] + ssDate[2];
        int New_S_Date = Integer.parseInt(new_s_Date);

        String eeDate[] = eDate.split("-");
        String new_e_Date = eeDate[0] + eeDate[1] + eeDate[2];
        int New_E_Date = Integer.parseInt(new_e_Date);

        if (New_E_Date >= New_S_Date) {
            return true;
        } else {
            return false;
        }

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
        loadInvestments(endDate, endDate);
        loadIncomes(endDate, endDate);
        loadExpenses(endDate, endDate);
        profitCalculator();
    }
    //load cash details by date selected---------------------

    //load investments---------------------------------------
    public void loadInvestments(String sDate, String eDate) {
        new Thread(() -> {
            try {
                double investment = 0;
                ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT cash_amount FROM cash_account WHERE cash_type='Investment' AND cash_date BETWEEN '" + sDate + "' AND '" + eDate + "'");
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

    //load incomes
    public void loadIncomes(String sDate, String eDate) {

        try {
            double income = 0;
            ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT SUM(cash_amount) AS totInvoiceCash FROM cash_account WHERE cash_type='Invoice' AND cash_date BETWEEN '" + sDate + "' AND '" + eDate + "'");
            if (rs.next()) {
                income = rs.getDouble("totInvoiceCash");
                lbl_income.setText(income + "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //load incomes

    //load expenses
    public void loadExpenses(String sDate, String eDate) {
        double expense = 0;
        try {
            ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT SUM(cash_amount) AS sumExpense FROM cash_account WHERE cash_type='Expense' AND cash_date BETWEEN '" + sDate + "' AND '" + eDate + "'");
            if (rs.next()) {
                expense = rs.getDouble("sumExpense");
                lbl_expenses.setText(expense + "0");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   //load expenses-----------------------------------------

    //profit calculation-----------------------------------
    public void profitCalculator() {
        double invest = Double.parseDouble(lbl_investments.getText());
        double income = Double.parseDouble(lbl_income.getText());
        double expense = Double.parseDouble(lbl_expenses.getText());
        System.out.println(invest + "--" + income + "--" + expense);
        lbl_profit.setText((income - (expense + invest)) + "0");
        lbl_profitwithoutinvest.setText((income - expense) + "0");
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
        jLabel7 = new javax.swing.JLabel();
        lbl_profitwithoutinvest = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
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
        jScrollPane1.setBounds(20, 100, 1330, 390);

        dt_end.setDateFormatString("yyyy-MM-dd");
        dt_end.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(dt_end);
        dt_end.setBounds(540, 30, 300, 40);

        dt_start.setDateFormatString("yyyy-MM-dd");
        dt_start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(dt_start);
        dt_start.setBounds(120, 30, 300, 40);

        jPanel2.setBackground(new java.awt.Color(81, 81, 81));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Profit :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(26, 91, 112, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Expenses :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(26, 61, 180, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Income :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(26, 31, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Investments :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(26, 1, 180, 30);

        lbl_investments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_investments.setForeground(new java.awt.Color(255, 255, 255));
        lbl_investments.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_investments.setText("00.00");
        jPanel2.add(lbl_investments);
        lbl_investments.setBounds(250, 0, 170, 30);

        lbl_income.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_income.setForeground(new java.awt.Color(255, 255, 255));
        lbl_income.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_income.setText("00.00");
        jPanel2.add(lbl_income);
        lbl_income.setBounds(250, 30, 170, 30);

        lbl_expenses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_expenses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_expenses.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_expenses.setText("00.00");
        jPanel2.add(lbl_expenses);
        lbl_expenses.setBounds(250, 60, 170, 30);

        lbl_profit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_profit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_profit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_profit.setText("00.00");
        jPanel2.add(lbl_profit);
        lbl_profit.setBounds(250, 90, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Profit :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(26, 121, 112, 30);

        lbl_profitwithoutinvest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_profitwithoutinvest.setForeground(new java.awt.Color(255, 255, 255));
        lbl_profitwithoutinvest.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_profitwithoutinvest.setText("00.00");
        jPanel2.add(lbl_profitwithoutinvest);
        lbl_profitwithoutinvest.setBounds(250, 120, 170, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(With Investmnet)");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(144, 97, 88, 14);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(Without Investmnet)");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(140, 130, 104, 14);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(930, 500, 420, 160);

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

        jPanel3.setBackground(new java.awt.Color(239, 108, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1350, 90);

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

        if (checkDateCase(sDate, eDate)) {
            System.out.println(sDate);
            System.out.println(eDate);
            loadCashData(sDate, eDate);
            loadInvestments(sDate, eDate);
            loadExpenses(sDate, eDate);
            loadIncomes(sDate, eDate);
            profitCalculator();
        }else{
            JOptionPane.showMessageDialog(this, "End Date should be less than Start Date","Invalid Date Rage Found",JOptionPane.WARNING_MESSAGE);
            dt_end.setDate(new Date());
        }


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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_expenses;
    private javax.swing.JLabel lbl_income;
    private javax.swing.JLabel lbl_investments;
    private javax.swing.JLabel lbl_profit;
    private javax.swing.JLabel lbl_profitwithoutinvest;
    private javax.swing.JTable tbl_cash_account;
    // End of variables declaration//GEN-END:variables
}
