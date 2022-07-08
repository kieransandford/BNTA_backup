package animals;

import animals.Penguin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {

    private Penguin penguin;

    @BeforeEach
    void setup(){
        penguin = new Penguin("Nils Olav", 6, "fish");
    }

    @Test
    void namePropertyHasInheritedCorrectly(){
        assertEquals("Nils Olav", penguin.getName());
    }

    @Test
    void canLayEgg(){
        assertEquals("I laid an egg!", penguin.layEgg());
    }

}
