package io.deniffel.raytracer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TupleTests {
    @Test
    public void tupleConstructsCorrectly() {
        Tuple t = Tuple.of(4.3, -4.2, 3.1, 1.0);
        assertEquals(4.3, t.x, 0.0001);
        assertEquals(-4.2, t.y, 0.0001);
        assertEquals(3.1, t.z, 0.0001);
        assertEquals(1.0, t.w, 0.0001);
    }

//    @Test
//    public void tupleWithW1_isAPoint() {
//        Tuple t = Tuple.of(4.3, -4.2, 3.1, 1.0);
//        assertTrue(t instanceof Point);
//    }




}
