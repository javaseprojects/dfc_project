/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fsc.www.db;

/**
 *
 * @author deepalsuranga
 */
import com.dfc.www.public_access.user.user_login;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class SendAttachmentInEmail {

    public static void sendSSLAttMail(String FileName, String to, String from) {
        // Recipient's email ID needs to be mentioned.
        //to = "deepalsuranga@live.com";

        // Sender's email ID needs to be mentioned
        //from = "systemdfc@gmail.com";
        final String username = "systemdfc";//change accordingly
        final String password = "WelCome./@1";//change accordingly

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "relay.jangosmtp.net";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        // Get the Session object.
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("BACKUP-" + FileName);

            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Now set the actual message
            messageBodyPart.setText("Your backup file successfully uploaded!");

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            String filename = System.getProperty("user.home") + "\\FSC_Creation\\System_Backup\\" + FileName;
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);

            System.out.println("Sent email " + from + " successfully....");
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Backup Uploaded & Send Email Successfully! \n You Can Close This Application Now! ", "Confirm", JOptionPane.YES_OPTION);
            if (showConfirmDialog == JOptionPane.YES_OPTION) {
                Object obj = new Object();
                // use obj
                obj = null;

                // test run #1
                System.gc();
                for (int i = 0; i < 10; i++) {
                    // calling clean
                    System.gc();
                }
                // test run #2
                System.gc();

                ///////////////////////////
                File tempFile = File.createTempFile("Temp", null);
                tempFile.deleteOnExit();
                RandomAccessFile raTempFile = new RandomAccessFile(tempFile, "rw");
                FileChannel fChannel = raTempFile.getChannel();

                MappedByteBuffer mappedBuffer = fChannel.map(FileChannel.MapMode.READ_WRITE, 0, 512);

                fChannel.close();
                raTempFile.close();
                mappedBuffer = null;

                System.gc();

                if (tempFile.delete()) {
                    System.out.println("Successfully deleted: " + tempFile);
                } else {
                    System.out.println("Unable to delete: " + tempFile);
                }

                ///////////////////////////////
                System.exit(0);
            }
            if (showConfirmDialog == JOptionPane.NO_OPTION) {
                Object obj = new Object();
                // use obj
                obj = null;

                // test run #1
                System.gc();
                for (int i = 0; i < 10; i++) {
                    // calling clean
                    System.gc();
                }
                // test run #2
                System.gc();
                user_login ul = new user_login();
                ul.setVisible(true);

            }

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            Logger.getLogger(SendAttachmentInEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
