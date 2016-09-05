package com.dfc.www.private_access.admin.products;

import com.fsc.www.db.MC_DB;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;

public class final_product_balance extends javax.swing.JPanel {

    String date;

    public final_product_balance() {
        initComponents();
        CheckDate();
        JTextFieldDateEditor dt = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
        dt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(1366, 618));

        jPanel1.setBackground(new java.awt.Color(230, 74, 25));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 60, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(73, 50));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/public_access/images/fdc_button_hover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 50, 300, 40);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Product name", "Quantity Added", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 1310, 500);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(30, 50, 300, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            new Thread(() -> {
                try {

                    int i = 0;
                    int Added_qty = 0;
                    int item_id = 0;

                    String df = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
                    ResultSet rs = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM stock_log WHERE stock_date = '" + df + "'  ");
                    DefaultTableModel dtm = (DefaultTableModel) tbl_product.getModel();
                    dtm.setRowCount(0);

                    while (rs.next()) {
                        Vector v = new Vector();
                        item_id = Integer.parseInt(rs.getString("item_id"));
                        Added_qty = Integer.parseInt(rs.getString("qty"));

                        ResultSet rs1 = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_id= '" + item_id + "' ");
                        while (rs1.next()) {

                            v.add(rs1.getString("item_code"));
                            v.add(rs1.getString("item_name"));
                            v.add(Added_qty);

                        }

                        ResultSet rs2 = MC_DB.myConnection().createStatement().executeQuery("SELECT qty FROM invoice_reg WHERE item_id= '" + item_id + "' ");
                        while (rs2.next()) {
                            int Sold_qty = Integer.parseInt(rs2.getString("qty"));
                            v.add(Added_qty - Sold_qty);
                        }
                        v.add("No item Sell");
                        dtm.addRow(v);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_product;
    // End of variables declaration//GEN-END:variables

    void CheckDate() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        jDateChooser1.setDate(new Date());
    }

}
