package _2_generics.customclass.list.customclass.list;

import _2_generics.customclass.list.customclass.list.Person;

import java.util.ArrayList;

public class Main extends Object {

    public static void main(String[] args) {

        ArrayList nonGenericList = new ArrayList<>();

        nonGenericList.add(1);
        nonGenericList.add("String");
        nonGenericList.add(new Person());

        Object object = nonGenericList.get(1);
        Person person = (Person) object;
        person.personMethod();

        ArrayList<Person> personTypeOnly = new ArrayList<>();
        personTypeOnly.add(new Person());

    }

    {

    }

}
