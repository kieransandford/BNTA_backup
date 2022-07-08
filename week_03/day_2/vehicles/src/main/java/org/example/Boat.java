package org.example;

public class Boat implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Vroom Vroom from boat");
        return "Vroom Vroom from boat";
    }

    public String raiseTheSail(){
        String msg = "The sail is up!";
        System.out.println(msg);
        return msg;
    }

}
