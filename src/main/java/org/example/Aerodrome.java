package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Aerodrome
{
    IAircraft[] airplanes;

    public Aerodrome(int airplaneNumber) {
        this.airplanes = new IAircraft[airplaneNumber];
    }

    public int getSumPassengers(){
        int sum = 0;
        for(IAircraft item : this.airplanes){
            sum += item.getPassengers();
        }
        return sum;
    }

    public void AddPlane(IAircraft plane) throws NoMorePortException{
        int index = 0;
        while(index < airplanes.length && airplanes[index] != null) index++;
        if(index == airplanes.length) throw new NoMorePortException(plane);
        airplanes[++index] = plane;
    }

    public IAircraft[] Prioritize(){
        ArrayList<Airplane> temp = new ArrayList<>();
        for (IAircraft airplane : airplanes) {
            if (!(airplane instanceof Cargo)) temp.add((Airplane) airplane);
        }
        Collections.sort(temp);
        return (IAircraft[]) temp.toArray();
    }
}