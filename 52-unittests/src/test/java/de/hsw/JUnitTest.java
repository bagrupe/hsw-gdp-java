package de.hsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// Siehe https://junit.org/junit5/docs/current/user-guide/#writing-tests
public class JUnitTest {
    
    @Test
    public void test123() {
        assertEquals(2, Starter.add(1,1));
    }

    @Test
    public void testSubtrahieren() {
        assertEquals(5, Mathe.subtrahieren(7, 2));
    }

    @Test
    public void testFalse() {
        assertFalse(3 > Starter.add(2, 2));
    }

    @Test
    public void testNotNull() {
        assertNotNull(new Starter());
    }

}
