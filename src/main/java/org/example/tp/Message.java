package org.example.tp;

public abstract class Message {
    protected NotificationSender sender;

    public Message(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void sendMessage();

    public static class AlertMessage extends Message {
        public AlertMessage(NotificationSender sender) {
            super(sender);
        }

        @Override
        public void sendMessage() {
            sender.send("Message d'alerte envoyé");
        }
    }

    public static class PromotionMessage extends Message {
        public PromotionMessage(NotificationSender sender) {
            super(sender);
        }

        @Override
        public void sendMessage() {
            sender.send("Message de promotion envoyé");
        }
    }

    public static class InfoMessage extends Message {
        public InfoMessage(NotificationSender sender) {
            super(sender);
        }

        @Override
        public void sendMessage() {
            sender.send("Message d'information envoyé");
        }
    }

}

