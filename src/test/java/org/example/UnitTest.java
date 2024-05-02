package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
    @Test
    @DisplayName("SANotEnoughSeatsException")
    void SmallAirplaneTest(){
        assertThrows(NotEnoughSeatsException.class, () -> new SmallAirplane("name", 5000, SmallAirplane.PlaneType.Cessna, 8));
    }

    @Test
    @DisplayName("MATakeOffOverWeight")
    void MediumAirplaneTest1(){
        MediumAirplane test = new MediumAirplane("name", 35000, SmallAirplane.PlaneType.Boeing, 20000);
        assertFalse(test.TakeOff());
    }

    @Test
    @DisplayName("MATakeOffUnderWeight")
    void MediumAirplaneTest2(){
        MediumAirplane test = new MediumAirplane("name", 35000, SmallAirplane.PlaneType.Airbus, 5000);
        assertTrue(test.TakeOff());
    }

    @Test
    @DisplayName("MAToString")
    void MediumAirplaneTest3(){
        MediumAirplane test = new MediumAirplane("name", 35000, SmallAirplane.PlaneType.Airbus, 5000);
        assertEquals(MessageFormat.format("{0} - [{1} kg / {2} fo] felszallhat", test.name, test.sumWeight, test.passengers), test.toString());
    }

    @Test
    @DisplayName("CargoPassengers")
    void CargoTest(){
        Cargo test = new Cargo(35000, 20000);
        assertEquals(1, test.getPassengers());
    }

}