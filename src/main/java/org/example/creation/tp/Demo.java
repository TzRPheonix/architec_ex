package org.example.creation.tp;

public class Demo {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender smsSender = new SMSSender();
        NotificationSender pushSender = new PushSender();

        Message alertViaEmail = new Message.AlertMessage(emailSender);
        alertViaEmail.sendMessage();

        Message promoViaSMS = new Message.PromotionMessage(smsSender);
        promoViaSMS.sendMessage();

        Message infoViaPush = new Message.InfoMessage(pushSender);
        infoViaPush.sendMessage();
    }
}
