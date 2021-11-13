package de.hsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Siehe https://junit.org/junit5/docs/current/user-guide/#writing-tests
public class JUnitTest {
    
    @Test
    public void calcAvgTest() {
        int[] values = {1, 2, 3, 4};
        assertEquals(2.5, Starter.calcAvg(values));
    }

    @Test
    public void calcMinTest() {
        int[] values = {1, 2, 3, 4};
        assertEquals(1, Starter.calcMin(values));
    }

    @Test
    public void calcMaxTest() {
        int[] values = {1, 2, 3, 4};
        assertEquals(4, Starter.calcMax(values));
    }

    @Test
    public void caesarTest() {
        String input = "Otto";
        assertEquals("Bggb", Starter.encryptDecrypt(input));
    }

}
