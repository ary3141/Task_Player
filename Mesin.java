/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasi;

public class Mesin {
    private boolean isOn;

    public Mesin() {
        this.isOn = false;
    }

    public void ignite() {
        if (!isOn) {
            isOn = true;
            System.out.println("Mesin dinyalakan.");
        } else {
            System.out.println("Mesin sudah menyala.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Mesin dimatikan.");
        } else {
            System.out.println("Mesin sudah dalam keadaan mati.");
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
