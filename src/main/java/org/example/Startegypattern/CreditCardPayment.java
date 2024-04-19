package org.example.Startegypattern;

public class CreditCardPayment implements IPaymentStrategy {

    public CreditCardPayment() {
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with credit card");
    }
}
