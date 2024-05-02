package org.example;

import java.text.MessageFormat;

public class SmallAirplane extends Airplane
{
    public enum PlaneType{
        Cessna, Piper, Caravan,
        Boeing, Airbus, Embraer
    }

    PlaneType planeType;
    public SmallAirplane(String name, int weight) {
        super(name, weight);
    }

    public SmallAirplane(String name, int weight, PlaneType type) {
        super(name, weight);
        this.planeType = type;
    }

    public SmallAirplane(String name, int weight, PlaneType type, int passengers) throws NotEnoughSeatsException {
        super(name, weight);
        this.setPassengers(passengers);
        if((type == PlaneType.Piper || type == PlaneType.Cessna) && passengers > 4) throw new NotEnoughSeatsException();
        else if(type == PlaneType.Caravan && passengers > 12) throw new NotEnoughSeatsException();
        this.planeType = type;
    }

    int sumWeight = (80 * this.getPassengers() + this.getWeight());

    @Override
    public boolean TakeOff() {
        return (this.sumWeight < 12000);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} - [{1} kg / {2} fo]", this.name, this.sumWeight, this.getPassengers());
    }
}
