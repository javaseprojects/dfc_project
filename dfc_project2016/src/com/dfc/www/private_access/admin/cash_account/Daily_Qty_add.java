package com.dfc.www.private_access.admin.cash_account;

/**
 *
 * @author Buwaneka
 */
public class Daily_Qty_add extends javax.swing.JPanel {

    /**
     * Creates new form Test_Pannel
     */
    public Daily_Qty_add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPid1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPid2 = new javax.swing.JTextField();

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Item Code :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 100, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Date :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 250, 120, 50);

        txtPname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPname.setEnabled(false);
        txtPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPname);
        txtPname.setBounds(160, 110, 310, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Name :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 130, 50);

        txtPid1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPid1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPid1);
        txtPid1.setBounds(160, 40, 310, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.setPreferredSize(new java.awt.Dimension(73, 50));
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 390, 120, 50);

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Product name", "Category", "Sub Category", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(500, 40, 500, 400);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Add Quantity");
        jButton2.setPreferredSize(new java.awt.Dimension(73, 50));
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 390, 140, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.setPreferredSize(new java.awt.Dimension(73, 50));
        jPanel1.add(jButton3);
        jButton3.setBounds(200, 390, 120, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Quantity :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 180, 130, 50);

        txtPid2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPid2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtPid2);
        txtPid2.setBounds(160, 180, 310, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPnameActionPerformed

    private void txtPid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPid1ActionPerformed

    private void txtPid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPid2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txtPid1;
    private javax.swing.JTextField txtPid2;
    private javax.swing.JTextField txtPname;
    // End of variables declaration//GEN-END:variables
}
