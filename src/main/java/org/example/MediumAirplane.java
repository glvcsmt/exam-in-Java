package org.example;

import java.util.Random;

public class MediumAirplane extends SmallAirplane
{
    int cargoWeight;


    public MediumAirplane(String name, int weight, PlaneType type, int cargoWeight) {
        super(name, weight, type);
        this.cargoWeight = cargoWeight;
        Random rnd = new Random();
        this.setPassengers(rnd.nextInt(80, 201));
    }

    @Override
    public boolean TakeOff() {
        return (this.sumWeight + this.cargoWeight) < 45000;
    }

    @Override
    public String toString() {
        if (this.TakeOff()) return super.toString() + " felszallhat";
        else return super.toString() + " Nem szallhat fel";
    }
}
