package com.onesoftbytes.emaildemo.controller;

import com.onesoftbytes.emaildemo.model.EmailMessage;
import com.onesoftbytes.emaildemo.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/send-email")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) {
        emailSenderService.sendEmail(emailMessage.getTo(),
                emailMessage.getMessage(), emailMessage.getSubject());
        return ResponseEntity.ok("Email sent");
    }

}
