/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasi;
public class Fuel {
    private int level;

    public Fuel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void consume(int amount) {
        if (level >= amount) {
            level -= amount;
            System.out.println("Bahan bakar dikonsumsi. Sisa bahan bakar: " + level);
        } else {
            System.out.println("Bahan bakar tidak mencukupi untuk dikonsumsi.");
        }
    }

    public void refuel(int amount) {
        level += amount;
        System.out.println("Bahan bakar ditambahkan. Level sekarang: " + level);
    }

    public boolean isLow() {
        return level <= 10;
    }
}


