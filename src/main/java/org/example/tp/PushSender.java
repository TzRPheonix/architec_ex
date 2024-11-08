        package org.example.tp;

public class PushSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoie d'une notification push avec ce message: " + message);
    }
}
