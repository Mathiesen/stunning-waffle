package org.example.Startegypattern;

public class PayPalPayment implements IPaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " to " + email);
    }
}
