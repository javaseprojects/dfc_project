package com.dfc.www.private_access.admin.invoice;

import com.dfc.www.private_access.admin.backend.jf_onScreenInvoiceKeyBoard;
import static com.dfc.www.private_access.admin.invoice.jp_invoice_view_item.li_searchSuggestions;
import com.dfc.www.public_access.user_frontend.User_Home;
import com.fsc.www.db.MC_DB;
import com.fsc.www.db.PB_MD;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class jp_user_invoiceManagment extends javax.swing.JPanel {

    String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    KeyEvent mykeys;
    String Invoice_No;
    DefaultTableModel dtm_invoice_reg_local_table;

    public jp_user_invoiceManagment() {

        initComponents();
        dtm_invoice_reg_local_table = (DefaultTableModel) tb_invoiceRegistor.getModel();
        getInvoiceNo();
        tf_item_code.grabFocus();
        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                itemLOAD.setVisible(true);
                jp_submainPanel.add(itemLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_F1) {
                    jp_user_invoiceManagment.tf_item_code.grabFocus();
                    //JOptionPane.showMessageDialog(null, "F1 is pressed!");
                }
                if (ke.getKeyCode() == KeyEvent.VK_F3) {
                    jp_user_invoiceManagment.tf_payment.grabFocus();
                    //JOptionPane.showMessageDialog(null, "F1 is pressed!");
                }
            }
        });

    }
    String invoice_no = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jp_submainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tf_item_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lb_item_name = new javax.swing.JLabel();
        lb_available_qty = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_qty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_invoiceRegistor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lb_tot_item = new javax.swing.JLabel();
        lb_bil_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_payment = new javax.swing.JTextField();
        lb_balance = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 670));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(32, 32, 32));
        jPanel3.setMaximumSize(new java.awt.Dimension(310, 580));
        jPanel3.setMinimumSize(new java.awt.Dimension(310, 580));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 580));
        jPanel3.setLayout(new java.awt.CardLayout());

        jp_submainPanel.setBackground(new java.awt.Color(239, 108, 0));
        jp_submainPanel.setMaximumSize(new java.awt.Dimension(310, 562));
        jp_submainPanel.setMinimumSize(new java.awt.Dimension(310, 562));

        javax.swing.GroupLayout jp_submainPanelLayout = new javax.swing.GroupLayout(jp_submainPanel);
        jp_submainPanel.setLayout(jp_submainPanelLayout);
        jp_submainPanelLayout.setHorizontalGroup(
            jp_submainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jp_submainPanelLayout.setVerticalGroup(
            jp_submainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel3.add(jp_submainPanel, "card2");

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 580));

        jPanel2.setBackground(new java.awt.Color(66, 66, 66));
        jPanel2.setMaximumSize(new java.awt.Dimension(1020, 650));
        jPanel2.setMinimumSize(new java.awt.Dimension(1020, 650));
        jPanel2.setPreferredSize(new java.awt.Dimension(1020, 650));

        jPanel7.setBackground(new java.awt.Color(219, 122, 39));

        jPanel6.setBackground(new java.awt.Color(81, 81, 81));

        tf_item_code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_item_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_item_codeActionPerformed(evt);
            }
        });
        tf_item_code.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tf_item_codePropertyChange(evt);
            }
        });
        tf_item_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_item_codeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_item_codeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_item_codeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Code:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Item Name:");

        lb_item_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_item_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_item_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_item_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_item_name.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lb_item_namePropertyChange(evt);
            }
        });

        lb_available_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_available_qty.setForeground(new java.awt.Color(255, 255, 255));
        lb_available_qty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_available_qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Available Quantity:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Quantity:");

        tf_qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_qtyKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_item_code, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_item_name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_available_qty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_qty)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_item_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_item_code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(tf_qty, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lb_available_qty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tb_invoiceRegistor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Item Code", "Item Name", "Unit Price", "Qty", "Sub Total", "Available Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_invoiceRegistor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tb_invoiceRegistorPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tb_invoiceRegistor);
        if (tb_invoiceRegistor.getColumnModel().getColumnCount() > 0) {
            tb_invoiceRegistor.getColumnModel().getColumn(0).setMinWidth(3);
            tb_invoiceRegistor.getColumnModel().getColumn(0).setPreferredWidth(3);
            tb_invoiceRegistor.getColumnModel().getColumn(0).setMaxWidth(3);
            tb_invoiceRegistor.getColumnModel().getColumn(2).setMinWidth(80);
            tb_invoiceRegistor.getColumnModel().getColumn(2).setPreferredWidth(80);
            tb_invoiceRegistor.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        jPanel4.setBackground(new java.awt.Color(66, 66, 66));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lb_tot_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_tot_item.setForeground(new java.awt.Color(255, 255, 255));
        lb_tot_item.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tot_item.setText("0");
        lb_tot_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        lb_bil_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_bil_total.setForeground(new java.awt.Color(255, 255, 255));
        lb_bil_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bil_total.setText("0.00");
        lb_bil_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Balance:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Item Qty:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Total:");

        tf_payment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_paymentKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_paymentKeyTyped(evt);
            }
        });

        lb_balance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_balance.setForeground(new java.awt.Color(255, 255, 255));
        lb_balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_balance.setText("0.00");
        lb_balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_tot_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_bil_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_payment)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_tot_item, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_bil_total, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(tf_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(lb_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 1020, 650));

        jPanel5.setBackground(new java.awt.Color(255, 153, 51));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/itemlist4040.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/invoice4040.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/keyboard.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fsczone/src/images/redo-5124040.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 60));

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

    private void tf_item_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_item_codeActionPerformed


    }//GEN-LAST:event_tf_item_codeActionPerformed

    private void tf_item_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyPressed


    }//GEN-LAST:event_tf_item_codeKeyPressed

    private void tf_item_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyReleased

        ////////////////////////////////////////////////////////////////////////
        if (!tf_item_code.getText().isEmpty()) {
            if (PB_MD.isNumbersOnly(tf_item_code.getText().trim())) {
                try {
                    Vector v = new Vector();
                    ResultSet rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_code` LIKE '" + tf_item_code.getText().trim().toLowerCase() + "%';");
                    while (rs_itemCode.next()) {
                        String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");
                        v.add(sug);
                        jp_invoice_view_item.li_searchSuggestions.setListData(v);
                    }
                    rs_itemCode.close();

                    ///////////////////////////////////////////////////////////////////////////////////////
                    try {

                        if (tf_item_code.getText().length() == 5) {

                            md_loadItemName();

                            //    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                            tf_qty.grabFocus();
                            tf_qty.setText("");
                            //tf_qty.selectAll();
                            //    }
                        } else {

                            lb_item_name.setText("");

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    ////////////////////////////////////////////////////////////////////////////////////////
                } catch (SQLException ex) {
                    Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                evt.consume();
//                try {
//                    Vector v = new Vector();
//                    try (ResultSet rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_name` LIKE '%" + tf_item_code.getText().trim().toLowerCase() + "%';")) {
//                        
//                        
//                        while (rs_itemCode.next()) {
//                           
//                            String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");
//                            
//                            v.add(sug);
//                            li_searchSuggestions.setListData(v);
//                        }
//                        rs_itemCode.close();
//                        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
//                            
//                            
//                            
//                        }
//                    }
//
//                } catch (SQLException ex) {
//                    Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        } else {
            lb_item_name.setText("");
            lb_available_qty.setText("");
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                setInvoiceDetails();
                tf_payment.grabFocus();
                lb_tot_item.setText(tb_invoiceRegistor.getRowCount() + "");
            }
            jp_invoice_view_item.md_loadITEM();
        }

        ////////////////////////////////////////////////////////////////////////
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jp_invoice_view_item.li_searchSuggestions.grabFocus();
        }


    }//GEN-LAST:event_tf_item_codeKeyReleased
    int qty, avb_qty;
    int down_qty;
    private void tf_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_qtyKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            tf_item_code.grabFocus();
        }

        try {
            if (!tf_qty.getText().isEmpty() && !lb_available_qty.getText().isEmpty()) {
                qty = Integer.parseInt(tf_qty.getText());

                avb_qty = Integer.parseInt(lb_available_qty.getText());

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (qty <= avb_qty) {

                        md_setItemTable();

                        tf_item_code.grabFocus();

                        lb_item_name.setText("");
                        lb_available_qty.setText("");
                        jp_invoice_view_item.md_loadITEM();
                        if (!tf_item_code.getText().isEmpty()) {
                            tf_item_code.selectAll();
                        }
                    } else {
                        tf_qty.setText("");
                        JOptionPane.showMessageDialog(this, "Enter Here Posible Quantity");

                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tf_qtyKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased


    }//GEN-LAST:event_formKeyReleased

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased


    }//GEN-LAST:event_jPanel1KeyReleased
    jf_onScreenInvoiceKeyBoard invoiceKeyBoard = new jf_onScreenInvoiceKeyBoard();
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked


    }//GEN-LAST:event_jButton3MouseClicked
    jp_invoice_view_invoice invoiceLOAD = new jp_invoice_view_invoice();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Thread(() -> {
            try {

                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                invoiceLOAD.setVisible(true);
                jp_submainPanel.add(invoiceLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton2ActionPerformed
    jp_invoice_view_item itemLOAD = new jp_invoice_view_item();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());

                itemLOAD.setVisible(true);
                jp_submainPanel.add(itemLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed
    jp_invoice_view_keyboard keyboardLOAD = new jp_invoice_view_keyboard();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Thread(() -> {
            try {
                jp_submainPanel.removeAll();
                jp_submainPanel.setLayout(new FlowLayout());
                keyboardLOAD.setVisible(true);
                jp_submainPanel.add(keyboardLOAD);
                jp_submainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        tf_item_code.grabFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lb_item_namePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lb_item_namePropertyChange


    }//GEN-LAST:event_lb_item_namePropertyChange

    private void tb_invoiceRegistorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tb_invoiceRegistorPropertyChange


    }//GEN-LAST:event_tb_invoiceRegistorPropertyChange

    Double toBalance, toPayment, toBillTotal;
    private void tf_paymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_paymentKeyReleased
        if (!tf_payment.getText().isEmpty()) {
            toPayment = Double.parseDouble(lb_bil_total.getText());
            toBillTotal = Double.parseDouble(tf_payment.getText().trim());

            toBalance = toPayment - toBillTotal;
            lb_balance.setText(toBalance + "0");

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                int response = JOptionPane.showConfirmDialog(null, "Do you want to Continue?", "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    updateDailyStock();
                    JOptionPane.showMessageDialog(this, "Invoice Saved Successfully");
//                    clearFieldsandLoadInitialData();

                    String path = "C:\\FSC\\dfc_invoicefinal.jrxml";
                    //passing parmeter
                    invoice_reportView(path, this.Invoice_No);

                    //passing parmeter
                }

            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_PLUS) {
            tf_item_code.grabFocus();
        }


    }//GEN-LAST:event_tf_paymentKeyReleased

    private void tf_item_codePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tf_item_codePropertyChange

//        if (!tf_item_code.getText().isEmpty()) {
//            if (PB_MD.isNumbersOnly(tf_item_code.getText().trim())) {
//                if (tf_item_code.getText().length() == 5) {
//
//                    try {
//                        Vector v = new Vector();
//                        ResultSet rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_code` LIKE '" + tf_item_code.getText().trim().toLowerCase() + "%';");
//                        while (rs_itemCode.next()) {
//                            String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");
//                            v.add(sug);
//                            jp_invoice_view_item.li_searchSuggestions.setListData(v);
//                        }
//                        rs_itemCode.close();
//
//                        ///////////////////////////////////////////////////////////////////////////////////////
//                        try {
//
//                            if (tf_item_code.getText().length() == 5) {
//
//                                md_loadItemName();
//
//                                //    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//                                tf_qty.grabFocus();
//                                tf_qty.setText("");
//                                //tf_qty.selectAll();
//                                //    }
//                            } else {
//
//                                lb_item_name.setText("");
//
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//
//                        ////////////////////////////////////////////////////////////////////////////////////////
//                    } catch (SQLException ex) {
//                        Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            } else {
//
////                try {
////                    Vector v = new Vector();
////                    try (ResultSet rs_itemCode = MC_DB.search_dataQuery("SELECT * FROM `item` WHERE `item_name` LIKE '%" + tf_item_code.getText().trim().toLowerCase() + "%';")) {
////                        
////                        
////                        while (rs_itemCode.next()) {
////                           
////                            String sug = rs_itemCode.getString("item_code") + "-" + rs_itemCode.getString("item_name");
////                            
////                            v.add(sug);
////                            li_searchSuggestions.setListData(v);
////                        }
////                        rs_itemCode.close();
////                        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
////                            
////                            
////                            
////                        }
////                    }
////
////                } catch (SQLException ex) {
////                    Logger.getLogger(jp_invoice_view_item.class.getName()).log(Level.SEVERE, null, ex);
////                }
//            }
//        } else {
//            lb_item_name.setText("");
//            lb_available_qty.setText("");
////            if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
////                tf_payment.grabFocus();
////            }
//            jp_invoice_view_item.md_loadITEM();
//        }

    }//GEN-LAST:event_tf_item_codePropertyChange

    private void tf_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_paymentKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE))) {
            evt.consume();
        }

    }//GEN-LAST:event_tf_paymentKeyTyped

    private void tf_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_qtyKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_ENTER))) {
            evt.consume();
        }

    }//GEN-LAST:event_tf_qtyKeyTyped

    private void tf_item_codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_item_codeKeyTyped

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_ENTER))) {
            evt.consume();
        }

    }//GEN-LAST:event_tf_item_codeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel jp_submainPanel;
    private javax.swing.JLabel lb_available_qty;
    private javax.swing.JLabel lb_balance;
    public static javax.swing.JLabel lb_bil_total;
    private javax.swing.JLabel lb_item_name;
    private javax.swing.JLabel lb_tot_item;
    public static javax.swing.JTable tb_invoiceRegistor;
    public static javax.swing.JTextField tf_item_code;
    public static javax.swing.JTextField tf_payment;
    private javax.swing.JTextField tf_qty;
    // End of variables declaration//GEN-END:variables

    //................create invoice no - start.....................................................
    //....IN-0001-160830-001
    ResultSet rs_getuserid;
    ResultSet rs_last_invoiceno;

    public void md_createInvoiceNo() {
        try {
            int u_id1 = 0;
            int invoiceno3 = 0;
            String last_invoiceno_ar[] = {};
            Date date = new Date();
            DateFormat dft = new SimpleDateFormat("yyMMdd");
            String df_2 = dft.format(date);

            new Thread(() -> {
                rs_getuserid = MC_DB.search_dataOne("user_account", "username", User_Home.bt_main_userNameLOAD.getText());
            }).start();

            while (rs_getuserid.next()) {
                u_id1 = rs_getuserid.getInt("user_account_id");
            }

            new Thread(() -> {
                try {
                    rs_last_invoiceno = MC_DB.myConnection().createStatement().executeQuery("SELECT LAST(invoice_no) FROM invoice");
                } catch (SQLException ex) {
                    Logger.getLogger(jp_user_invoiceManagment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();

            if (rs_last_invoiceno.next()) {
                String last_invoiceno = rs_last_invoiceno.getNString("invoice_no");
                last_invoiceno_ar = last_invoiceno.split("-");
            }

            if (last_invoiceno_ar[1].equals(df_2)) {
                invoiceno3 = Integer.parseInt(last_invoiceno_ar[0]) + 1;
            } else {
                invoiceno3 = 001;
            }

            invoice_no = "IN-" + u_id1 + "-" + df_2 + "-" + invoiceno3;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................create invoice no - end.......................................................

    //................set item table - start........................................................
    ResultSet rs_itemtable = null;

    public void md_setItemTable() {

        try {

            new Thread(() -> {
                try {
                    try {
                        if (!tf_item_code.getText().isEmpty()) {
                            rs_itemtable = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item WHERE item_code='" + Integer.parseInt(tf_item_code.getText()) + "'");

                        }

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    DefaultTableModel dt = (DefaultTableModel) tb_invoiceRegistor.getModel();

                    if (!tf_qty.getText().isEmpty()) {
                        if (rs_itemtable.next()) {

                            try {
                                //qty = Integer.parseInt(tf_qty.getText());
                                //avb_qty = Integer.parseInt(lb_available_qty.getText());

                                Vector v = new Vector();
                                v.add(dt.getRowCount() + 1);
                                v.add(tf_item_code.getText());
                                v.add(rs_itemtable.getString("item_name"));
                                v.add(rs_itemtable.getDouble("selling_price") + "0");
                                v.add(tf_qty.getText());
                                v.add(Double.parseDouble(rs_itemtable.getString("selling_price")) * Double.parseDouble(tf_qty.getText()) + "0");
                                v.add(avb_qty - qty);
                                dt.addRow(v);
                                tf_item_code.setText("");
                                tf_qty.setText("");

                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }

                        }
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................set item table  end..........................................................

    //..................set table item qty - start.................................................
    public void md_setTableItemQty() {
        DefaultTableModel dt = (DefaultTableModel) tb_invoiceRegistor.getModel();

    }
    //..................set table item qty - end.................................................

    //......................item name loade from jlist - start...............................................
    ResultSet rs_load_item_name;

    public void md_loadItemName() {

        try {
            try {
                rs_load_item_name = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM `item` i LEFT JOIN `stock_log` s ON i.`item_id`=s.`item_id` WHERE i.`item_code`='" + tf_item_code.getText() + "' AND s.`stock_date`='" + User_Home.lb_v_date.getText() + "'");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (rs_load_item_name.first()) {
                //dlm.addElement(rs_load_item_name.getString("item_name"));
                lb_item_name.setText(rs_load_item_name.getString("i.item_name"));
                lb_available_qty.setText("");
                lb_available_qty.setText(rs_load_item_name.getString("s.qty"));

            } else {
                //JOptionPane.showMessageDialog(this, "No Daily Product Quantity");
            }
            //jp_invoice_view_item.li_searchSuggestions.setModel(dlm);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //......................item name loade from jlist - end.................................................

    //......................item code loade from tf_item - start...............................................
    ResultSet rs_load_tf_item;

    public void md_loadTF_Item() {
        if (!tf_item_code.getText().isEmpty()) {
            try {
                new Thread(() -> {
                    rs_load_tf_item = MC_DB.search_dataOne("item", "item_name", jp_invoice_view_item.li_searchSuggestions.getSelectedValue().toString());
                }).start();

                while (rs_load_tf_item.first()) {

                    tf_item_code.setText(rs_load_tf_item.getInt("item_code") + "");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    //......................item code loade from tf_item - end.................................................

    //..............................Key pad - start............................................................
    public void md_keyPad(java.awt.event.KeyEvent evt) {

    }
    //..............................Key pad - end................................................................

    //................................set available qty from label - start................................................
    ResultSet rs_setavailableqty;
//li_searchSuggestions

    public void md_setAvailableQty() {
        try {
            new Thread(() -> {

                try {
                    rs_setavailableqty = MC_DB.myConnection().createStatement().executeQuery("SELECT * FROM item i INNER JOIN stock_log sg ON i.item_id = sg.item_id WHERE i.item_code='" + tf_item_code.getText() + "'");

                    while (rs_setavailableqty.next()) {
                        lb_available_qty.setText(rs_setavailableqty.getInt("qty") + "");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //................................set available qty from label - end..................................................

    //................................save invoice table - start.........................................................
    ResultSet rs_save_invoice;

    public void md_saveInvoice() {
    }
    //................................save invoice table - end...........................................................

    //set invoice details bill total and total qty
    DefaultTableModel dtmprice;

    public void setInvoiceDetails() {

        double bill_tot_qty = 0;
        double bill_tot_cost = 0;
        dtmprice = (DefaultTableModel) tb_invoiceRegistor.getModel();
        if (tb_invoiceRegistor.getRowCount() > 0) {
            System.out.println("++++++++++++++++++++++INer++++++++++++++++++== ");
            for (int x = 0; x < dtmprice.getRowCount(); x++) {
                bill_tot_qty = Double.parseDouble(dtmprice.getValueAt(x, 5) + "");
                System.out.println("hkxz  zjsskkjk" + bill_tot_qty);

                bill_tot_cost += Double.parseDouble(dtmprice.getValueAt(x, 5) + "");
                lb_bil_total.setText(bill_tot_cost + "");
            }
        } else {
//            lbl_tot_invoice_qty.setText("0");
//            lb_bil_total.setText("00.00");
        }
//        System.out.println(bill_tot_cost);
//        System.out.println(bill_tot_qty);

//        if (bill_tot_qty != 0) {
//            lbl_tot_invoice_qty.setText(bill_tot_qty + "");
//        } else {
//            lbl_tot_invoice_qty.setText("0");
//        }
//        if (bill_tot_cost != 0) {
//            lb_bil_total.setText(bill_tot_cost + "");
//        } else {
//            lb_bil_total.setText("00.00");
//        }
    }
    //set invoice details bill total and total qty

    private void md_setItemCodeToTextF() {

        new Thread(() -> {
            try {
                ResultSet rs_load_tf_itemID = MC_DB.search_dataOne("item", "item_name", jp_invoice_view_item.li_searchSuggestions.getSelectedValue().toString().trim());

                while (rs_load_tf_itemID.next()) {
                    if (tf_item_code.getText().isEmpty()) {
                        System.out.println("HEllo!");
                        tf_item_code.setText(rs_load_tf_itemID.getInt("item_code") + "");
                        tf_qty.grabFocus();
                    } else {
                        tf_item_code.setText("");
                        tf_item_code.setText(rs_load_tf_itemID.getInt("item_code") + "");
                        tf_qty.grabFocus();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(jp_user_invoiceManagment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
        //jp_invoice_view_item.li_searchSuggestions.setVisible(false);

    }

    private void updateDailyStock() {
        try {
            for (int i = 0; i < dtm_invoice_reg_local_table.getRowCount(); i++) {
                String item_code = dtm_invoice_reg_local_table.getValueAt(i, 1).toString();
                int qty = Integer.parseInt(dtm_invoice_reg_local_table.getValueAt(i, 6).toString());
                System.out.println(item_code + "-----" + qty);

                String stockDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                String dataQuery = "UPDATE stock_log sl LEFT JOIN item i ON sl.`item_id`=i.`item_id` SET sl.qty='" + qty + "' WHERE i.`item_code`='" + item_code + "' AND sl.stock_date='" + stockDate + "'";
                MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                System.out.println("daily stock updated");

            }
            saveInvoice();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getInvoiceNo() {
        try {
            ResultSet rs = MC_DB.myConnection().createStatement().executeQuery(("SELECT MAX(invoice_id) AS maxInvoiceId FROM invoice"));
            int max_id = 1;
            if (rs.next()) {
                max_id = (rs.getInt("maxInvoiceId"));
                System.out.println("KKKKKKKKK" + max_id);

                max_id++;

            } else {
                max_id = 1;
                System.out.println("no invoice found");
            }

            String InvoiceNumberNEW = "";
            String preFix = "IN-";
            if (max_id > 0) {

                String max_ids = max_id + "";

                if (max_ids.length() == 1) {
                    max_ids = "0000" + max_id;
                } else if (max_ids.length() == 2) {
                    max_ids = "000" + max_id;
                } else if (max_ids.length() == 3) {
                    max_ids = "00" + max_id;
                } else if (max_ids.length() == 4) {
                    max_ids = "0" + max_id;
                } else if (max_ids.length() == 5) {
                    InvoiceNumberNEW = preFix + max_ids;
                }
                InvoiceNumberNEW = preFix + max_ids;
            }
            System.out.println(InvoiceNumberNEW);
            this.Invoice_No = InvoiceNumberNEW;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getUserID() {
        String username = User_Home.bt_main_userNameLOAD.getText();
        if (!username.isEmpty()) {
            try {
                ResultSet rs = MC_DB.search_dataQuery("SELECT user_account_id FROM user_account WHERE username='" + username + "'");
                if (rs.next()) {
                    return rs.getInt("user_account_id");
                } else {
                    return 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }

    private void saveInvoice() {
        if (getUserID() != 0) {
            if (this.Invoice_No != null) {
                try {

                    String invoiceDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    String invoiceTime = User_Home.lb_v_time.getText();

                    String dataQuery = "INSERT INTO invoice(invoice_no,user_account_id,total_amount,invoice_date,invoice_time,status) VALUES ('" + this.Invoice_No + "','" + getUserID() + "','" + Double.parseDouble(lb_bil_total.getText()) + "','" + invoiceDate + "','" + invoiceTime + "','Active')";
                    MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                    System.out.println("invoice saved");

                    //saving invoice reg
                    saveInvoiceReg();
                    //saving invoice reg

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void saveInvoiceReg() {
        for (int i = 0; i < tb_invoiceRegistor.getRowCount(); i++) {
            String item_code = tb_invoiceRegistor.getValueAt(i, 1).toString();
            int qty = Integer.parseInt(tb_invoiceRegistor.getValueAt(i, 4).toString());
            double up = Double.parseDouble(tb_invoiceRegistor.getValueAt(i, 3).toString());
            double sub_tot = Double.parseDouble(tb_invoiceRegistor.getValueAt(i, 5).toString());
            int item_id = 0;
            int invoice_id = 0;
            try {
                ResultSet rs = MC_DB.search_dataQuery("SELECT item_id FROM item WHERE item_code='" + item_code + "'");
                if (rs.next()) {
                    item_id = rs.getInt("item_id");
                }
                ResultSet rs_invoice_id = MC_DB.search_dataQuery("SELECT invoice_id FROM invoice WHERE invoice_no='" + this.Invoice_No + "'");
                if (rs_invoice_id.next()) {
                    invoice_id = rs_invoice_id.getInt("invoice_id");
                }
                if (qty != 0 && up != 0 && sub_tot != 0 && item_id != 0 && invoice_id != 0 && (!item_code.isEmpty())) {
                    String dataQuery = "INSERT INTO `safenets_dfcdata`.`invoice_reg`(`invoice_id`,`item_id`,`qty`,`total_price`,`status`,`selling_price`) VALUES ('" + invoice_id + "','" + item_id + "','" + qty + "','" + sub_tot + "','Active','" + up + "')";
                    MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
                    System.out.println("invoice reg saved");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        //save cash to cash account
        saveInvoiceCash();
        //save cash to cash account
    }

    private void saveInvoiceCash() {
        String cashDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String des = this.Invoice_No + " credited cash-" + User_Home.bt_main_userNameLOAD.getText();
        try {
            String dataQuery = "INSERT INTO cash_account(`cash_amount`,`cash_type`,`status`,`cash_date`,`description`) VALUES ('" + Double.parseDouble(lb_bil_total.getText()) + "','Invoice','1','" + cashDate + "','" + des + "')";
            MC_DB.myConnection().createStatement().executeUpdate(dataQuery);
            System.out.println("cash saved");
            clearFieldsandLoadInitialData();
            tf_item_code.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearFieldsandLoadInitialData() {
        tf_item_code.setText("");
        lb_item_name.setText("");
        lb_available_qty.setText("");
        tf_qty.setText("");
        DefaultTableModel dtm = (DefaultTableModel) tb_invoiceRegistor.getModel();
        dtm.setRowCount(0);
        lb_tot_item.setText("");
        lb_bil_total.setText("");
        tf_payment.setText("");
        lb_balance.setText("");
        this.Invoice_No = "";
        getInvoiceNo();
    }

    private void invoice_reportView(String rp_parth, String invoice_no) {

        try {
            JasperReport jp = JasperCompileManager.compileReport(rp_parth);
            System.out.println("===========jasper report compiled successfully==========");
            Map<String, Object> map = new HashMap<String, Object>();

            System.out.println("INVOICE Noooooooooooooooooooooo" + invoice_no);
            map.put("para_invoiceNumber", invoice_no);
            System.out.println("INVOICE Noooooooooooooooooooooo" + invoice_no);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jp, map, MC_DB.myConnection());
            JasperViewer.viewReport(jasperPrint, false);
            JRViewer v = new JRViewer(jasperPrint);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
