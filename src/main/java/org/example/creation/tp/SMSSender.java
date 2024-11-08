package org.example.creation.tp;

public class SMSSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoie d'un SMS avec ce message : " + message);
    }
}
