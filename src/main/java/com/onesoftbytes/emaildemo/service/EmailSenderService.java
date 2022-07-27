package com.onesoftbytes.emaildemo.service;

public interface EmailSenderService {

    void sendEmail(String to, String subject, String message);
}
