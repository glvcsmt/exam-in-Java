package org.example;

public class NoMorePortException extends Exception
{
    IAircraft plane;

    public NoMorePortException(IAircraft plane) {
        this.plane = plane;
    }
}
