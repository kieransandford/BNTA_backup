
package _2_class_vs_object_and_constructors;

public class Main {
    public static void main(String[] args) {

       // Vehicle vehicleConstructedWithNoArgConstructor = new Vehicle();


        // vehicle1 is created using a no-arg constructor
        Vehicle vehicle1 = new Vehicle();

        // vehicle2 is created using a constructor with String param
        Vehicle vehicle2 = new Vehicle("A message passed to a constructor");
    }
}
