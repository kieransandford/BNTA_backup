package tddexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassUnderTheTestTest {

    ClassUnderTheTest classUnderTheTest = new ClassUnderTheTest();

    @Test
    void sleepIn_false_false(){
        // given
        boolean firstParam = false;
        boolean secondParam = false;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertTrue(actualValue);

    }

    @Test
    void sleepIn_true_false(){
        // given
        boolean firstParam = true;
        boolean secondParam = false;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertFalse(actualValue);

    }

    @Test
    void sleepIn_false_true(){
        // given
        boolean firstParam = false;
        boolean secondParam = true;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertTrue(actualValue);

    }

    @Test
    void sleepIn_true_true(){
        // given
        boolean firstParam = true;
        boolean secondParam = true;

        // when
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

        // then
        assertTrue(actualValue);

    }

}