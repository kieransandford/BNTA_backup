package org.example;

public class Plane implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Vroom Vroom from plane");
        return "Vroom Vroom from plane";
    }

    public void deployLandingGear(){
        System.out.println("Landing gear deployed!");
    }

}
