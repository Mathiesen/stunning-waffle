package org.example;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                System.out.println("Creating new instance of Singleton");
                instance = new Singleton();
            }
        } else {
            System.out.println("Instance of Singleton already exists");
        }

        return instance;
    }
}
