package com.example.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

  @Autowired
  private JavaMailSender mailSender;

  public void sendEmail(Mail mail) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(mail.getRecipient());
    message.setSubject(mail.getSubject());
    message.setText(mail.getMessage());
    mailSender.send(message);
  }

}