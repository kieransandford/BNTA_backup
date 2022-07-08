package _3_test_paired_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    @Test
    void diff21() {
    Diff21 diff21 = new Diff21();
    int solution = diff21.solution(19);
    assertEquals(2,solution);


    }
}

/*

diff21(19) → 2	2
diff21(10) → 11	2
diff21(21) → 0	2

 */