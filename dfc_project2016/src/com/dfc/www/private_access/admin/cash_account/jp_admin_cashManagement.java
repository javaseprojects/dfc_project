package com.dfc.www.private_access.admin.cash_account;

import com.fsc.www.db.MC_DB;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class jp_admin_cashManagement extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ResultSet rs;
    public jp_admin_cashManagement() {
        initComponents();
        setCurrentDate();
    }
    
    //set current date---------------------------------------
    public void setCurrentDate(){
        dt_start.setDate(new Date());
        dt_end.setDate(new Date());
    }
    //set current date---------------------------------------
    
    //load cash details by date selected---------------------
    public void loadCashData(String startDate,String endDate){
        dtm = (DefaultTableModel)tbl_cash_account.getModel();
        dtm.setRowCount(0);
        try {
            rs=null;
            rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM cash_account WHERE cash_date BETWEEN '"+startDate+"' AND '"+endDate+"'");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getDouble("cash_amount"));
                v.add(rs.getString("cash_date"));
                v.add(rs.getString("cash_type"));
                v.add(rs.getString("description"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //load cash details by date selected---------------------
    
    
    //load investments---------------------------------------
    public void loadInvestments(){
        try {
            rs=null;
            rs = MC_DB.myConnection().createStatement().executeQuery("SELECT COUNT(cash_amount) AS investmentCount FROM cash_account WHERE cash_type='Investment'");
            if(rs.next()){
                lbl_investments.setText(rs.getString("investmentCount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //load investments--------------------------------------
    
    
    //load incomes------------------------------------------
    public void loadIncomes(){
        try {
            rs=null;
            rs = MC_DB.myConnection().createStatement().executeQuery("SELECT COUNT(cash_amount) AS incomeCount FROM cash_account WHERE cash_type='Income'");
            if(rs.next()){
                lbl_income.setText(rs.getString("incomeCount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //load incomes------------------------------------------
    
    //load expenses
    public void loadExpenses(){
        try {
            rs=null;
            rs = MC_DB.myConnection().createStatement().executeQuery("SELECT COUNT(cash_amount) AS expenseCount FROM cash_account WHERE cash_type='Expense'");
            if(rs.next()){
                lbl_expenses.setText(rs.getString("expenseCount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   //load expenses-----------------------------------------
    
    //profit calculation-----------------------------------
    public void profitCalculator(){
        try {
            double invest = Double.parseDouble(lbl_investments.getText());
            double income = Double.parseDouble(lbl_income.getText());
            double expense = Double.parseDouble(lbl_expenses.getText());
            lbl_profit.setText((income-(expense+invest))+"0");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        jLabel3 = new javax.swing.JLabel();
        lbl_investments = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_income = new javax.swing.JLabel();
        lbl_expenses = new javax.swing.JLabel();
        lbl_profit = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_search1 = new javax.swing.JButton();
        dt_end = new com.toedter.calendar.JDateChooser();
        dt_start = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Start Date :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 20, 91, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("End Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 20, 84, 50);

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
        jScrollPane1.setBounds(30, 80, 1310, 420);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total Investments :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1000, 510, 180, 30);

        lbl_investments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_investments.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_investments.setText("00.00");
        jPanel1.add(lbl_investments);
        lbl_investments.setBounds(1170, 510, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Income :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1000, 540, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Expenses :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1000, 570, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total Profit :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1000, 600, 180, 30);

        lbl_income.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_income.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_income.setText("00.00");
        jPanel1.add(lbl_income);
        lbl_income.setBounds(1170, 540, 170, 30);

        lbl_expenses.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_expenses.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_expenses.setText("00.00");
        jPanel1.add(lbl_expenses);
        lbl_expenses.setBounds(1170, 570, 170, 30);

        lbl_profit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_profit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_profit.setText("00.00");
        jPanel1.add(lbl_profit);
        lbl_profit.setBounds(1170, 600, 170, 30);

        btn_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_search.setText("Print");
        btn_search.setPreferredSize(new java.awt.Dimension(73, 50));
        jPanel1.add(btn_search);
        btn_search.setBounds(1240, 30, 100, 30);

        btn_search1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_search1.setText("Search");
        btn_search1.setPreferredSize(new java.awt.Dimension(73, 50));
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search1);
        btn_search1.setBounds(720, 30, 100, 30);

        dt_end.setDateFormatString("YYYY-MM-dd");
        jPanel1.add(dt_end);
        dt_end.setBounds(500, 30, 210, 30);

        dt_start.setDateFormatString("YYYY-MM-dd");
        jPanel1.add(dt_start);
        dt_start.setBounds(140, 30, 210, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(980, 510, 370, 140);

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

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_search1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private com.toedter.calendar.JDateChooser dt_end;
    private com.toedter.calendar.JDateChooser dt_start;
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
