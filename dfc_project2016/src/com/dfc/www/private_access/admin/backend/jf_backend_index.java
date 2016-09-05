package com.dfc.www.private_access.admin.backend;

import static com.dfc.www.private_access.admin.backend.jp_admin_posManagment_mainMenu.jp_adminPOSsubPanel;
import com.dfc.www.private_access.admin.cash_account.jp_admin_cashManagement;
import com.dfc.www.private_access.admin.products.Add_Cat_And_SubCat;
import com.dfc.www.public_access.user.user_login;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * @author deepalsuranga
 */
public class jf_backend_index extends javax.swing.JFrame {

    /*c
     * Creates new form jf_backend_index
     */
    public static String us_fullname;

    public jf_backend_index() {

        initComponents();

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            AWTUtilities.setWindowOpaque(this, false);
        } catch (Exception e) {
        }

    }

    public jf_backend_index(String email) {
        initComponents();

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            AWTUtilities.setWindowOpaque(this, false);
        } catch (Exception e) {
        }

        jf_backend_index.us_fullname = email;
        try {

            lb_main_administratorNameLOAD.setText("");
            lb_main_administratorNameLOAD.setText(email);

        } catch (Exception e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lb_main_administratorNameLOAD = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jp_adminMainPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(97, 97, 97));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRATOR | BACKEND");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel6MouseMoved(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 102, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel7MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(30, 5));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel8MouseMoved(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 35));

        lb_main_administratorNameLOAD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_main_administratorNameLOAD.setForeground(new java.awt.Color(0, 204, 255));
        lb_main_administratorNameLOAD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_main_administratorNameLOAD.setText("WelCome Administrator");
        jPanel2.add(lb_main_administratorNameLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 240, 30));

        jPanel4.setBackground(new java.awt.Color(145, 145, 145));
        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel2KeyReleased(evt);
            }
        });
        jPanel4.add(jLabel2, "card2");

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 50));

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 740, 1370, 30));

        jp_adminMainPanel.setBackground(new java.awt.Color(230, 74, 25));
        jp_adminMainPanel.setMaximumSize(new java.awt.Dimension(1366, 670));
        jp_adminMainPanel.setMinimumSize(new java.awt.Dimension(1366, 670));
        jp_adminMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel9MouseMoved(evt);
            }
        });
        jPanel9.setLayout(new java.awt.CardLayout());

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        jButton1.setText("Privilage Managment");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, "card2");

        jp_adminMainPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 170));

        jPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel10MouseMoved(evt);
            }
        });
        jPanel10.setLayout(new java.awt.CardLayout());

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        jButton2.setText("POS Managment");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, "card2");

        jp_adminMainPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 240, 170));

        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel11MouseMoved(evt);
            }
        });
        jPanel11.setLayout(new java.awt.CardLayout());

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        jButton3.setText("Invoice Managment");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel11.add(jButton3, "card2");

        jp_adminMainPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 240, 170));

        jPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel12MouseMoved(evt);
            }
        });
        jPanel12.setLayout(new java.awt.CardLayout());

        jButton4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        jButton4.setText("Cash Managment");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton4, "card2");

        jp_adminMainPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 240, 170));

        jPanel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel13MouseMoved(evt);
            }
        });
        jPanel13.setLayout(new java.awt.CardLayout());

        jButton5.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dfc/www/private_access/admin/backend/bt_background.png"))); // NOI18N
        jButton5.setText("Report Managment");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jPanel13.add(jButton5, "card2");

        jp_adminMainPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 240, 170));

        jPanel14.setBackground(new java.awt.Color(255, 112, 67));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 760, 400));

        jPanel15.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, 240, 210));

        jPanel16.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 240, 240, -1));

        jPanel17.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 240, -1));

        jPanel18.setBackground(new java.awt.Color(66, 66, 66));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jp_adminMainPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 240, -1));

        jPanel1.add(jp_adminMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1366, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseMoved

//        jPanel6.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel6MouseMoved

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved

//        jPanel6.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseMoved

//        jPanel8.setBackground(new Color(250, 250, 250));
//        jPanel7.setBackground(new Color(250, 250, 250));
//        jPanel8.setBackground(new Color(250, 250, 250));
        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));


    }//GEN-LAST:event_jPanel8MouseMoved

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

        jPanel5.setBackground(new Color(255, 102, 0));

        jPanel6.setBackground(new Color(250, 250, 250));
        jPanel7.setBackground(new Color(250, 250, 250));
        jPanel8.setBackground(new Color(250, 250, 250));

    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited

        jPanel5.setBackground(new Color(250, 250, 250));

        jPanel6.setBackground(new Color(255, 102, 0));
        jPanel7.setBackground(new Color(255, 102, 0));
        jPanel8.setBackground(new Color(255, 102, 0));

    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseMoved

        jPanel9.setBackground(new Color(255, 143, 0));

    }//GEN-LAST:event_jPanel9MouseMoved

    private void jPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseMoved

    private void jPanel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseMoved

    private void jPanel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseMoved

    private void jPanel13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Thread(() -> {
            try {
                jp_adminMainPanel.removeAll();
                jp_adminMainPanel.setLayout(new FlowLayout());
                jp_admin_privilageManagment ai = new jp_admin_privilageManagment();
                ai.setVisible(true);
                jp_adminMainPanel.add(ai);
                jp_adminMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new Thread(() -> {
            try {
                jp_adminMainPanel.removeAll();
                jp_adminMainPanel.setLayout(new FlowLayout());
                jp_admin_cashManagement ai = new jp_admin_cashManagement();
                ai.setVisible(true);
                jp_adminMainPanel.add(ai);
                jp_adminMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased

        this.dispose();
        jf_backend_index jp = new jf_backend_index(lb_main_administratorNameLOAD.getText());
        jp.setVisible(true);

    }//GEN-LAST:event_jPanel6MouseReleased

    private void jLabel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyReleased


    }//GEN-LAST:event_jLabel2KeyReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

        int out = JOptionPane.showConfirmDialog(this, "You Want to logout here?", "Conform!", JOptionPane.YES_NO_OPTION);

        if (out == JOptionPane.YES_OPTION) {
            user_login ul = new user_login();
            ul.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jLabel2MouseReleased

    private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased

        this.dispose();
        jf_backend_index jp = new jf_backend_index(lb_main_administratorNameLOAD.getText());
        jp.setVisible(true);

    }//GEN-LAST:event_jPanel7MouseReleased

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased

        this.dispose();
        jf_backend_index jp = new jf_backend_index(lb_main_administratorNameLOAD.getText());
        jp.setVisible(true);

    }//GEN-LAST:event_jPanel8MouseReleased

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased

        this.dispose();
        jf_backend_index jp = new jf_backend_index(lb_main_administratorNameLOAD.getText());
        jp.setVisible(true);

    }//GEN-LAST:event_jPanel5MouseReleased

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved

        jButton1.setForeground(new Color(255, 87, 34));

    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved

        jButton2.setForeground(new Color(255, 87, 34));

    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved

        jButton3.setForeground(new Color(255, 87, 34));

    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved

        jButton4.setForeground(new Color(255, 87, 34));

    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved

        jButton5.setForeground(new Color(255, 87, 34));

    }//GEN-LAST:event_jButton5MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

        jButton1.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited

        jButton2.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited

        jButton3.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited

        jButton4.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited

        jButton5.setForeground(new Color(255, 255, 255));

    }//GEN-LAST:event_jButton5MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Thread(() -> {
            try {
                jp_adminMainPanel.removeAll();
                jp_adminMainPanel.setLayout(new FlowLayout());
                jp_admin_posManagment_mainMenu ai = new jp_admin_posManagment_mainMenu();
                ai.setVisible(true);
                jp_adminMainPanel.add(ai);
                jp_adminMainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_backend_index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jf_backend_index().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JPanel jp_adminMainPanel;
    public static javax.swing.JLabel lb_main_administratorNameLOAD;
    // End of variables declaration//GEN-END:variables
}
