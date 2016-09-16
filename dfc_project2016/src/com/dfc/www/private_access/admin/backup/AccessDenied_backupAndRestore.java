/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfc.www.private_access.admin.backup;

import com.dfc.www.private_access.admin.products.User_Home;
import com.fsc.www.db.Backup_SendMailSSL;
import com.fsc.www.db.SendAttachmentInEmail;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepalsuranga
 */
public class AccessDenied_backupAndRestore extends javax.swing.JFrame {

    /**
     * Creates new form AccessDenied_backupAndRestore
     */
    private static String property_host, property_port, property_Backup, property_database, property_user, property_password;

    public AccessDenied_backupAndRestore() {
        initComponents();

        try {
            Properties prop = new Properties();
            InputStream input = null;

            input = new FileInputStream(System.getProperty("user.home") + "\\FSC_Creation\\db_pro.properties");

            // load a properties file
            prop.load(input);
            property_host = prop.getProperty("host");
            property_port = prop.getProperty("prot");

            property_Backup = System.getProperty("user.home") + "\\" + prop.getProperty("MASTER_BACKUP_PATH");

            property_database = prop.getProperty("dbname");
            property_user = prop.getProperty("username");
            property_password = prop.getProperty("password");
        } catch (Exception e) {
        }

        try {
            md_loadBACKUP();
        } catch (Exception e) {
        }

        // md_loadDaabaseisHave();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_backupview = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_hostAddress = new javax.swing.JTextField();
        tf_userName = new javax.swing.JTextField();
        tf_accessPort = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_databaseName = new javax.swing.JTextField();
        pf_userPassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lb_output = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tf_pathsetText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(61, 61, 61));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        tb_backupview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Backup", "Date", "Time", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_backupview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_backupviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_backupview);
        if (tb_backupview.getColumnModel().getColumnCount() > 0) {
            tb_backupview.getColumnModel().getColumn(0).setMinWidth(300);
            tb_backupview.getColumnModel().getColumn(1).setMinWidth(50);
            tb_backupview.getColumnModel().getColumn(2).setMinWidth(50);
            tb_backupview.getColumnModel().getColumn(3).setMinWidth(50);
        }

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setText("1.");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("CREATE FOLDER STRUCTURE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("2.");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("COPY DATABASE PROPATY FILE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("3.");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("WRITE PROPATY FILE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("EMPTY PROPATY FILE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("4.");

        tf_hostAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_hostAddress.setText("77.104.128.75");

        tf_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_userName.setText("safenets_dfc");

        tf_accessPort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_accessPort.setText("3306");

        jLabel8.setText("Database Port:");

        jLabel9.setText("Database Password:");

        jLabel10.setText("Database Username:");

        jLabel11.setText("Database Host:");

        jLabel12.setText("Database Name:");

        tf_databaseName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_databaseName.setText("safenets_dfcdata");

        pf_userPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pf_userPassword.setText("WelComeDB1129");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pf_userPassword)
                    .addComponent(tf_hostAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(tf_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(tf_accessPort, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(tf_databaseName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_hostAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_accessPort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_databaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        lb_output.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        lb_output.setForeground(java.awt.SystemColor.controlLtHighlight);
        lb_output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_output.setText("Welcome to Backup & Restore System");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Output result:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_output, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_output, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manual Backups:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Backup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_pathsetText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pathsetTextMouseClicked(evt);
            }
        });
        tf_pathsetText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pathsetTextActionPerformed(evt);
            }
        });

        jButton2.setText("Email Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_pathsetText)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_pathsetText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Developer Area | Developer Access only!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        md_create_BASICPATHFOLDER();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        md_create_DATABASEPROPATYFILE();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (md_write_PROPATYFILE()) {
            trd_1 = new Thread(() -> {
                try {
                    lb_output.setText("");
                    lb_output.setText("SUCCESSFULLY: DATABASE PROPATY ADDED!");
                    Thread.sleep(3000);

                    lb_output.setText("Welcome to Backup & Restore System");
                } catch (InterruptedException ex) {
                    Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(Level.SEVERE, null, ex);
                }

            });

            trd_1.start();
            System.out.println("SUCCESSFULLY: DATABASE FILE EMPTY!");

        } else {
            trd_1 = new Thread(() -> {
                lb_output.setText("");
                lb_output.setText("FAILED: : DATABASE FILE EMPTY!");
            });

            trd_1.start();
            System.out.println("FAILED: : DATABASE FILE EMPTY!");

        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        md_createBackup("Developer");
        try {
            md_loadBACKUP();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_pathsetTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pathsetTextActionPerformed


    }//GEN-LAST:event_tf_pathsetTextActionPerformed

    private void tf_pathsetTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pathsetTextMouseClicked

        tf_pathsetText.setText(getBackUpPath());

    }//GEN-LAST:event_tf_pathsetTextMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (md_write_EMPTYFILE()) {
            trd_1 = new Thread(() -> {
                lb_output.setText("");
                lb_output.setText("SUCCESSFULLY: DATABASE FILE EMPTY!");
            });
            //Backup_Data-2(BACKUP[Developer)-DFC_DATA-FSC-16%09%2016-04~05~33])	16-09-2016	04:05:33]

            trd_1.start();
            System.out.println("SUCCESSFULLY: DATABASE FILE EMPTY!");

        } else {
            trd_1 = new Thread(() -> {
                lb_output.setText("");
                lb_output.setText("FAILED: : DATABASE FILE EMPTY!");
            });

            trd_1.start();
            System.out.println("FAILED: : DATABASE FILE EMPTY!");

        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

//        Backup_SendMailSSL sslsend = new Backup_SendMailSSL();
//        //admin Alert
//        sslsend.sendingSSL("Administrator", "Login Status:System Entered!\n\n" + "Username:" + "Deepal Suranga" + "\n\n" + "Time:" + "00:00" + "\n\n" + "Date:" + "00/00" + "\n\n\n \t Thank you for using FSC System.");
        SendAttachmentInEmail.sendSSLAttMail(subSequence, "deepalsuranga@live.com", "systemdfc@gmail.com");

    }//GEN-LAST:event_jButton2ActionPerformed
    String subSequence;
    private void tb_backupviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_backupviewMouseClicked

        String Codes = (String) tb_backupview.getValueAt(tb_backupview.getSelectedRow(), 0);
        subSequence = (String) Codes.subSequence(Codes.indexOf("[") + 1, Codes.indexOf("]"));
        System.out.println(subSequence);


    }//GEN-LAST:event_tb_backupviewMouseClicked

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
            java.util.logging.Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AccessDenied_backupAndRestore().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_output;
    private javax.swing.JPasswordField pf_userPassword;
    public static javax.swing.JTable tb_backupview;
    private javax.swing.JTextField tf_accessPort;
    private javax.swing.JTextField tf_databaseName;
    private javax.swing.JTextField tf_hostAddress;
    private javax.swing.JTextField tf_pathsetText;
    private javax.swing.JTextField tf_userName;
    // End of variables declaration//GEN-END:variables

    private void md_loadDaabaseisHave() {
//FSC_Creation\System_Backup
        try {
            Properties prop = new Properties();
            InputStream input = null;
            input = new FileInputStream(System.getProperty("user.home") + "\\FSC_Creation\\db_pro.properties");
            // load a properties file
            prop.load(input);
            System.out.println(prop.getProperty("MASTER_BACKUP_PATH"));
            String property_BackupPath = prop.getProperty("MASTER_BACKUP_PATH");
            File files = new File(property_BackupPath);
            if (!files.exists()) {
                if (files.mkdirs()) {
                    System.out.println("SUCCESSFULLY: CREATED MASTER BACKUP PATH DIRECTORIES!");
                } else {
                    System.out.println("FAILED: CREATED MASTER BACKUP PATH DIRECTORIES!");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    Thread trd_1;

    private void md_create_BASICPATHFOLDER() {

        try {

            File BASICPATHFOLDERS = new File(System.getProperty("user.home") + "\\FSC_Creation\\System_Backup");
            if (!BASICPATHFOLDERS.exists()) {
                if (BASICPATHFOLDERS.mkdirs()) {
                    trd_1 = new Thread(() -> {
                        lb_output.setText("");
                        lb_output.setText("SUCCESSFULLY: BASE PATH FOLDER & MASTER BACKUP PATH DIRECTORIES CREATED!");
                    });

                    trd_1.start();
                    System.out.println("SUCCESSFULLY: CREATED BASICPATHFOLDER & MASTER BACKUP PATH DIRECTORIES!");

                } else {
                    trd_1 = new Thread(() -> {
                        lb_output.setText("");
                        lb_output.setForeground(Color.RED);
                        lb_output.setText("FAILED: BASE PATH FOLDER & MASTER BACKUP PATH DIRECTORIES CREATED!");
                    });

                    trd_1.start();
                    System.out.println("FAILED: CREATED BASICPATHFOLDER & MASTER BACKUP PATH DIRECTORIES!");
                }

            } else {
                trd_1 = new Thread(() -> {

                    lb_output.setText("FAILED: ALREADY EXISTS!");
                });

                trd_1.start();

            }

            Properties properties = new Properties();
            InputStream inputStream = null;

            //inputStream = new FileInputStream("C:\\FSC_Technology\\System_Backup");
        } catch (Exception ex) {
            Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void md_create_DATABASEPROPATYFILE() {

        InputStream inStream = null;
        OutputStream outStream = null;

        try {

            File afile = new File("src\\db_pro.properties");
            System.out.println(System.getProperty("user.home"));
            File bfile = new File(System.getProperty("user.home") + "\\FSC_Creation\\db_pro.properties");
            bfile.canWrite();

            if (!bfile.exists()) {

                inStream = new FileInputStream(afile);
                outStream = new FileOutputStream(bfile);

                byte[] buffer = new byte[1024];

                int length;
                //copy the file content in bytes
                while ((length = inStream.read(buffer)) > 0) {

                    outStream.write(buffer, 0, length);

                }

                inStream.close();
                outStream.close();

                trd_1 = new Thread(() -> {
                    lb_output.setText("");
                    lb_output.setText("SUCCESSFULLY: DATABASE File is copied!".toUpperCase());
                });
                trd_1.start();
            } else {
                trd_1 = new Thread(() -> {
                    lb_output.setText("");
                    lb_output.setText("FAILED: ALREADY EXISTS!");
                });

                trd_1.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean md_write_PROPATYFILE() {
        boolean b = true;
        try {

            String content = md_setString();

            File file = new File(System.getProperty("user.home") + "\\FSC_Creation\\db_pro.properties");

            if (file.exists()) {

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("");
                bw.write(content);

                bw.close();
                b = true;
            } else {
                // if file doesnt exists, then create it
                md_create_BASICPATHFOLDER();
                md_create_DATABASEPROPATYFILE();
                md_write_PROPATYFILE();
                b = true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }

    private boolean md_write_EMPTYFILE() {
        boolean b = false;
        try {

            File file = new File(System.getProperty("user.home") + "\\FSC_Creation\\db_pro.properties");

            if (file.exists()) {

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("");

                bw.close();
                b = true;
            } else {
                // if file doesnt exists, then create it
                md_create_BASICPATHFOLDER();
                md_create_DATABASEPROPATYFILE();
                b = true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return b;
    }

    private String md_setString() {
        String content = "#/*\n"
                + "#* @author deepalsuranga\n"
                + "#*/\n"
                + "\n"
                + "#Start database Properties \n"
                + "\n"
                + "\n"
                + "\n"
                + "host=" + tf_hostAddress.getText().trim() + "\n"
                + "prot=" + tf_accessPort.getText().trim() + "\n"
                + "dbname=" + tf_databaseName.getText().trim() + "\n"
                + "username=" + tf_userName.getText().trim() + "\n"
                + "password=" + new String(pf_userPassword.getPassword()).trim() + "\n"
                + "\n"
                + "\n"
                + "MASTER_BACKUP_PATH=FSC_Creation\\\\System_Backup\n"
                + "\n"
                + "#end database Properties \n"
                + "\n"
                + "#===================================================";

        return content;
    }

    public static String getBackUpPath() {

        String backUpPath = "";
        JFileChooser fc = null;
        if (fc == null) {
            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setAcceptAllFileFilterUsed(false);
        }
        int returnVal = fc.showDialog(null, "Open");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            backUpPath = file.getAbsolutePath();
        }
        return backUpPath;
    }

    private void md_loadBACKUP() {

        DefaultTableModel dtm = (DefaultTableModel) tb_backupview.getModel();
        dtm.setRowCount(0);
        FilenameFilter sqlFilter = (File file, String name) -> {
            return name.endsWith(".zip"); // filters files whose extension is .mp3
        };

        String dirPath = property_Backup;
        File dir = new File(dirPath);
        File[] files = dir.listFiles(sqlFilter);

        if (files.length == 0) {
            Vector v = new Vector();
            v.add("There is no BACKUP files".toUpperCase());
            dtm.addRow(v);
            System.out.println("There is no sql files");
        } else {
            int i = 0;
            for (File aFile : files) {
                i++;
                Vector v = new Vector();
                String part = aFile.getName();
                String[] split = part.split("-");
                String s = split[3];
                String s2 = split[4];
                String[] datePart = s.split("%");
                String[] datePart2 = s.split("~");
                //v.add("Backup_Data-" + i + "(" + part.replaceAll(".zip", "") + ")");
                v.add("Backup_Data-" + i + "[" + part + "]");

                v.add(datePart[0] + "-" + datePart[1] + "-" + datePart[2]);
                v.add(s2.replaceAll(".zip", "").replaceAll("~", ":"));

                double bytes = aFile.length();
                double kilobytes = (bytes / 1024);
                long roundDouble = Math.round(kilobytes);
                v.add(+kilobytes + "~(" + roundDouble + "KB)");
                dtm.addRow(v);
            }
        }

    }
    String nameGEN;

    public String md_createBackup(String typeuser) {

        try {

            String host = property_host;
            String port = property_port;
            //String backuppath = tf_pathsetText.getText();
            String backuppath = property_Backup;
            String Database = property_database;
            String Password = property_password;
            String user = property_user;

            System.out.println("H:" + host);

            System.out.println("H:" + backuppath);
            System.out.println("H:" + Database);

            Backup b = new Backup();
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd%MM%yyyy-hh~mm~ss");
            String date = sdf.format(d);
            System.out.println(date);
            try {

                byte[] data = b.getData(host, port, user, Password, Database).getBytes();
                File filedst = new File(backuppath + "\\" + "BACKUP(" + typeuser + ")-" + Database.toUpperCase() + "-FSC-" + date + ".zip");

                nameGEN = "BACKUP(" + typeuser + ")-" + Database.toUpperCase() + "-FSC-" + date + ".zip";

                FileOutputStream dest = new FileOutputStream(filedst);
                ZipOutputStream zip = new ZipOutputStream(
                        new BufferedOutputStream(dest));
                zip.setMethod(ZipOutputStream.DEFLATED);
                zip.setLevel(Deflater.BEST_COMPRESSION);
                zip.putNextEntry(new ZipEntry("BACKUP_DATA_" + Database.toUpperCase() + ".sql"));
                zip.write(data);
                zip.close();
                dest.close();
                JOptionPane.showMessageDialog(null, "HAVE A NICE DAY! \n Back Up Successfully." + "\n" + "For Database: " + Database, "Database BackUp Wizard", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, "IT'S OK! You can try again! \nBack Up Failed." + "\n" + "For Database: " + Database, "Database BackUp Wizard", JOptionPane.INFORMATION_MESSAGE);
                ex.printStackTrace();
            }

        } catch (Exception ex) {
            Logger.getLogger(AccessDenied_backupAndRestore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nameGEN;
    }

}
