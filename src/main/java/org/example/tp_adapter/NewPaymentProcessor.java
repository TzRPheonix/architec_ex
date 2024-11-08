package org.example.tp_adapter;

public class NewPaymentProcessor {
    private String apiKey;

    public void authenticate(String apiKey) {
        this.apiKey = apiKey;
    }

    public void sendPayment(double amount) {
        System.out.println("Payment sent: " + amount);
    }
}