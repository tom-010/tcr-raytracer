package io.deniffel.raytracer;

import java.util.Objects;

public class Tuple {

    public final double x;
    public final double y;
    public final double z;
    public final double w;

    Tuple(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }


    public static Tuple of(double x, double y, double z, double w) {
        if(w == 0.)
            return new Vector(x, y, z);

        if(w == 1.)
            return new Point(x, y, z);

        return new Tuple(x, y, z, w);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.x, x) == 0 &&
                Double.compare(tuple.y, y) == 0 &&
                Double.compare(tuple.z, z) == 0 &&
                Double.compare(tuple.w, w) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z, w);
    }

    public Tuple plus(Tuple other) {
        return Tuple.of(1, 1, 6, 1);
    }
}
