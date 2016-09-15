/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.backend;

import static com.dfc.www.private_access.admin.backend.jf_backend_index.jp_adminMainPanel;
import com.dfc.www.private_access.admin.products.Add_Cat_And_SubCat;
import com.dfc.www.private_access.admin.products.Daily_Qty_add;
import com.dfc.www.private_access.admin.products.Product;
import com.dfc.www.private_access.admin.products.final_product_balance;
import java.awt.Color;
import java.awt.FlowLayout;

/**
 *
 * @author deepalsuranga
 */
public class jp_admin_posManagment_mainMenu extends javax.swing.JPanel {

    /**
     * Creates new form jp_admin_posManagment_mainMenu
     */
    public jp_admin_posManagment_mainMenu() {
        initComponents();
        new Thread(() -> {
            try {
                jp_adminPOSsubPanel.removeAll();
                jp_adminPOSsubPanel.setLayout(new FlowLayout());
                Product ai = new Product();
                ai.setVisible(true);
                jp_adminPOSsubPanel.add(ai);
                jp_adminPOSsubPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
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
        bt_addproduct = new javax.swing.JButton();
        bt_adddailyquantity = new javax.swing.JButton();
        bt_finalproductbalance = new javax.swing.JButton();
        bt_addcatandsub = new javax.swing.JButton();
        jp_adminPOSsubPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(230, 74, 25));

        bt_addproduct.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        bt_addproduct.setForeground(new java.awt.Color(255, 255, 255));
        bt_addproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        bt_addproduct.setText("Add Product");
        bt_addproduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_addproduct.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_addproductMouseMoved(evt);
            }
        });
        bt_addproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_addproductMouseExited(evt);
            }
        });
        bt_addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addproductActionPerformed(evt);
            }
        });

        bt_adddailyquantity.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        bt_adddailyquantity.setForeground(new java.awt.Color(255, 255, 255));
        bt_adddailyquantity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        bt_adddailyquantity.setText("Add Daily Quantity");
        bt_adddailyquantity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_adddailyquantity.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_adddailyquantityMouseMoved(evt);
            }
        });
        bt_adddailyquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_adddailyquantityMouseExited(evt);
            }
        });
        bt_adddailyquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adddailyquantityActionPerformed(evt);
            }
        });

        bt_finalproductbalance.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        bt_finalproductbalance.setForeground(new java.awt.Color(255, 255, 255));
        bt_finalproductbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        bt_finalproductbalance.setText("Final Product Balance");
        bt_finalproductbalance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_finalproductbalance.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_finalproductbalanceMouseMoved(evt);
            }
        });
        bt_finalproductbalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_finalproductbalanceMouseExited(evt);
            }
        });
        bt_finalproductbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_finalproductbalanceActionPerformed(evt);
            }
        });

        bt_addcatandsub.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        bt_addcatandsub.setForeground(new java.awt.Color(255, 255, 255));
        bt_addcatandsub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        bt_addcatandsub.setText("Add Category & Sub Category");
        bt_addcatandsub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_addcatandsub.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_addcatandsubMouseMoved(evt);
            }
        });
        bt_addcatandsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_addcatandsubMouseExited(evt);
            }
        });
        bt_addcatandsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addcatandsubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_adddailyquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_finalproductbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_addcatandsub, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_adddailyquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_finalproductbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addcatandsub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_adminPOSsubPanel.setBackground(new java.awt.Color(65, 65, 65));
        jp_adminPOSsubPanel.setMaximumSize(new java.awt.Dimension(1366, 618));
        jp_adminPOSsubPanel.setMinimumSize(new java.awt.Dimension(1366, 618));

        javax.swing.GroupLayout jp_adminPOSsubPanelLayout = new javax.swing.GroupLayout(jp_adminPOSsubPanel);
        jp_adminPOSsubPanel.setLayout(jp_adminPOSsubPanelLayout);
        jp_adminPOSsubPanelLayout.setHorizontalGroup(
            jp_adminPOSsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jp_adminPOSsubPanelLayout.setVerticalGroup(
            jp_adminPOSsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_adminPOSsubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_adminPOSsubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addcatandsubMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addcatandsubMouseMoved

        bt_addcatandsub.setForeground(new Color(255, 87, 34));
    }//GEN-LAST:event_bt_addcatandsubMouseMoved

    private void bt_addcatandsubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addcatandsubMouseExited

        bt_addcatandsub.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_bt_addcatandsubMouseExited

    private void bt_addcatandsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addcatandsubActionPerformed

        new Thread(() -> {
            try {
                jp_adminPOSsubPanel.removeAll();
                jp_adminPOSsubPanel.setLayout(new FlowLayout());
                Add_Cat_And_SubCat ai = new Add_Cat_And_SubCat();
                ai.setVisible(true);
                jp_adminPOSsubPanel.add(ai);
                jp_adminPOSsubPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }//GEN-LAST:event_bt_addcatandsubActionPerformed

    private void bt_addproductMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addproductMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addproductMouseMoved

    private void bt_addproductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addproductMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addproductMouseExited

    private void bt_addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addproductActionPerformed

        new Thread(() -> {
            try {
                jp_adminPOSsubPanel.removeAll();
                jp_adminPOSsubPanel.setLayout(new FlowLayout());
                Product ai = new Product();
                ai.setVisible(true);
                jp_adminPOSsubPanel.add(ai);
                jp_adminPOSsubPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_addproductActionPerformed

    private void bt_adddailyquantityMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adddailyquantityMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_adddailyquantityMouseMoved

    private void bt_adddailyquantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adddailyquantityMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_adddailyquantityMouseExited

    private void bt_adddailyquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adddailyquantityActionPerformed

        new Thread(() -> {
            try {
                jp_adminPOSsubPanel.removeAll();
                jp_adminPOSsubPanel.setLayout(new FlowLayout());
                Daily_Qty_add ai = new Daily_Qty_add();
                ai.setVisible(true);
                jp_adminPOSsubPanel.add(ai);
                jp_adminPOSsubPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_adddailyquantityActionPerformed

    private void bt_finalproductbalanceMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_finalproductbalanceMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_finalproductbalanceMouseMoved

    private void bt_finalproductbalanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_finalproductbalanceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_finalproductbalanceMouseExited

    private void bt_finalproductbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_finalproductbalanceActionPerformed

        new Thread(() -> {
            try {
                jp_adminPOSsubPanel.removeAll();
                jp_adminPOSsubPanel.setLayout(new FlowLayout());
                final_product_balance ai = new final_product_balance();
                ai.setVisible(true);
                jp_adminPOSsubPanel.add(ai);
                jp_adminPOSsubPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_finalproductbalanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addcatandsub;
    private javax.swing.JButton bt_adddailyquantity;
    private javax.swing.JButton bt_addproduct;
    private javax.swing.JButton bt_finalproductbalance;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jp_adminPOSsubPanel;
    // End of variables declaration//GEN-END:variables
}
