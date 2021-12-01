/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.untils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Admin
 */
public class Exceptions {

    static Properties props;
    static Session session;

    public static void writeException(Exception ex, String x) {
        try {
            File f = new File("EXCEPTIONS/bugs.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            ex.printStackTrace(pw);
            pw.write(Xdate.toString(new Date(), "dd/MM/yyyy hh:mm:ss a"));
            pw.write("\nGiá trị nhập vào:\n" + x);
            pw.close();
        } catch (Exception e) {
        }
    }

    public static void setProsSession() {
        props = new Properties();
        props.put("mail.smtp.user", "username");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.EnableSSL.enable", "true");

        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        //----------------------------
        String accountName = "lucttph17307@fpt.edu.vn";
        String accountPassword = "bl4z3login";
        session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(accountName, accountPassword);
            }
        });
    }

    public static void sendMail() {
        try {
            setProsSession();
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("lucttph17307@fpt.edu.vn"));
//                message.setRecipients(Message.RecipientType.TO,
//                        InternetAddress.parse("trinhluc003@gmail.com"));
                String address = "trinhluc003@gmail.com,huongdxph17470@fpt.edu.vn,linhntph17474@fpt.edu.vn,dungvxph17264@fpt.edu.vn,haupvph17311@fpt.edu.vn,ngocpdph17406@fpt.edu.vn";
                InternetAddress[] iAdressArray = InternetAddress.parse(address);
                message.setRecipients(Message.RecipientType.CC, iAdressArray);
                message.setSubject("Exception");
                MimeBodyPart contentPart = new MimeBodyPart();
                contentPart.setContent("IP: " + getIP(), "text/html; charser=utf-8");
                MimeBodyPart filePart = new MimeBodyPart();
                File f = new File("EXCEPTIONS/bugs.txt");
                FileDataSource fds = new FileDataSource(f);
                filePart.setDataHandler(new DataHandler(fds));
                filePart.setFileName(f.getName());
                MimeMultipart mm = new MimeMultipart();
                mm.addBodyPart(contentPart);
                mm.addBodyPart(filePart);
                message.setContent(mm);
                Transport.send(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getIP() {
        try (DatagramSocket socket = new DatagramSocket()) {
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            String ip = socket.getLocalAddress().getHostAddress();
            return ip;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void sendPass(String email, String subject, String mess) {
        try {
            setProsSession();
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("lucttph17307@fpt.edu.vn"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(email));
                message.setSubject(subject);
                message.setText(mess);
                Transport.send(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
