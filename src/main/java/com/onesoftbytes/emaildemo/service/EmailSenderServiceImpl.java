package com.onesoftbytes.emaildemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderServiceImpl implements EmailSenderService{

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String to, String subject, String message) {

        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom("onesoftbytes@gmail.com");
            simpleMailMessage.setTo(to);
            simpleMailMessage.setText(message);
            simpleMailMessage.setSubject(subject);

            mailSender.send(simpleMailMessage);

            System.out.println("Mail sent.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
