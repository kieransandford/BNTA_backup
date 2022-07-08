package org.example;

public class Car implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Vroom Vroom from car");
        return "Vroom Vroom from car";
    }
    public boolean isTheLightOn(){
        System.out.println("The light is off");
        return false;
    }

}
