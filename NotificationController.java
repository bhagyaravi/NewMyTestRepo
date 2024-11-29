package com.example.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

  @Autowired
  private NotificationService notificationService;

  @PostMapping("/send-email")
  public String sendEmail(@RequestBody Mail mail) {
    notificationService.sendEmail(mail);
    return "Email sent successfully";
  }

}