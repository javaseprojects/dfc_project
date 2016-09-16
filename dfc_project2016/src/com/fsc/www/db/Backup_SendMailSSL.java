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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Backup_SendMailSSL {
    
    String system_mail;
    String system_mail_password;
    String to_mail;

   
    
   public void sendingSSL(String subject_plus, String message_body) {
        
        //////////////////////////////////////////////////////////////////////
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream(System.getProperty("user.home")+"\\FSC_Creation\\db_pro.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("SYSTEM_MAIL"));
            System.out.println(prop.getProperty("SYSTEM_PASSWORD"));
            //System.out.println(prop.getProperty("SYSTEM_PORT"));
            System.out.println(prop.getProperty("SYSTEM_ADMIN_RC"));
            
            
            to_mail=prop.getProperty("SYSTEM_ADMIN_RC");
            system_mail = prop.getProperty("SYSTEM_MAIL");
            system_mail_password = prop.getProperty("SYSTEM_PASSWORD");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ////////////////////////////////////////////////////////////////////

        String to =to_mail; 
                //"acedamy_manager@outlook.com";//change accordingly

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(system_mail, system_mail_password);//change accordingly
                    }
                });

//compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(system_mail));//change accordingly
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("System Login Alert:" + subject_plus);
            message.setText(message_body);

            //send message
            Transport.send(message);

            System.out.println("message sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
