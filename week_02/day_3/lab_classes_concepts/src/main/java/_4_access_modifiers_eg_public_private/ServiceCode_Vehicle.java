package _4_access_modifiers_eg_public_private;

public class ServiceCode_Vehicle {

    /*
    + public
    # protected
    ~ default (package private)
    - private
     */

    String kind = "A hardcoded value of the kind property";

    void startEngine(){
        System.out.println("The engine has started!");

    }


}
