package org.example.tp_adapter;

public class demo_adapter2 {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new NotificationAdapter(emailService);

        smsService.sendSms("123", "Test");
    }
}
