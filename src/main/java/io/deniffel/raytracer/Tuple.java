package io.deniffel.raytracer;

public class Tuple {

    public final double x;
    public final double y;
    public final double z;
    public final double w;

    private Tuple(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }


    public static Tuple of(double x, double y, double z, double w) {
        return new Tuple(x, y, z, w);
    }
}
