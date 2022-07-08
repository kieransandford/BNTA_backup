package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testVehicleList(){
        List<Vehicle> vehicles = List.of(new Car(), new Boat(), new Plane());
        for (Vehicle v: vehicles) {
            v.startEngine();
        }
    }



}