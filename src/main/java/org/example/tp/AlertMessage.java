package org.example.tp;

public class AlertMessage extends Message {
    public AlertMessage(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Message d'alerte envoyé");
    }
}