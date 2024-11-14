/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasi;
public class AutoCarRPL implements Transportasi {
    private Fuel fuel;
    private int kecepatan;
    private Mesin mesin;
    private Roda[] roda;
    private Setir setir;

    public AutoCarRPL(Fuel fuel, int kecepatan, Mesin mesin, Roda[] roda, Setir setir) {
        this.fuel = fuel;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
        this.roda = roda;
        this.setir = setir;
    }

    @Override
    public void start() {
        if (!mesin.isOn()) {
            mesin.ignite();
            System.out.println("Mobil dimulai.");
        } else {
            System.out.println("Mobil sudah dalam keadaan menyala.");
        }
    }

    @Override
    public void drive() {
        if (fuel.getLevel() <= 0) {
            System.out.println("Bahan bakar habis! Isi bahan bakar sebelum berkendara.");
            return;
        }
        if (!mesin.isOn()) {
            System.out.println("Mesin belum dinyalakan! Nyalakan mesin terlebih dahulu.");
            return;
        }
        System.out.println("Mengemudi dengan kecepatan " + kecepatan + " km/jam.");
        fuel.consume(10);  // Consume some fuel on each drive
        System.out.println("Bahan bakar tersisa: " + fuel.getLevel());
    }
    public Fuel getFuel(){
        return fuel;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public Mesin getMesin(){
        return mesin;
    }
    public void stop() {
        if (mesin.isOn()) {
            mesin.turnOff();
            System.out.println("Mobil berhenti.");
        } else {
            System.out.println("Mobil sudah dalam keadaan mati.");
        }
    }

    public void refuel(int amount) {
        fuel.refuel(amount);
    }

    public void checkTires() {
        for (Roda roda : this.roda) {
            roda.rotate();
        }
    }

    public void steer(String direction) {
        if (direction.equalsIgnoreCase("left")) {
            setir.steerLeft();
        } else if (direction.equalsIgnoreCase("right")) {
            setir.steerRight();
        } else {
            System.out.println("Arah setir tidak dikenal.");
        }
    }
}
