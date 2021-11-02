package de.hsw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testNewPoint() {
        Point p = new Point();
        Assertions.assertNotNull(p);

        p.setX(5);
        assertEquals(5, p.getX());
        //assertEquals(10, p.getY());
    }
    
}
