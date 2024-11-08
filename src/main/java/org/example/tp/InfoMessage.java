package org.example.tp;

public class InfoMessage extends Message {
    public InfoMessage(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage() {
        sender.send("Message d'information envoyé");
    }
}
