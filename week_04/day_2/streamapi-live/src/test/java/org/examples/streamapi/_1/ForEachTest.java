package org.examples.streamapi._1;

import org.junit.jupiter.api.Test;

import static org.examples.streamapi.TestUtil.PEOPLE;

public class ForEachTest {
    @Test
    void printOutNamesAllCaps_comments(){
        PEOPLE
                .forEach(
                      /*
                        To help you understand the lambda's syntax
                        You may start with this and use IntelliJ to simplify the expression.
                     */
                        (person) -> {
                            System.out.println(person.getName().toUpperCase());
                        }
                );
    }

    @Test
    void printOutAllCaps(){
        PEOPLE
                .forEach(person -> System.out.println(person.getName().toUpperCase()));
    }

    @Test
    void printOutLastName(){
        PEOPLE
                .forEach(person -> System.out.println(person.getLastName().toUpperCase()));
    }

    @Test
    void printOutAge(){
        PEOPLE
                .forEach(person -> System.out.println(person.getAge()));
    }

    @Test
    void printOutGender(){
        PEOPLE
                .forEach(person -> System.out.println(person.getGender()));
    }

    @Test
    void printOutFullNameAndAge(){
        PEOPLE
                .forEach(person -> System.out.println(person.getName().toUpperCase() + " " + person.getLastName().toUpperCase() + " is " + person.getAge() + " years old."));
    }

    // Time for some practice: print out, in separate tests: lastName, age, Gender.
}
