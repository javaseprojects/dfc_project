/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.invoice;

/**
 *
 * @author Sajeewa
 */
public class invoice extends javax.swing.JPanel {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        tex_item_code.grabFocus();
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
        tex_invoice_no = new javax.swing.JTextField();
        tex_item_code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_space = new javax.swing.JButton();
        btn_number_7 = new javax.swing.JButton();
        btn_number_2 = new javax.swing.JButton();
        btn_number_3 = new javax.swing.JButton();
        btn_number_8 = new javax.swing.JButton();
        btn_number_6 = new javax.swing.JButton();
        btn_number_5 = new javax.swing.JButton();
        btn_number_4 = new javax.swing.JButton();
        btn_number_1 = new javax.swing.JButton();
        btn_enter = new javax.swing.JButton();
        btn_number_0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btn_number_9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tex_qty = new javax.swing.JTextField();
        tex_payment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 670));

        jPanel1.setLayout(null);

        tex_invoice_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tex_invoice_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_invoice_noActionPerformed(evt);
            }
        });
        jPanel1.add(tex_invoice_no);
        tex_invoice_no.setBounds(10, 70, 250, 40);

        tex_item_code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tex_item_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_item_codeActionPerformed(evt);
            }
        });
        tex_item_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tex_item_codeKeyPressed(evt);
            }
        });
        jPanel1.add(tex_item_code);
        tex_item_code.setBounds(320, 70, 230, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Invoice No:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 270, 40);

        btn_space.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_space.setText("Space");
        jPanel1.add(btn_space);
        btn_space.setBounds(990, 460, 350, 70);

        btn_number_7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_7.setText("7");
        jPanel1.add(btn_number_7);
        btn_number_7.setBounds(990, 100, 80, 80);

        btn_number_2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_2.setText("2");
        jPanel1.add(btn_number_2);
        btn_number_2.setBounds(1080, 280, 80, 80);

        btn_number_3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_3.setText("3");
        jPanel1.add(btn_number_3);
        btn_number_3.setBounds(1170, 280, 80, 80);

        btn_number_8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_8.setText("8");
        jPanel1.add(btn_number_8);
        btn_number_8.setBounds(1080, 100, 80, 80);

        btn_number_6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_6.setText("6");
        jPanel1.add(btn_number_6);
        btn_number_6.setBounds(1170, 190, 80, 80);

        btn_number_5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_5.setText("5");
        jPanel1.add(btn_number_5);
        btn_number_5.setBounds(1080, 190, 80, 80);

        btn_number_4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_4.setText("4");
        jPanel1.add(btn_number_4);
        btn_number_4.setBounds(990, 190, 80, 80);

        btn_number_1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_1.setText("1");
        jPanel1.add(btn_number_1);
        btn_number_1.setBounds(990, 280, 80, 80);

        btn_enter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_enter.setText("Enter");
        jPanel1.add(btn_enter);
        btn_enter.setBounds(1080, 370, 170, 80);

        btn_number_0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_0.setText("0");
        jPanel1.add(btn_number_0);
        btn_number_0.setBounds(990, 370, 80, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 140, 680, 390);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("-");
        jPanel1.add(jButton12);
        jButton12.setBounds(1260, 280, 80, 80);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setText("*");
        jPanel1.add(jButton13);
        jButton13.setBounds(1260, 190, 80, 80);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("/");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(1260, 100, 80, 80);

        btn_number_9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_number_9.setText("9");
        jPanel1.add(btn_number_9);
        btn_number_9.setBounds(1170, 100, 80, 80);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Total Payment"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 140, 280, 510);

        tex_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(tex_qty);
        tex_qty.setBounds(660, 70, 220, 40);

        tex_payment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(tex_payment);
        tex_payment.setBounds(1110, 550, 230, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Item Code:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 30, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Qty:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(660, 30, 60, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("0.00");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(740, 550, 140, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("0.00");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1110, 600, 230, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Bill Total:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(640, 550, 100, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Payment:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(990, 550, 120, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Total Qty:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 550, 100, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("0");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(410, 550, 120, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("+");
        jPanel1.add(jButton2);
        jButton2.setBounds(1260, 370, 80, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Balance:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(990, 600, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tex_invoice_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_invoice_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_invoice_noActionPerformed

    private void tex_item_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_item_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_item_codeActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void tex_item_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_item_codeKeyPressed
        
        
    }//GEN-LAST:event_tex_item_codeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enter;
    private javax.swing.JButton btn_number_0;
    private javax.swing.JButton btn_number_1;
    private javax.swing.JButton btn_number_2;
    private javax.swing.JButton btn_number_3;
    private javax.swing.JButton btn_number_4;
    private javax.swing.JButton btn_number_5;
    private javax.swing.JButton btn_number_6;
    private javax.swing.JButton btn_number_7;
    private javax.swing.JButton btn_number_8;
    private javax.swing.JButton btn_number_9;
    private javax.swing.JButton btn_space;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tex_invoice_no;
    private javax.swing.JTextField tex_item_code;
    private javax.swing.JTextField tex_payment;
    private javax.swing.JTextField tex_qty;
    // End of variables declaration//GEN-END:variables

    
    //................item search start........................................................
    public void searchItem(){
    }
    //................item search end..........................................................
    
}