package org.example.tp;

public class Demo {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();
        NotificationSender pushSender = new PushSender();

        Message alertMessage = new AlertMessage(emailSender);
        Message notificationMessage = new PromotionMessage(smsSender);
        Message infoMessage = new InfoMessage(pushSender);

        alertMessage.sendMessage();
        notificationMessage.sendMessage();
        infoMessage.sendMessage();
    }
}   