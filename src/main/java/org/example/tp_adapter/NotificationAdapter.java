package org.example.tp_adapter;

import java.util.HashMap;
import java.util.Map;

public class NotificationAdapter implements SmsService {
    private EmailService emailService;
    private Map<String, String> phoneToEmailMap;

    public NotificationAdapter(EmailService emailService) {
        this.emailService = emailService;
        this.phoneToEmailMap = new HashMap<>();
        phoneToEmailMap.put("123", "axel@ynov.com");
    }

    @Override
    public void sendSms(String number, String message) {
        String email = phoneToEmailMap.get(number);
        if (email != null) {
            emailService.sendEmail(email, "Notification", message);
        } else {
            throw new IllegalArgumentException("Pas d'email associé au numéro de téléphone");
        }
    }
}
