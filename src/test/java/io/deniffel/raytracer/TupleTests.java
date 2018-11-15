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

    @Test
    public void tupleWithW1_isAPoint() {
        Tuple t = Tuple.of(4.3, -4.2, 3.1, 1.0);
        assertTrue(t instanceof Point);
    }

    @Test
    public void tupleWith0_aVector() {
        Tuple t = Tuple.of(4.3, -4.2, 3.1, 0.0);
        assertTrue(t instanceof Vector);
    }

    @Test
    public void tupleEquality() {
        Tuple t = Tuple.of(1,1,1,1);

        assertEquals(t, Tuple.of(1,1,1,1));

        assertNotEquals(t, Tuple.of(2,1,1,1));
        assertNotEquals(t, Tuple.of(1,2,1,1));
        assertNotEquals(t, Tuple.of(1,1,2,1));
        assertNotEquals(t, Tuple.of(1,1,1,2));
    }

    @Test
    public void adding() {
        Tuple one = Tuple.of(3, -2, 5, 1);
        Tuple two = Tuple.of(-2, 3, 1, 0);
        Tuple result = one.plus(two);
        assertEquals(Tuple.of(1, 1, 6, 1), result);
    }

    @Test
    public void addingImmutable() {
        Tuple one = Tuple.of(3, -2, 5, 1);
        Tuple two = Tuple.of(-2, 3, 1, 0);
        one.plus(two);
        assertEquals(Tuple.of(3, -2, 5, 1), one);
        assertEquals(Tuple.of(-2, 3, 1, 0), two);
    }
}
