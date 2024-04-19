package org.example.Facadepattern;

import java.sql.ShardingKey;

public class Facade {
    private CPU cpu;
    private Memory memory;
    private HDD hdd;

    public Facade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hdd = new HDD();
    }

    public void start() {
        hdd.readData();
        memory.load();
        cpu.processData();
        System.out.println("Boot completed");
    }
}
