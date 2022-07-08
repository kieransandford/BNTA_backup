package _2_class_vs_object_and_constructors;

public class Vehicle {

    public Vehicle() {
        System.out.println("No-arg constructor, a hardcoded message");

    }

    public static void main(String[] args) {

    }

    public Vehicle(String message){
        System.out.println(message);
    }
}
