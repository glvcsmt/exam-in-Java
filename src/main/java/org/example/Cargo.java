package org.example;

public class Cargo implements IAircraft{
    int sumCargoWeight;
    int weight;
    int passengers;
    public Cargo(int sumCargoWeight, int weight) {
        this.sumCargoWeight = sumCargoWeight;
        this.setWeight(weight);
        this.setPassengers(1);
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean TakeOff() {
        if(((80 * this.getPassengers()) + this.getWeight() + this.sumCargoWeight) < 120000) return true;
        return false;
    }
}
