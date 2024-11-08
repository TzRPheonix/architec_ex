package org.example.tp_adapter;

public class demo_adapter {
    public static void main(String[] args) {
        NewPaymentProcessor newPaymentProcessor = new NewPaymentProcessor();
        String apiKey = "Thomas";

        OldPaymentGateway paymentAdapter = new PaymentAdapter(newPaymentProcessor, apiKey);

        paymentAdapter.makePayment("123", 100);
    }
}
