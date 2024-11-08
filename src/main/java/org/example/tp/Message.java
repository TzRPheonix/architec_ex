package org.example.tp;

public abstract class Message {
    protected NotificationSender sender;

    public Message(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void sendMessage();
}

