package org.example.tp;

public class EmailSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoie d'email avec ce message: " + message);
    }
}

