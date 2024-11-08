package org.example.tp;

public class PromotionMessage extends Message {
    public PromotionMessage(NotificationSender sender) {
            super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Message de promotion envoyé");
    }
}
