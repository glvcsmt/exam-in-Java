package org.example;

public interface IAircraft {
    int weight = 0;
    int passengers = 0;

    public int getWeight();
    public int getPassengers();
    public void setWeight(int weight);
    public void setPassengers(int passengers);

    public boolean TakeOff();

}
