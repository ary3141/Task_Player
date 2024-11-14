/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasi;
public class Tugasi {
    public static void main(String[] args) {

        Fuel fuel = new Fuel(50);
        Mesin mesin = new Mesin();
        Roda[] roda = { new Roda(32), new Roda(33), new Roda(30), new Roda(31) };
        Setir setir = new Setir();


        AutoCarRPL autoCar = new AutoCarRPL(fuel, 60, mesin, roda, setir);
        Mio mio = new Mio(new Fuel(30), 40, mesin, roda, setir);


        System.out.println("Testing AutoCarRPL:");
        autoCar.start();
        autoCar.checkTires();
        autoCar.drive();
        autoCar.steer("left");
        autoCar.refuel(20);
        autoCar.drive();
        autoCar.stop();

        System.out.println("\nTesting Mio with Eco Mode:");

        mio.start();
        mio.enableEcoMode();
        mio.drive();
        mio.disableEcoMode();
        mio.drive();
        mio.stop();
    }
}

