package org.example.tp_adapter;

public class EmailService {
    public void sendEmail(String email, String subject, String body) {
        System.out.println("Email sent to: " + email + " with subject: " + subject + " and body: " + body);
    }
}
