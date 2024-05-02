package org.example;

public abstract class Airplane implements IAircraft, Comparable<Airplane>
{
    String name;
    int weight;
    int passengers;
    public Airplane(String name, int weight) {
        this.name = name;
        this.setWeight(weight);
        this.setPassengers(0);
    }

    @Override
    public int compareTo(Airplane o) {
        return Integer.compare(this.getPassengers(), o.getPassengers());
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
    public abstract boolean TakeOff();
}
