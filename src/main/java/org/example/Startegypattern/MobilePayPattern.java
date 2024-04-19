package org.example.Startegypattern;

public class MobilePayPattern implements IPaymentStrategy {
    private int fromNumber;
    private int toNumber;

    public MobilePayPattern(int fromNumber, int toNumber) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " from " + fromNumber + " to " + toNumber);
    }
}
