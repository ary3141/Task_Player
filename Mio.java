/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasi;
public class Mio extends AutoCarRPL {
    private boolean ecoMode;

    public Mio(Fuel fuel, int kecepatan, Mesin mesin, Roda[] roda, Setir setir) {
        super(fuel, kecepatan, mesin, roda, setir);
        this.ecoMode = false;
    }

    public void enableEcoMode() {
        ecoMode = true;
        System.out.println("Eco Mode diaktifkan untuk menghemat bahan bakar.");
    }

    public void disableEcoMode() {
        ecoMode = false;
        System.out.println("Eco Mode dimatikan.");
    }

    @Override
    public void drive() {
        if (getFuel().getLevel() <= 0) {
            System.out.println("Bahan bakar habis! Isi bahan bakar sebelum berkendara.");
            return;
        }
        if (!getMesin().isOn()) {
            System.out.println("Mesin belum dinyalakan! Nyalakan mesin terlebih dahulu.");
            return;
        }
        int drivingSpeed = ecoMode ? getKecepatan() / 2 : getKecepatan();
        System.out.println("Mio mengemudi dengan kecepatan " + drivingSpeed + " km/jam.");
        int fuelConsumption = ecoMode ? 5 : 10;
        getFuel().consume(fuelConsumption);
        System.out.println("Bahan bakar tersisa: " + super.getFuel().getLevel());
    }
}

