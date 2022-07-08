package _2_generics.customclass.list.customclass;

import _2_generics.customclass.list.customclass.list.Person;

public class Main {

    public static void main(String[] args) {

        GenericClass<Person, String> genericClassRefVariable = new GenericClass<>();
        genericClassRefVariable.useGenerics(new Person(), "");

    }

}
