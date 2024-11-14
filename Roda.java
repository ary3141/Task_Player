/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasi;

public class Roda {
    private int pressure;

    public Roda(int pressure) {
        this.pressure = pressure;
    }

    public void rotate() {
        if (pressure >= 30 && pressure <= 35) {
            System.out.println("Roda berputar dengan tekanan aman: " + pressure);
        } else {
            System.out.println("Tekanan ban tidak aman: " + pressure + ". Silakan periksa!");
        }
    }

    public void inflate(int amount) {
        pressure += amount;
        System.out.println("Tekanan ban ditambahkan. Sekarang: " + pressure);
    }

    public int getPressure() {
        return pressure;
    }
}

