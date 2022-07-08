package tddexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonkeyTroubleTest {

    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @Test
    void monkeyTrouble_true_true(){
        boolean firstParam = true;
        boolean secondParam = true;
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

        assertTrue(actualValue);
    }

    @Test
    void monkeyTrouble_true_false(){
        boolean firstParam = false;
        boolean secondParam = false;
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

        assertTrue(actualValue);
    }

    @Test
    void monkeyTrouble_true_false2(){
        boolean firstParam = true;
        boolean secondParam = false;
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

        assertFalse(actualValue);
    }

}
